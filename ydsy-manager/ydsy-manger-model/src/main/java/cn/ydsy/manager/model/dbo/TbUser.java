package cn.ydsy.manager.model.dbo;

import java.util.Date;
import javax.persistence.*;

@Table(name = "tb_user")
public class TbUser extends BaseDBO {

    /**
     * 真实姓名
     */
    @Column(name = "UserName")
    private String username;

    @Column(name = "Phone")
    private String phone;

    @Column(name = "Sex")
    private Integer sex;

    /**
     * 身份证
     */
    @Column(name = "IdCardNo")
    private String idcardno;

    /**
     * 微信用户id
     */
    private Long wxuserid;

    /**
     * 生日
     */
    private String borndate;

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
     * 获取真实姓名
     *
     * @return UserName - 真实姓名
     */
    public String getUsername() {
        return username;
    }

    /**
     * 设置真实姓名
     *
     * @param username 真实姓名
     */
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    /**
     * @return Phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * @param phone
     */
    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    /**
     * @return Sex
     */
    public Integer getSex() {
        return sex;
    }

    /**
     * @param sex
     */
    public void setSex(Integer sex) {
        this.sex = sex;
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

    /**
     * 获取身份证
     *
     * @return IdCardNo - 身份证
     */
    public String getIdcardno() {
        return idcardno;
    }

    /**
     * 设置身份证
     *
     * @param idcardno 身份证
     */
    public void setIdcardno(String idcardno) {
        this.idcardno = idcardno == null ? null : idcardno.trim();
    }

    /**
     * 获取微信用户id
     *
     * @return wxuserid - 微信用户id
     */
    public Long getWxuserid() {
        return wxuserid;
    }

    /**
     * 设置微信用户id
     *
     * @param wxuserid 微信用户id
     */
    public void setWxuserid(Long wxuserid) {
        this.wxuserid = wxuserid;
    }

    /**
     * 获取生日
     *
     * @return borndate - 生日
     */
    public String getBorndate() {
        return borndate;
    }

    /**
     * 设置生日
     *
     * @param borndate 生日
     */
    public void setBorndate(String borndate) {
        this.borndate = borndate == null ? null : borndate.trim();
    }
}