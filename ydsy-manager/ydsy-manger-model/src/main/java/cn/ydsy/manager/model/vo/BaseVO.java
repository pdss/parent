package cn.ydsy.manager.model.vo;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

@Data
@ToString
public class BaseVO implements Serializable {

    /**
     * 分页，页码
     */
    private Integer pageIndex = 1;

}
