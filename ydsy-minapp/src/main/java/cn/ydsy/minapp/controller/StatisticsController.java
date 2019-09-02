package cn.ydsy.minapp.controller;

import cn.ydsy.common.annotation.ApiController;
import cn.ydsy.common.model.MyResult;
import cn.ydsy.manager.service.BannerService;
import cn.ydsy.manager.service.CourseService;
import cn.ydsy.manager.service.SchoolAreaService;
import com.alibaba.dubbo.config.annotation.Reference;
import org.apache.zookeeper.data.Stat;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;

import static cn.ydsy.manager.model.Configuration.RedisKey.Stat_New;


/**
 * 统计
 */
@ApiController("/api/stat")
public class StatisticsController extends BaseController {

    @Reference
    @Lazy
    private CourseService courseService;

    @Reference
    @Lazy
    private SchoolAreaService schoolAreaService;


    /**
     * 最新统计
     * @return
     */
    @GetMapping("newest")
    public MyResult newest() {

        var cache = this.redisService.get(String.format(Stat_New));
        if(cache!=null){
            return ok(cache);
        }
        //课程数
        var courseCount = this.courseService.count(new HashMap<String,Object>(){{
            put("status",1);
        }});

        //机构数
        var schoolAreaCount = this.schoolAreaService.count(new HashMap<String, Object>(){{
            put("status",1);
        }});

        var result = new HashMap<String,Object>(){{
            put("course",courseCount);
            put("school",schoolAreaCount);
        }};

        this.redisService.set(Stat_New,result);

        return ok(result);
    }
}
