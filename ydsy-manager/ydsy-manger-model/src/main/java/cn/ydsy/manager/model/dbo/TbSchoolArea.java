package cn.ydsy.manager.model.dbo;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "tb_school_area")
public class TbSchoolArea extends BaseDBO {
    @Id
    private Long id;

    private Boolean isdelete;

    private Date addtime;

    /**
     * 校区名称
     */
    private String areaname;

    /**
     * 电话
     */
    private String telephone;

    /**
     * 负责人
     */
    private String leadername;

    /**
     * 负责人电话
     */
    private String leaderphone;

    /**
     * 校区图片
     */
    private String logo;

    /**
     * 状态
     */
    private Boolean status;

    /**
     * 经度
     */
    private BigDecimal longitude;

    /**
     * 纬度
     */
    private BigDecimal latitude;

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

    /**
     * 获取校区名称
     *
     * @return areaname - 校区名称
     */
    public String getAreaname() {
        return areaname;
    }

    /**
     * 设置校区名称
     *
     * @param areaname 校区名称
     */
    public void setAreaname(String areaname) {
        this.areaname = areaname == null ? null : areaname.trim();
    }

    /**
     * 获取电话
     *
     * @return telephone - 电话
     */
    public String getTelephone() {
        return telephone;
    }

    /**
     * 设置电话
     *
     * @param telephone 电话
     */
    public void setTelephone(String telephone) {
        this.telephone = telephone == null ? null : telephone.trim();
    }

    /**
     * 获取负责人
     *
     * @return leadername - 负责人
     */
    public String getLeadername() {
        return leadername;
    }

    /**
     * 设置负责人
     *
     * @param leadername 负责人
     */
    public void setLeadername(String leadername) {
        this.leadername = leadername == null ? null : leadername.trim();
    }

    /**
     * 获取负责人电话
     *
     * @return leaderphone - 负责人电话
     */
    public String getLeaderphone() {
        return leaderphone;
    }

    /**
     * 设置负责人电话
     *
     * @param leaderphone 负责人电话
     */
    public void setLeaderphone(String leaderphone) {
        this.leaderphone = leaderphone == null ? null : leaderphone.trim();
    }

    /**
     * 获取校区图片
     *
     * @return logo - 校区图片
     */
    public String getLogo() {
        return logo;
    }

    /**
     * 设置校区图片
     *
     * @param logo 校区图片
     */
    public void setLogo(String logo) {
        this.logo = logo == null ? null : logo.trim();
    }

    /**
     * 获取状态
     *
     * @return status - 状态
     */
    public Boolean getStatus() {
        return status;
    }

    /**
     * 设置状态
     *
     * @param status 状态
     */
    public void setStatus(Boolean status) {
        this.status = status;
    }

    /**
     * 获取经度
     *
     * @return longitude - 经度
     */
    public BigDecimal getLongitude() {
        return longitude;
    }

    /**
     * 设置经度
     *
     * @param longitude 经度
     */
    public void setLongitude(BigDecimal longitude) {
        this.longitude = longitude;
    }

    /**
     * 获取纬度
     *
     * @return latitude - 纬度
     */
    public BigDecimal getLatitude() {
        return latitude;
    }

    /**
     * 设置纬度
     *
     * @param latitude 纬度
     */
    public void setLatitude(BigDecimal latitude) {
        this.latitude = latitude;
    }
}