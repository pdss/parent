package cn.ydsy.manager.serviceimpl;

import cn.ydsy.manager.mapper.TbVipcardMapper;
import cn.ydsy.manager.model.dbo.TbVipcard;
import cn.ydsy.manager.model.dto.VipCardDto;
import cn.ydsy.manager.service.VipcarService;
import com.alibaba.dubbo.config.annotation.Service;

@Service(interfaceClass = VipcarService.class)
public class VipCardServiceImpl extends BaseServiceImpl<TbVipcardMapper, TbVipcard, VipCardDto> implements VipcarService {
//
//    @Override
//    public List<VipCardDto> getAll() {
//        return this.baseMapper.getAll();
//    }

}
