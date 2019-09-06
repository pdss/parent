package cn.ydsy.manager.service;

import cn.ydsy.manager.mapper.TbAreaMapper;
import cn.ydsy.manager.model.dbo.TbArea;
import cn.ydsy.manager.model.dto.AreaDTO;

import java.util.List;

public interface AreaService extends BaseService<AreaDTO, TbAreaMapper, TbArea> {
    //通过城市code获取所有区域
    public List<AreaDTO> getAreaNameByCityCode(String cityCode);
}
