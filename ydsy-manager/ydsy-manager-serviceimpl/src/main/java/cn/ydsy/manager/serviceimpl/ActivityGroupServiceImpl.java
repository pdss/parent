package cn.ydsy.manager.serviceimpl;

import cn.ydsy.manager.mapper.TbActivitygroupMapper;
import cn.ydsy.manager.model.dbo.TbActivitygroup;
import cn.ydsy.manager.model.dto.ActivityGroupDTO;
import cn.ydsy.manager.service.ActivityGroupService;
import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Service(interfaceClass = ActivityGroupService.class)
public class ActivityGroupServiceImpl extends BaseServiceImpl<TbActivitygroupMapper, TbActivitygroup, ActivityGroupDTO> implements ActivityGroupService {
    @Override
    public List<ActivityGroupDTO> getTopSix() {
        return this.baseMapper.getTopSix();
    }
}
