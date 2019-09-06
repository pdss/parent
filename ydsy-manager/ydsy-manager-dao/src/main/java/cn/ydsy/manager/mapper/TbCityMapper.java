package cn.ydsy.manager.mapper;

import cn.ydsy.manager.model.dbo.TbCity;
import tk.mybatis.mapper.common.Mapper;

public interface TbCityMapper extends Mapper<TbCity> {
    public String getCityCodeByCityName(String cityName);
}