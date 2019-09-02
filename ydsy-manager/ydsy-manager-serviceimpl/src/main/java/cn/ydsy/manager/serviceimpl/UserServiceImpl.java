package cn.ydsy.manager.serviceimpl;

import cn.ydsy.manager.mapper.TbUserMapper;
import cn.ydsy.manager.model.dbo.TbUser;
import cn.ydsy.manager.model.dto.UserDTO;
import cn.ydsy.manager.model.dto.WxUserDTO;
import cn.ydsy.manager.service.UserService;
import com.alibaba.dubbo.config.annotation.Service;

import java.util.Date;

@Service(interfaceClass = UserService.class)
public class UserServiceImpl extends BaseServiceImpl<TbUserMapper, TbUser, UserDTO> implements UserService {
}
