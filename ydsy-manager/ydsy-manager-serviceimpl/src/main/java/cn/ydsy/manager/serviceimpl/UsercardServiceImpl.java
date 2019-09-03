package cn.ydsy.manager.serviceimpl;

import cn.ydsy.manager.mapper.TbUserMapper;
import cn.ydsy.manager.mapper.TbUsercardMapper;
import cn.ydsy.manager.model.dbo.TbUser;
import cn.ydsy.manager.model.dbo.TbUsercard;
import cn.ydsy.manager.model.dto.UserDTO;
import cn.ydsy.manager.model.dto.UsercardDTO;
import cn.ydsy.manager.service.UserService;
import cn.ydsy.manager.service.UsercardService;
import com.alibaba.dubbo.config.annotation.Service;

import java.util.List;
@Service(interfaceClass = UsercardService.class)
public class UsercardServiceImpl extends BaseServiceImpl<TbUsercardMapper, TbUsercard, UsercardDTO> implements UsercardService {

    @Override
    public List<UsercardDTO> getMyCards(Long id) {
        var list = this.baseMapper.getMyCards(id);
        for (UsercardDTO user:list) {
            if(user.getAddtime().compareTo(user.getOvertime()) >= 0){
                list.remove(user);
            }
        }
        return list;
    }

    @Override
    public List<UsercardDTO> getOldCards(Long id) {
        var list = this.baseMapper.getMyCards(id);
        for (UsercardDTO user:list) {
            if(user.getAddtime().compareTo(user.getOvertime()) < 0){
                list.remove(user);
            }
        }
        return list;
    }
}
