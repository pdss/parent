package cn.ydsy.manager.model.dto;

import cn.ydsy.manager.model.dbo.TbWxuser;
import lombok.Data;

@Data
public class WxUserDTO extends TbWxuser implements BaseDTO {

    private String sessiontoken;

    private String sessionKey;
}

