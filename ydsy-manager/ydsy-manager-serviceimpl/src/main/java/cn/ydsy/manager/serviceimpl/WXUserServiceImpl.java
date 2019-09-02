package cn.ydsy.manager.serviceimpl;

import cn.binarywang.wx.miniapp.api.WxMaService;
import cn.binarywang.wx.miniapp.bean.WxMaJscode2SessionResult;
import cn.ydsy.common.model.MyResult;
import cn.ydsy.manager.mapper.TbWxuserMapper;
import cn.ydsy.manager.model.dbo.TbWxuser;
import cn.ydsy.manager.model.dto.UserDTO;
import cn.ydsy.manager.model.dto.WxUserDTO;
import cn.ydsy.manager.service.UserService;
import cn.ydsy.manager.service.WXUserService;
import com.alibaba.dubbo.config.annotation.Service;
import com.alibaba.fastjson.parser.JSONLexer;
import lombok.extern.slf4j.Slf4j;
import me.chanjar.weixin.common.error.WxErrorException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;

import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.TimeUnit;

@Slf4j
@Service(interfaceClass = WXUserService.class)
public class WXUserServiceImpl extends BaseServiceImpl<TbWxuserMapper, TbWxuser, WxUserDTO> implements WXUserService{
    @Autowired
    @Lazy
    private WxMaService wxService;
    @Autowired
    @Lazy
    private UserService userService;

    @Value("${ydsy.userRedisExprie}")
    private long userRedisExprie = 20L;

    //登录
    @Override
    public MyResult login(String code) {
        try {
            WxMaJscode2SessionResult session = this.wxService.getUserService().getSessionInfo(code);

            var openid = session.getOpenid();
            var sessionkey = session.getSessionKey();

            var map = new HashMap<String, Object>();
            map.put("openid", openid);
            var wxUser = this.getOne(map);
            //更新或添加wx用户和用户信息 返回新的用户信息
            var message = this.registerNewUser(wxUser, openid , map);
            if(message == null){
                return MyResult.error("信息上传异常");
            }
            //查出新的user信息
            HashMap<String, Object> userMap = new HashMap<>();
            userMap.put("userid", this.getOne(map).getUserid());
            var newUser = this.getOne(userMap);
            //加密生成token
            var token = String.format("YDSY:WXUSER_%s", newUser.getId());
            //把当期用户写入缓存,有效期20天
            this.redisService.set(token, newUser, userRedisExprie, TimeUnit.DAYS);
            return MyResult.ok(token);
        } catch (WxErrorException e) {
            log.info("获取微信信息失败:{}", e.getMessage());
        }
        return MyResult.error("系统异常");
    }

    @Override
    public MyResult bindUser(UserDTO req) {
        if(userService.updateById(req)){
            return MyResult.ok("信息上传成功");
        }
        return MyResult.error("信息上传失败");
    }

    private String registerNewUser(WxUserDTO wxuser, String openid , Map<String,Object> map) {
        if (wxuser == null) {
            var res = this.transactionUtils.transact((a) -> {
                //保存wxuser
                WxUserDTO wxUser = new WxUserDTO();
                wxUser.setOpenid(openid);
                wxUser.setUnionid("");
                wxUser.setAddtime(new Date());
                wxUser.setIsdelete(false);
                wxUser.setUserid(0L);
                wxUser.setNickname("");
                wxUser.setAvatarurl("");
                this.add(wxUser);
                //查出wxuser.id 新建user把wxuser.id保存到user
                UserDTO user = new UserDTO();
                user.setUsername("");
                user.setPhone("");
                user.setSex(0);
                user.setIsdelete(false);
                user.setAddtime(new Date());
                user.setIdcardno("");
                //查出新的wxUserid
                var newWxuser = this.getOne(map);
                user.setWxuserid(newWxuser.getId());
                userService.add(user);
                //查出user.id保存入wxUser
                HashMap<String, Object> userMap = new HashMap<>();
                userMap.put("wxuserid",newWxuser.getId());
                var newUser = userService.getOne(userMap);
                newWxuser.setUserid(newUser.getId());
                this.updateById(newWxuser);
            });
            if (res) {
                return "ok";
            } else {
                return null;
            }
        }
        return "ok";
    }
}
