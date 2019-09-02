package cn.ydsy.minapp.controller;

import cn.ydsy.common.annotation.ApiController;
import cn.ydsy.common.model.MyResult;
import cn.ydsy.manager.model.dto.KidDTO;
import cn.ydsy.manager.service.KidService;
import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import javax.websocket.server.PathParam;

@ApiController("/api/wx/user")
public class WXKidControlelr extends BaseController {
    @Reference
    private KidService kidService;
    @GetMapping("/kid")
    public MyResult getAllKidsByUserID(@PathParam("userid") Long userid ){
        return kidService.getAllKids(userid);
    }
    @PostMapping("/kid")
    public MyResult addKid(@RequestBody KidDTO kid){
        return kidService.addKid(kid);
    }
}
