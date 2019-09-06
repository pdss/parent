package cn.ydsy.manager.service;

import cn.ydsy.manager.mapper.TbCityMapper;
import cn.ydsy.manager.model.dbo.TbCity;
import cn.ydsy.manager.model.dto.CityDTO;

public interface CityService extends BaseService<CityDTO, TbCityMapper, TbCity>{
    //通过城市名获取城市code
    public String getCityCodeByCityName(String cityName);
}
