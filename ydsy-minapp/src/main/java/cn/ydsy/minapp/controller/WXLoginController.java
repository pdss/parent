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
import org.springframework.web.bind.annotation.*;

@ApiController("/api/wx")
public class WXLoginController extends BaseController {
    @Reference(timeout = 30000)
    private WXUserService wxUserService;

    @GetMapping("/login")
    public MyResult login(@RequestParam("code")String code){
        if (StringUtils.isEmpty(code)) {
            return this.badreq(null);
        }
        return this.wxUserService.login(code);
    }
    @PostMapping("/register")
    public MyResult register(@RequestBody UserDTO req) throws IllegalAccessException, UnAuthorizeException {
        req.setWxuserid(this.getUserId());
        return this.wxUserService.bindUser(req);
    }
}
