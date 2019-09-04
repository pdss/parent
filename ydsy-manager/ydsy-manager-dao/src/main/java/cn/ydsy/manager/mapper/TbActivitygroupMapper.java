package cn.ydsy.manager.mapper;

import cn.ydsy.manager.model.dbo.TbActivitygroup;
import cn.ydsy.manager.model.dto.ActivityDTO;
import cn.ydsy.manager.model.dto.ActivityGroupDTO;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface TbActivitygroupMapper extends Mapper<TbActivitygroup> {
    List<ActivityGroupDTO> getAllGroup();
}