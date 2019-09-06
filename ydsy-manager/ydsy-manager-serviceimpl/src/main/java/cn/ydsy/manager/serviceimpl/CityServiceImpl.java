package cn.ydsy.manager.serviceimpl;

import cn.ydsy.manager.mapper.TbCityMapper;
import cn.ydsy.manager.mapper.TbCourseMapper;
import cn.ydsy.manager.model.dbo.TbCity;
import cn.ydsy.manager.model.dbo.TbCourse;
import cn.ydsy.manager.model.dto.CityDTO;
import cn.ydsy.manager.model.dto.CourseDTO;
import cn.ydsy.manager.service.CityService;
import cn.ydsy.manager.service.CourseService;
import com.alibaba.dubbo.config.annotation.Service;

@Service(interfaceClass = CityService.class)
public class CityServiceImpl extends BaseServiceImpl<TbCityMapper, TbCity, CityDTO> implements CityService {

    @Override
    public String getCityCodeByCityName(String cityName) {
        return this.baseMapper.getCityCodeByCityName(cityName);
    }
}
