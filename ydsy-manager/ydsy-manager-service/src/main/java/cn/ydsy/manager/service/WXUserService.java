package cn.ydsy.manager.service;

import cn.ydsy.common.model.MyResult;
import cn.ydsy.manager.mapper.TbWxuserMapper;
import cn.ydsy.manager.model.dbo.TbWxuser;
import cn.ydsy.manager.model.dto.UserDTO;
import cn.ydsy.manager.model.dto.WxUserDTO;

import java.util.Map;

//public interface WxUserService extends BaseService<WxUserDTO, TbWxuserMapper, TbWxuser> {
//}
public interface WXUserService extends BaseService<WxUserDTO, TbWxuserMapper, TbWxuser> {
    /**
     * 用户登录传入code获取sessionkey和openid
     */
    public MyResult login(String code);

    /**
     * 传入用户信息录入user表
     */
    public MyResult bindUser(UserDTO req);
}