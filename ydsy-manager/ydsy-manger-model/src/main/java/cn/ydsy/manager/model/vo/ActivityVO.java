package cn.ydsy.manager.model.vo;

import cn.ydsy.manager.model.dto.ActivityDTO;
import cn.ydsy.manager.model.dto.ActivityGroupDTO;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * hot页面的数据
 */
@Data
public class ActivityVO implements Serializable {
    private List<ActivityGroupDTO> hot;
    private List<String> path;
}
