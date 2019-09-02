package cn.ydsy.manager.model.dbo;

import java.util.Date;
import javax.persistence.*;

@Table(name = "tb_banner")
public class TbBanner extends BaseDBO {
    @Id
    @Column(name = "Id")
    private Long id;

    private String imageurl;

    private String url;

    private Boolean status;

    private Double sort;

    @Column(name = "Title")
    private String title;

    @Column(name = "BannerType")
    private Integer bannertype;

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
     * @return imageurl
     */
    public String getImageurl() {
        return imageurl;
    }

    /**
     * @param imageurl
     */
    public void setImageurl(String imageurl) {
        this.imageurl = imageurl == null ? null : imageurl.trim();
    }

    /**
     * @return url
     */
    public String getUrl() {
        return url;
    }

    /**
     * @param url
     */
    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    /**
     * @return status
     */
    public Boolean getStatus() {
        return status;
    }

    /**
     * @param status
     */
    public void setStatus(Boolean status) {
        this.status = status;
    }

    /**
     * @return sort
     */
    public Double getSort() {
        return sort;
    }

    /**
     * @param sort
     */
    public void setSort(Double sort) {
        this.sort = sort;
    }

    /**
     * @return Title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * @return BannerType
     */
    public Integer getBannertype() {
        return bannertype;
    }

    /**
     * @param bannertype
     */
    public void setBannertype(Integer bannertype) {
        this.bannertype = bannertype;
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