package cn.ydsy.manager.mapper;

import cn.ydsy.manager.model.dbo.TbArea;
import cn.ydsy.manager.model.dto.AreaDTO;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface TbAreaMapper extends Mapper<TbArea> {
    public List<AreaDTO> getAreaNameByCityCode(String cityCode);
}