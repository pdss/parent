package cn.ydsy.manager.mapper;

import cn.ydsy.manager.model.dbo.TbActivity;
import cn.ydsy.manager.model.dto.ActivityDTO;
import com.github.pagehelper.Page;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface TbActivityMapper extends Mapper<TbActivity> {
    List<ActivityDTO> getAllById(int id);
    //所有图片
    List<String> getAllImage();
    //得到前六条activity
    List<ActivityDTO> getTopSix();
}