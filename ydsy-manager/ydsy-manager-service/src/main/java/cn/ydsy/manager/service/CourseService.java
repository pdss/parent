package cn.ydsy.manager.service;

import cn.ydsy.manager.mapper.TbCourseMapper;
import cn.ydsy.manager.mapper.TbIndexcategoryMapper;
import cn.ydsy.manager.model.dbo.TbCourse;
import cn.ydsy.manager.model.dbo.TbIndexcategory;
import cn.ydsy.manager.model.dto.CourseDTO;
import cn.ydsy.manager.model.dto.IndexCategoryDTO;

public interface CourseService extends BaseService<CourseDTO, TbCourseMapper, TbCourse> {
}
