package cn.ydsy.manager.serviceimpl;

import cn.ydsy.common.model.Pagination;
import cn.ydsy.manager.mapper.TbActivityMapper;
import cn.ydsy.manager.model.dbo.TbActivity;
import cn.ydsy.manager.model.dbo.TbUser;
import cn.ydsy.manager.model.dto.ActivityDTO;
import cn.ydsy.manager.service.ActivityService;
import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import java.util.List;

@Service(interfaceClass = ActivityService.class)
public class ActivityServiceImpl extends BaseServiceImpl<TbActivityMapper, TbActivity,ActivityDTO> implements ActivityService {
    @Override
    public Pagination<ActivityDTO> getALLById(int id, int pageNum, int pageSize){
        PageHelper.startPage(pageNum, pageSize);
        List<ActivityDTO> list = this.baseMapper.getAllById(id);
        PageInfo<ActivityDTO> pageInfo = new PageInfo<>(list);
        return this.mapPageInfo(pageInfo,ActivityDTO.class);

    }
}
