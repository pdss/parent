package cn.ydsy.manager.service;

import cn.ydsy.common.model.MyResult;
import cn.ydsy.manager.mapper.TbKidMapper;
import cn.ydsy.manager.mapper.TbWxuserMapper;
import cn.ydsy.manager.model.dbo.TbKid;
import cn.ydsy.manager.model.dbo.TbWxuser;
import cn.ydsy.manager.model.dto.KidDTO;
import cn.ydsy.manager.model.dto.WxUserDTO;

import java.util.List;

public interface KidService extends BaseService<KidDTO, TbKidMapper, TbKid> {
    public MyResult getAllKids(Long userid);
    public MyResult addKid(KidDTO kid);
}
