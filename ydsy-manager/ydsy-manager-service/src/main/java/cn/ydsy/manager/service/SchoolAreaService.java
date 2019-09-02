package cn.ydsy.manager.service;

import cn.ydsy.manager.mapper.TbCourseMapper;
import cn.ydsy.manager.mapper.TbSchoolAreaMapper;
import cn.ydsy.manager.model.dbo.TbCourse;
import cn.ydsy.manager.model.dbo.TbSchoolArea;
import cn.ydsy.manager.model.dto.CourseDTO;
import cn.ydsy.manager.model.dto.SchoolAreaDTO;

public interface SchoolAreaService extends BaseService<SchoolAreaDTO, TbSchoolAreaMapper, TbSchoolArea> {
}
