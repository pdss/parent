package cn.ydsy.manager.service;

import cn.ydsy.manager.mapper.TbUserMapper;
import cn.ydsy.manager.model.dbo.TbUser;
import cn.ydsy.manager.model.dto.UserDTO;

public interface UserService extends BaseService<UserDTO, TbUserMapper, TbUser> {
}
