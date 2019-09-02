package cn.ydsy.manager.model.dto;

import java.io.Serializable;
import java.util.Date;

public interface BaseDTO extends Serializable {

    Long getId();

    void setId(Long id);

    Date getAddtime();


    void setAddtime(Date addtime);

    void setIsdelete(Boolean isdelete);

    Boolean getIsdelete();


}
