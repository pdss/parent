package cn.ydsy.manager.serviceimpl;

import cn.ydsy.manager.mapper.TbBannerMapper;
import cn.ydsy.manager.mapper.TbIndexcategoryMapper;
import cn.ydsy.manager.model.dbo.TbBanner;
import cn.ydsy.manager.model.dbo.TbIndexcategory;
import cn.ydsy.manager.model.dto.BannerDTO;
import cn.ydsy.manager.model.dto.IndexCategoryDTO;
import cn.ydsy.manager.service.BannerService;
import cn.ydsy.manager.service.IndexCategoryService;
import com.alibaba.dubbo.config.annotation.Service;

@Service(interfaceClass = IndexCategoryService.class)
public class IndexCategoryServiceImpl extends BaseServiceImpl<TbIndexcategoryMapper, TbIndexcategory, IndexCategoryDTO> implements IndexCategoryService {
}
