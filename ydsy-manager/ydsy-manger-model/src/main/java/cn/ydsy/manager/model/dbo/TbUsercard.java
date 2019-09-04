package cn.ydsy.manager.model.dbo;

import java.util.Date;
import javax.persistence.*;

@Table(name = "tb_usercard")
public class TbUsercard extends BaseDBO {

    private Long userid;

    private Long cardid;

    private Date buytime;

    private Date overtime;

    private Integer cardtype;

    private String cardno;

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
     * @return userid
     */
    public Long getUserid() {
        return userid;
    }

    /**
     * @param userid
     */
    public void setUserid(Long userid) {
        this.userid = userid;
    }

    /**
     * @return cardid
     */
    public Long getCardid() {
        return cardid;
    }

    /**
     * @param cardid
     */
    public void setCardid(Long cardid) {
        this.cardid = cardid;
    }

    /**
     * @return buytime
     */
    public Date getBuytime() {
        return buytime;
    }

    /**
     * @param buytime
     */
    public void setBuytime(Date buytime) {
        this.buytime = buytime;
    }

    /**
     * @return overtime
     */
    public Date getOvertime() {
        return overtime;
    }

    /**
     * @param overtime
     */
    public void setOvertime(Date overtime) {
        this.overtime = overtime;
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
     * @return cardno
     */
    public String getCardno() {
        return cardno;
    }

    /**
     * @param cardno
     */
    public void setCardno(String cardno) {
        this.cardno = cardno == null ? null : cardno.trim();
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