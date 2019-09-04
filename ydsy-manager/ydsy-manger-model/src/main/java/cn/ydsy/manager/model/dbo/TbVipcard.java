package cn.ydsy.manager.model.dbo;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "tb_vipcard")
public class TbVipcard extends BaseDBO {

    private BigDecimal price;

    private BigDecimal saleprice;

    private BigDecimal givemoney;

    private String cardname;

    private Integer cardtype;

    private Date addtime;

    private String description;

    private String logo;

    private String services;

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
     * @return price
     */
    public BigDecimal getPrice() {
        return price;
    }

    /**
     * @param price
     */
    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    /**
     * @return saleprice
     */
    public BigDecimal getSaleprice() {
        return saleprice;
    }

    /**
     * @param saleprice
     */
    public void setSaleprice(BigDecimal saleprice) {
        this.saleprice = saleprice;
    }

    /**
     * @return givemoney
     */
    public BigDecimal getGivemoney() {
        return givemoney;
    }

    /**
     * @param givemoney
     */
    public void setGivemoney(BigDecimal givemoney) {
        this.givemoney = givemoney;
    }

    /**
     * @return cardname
     */
    public String getCardname() {
        return cardname;
    }

    /**
     * @param cardname
     */
    public void setCardname(String cardname) {
        this.cardname = cardname == null ? null : cardname.trim();
    }

    /**
     * @return cardtype
     */
    public Integer getCardtype() {
        return cardtype;
    }

    /**
     * @param cardtype
     */
    public void setCardtype(Integer cardtype) {
        this.cardtype = cardtype;
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
     * @return description
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
     * @return logo
     */
    public String getLogo() {
        return logo;
    }

    /**
     * @param logo
     */
    public void setLogo(String logo) {
        this.logo = logo == null ? null : logo.trim();
    }

    /**
     * @return services
     */
    public String getServices() {
        return services;
    }

    /**
     * @param services
     */
    public void setServices(String services) {
        this.services = services == null ? null : services.trim();
    }
}