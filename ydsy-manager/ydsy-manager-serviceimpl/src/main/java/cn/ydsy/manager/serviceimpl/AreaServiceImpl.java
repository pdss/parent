package cn.ydsy.manager.serviceimpl;

import cn.ydsy.manager.mapper.TbAreaMapper;
import cn.ydsy.manager.mapper.TbCityMapper;
import cn.ydsy.manager.model.dbo.TbArea;
import cn.ydsy.manager.model.dbo.TbCity;
import cn.ydsy.manager.model.dto.AreaDTO;
import cn.ydsy.manager.model.dto.CityDTO;
import cn.ydsy.manager.service.AreaService;
import cn.ydsy.manager.service.CityService;
import com.alibaba.dubbo.config.annotation.Service;

import java.util.List;

@Service(interfaceClass = AreaService.class)
public class AreaServiceImpl  extends BaseServiceImpl<TbAreaMapper, TbArea, AreaDTO> implements AreaService {
    @Override
    public List<AreaDTO> getAreaNameByCityCode(String cityCode) {
        return this.baseMapper.getAreaNameByCityCode(cityCode);
    }

}
