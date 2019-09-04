package cn.ydsy.manager.mapper;

import cn.ydsy.manager.model.dbo.TbUsercard;
import cn.ydsy.manager.model.dto.UsercardDTO;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface TbUsercardMapper extends Mapper<TbUsercard> {
    List<UsercardDTO> getMyCards(Long id);
    List<UsercardDTO> getOldCards(Long id);
}