package cn.ydsy.manager.mapper;

import cn.ydsy.manager.model.dbo.TbKid;
import cn.ydsy.manager.model.dto.KidDTO;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface TbKidMapper extends Mapper<TbKid> {
    List<KidDTO> getAllKids(Long userid);
}