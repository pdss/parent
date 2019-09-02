package cn.ydsy.manager.serviceimpl;

import cn.ydsy.manager.mapper.TbCourseMapper;
import cn.ydsy.manager.mapper.TbIndexcategoryMapper;
import cn.ydsy.manager.model.dbo.TbCourse;
import cn.ydsy.manager.model.dbo.TbIndexcategory;
import cn.ydsy.manager.model.dto.CourseDTO;
import cn.ydsy.manager.model.dto.IndexCategoryDTO;
import cn.ydsy.manager.service.CourseService;
import cn.ydsy.manager.service.IndexCategoryService;
import com.alibaba.dubbo.config.annotation.Service;

@Service(interfaceClass = CourseService.class)
public class CourseServiceImpl extends BaseServiceImpl<TbCourseMapper, TbCourse, CourseDTO> implements CourseService {
}
