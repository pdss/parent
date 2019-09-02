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

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

@Slf4j
@Service(interfaceClass = WXUserService.class)
public class WXUserServiceImpl extends BaseServiceImpl<TbWxuserMapper, TbWxuser, WxUserDTO> implements WXUserService{
    @Autowired
    private WxMaService wxService;
    @Autowired
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
            //更新或添加用户
            wxUser = this.registerNewUser(wxUser, openid);
            //查出新的wxuser 入库和如redis
            var newWxUser = this.getOne(map);
            //加密生成token
            var token = String.format("YDSY:WXUSER_%s", newWxUser.getId());
            //把当期用户写入缓存,有效期20天
            this.redisService.set(token, newWxUser, userRedisExprie, TimeUnit.DAYS);
            return MyResult.ok(token);
        } catch (WxErrorException e) {
            log.info("获取微信信息失败:{}", e.getMessage());
        }
        return MyResult.error("系统异常");
    }

    @Override
    public MyResult bindUser(UserDTO req) {
        userService.add(req);
        return MyResult.ok("信息上传成功");
    }

    private WxUserDTO registerNewUser(WxUserDTO wxuser, String openid) {
        if (wxuser == null) {
            wxuser = new WxUserDTO();
            wxuser.setOpenid(openid);
            wxuser.setUnionid("");
            wxuser.setAddtime(new Date());
            wxuser.setIsdelete(false);
            wxuser.setUserid(0L);
            wxuser.setNickname("");
            wxuser.setAvatarurl("");
            this.add(wxuser);
        }
        return wxuser;
    }
}
