package cn.ydsy.manager.service;

import cn.ydsy.common.model.Pagination;
import cn.ydsy.manager.mapper.TbActivityMapper;
import cn.ydsy.manager.model.dbo.TbActivity;
import cn.ydsy.manager.model.dto.ActivityDTO;
import com.github.pagehelper.Page;

import java.util.List;

public interface ActivityService extends BaseService<ActivityDTO, TbActivityMapper, TbActivity> {
    //通过guoupid查所有activity
    Pagination<ActivityDTO> getALLById(int id, int pageNum, int pageSize);
    //得到所有图片
    List<String> getAllImage();
    //得到当前组的六个activity
    List<ActivityDTO> getTopSix();
}
