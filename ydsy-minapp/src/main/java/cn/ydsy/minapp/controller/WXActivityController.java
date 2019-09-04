package cn.ydsy.minapp.controller;

import cn.ydsy.common.annotation.ApiController;
import cn.ydsy.common.model.MyResult;
import cn.ydsy.manager.model.dto.ActivityDTO;
import cn.ydsy.manager.service.ActivityGroupService;
import cn.ydsy.manager.service.ActivityService;
import com.alibaba.dubbo.config.annotation.Reference;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@ApiController("/api/wx/hot")
public class WXActivityController extends BaseController {
    @Reference
    private ActivityGroupService activityGroupService;
    @Reference
    private ActivityService activityService;

    @GetMapping("/hotpage")
    public MyResult getActivityGroup(){
        return MyResult.ok(activityGroupService.getAllGroup());
    }

    @GetMapping("/hotdetails")
    public MyResult getActivity(@RequestParam("groupid")int groupid,
                                @RequestParam(value = "pageNum",defaultValue = "1")Integer pageNum,
                                @RequestParam(value = "pageSize" ,defaultValue = "20")Integer pageSize){
        return MyResult.ok(activityService.getALLById(groupid,pageNum,pageSize));
    }
}
