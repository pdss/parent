package cn.ydsy.manager.service;

import cn.ydsy.manager.mapper.TbProductbookMapper;
import cn.ydsy.manager.mapper.TbSchoolMapper;
import cn.ydsy.manager.model.dbo.TbProductbook;
import cn.ydsy.manager.model.dbo.TbSchool;
import cn.ydsy.manager.model.dto.ProductBookDTO;
import cn.ydsy.manager.model.dto.SchoolDTO;

public interface ProductBookService extends BaseService<ProductBookDTO, TbProductbookMapper, TbProductbook> {
}
