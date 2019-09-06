package cn.ydsy.manager.model.dbo;

import java.util.Date;
import javax.persistence.*;

@Table(name = "tb_city")
public class TbCity extends BaseDBO {
    /**
     * 自增列
     */
    @Id
    private Long id;

    /**
     * 市代码
     */
    @Column(name = "CITY_CODE")
    private String cityCode;

    /**
     * 市名称
     */
    @Column(name = "CITY_NAME")
    private String cityName;

    /**
     * 简称
     */
    @Column(name = "SHORT_NAME")
    private String shortName;

    /**
     * 省代码
     */
    @Column(name = "PROVINCE_CODE")
    private String provinceCode;

    /**
     * 经度
     */
    @Column(name = "LNG")
    private String lng;

    /**
     * 纬度
     */
    @Column(name = "LAT")
    private String lat;

    /**
     * 排序
     */
    @Column(name = "SORT")
    private Integer sort;

    /**
     * 创建时间
     */
    @Column(name = "GMT_CREATE")
    private Date gmtCreate;

    /**
     * 修改时间
     */
    @Column(name = "GMT_MODIFIED")
    private Date gmtModified;

    /**
     * 备注
     */
    @Column(name = "MEMO")
    private String memo;

    /**
     * 状态
     */
    @Column(name = "DATA_STATE")
    private Integer dataState;

    /**
     * 租户ID
     */
    @Column(name = "TENANT_CODE")
    private String tenantCode;

    private Date addtime;

    private Boolean isdelete;

    /**
     * 获取自增列
     *
     * @return id - 自增列
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置自增列
     *
     * @param id 自增列
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取市代码
     *
     * @return CITY_CODE - 市代码
     */
    public String getCityCode() {
        return cityCode;
    }

    /**
     * 设置市代码
     *
     * @param cityCode 市代码
     */
    public void setCityCode(String cityCode) {
        this.cityCode = cityCode == null ? null : cityCode.trim();
    }

    /**
     * 获取市名称
     *
     * @return CITY_NAME - 市名称
     */
    public String getCityName() {
        return cityName;
    }

    /**
     * 设置市名称
     *
     * @param cityName 市名称
     */
    public void setCityName(String cityName) {
        this.cityName = cityName == null ? null : cityName.trim();
    }

    /**
     * 获取简称
     *
     * @return SHORT_NAME - 简称
     */
    public String getShortName() {
        return shortName;
    }

    /**
     * 设置简称
     *
     * @param shortName 简称
     */
    public void setShortName(String shortName) {
        this.shortName = shortName == null ? null : shortName.trim();
    }

    /**
     * 获取省代码
     *
     * @return PROVINCE_CODE - 省代码
     */
    public String getProvinceCode() {
        return provinceCode;
    }

    /**
     * 设置省代码
     *
     * @param provinceCode 省代码
     */
    public void setProvinceCode(String provinceCode) {
        this.provinceCode = provinceCode == null ? null : provinceCode.trim();
    }

    /**
     * 获取经度
     *
     * @return LNG - 经度
     */
    public String getLng() {
        return lng;
    }

    /**
     * 设置经度
     *
     * @param lng 经度
     */
    public void setLng(String lng) {
        this.lng = lng == null ? null : lng.trim();
    }

    /**
     * 获取纬度
     *
     * @return LAT - 纬度
     */
    public String getLat() {
        return lat;
    }

    /**
     * 设置纬度
     *
     * @param lat 纬度
     */
    public void setLat(String lat) {
        this.lat = lat == null ? null : lat.trim();
    }

    /**
     * 获取排序
     *
     * @return SORT - 排序
     */
    public Integer getSort() {
        return sort;
    }

    /**
     * 设置排序
     *
     * @param sort 排序
     */
    public void setSort(Integer sort) {
        this.sort = sort;
    }

    /**
     * 获取创建时间
     *
     * @return GMT_CREATE - 创建时间
     */
    public Date getGmtCreate() {
        return gmtCreate;
    }

    /**
     * 设置创建时间
     *
     * @param gmtCreate 创建时间
     */
    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    /**
     * 获取修改时间
     *
     * @return GMT_MODIFIED - 修改时间
     */
    public Date getGmtModified() {
        return gmtModified;
    }

    /**
     * 设置修改时间
     *
     * @param gmtModified 修改时间
     */
    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    /**
     * 获取备注
     *
     * @return MEMO - 备注
     */
    public String getMemo() {
        return memo;
    }

    /**
     * 设置备注
     *
     * @param memo 备注
     */
    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
    }

    /**
     * 获取状态
     *
     * @return DATA_STATE - 状态
     */
    public Integer getDataState() {
        return dataState;
    }

    /**
     * 设置状态
     *
     * @param dataState 状态
     */
    public void setDataState(Integer dataState) {
        this.dataState = dataState;
    }

    /**
     * 获取租户ID
     *
     * @return TENANT_CODE - 租户ID
     */
    public String getTenantCode() {
        return tenantCode;
    }

    /**
     * 设置租户ID
     *
     * @param tenantCode 租户ID
     */
    public void setTenantCode(String tenantCode) {
        this.tenantCode = tenantCode == null ? null : tenantCode.trim();
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
}