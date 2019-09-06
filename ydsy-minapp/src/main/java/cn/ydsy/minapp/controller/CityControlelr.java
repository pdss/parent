package cn.ydsy.minapp.controller;

import cn.ydsy.common.annotation.ApiController;
import cn.ydsy.common.model.MyResult;
import cn.ydsy.manager.service.AreaService;
import cn.ydsy.manager.service.CityService;
import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.ws.rs.PathParam;

@ApiController("/api/city")
public class CityControlelr {
    @Reference
    private AreaService areaService;
    @Reference
    private CityService cityService;
    @GetMapping("/area")
    public MyResult GetAreaByCity(@RequestParam("city")String city){
        var citycode = cityService.getCityCodeByCityName(city);
        var arealist = areaService.getAreaNameByCityCode(citycode);
        return MyResult.ok(arealist);
    }
}
