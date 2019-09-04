package cn.ydsy.manager.model.dto;

import cn.ydsy.manager.model.dbo.TbActivity;
import cn.ydsy.manager.model.dbo.TbActivitygroup;
import lombok.Data;

import java.util.List;
@Data
public class ActivityGroupDTO extends TbActivitygroup implements BaseDTO {
    List<ActivityDTO> activitys;
}
