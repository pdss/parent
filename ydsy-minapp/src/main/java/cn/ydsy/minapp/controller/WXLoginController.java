package cn.ydsy.minapp.controller;

import cn.ydsy.common.annotation.ApiController;
import cn.ydsy.common.exceptions.UnAuthorizeException;
import cn.ydsy.common.model.MyResult;
import cn.ydsy.common.utils.ObjectUtils;
import cn.ydsy.common.utils.StringUtils;
import cn.ydsy.manager.model.dbo.TbUser;
import cn.ydsy.manager.model.dto.UserDTO;
import cn.ydsy.manager.service.WXUserService;
import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.*;

@ApiController("/api/wx/user")
public class WXLoginController extends BaseController {
    @Reference(timeout = 30000)
    @Lazy
    private WXUserService wxUserService;

    @GetMapping("/login")
    public MyResult login(@RequestParam("code")String code){
        if (StringUtils.isEmpty(code)) {
            return MyResult.error("code为空");
        }
        return this.wxUserService.login(code);
    }
    //上传信息
    @PostMapping("/register")
    public MyResult register(@RequestBody UserDTO req) throws IllegalAccessException, UnAuthorizeException {
        var user = this.getUserInfo();
        if(user != null){
            req.setId(user.getId());
            return wxUserService.bindUser(req);
        }
        return MyResult.error("请重新登录");
    }
}
