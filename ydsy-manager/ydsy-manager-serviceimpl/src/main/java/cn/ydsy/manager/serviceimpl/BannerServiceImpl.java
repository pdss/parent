package cn.ydsy.manager.serviceimpl;

import cn.ydsy.manager.mapper.TbBannerMapper;
import cn.ydsy.manager.mapper.TbUserMapper;
import cn.ydsy.manager.model.dbo.TbBanner;
import cn.ydsy.manager.model.dbo.TbUser;
import cn.ydsy.manager.model.dto.BannerDTO;
import cn.ydsy.manager.model.dto.UserDTO;
import cn.ydsy.manager.service.BannerService;
import cn.ydsy.manager.service.UserService;
import com.alibaba.dubbo.config.annotation.Service;

@Service(interfaceClass = BannerService.class)
public class BannerServiceImpl extends BaseServiceImpl<TbBannerMapper, TbBanner, BannerDTO> implements BannerService {
}
