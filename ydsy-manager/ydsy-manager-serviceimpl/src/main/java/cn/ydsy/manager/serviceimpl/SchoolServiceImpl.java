package cn.ydsy.manager.serviceimpl;

import cn.ydsy.manager.mapper.TbCourseMapper;
import cn.ydsy.manager.mapper.TbSchoolMapper;
import cn.ydsy.manager.model.dbo.TbCourse;
import cn.ydsy.manager.model.dbo.TbSchool;
import cn.ydsy.manager.model.dto.CourseDTO;
import cn.ydsy.manager.model.dto.SchoolDTO;
import cn.ydsy.manager.service.CourseService;
import cn.ydsy.manager.service.SchoolService;
import com.alibaba.dubbo.config.annotation.Service;

@Service(interfaceClass = SchoolService.class)
public class SchoolServiceImpl extends BaseServiceImpl<TbSchoolMapper, TbSchool, SchoolDTO> implements SchoolService {
}
