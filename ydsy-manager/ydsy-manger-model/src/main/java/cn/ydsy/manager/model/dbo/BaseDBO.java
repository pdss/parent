package cn.ydsy.manager.model.dbo;


import com.alibaba.fastjson.annotation.JSONField;
import cn.ydsy.manager.model.dto.BaseDTO;
import lombok.Generated;
import lombok.Setter;
import lombok.ToString;


import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Setter
@ToString
public abstract class BaseDBO implements BaseDTO {

    public BaseDBO() {
//        this.id = IDUtils.genUUID();
//        this.addtime = new Date();
        this.isdelete = false;

    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Long id;
    protected Date addtime;
    @JSONField(serialize = false)
    protected Boolean isdelete;


    public Boolean getIsdelete() {
        return isdelete;
    }

    public Long getId() {
        return id;
    }

    public Date getAddtime() {
        return addtime;
    }
}
