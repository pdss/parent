package cn.ydsy.manager.model.dbo;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "tb_productbook")
public class TbProductbook extends BaseDBO {
    @Id
    @Column(name = "Id")
    private Long id;

    /**
     * MINI馆Id
     */
    @Column(name = "SchoolAreaId")
    private Long schoolareaid;

    /**
     * 编号
     */
    @Column(name = "BookNo")
    private String bookno;

    /**
     * 书名
     */
    @Column(name = "BookName")
    private String bookname;

    /**
     * 图片
     */
    @Column(name = "Images")
    private String images;

    /**
     * 绘本类型
     */
    @Column(name = "Category")
    private Integer category;

    /**
     * 作者
     */
    @Column(name = "Author")
    private String author;

    /**
     * 出版社
     */
    @Column(name = "Publication")
    private String publication;

    /**
     * 国际标准书号
     */
    @Column(name = "Serial")
    private String serial;

    /**
     * 售价
     */
    @Column(name = "Price")
    private BigDecimal price;

    /**
     * 简介
     */
    @Column(name = "Description")
    private String description;

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
     * 获取MINI馆Id
     *
     * @return SchoolAreaId - MINI馆Id
     */
    public Long getSchoolareaid() {
        return schoolareaid;
    }

    /**
     * 设置MINI馆Id
     *
     * @param schoolareaid MINI馆Id
     */
    public void setSchoolareaid(Long schoolareaid) {
        this.schoolareaid = schoolareaid;
    }

    /**
     * 获取编号
     *
     * @return BookNo - 编号
     */
    public String getBookno() {
        return bookno;
    }

    /**
     * 设置编号
     *
     * @param bookno 编号
     */
    public void setBookno(String bookno) {
        this.bookno = bookno == null ? null : bookno.trim();
    }

    /**
     * 获取书名
     *
     * @return BookName - 书名
     */
    public String getBookname() {
        return bookname;
    }

    /**
     * 设置书名
     *
     * @param bookname 书名
     */
    public void setBookname(String bookname) {
        this.bookname = bookname == null ? null : bookname.trim();
    }

    /**
     * 获取图片
     *
     * @return Images - 图片
     */
    public String getImages() {
        return images;
    }

    /**
     * 设置图片
     *
     * @param images 图片
     */
    public void setImages(String images) {
        this.images = images == null ? null : images.trim();
    }

    /**
     * 获取绘本类型
     *
     * @return Category - 绘本类型
     */
    public Integer getCategory() {
        return category;
    }

    /**
     * 设置绘本类型
     *
     * @param category 绘本类型
     */
    public void setCategory(Integer category) {
        this.category = category;
    }

    /**
     * 获取作者
     *
     * @return Author - 作者
     */
    public String getAuthor() {
        return author;
    }

    /**
     * 设置作者
     *
     * @param author 作者
     */
    public void setAuthor(String author) {
        this.author = author == null ? null : author.trim();
    }

    /**
     * 获取出版社
     *
     * @return Publication - 出版社
     */
    public String getPublication() {
        return publication;
    }

    /**
     * 设置出版社
     *
     * @param publication 出版社
     */
    public void setPublication(String publication) {
        this.publication = publication == null ? null : publication.trim();
    }

    /**
     * 获取国际标准书号
     *
     * @return Serial - 国际标准书号
     */
    public String getSerial() {
        return serial;
    }

    /**
     * 设置国际标准书号
     *
     * @param serial 国际标准书号
     */
    public void setSerial(String serial) {
        this.serial = serial == null ? null : serial.trim();
    }

    /**
     * 获取售价
     *
     * @return Price - 售价
     */
    public BigDecimal getPrice() {
        return price;
    }

    /**
     * 设置售价
     *
     * @param price 售价
     */
    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    /**
     * 获取简介
     *
     * @return Description - 简介
     */
    public String getDescription() {
        return description;
    }

    /**
     * 设置简介
     *
     * @param description 简介
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
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