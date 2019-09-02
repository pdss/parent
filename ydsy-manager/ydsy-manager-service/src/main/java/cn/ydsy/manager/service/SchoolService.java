package cn.ydsy.manager.service;

import cn.ydsy.manager.mapper.TbCourseMapper;
import cn.ydsy.manager.mapper.TbSchoolMapper;
import cn.ydsy.manager.model.dbo.TbCourse;
import cn.ydsy.manager.model.dbo.TbSchool;
import cn.ydsy.manager.model.dto.CourseDTO;
import cn.ydsy.manager.model.dto.SchoolDTO;

public interface SchoolService extends BaseService<SchoolDTO, TbSchoolMapper, TbSchool> {
}
