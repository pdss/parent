package cn.ydsy.manager.model.dbo;

import java.util.Date;
import javax.persistence.*;

@Table(name = "tb_activity")
public class TbActivity extends BaseDBO {

    @Column(name = "Title")
    private String title;

    @Column(name = "SubTitle")
    private String subtitle;

    @Column(name = "Address")
    private String address;

    @Column(name = "WorkTime")
    private String worktime;

    @Column(name = "Price")
    private Long price;

    @Column(name = "UserType")
    private String usertype;


    private Date addtime;

    private Long groupid;

    @Column(name = "Images")
    private String images;

    @Column(name = "Description")
    private String description;

    @Column(name = "Required")
    private String required;

    @Column(name = "Guide")
    private String guide;

    @Column(name = "activitytype")
    private int activitytype;

    public int getActivitytype() {
        return activitytype;
    }

    public void setActivitytype(int activitytype) {
        this.activitytype = activitytype;
    }

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
     * @return SubTitle
     */
    public String getSubtitle() {
        return subtitle;
    }

    /**
     * @param subtitle
     */
    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle == null ? null : subtitle.trim();
    }

    /**
     * @return Address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address
     */
    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    /**
     * @return WorkTime
     */
    public String getWorktime() {
        return worktime;
    }

    /**
     * @param worktime
     */
    public void setWorktime(String worktime) {
        this.worktime = worktime == null ? null : worktime.trim();
    }

    /**
     * @return Price
     */
    public Long getPrice() {
        return price;
    }

    /**
     * @param price
     */
    public void setPrice(Long price) {
        this.price = price;
    }

    /**
     * @return UserType
     */
    public String getUsertype() {
        return usertype;
    }

    /**
     * @param usertype
     */
    public void setUsertype(String usertype) {
        this.usertype = usertype == null ? null : usertype.trim();
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
     * @return groupid
     */
    public Long getGroupid() {
        return groupid;
    }

    /**
     * @param groupid
     */
    public void setGroupid(Long groupid) {
        this.groupid = groupid;
    }

    /**
     * @return Images
     */
    public String getImages() {
        return images;
    }

    /**
     * @param images
     */
    public void setImages(String images) {
        this.images = images == null ? null : images.trim();
    }

    /**
     * @return Description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    /**
     * @return Required
     */
    public String getRequired() {
        return required;
    }

    /**
     * @param required
     */
    public void setRequired(String required) {
        this.required = required == null ? null : required.trim();
    }

    /**
     * @return Guide
     */
    public String getGuide() {
        return guide;
    }

    /**
     * @param guide
     */
    public void setGuide(String guide) {
        this.guide = guide == null ? null : guide.trim();
    }
}