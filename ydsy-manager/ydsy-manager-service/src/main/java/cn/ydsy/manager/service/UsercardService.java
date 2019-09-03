package cn.ydsy.manager.service;

import cn.ydsy.manager.mapper.TbUsercardMapper;
import cn.ydsy.manager.model.dbo.TbUsercard;
import cn.ydsy.manager.model.dto.UsercardDTO;

import java.util.List;

public interface UsercardService extends BaseService<UsercardDTO, TbUsercardMapper, TbUsercard> {
    //获取当前用户所有有效卡信息
    List<UsercardDTO> getMyCards(Long id);
    //获取当前用户所有无效卡信息
    List<UsercardDTO> getOldCards(Long id);
}
