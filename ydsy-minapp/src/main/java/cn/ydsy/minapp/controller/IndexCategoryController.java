package cn.ydsy.minapp.controller;

import cn.ydsy.common.annotation.ApiController;
import cn.ydsy.common.model.MyResult;
import cn.ydsy.manager.service.BannerService;
import cn.ydsy.manager.service.IndexCategoryService;
import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;

@ApiController("/api/indexcategory")
public class IndexCategoryController extends BaseController {

    @Reference
    @Lazy
    private IndexCategoryService indexCategoryService;

    /**
     * 根据类型获取板块列表--首页
     *
     * @return
     */
    @GetMapping("all")
    public MyResult all() {
        String[] orderBy = {"sort"};
        var list = this.indexCategoryService.list(null, orderBy, 1);
        return ok(list);
    }

    @GetMapping("level")
    public MyResult level(){
//        String[] orderBy = {"sort"};

        var list = this.indexCategoryService.select2Level();
        return ok(list);
    }
}
