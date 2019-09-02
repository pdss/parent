package cn.ydsy.manager.model.dbo;

import java.util.Date;
import javax.persistence.*;

@Table(name = "tb_user_kid")
public class TbUserKid extends BaseDBO {
    @Id
    private Long id;

    /**
     * 用户id
     */
    private Long userid;

    /**
     * 小孩id
     */
    private Long kidid;

    private Boolean isdelete;

    private Date addtime;

    /**
     * @return id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取用户id
     *
     * @return userid - 用户id
     */
    public Long getUserid() {
        return userid;
    }

    /**
     * 设置用户id
     *
     * @param userid 用户id
     */
    public void setUserid(Long userid) {
        this.userid = userid;
    }

    /**
     * 获取小孩id
     *
     * @return kidid - 小孩id
     */
    public Long getKidid() {
        return kidid;
    }

    /**
     * 设置小孩id
     *
     * @param kidid 小孩id
     */
    public void setKidid(Long kidid) {
        this.kidid = kidid;
    }

    /**
     * @return isdelete
     */
    public Boolean getIsdelete() {
        return isdelete;
    }

    /**
     * @param isdelete
     */
    public void setIsdelete(Boolean isdelete) {
        this.isdelete = isdelete;
    }

    /**
     * @return addtime
     */
    public Date getAddtime() {
        return addtime;
    }

    /**
     * @param addtime
     */
    public void setAddtime(Date addtime) {
        this.addtime = addtime;
    }
}