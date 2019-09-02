package cn.ydsy.manager.service;

import cn.ydsy.manager.mapper.TbActivityMapper;
import cn.ydsy.manager.mapper.TbActivitygroupMapper;
import cn.ydsy.manager.model.dbo.TbActivitygroup;
import cn.ydsy.manager.model.dto.ActivityDTO;
import cn.ydsy.manager.model.dto.ActivityGroupDTO;

import java.util.List;

public interface ActivityGroupService extends BaseService<ActivityGroupDTO, TbActivitygroupMapper, TbActivitygroup> {
    //得到前面六条
    public List<ActivityGroupDTO> getTopSix();
}
