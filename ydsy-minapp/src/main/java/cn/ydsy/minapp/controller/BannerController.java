package cn.ydsy.minapp.controller;

import cn.ydsy.common.annotation.ApiController;
import cn.ydsy.common.model.MyResult;
import cn.ydsy.manager.model.dbo.TbCourse;
import cn.ydsy.manager.model.dto.BannerDTO;
import cn.ydsy.manager.service.BannerService;
import cn.ydsy.manager.service.TestService;
import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;

@ApiController("/api/banner")
public class BannerController extends BaseController {

    @Reference
    @Lazy
    private BannerService bannerService;

    /**
     * 根据类型获取Banner
     * @param type
     * @return
     */
    @GetMapping("all")
    public MyResult all(@RequestParam int type) {
        String[] orderBy = {"sort"};
        var list = this.bannerService.list(new HashMap<String, Object>() {{
            put("bannertype", type);
        }}, orderBy, 1);

        return ok(list);
    }
}
