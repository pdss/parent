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
    //获取当前用户所有孩子
    public List<KidDTO> getAllKids(Long userid);
    //添加孩子
    public MyResult addKid(KidDTO kid);
    //修改孩子
    public MyResult updateKid(KidDTO kid);
    //删除孩子
    public MyResult deleteKid(Long id);
}
