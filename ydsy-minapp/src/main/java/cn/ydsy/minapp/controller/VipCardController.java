package cn.ydsy.minapp.controller;

import cn.ydsy.common.annotation.ApiController;
import cn.ydsy.common.exceptions.UnAuthorizeException;
import cn.ydsy.common.model.MyResult;
import cn.ydsy.manager.service.UsercardService;
import cn.ydsy.manager.service.VipcarService;
import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.websocket.server.PathParam;

@ApiController("/api/vipcard")
public class VipCardController extends BaseController {
    @Reference
    private VipcarService vipcarService;
    @Reference
    private UsercardService usercardService;

    @GetMapping("/mycards")
    public MyResult getMyCards() throws UnAuthorizeException {
        var user = this.getUserInfo();
        if(user != null){
            var list = usercardService.getMyCards(user.getId());
            return MyResult.ok(list);
        }
        return MyResult.error("请重新登录");
    }
    @GetMapping("/oldcards")
    public MyResult getOldCards() throws UnAuthorizeException {
        var user = this.getUserInfo();
        if(user != null){
            var list = usercardService.getOldCards(user.getId());
            return ok(list);
        }
        return MyResult.error("请重新登录");
    }
//    @GetMapping("/show")
//    public MyResult showCard(){
//        return MyResult.ok(vipcarService.getAll());
//    }
//    @PostMapping("/buy")
//    public MyResult buyCard(@PathParam("cardid")Long id) throws UnAuthorizeException {
//        var user = this.getUserInfo();
//        if(user != null){
//            return UsercardService
//        }
//        return MyResult.error("请重新登录");
//    }

}
