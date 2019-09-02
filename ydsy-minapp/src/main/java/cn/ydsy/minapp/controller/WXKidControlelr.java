package cn.ydsy.minapp.controller;

import cn.ydsy.common.annotation.ApiController;
import cn.ydsy.common.exceptions.UnAuthorizeException;
import cn.ydsy.common.model.MyResult;
import cn.ydsy.manager.model.dto.KidDTO;
import cn.ydsy.manager.service.KidService;
import com.alibaba.dubbo.config.annotation.Reference;
import org.apache.ibatis.annotations.Delete;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;

@ApiController("/api/wx/user")
public class WXKidControlelr extends BaseController {
    @Reference
    @Lazy
    private KidService kidService;
    @GetMapping("/kid")
    public MyResult getAllKidsByUserID() throws UnAuthorizeException {
        if(this.getUserInfo() != null){
            return this.badreq(kidService.getAllKids(this.getUserInfo().getId()));
        }
        return MyResult.error("请重新登录");
    }
    @PostMapping("/kid")
    public MyResult addKid(@RequestBody KidDTO kid) throws UnAuthorizeException {
        var id = this.getUserInfo();
        if(id != null){
            kid.setUserid(id.getId());
            return kidService.addKid(kid);
        }
        return MyResult.error("请重新登录");
    }
    @PutMapping("/kid")
    public MyResult updateKid(@RequestBody KidDTO kid) throws UnAuthorizeException {
        var id = this.getUserInfo();
        if(id != null){
            kid.setUserid(id.getId());
            return kidService.addKid(kid);
        }
        return MyResult.error("请重新登录");
    }
    @DeleteMapping("/kid")
    public MyResult deleteKid(@PathParam("kidId") int kidId) throws UnAuthorizeException {
        var id = this.getUserInfo();
        if(id != null){
            return kidService.deleteKid(kidId);
        }
        return MyResult.error("请重新登录");
    }
}
