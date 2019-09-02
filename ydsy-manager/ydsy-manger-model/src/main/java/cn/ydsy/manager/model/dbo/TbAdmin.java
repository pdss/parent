package cn.ydsy.manager.model.dbo;

import java.util.Date;
import javax.persistence.*;

@Table(name = "tb_admin")
public class TbAdmin extends BaseDBO {
    @Id
    @Column(name = "Id")
    private Long id;

    private String login;

    @Column(name = "IsDelete")
    private Boolean isdelete;

    @Column(name = "AddTime")
    private Date addtime;

    /**
     * @return Id
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
     * @return login
     */
    public String getLogin() {
        return login;
    }

    /**
     * @param login
     */
    public void setLogin(String login) {
        this.login = login == null ? null : login.trim();
    }

    /**
     * @return IsDelete
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
     * @return AddTime
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