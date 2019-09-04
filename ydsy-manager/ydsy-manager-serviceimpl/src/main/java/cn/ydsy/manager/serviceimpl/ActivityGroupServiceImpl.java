package cn.ydsy.manager.serviceimpl;

import cn.ydsy.manager.mapper.TbActivitygroupMapper;
import cn.ydsy.manager.model.dbo.TbActivitygroup;
import cn.ydsy.manager.model.dto.ActivityGroupDTO;
import cn.ydsy.manager.model.vo.ActivityVO;
import cn.ydsy.manager.service.ActivityGroupService;
import cn.ydsy.manager.service.ActivityService;
import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Service(interfaceClass = ActivityGroupService.class)
public class ActivityGroupServiceImpl extends BaseServiceImpl<TbActivitygroupMapper, TbActivitygroup, ActivityGroupDTO> implements ActivityGroupService {
    @Autowired
    @Lazy
    private ActivityService activityService;
    @Override
    public List<ActivityGroupDTO> getAllGroup() {
        var list = (List<ActivityGroupDTO>)this.baseMapper.getAllGroup();
//       return  this.beanListMap(list,this.currentDTOClass());
        return list;



    }
}
