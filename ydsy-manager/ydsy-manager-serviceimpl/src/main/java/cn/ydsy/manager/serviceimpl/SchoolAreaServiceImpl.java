package cn.ydsy.manager.serviceimpl;

import cn.ydsy.manager.mapper.TbSchoolAreaMapper;
import cn.ydsy.manager.mapper.TbSchoolMapper;
import cn.ydsy.manager.model.dbo.TbSchool;
import cn.ydsy.manager.model.dbo.TbSchoolArea;
import cn.ydsy.manager.model.dto.SchoolAreaDTO;
import cn.ydsy.manager.model.dto.SchoolDTO;
import cn.ydsy.manager.service.SchoolAreaService;
import cn.ydsy.manager.service.SchoolService;
import com.alibaba.dubbo.config.annotation.Service;

@Service(interfaceClass = SchoolAreaService.class)
public class SchoolAreaServiceImpl extends BaseServiceImpl<TbSchoolAreaMapper, TbSchoolArea, SchoolAreaDTO> implements SchoolAreaService {
}
