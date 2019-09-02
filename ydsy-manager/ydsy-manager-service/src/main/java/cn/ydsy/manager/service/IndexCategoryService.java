package cn.ydsy.manager.service;

import cn.ydsy.manager.mapper.TbBannerMapper;
import cn.ydsy.manager.mapper.TbIndexcategoryMapper;
import cn.ydsy.manager.model.dbo.TbBanner;
import cn.ydsy.manager.model.dbo.TbIndexcategory;
import cn.ydsy.manager.model.dto.BannerDTO;
import cn.ydsy.manager.model.dto.IndexCategoryDTO;

public interface IndexCategoryService extends BaseService<IndexCategoryDTO, TbIndexcategoryMapper, TbIndexcategory> {
}
