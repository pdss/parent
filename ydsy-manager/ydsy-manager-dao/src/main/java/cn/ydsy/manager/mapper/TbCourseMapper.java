package cn.ydsy.manager.mapper;

import cn.ydsy.manager.model.dbo.TbCourse;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface TbCourseMapper extends Mapper<TbCourse> {
    List<TbCourse> getAll();
}