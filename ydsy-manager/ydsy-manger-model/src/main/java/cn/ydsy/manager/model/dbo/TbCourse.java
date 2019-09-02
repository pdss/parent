package cn.ydsy.manager.model.dbo;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "tb_course")
public class TbCourse extends BaseDBO {
    @Id
    private Long id;

    private Boolean isdelete;

    private Date addtime;

    /**
     * 课程名称
     */
    private String coursename;

    /**
     * 课程图片
     */
    @Column(name = "course_img")
    private String courseImg;

    /**
     * 课程有效期
     */
    @Column(name = "course_time")
    private String courseTime;

    /**
     * 课程时间
     */
    @Column(name = "lesson_time")
    private String lessonTime;

    /**
     * 地点
     */
    private String address;

    /**
     * 价格
     */
    private BigDecimal price;

    /**
     * 工作团队
     */
    private String workteam;

    /**
     * 适合年龄
     */
    @Column(name = "suitable_age")
    private String suitableAge;

    /**
     * 培养目标
     */
    private String target;

    /**
     * 课程详情
     */
    private String details;

    /**
     * 学校id
     */
    private Long schoolid;

    /**
     * 校区id
     */
    private Long areaid;

    /**
     * 剩余课程数
     */
    private Long count;

    /**
     * 状态
     */
    private Boolean status;




    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
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
     * 获取课程名称
     *
     * @return coursename - 课程名称
     */
    public String getCoursename() {
        return coursename;
    }

    /**
     * 设置课程名称
     *
     * @param coursename 课程名称
     */
    public void setCoursename(String coursename) {
        this.coursename = coursename == null ? null : coursename.trim();
    }

    /**
     * 获取课程图片
     *
     * @return course_img - 课程图片
     */
    public String getCourseImg() {
        return courseImg;
    }

    /**
     * 设置课程图片
     *
     * @param courseImg 课程图片
     */
    public void setCourseImg(String courseImg) {
        this.courseImg = courseImg == null ? null : courseImg.trim();
    }

    /**
     * 获取课程有效期
     *
     * @return course_time - 课程有效期
     */
    public String getCourseTime() {
        return courseTime;
    }

    /**
     * 设置课程有效期
     *
     * @param courseTime 课程有效期
     */
    public void setCourseTime(String courseTime) {
        this.courseTime = courseTime == null ? null : courseTime.trim();
    }

    /**
     * 获取课程时间
     *
     * @return lesson_time - 课程时间
     */
    public String getLessonTime() {
        return lessonTime;
    }

    /**
     * 设置课程时间
     *
     * @param lessonTime 课程时间
     */
    public void setLessonTime(String lessonTime) {
        this.lessonTime = lessonTime == null ? null : lessonTime.trim();
    }

    /**
     * 获取地点
     *
     * @return address - 地点
     */
    public String getAddress() {
        return address;
    }

    /**
     * 设置地点
     *
     * @param address 地点
     */
    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    /**
     * 获取价格
     *
     * @return price - 价格
     */
    public BigDecimal getPrice() {
        return price;
    }

    /**
     * 设置价格
     *
     * @param price 价格
     */
    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    /**
     * 获取工作团队
     *
     * @return workteam - 工作团队
     */
    public String getWorkteam() {
        return workteam;
    }

    /**
     * 设置工作团队
     *
     * @param workteam 工作团队
     */
    public void setWorkteam(String workteam) {
        this.workteam = workteam == null ? null : workteam.trim();
    }

    /**
     * 获取适合年龄
     *
     * @return suitable_age - 适合年龄
     */
    public String getSuitableAge() {
        return suitableAge;
    }

    /**
     * 设置适合年龄
     *
     * @param suitableAge 适合年龄
     */
    public void setSuitableAge(String suitableAge) {
        this.suitableAge = suitableAge == null ? null : suitableAge.trim();
    }

    /**
     * 获取培养目标
     *
     * @return target - 培养目标
     */
    public String getTarget() {
        return target;
    }

    /**
     * 设置培养目标
     *
     * @param target 培养目标
     */
    public void setTarget(String target) {
        this.target = target == null ? null : target.trim();
    }

    /**
     * 获取课程详情
     *
     * @return details - 课程详情
     */
    public String getDetails() {
        return details;
    }

    /**
     * 设置课程详情
     *
     * @param details 课程详情
     */
    public void setDetails(String details) {
        this.details = details == null ? null : details.trim();
    }

    /**
     * 获取学校id
     *
     * @return schoolid - 学校id
     */
    public Long getSchoolid() {
        return schoolid;
    }

    /**
     * 设置学校id
     *
     * @param schoolid 学校id
     */
    public void setSchoolid(Long schoolid) {
        this.schoolid = schoolid;
    }

    /**
     * 获取校区id
     *
     * @return areaid - 校区id
     */
    public Long getAreaid() {
        return areaid;
    }

    /**
     * 设置校区id
     *
     * @param areaid 校区id
     */
    public void setAreaid(Long areaid) {
        this.areaid = areaid;
    }

    /**
     * 获取剩余课程数
     *
     * @return count - 剩余课程数
     */
    public Long getCount() {
        return count;
    }

    /**
     * 设置剩余课程数
     *
     * @param count 剩余课程数
     */
    public void setCount(Long count) {
        this.count = count;
    }
}