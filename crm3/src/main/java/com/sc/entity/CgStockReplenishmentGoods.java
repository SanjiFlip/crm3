package com.sc.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

//进货_需补货产品表
public class CgStockReplenishmentGoods implements Serializable {
    private Long id;//编号

    private BigDecimal goosId;//产品编号

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date deliveryTime;//交货时间

    private String state;//状态״̬

    private Long operaterId;//操作人员

    private String noteInformation;//备注信息

    private BigDecimal companyId;//公司编号

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date lastModifyDate;//最后修改日期

    private static final long serialVersionUID = 1L;

    public CgStockReplenishmentGoods(Long id, BigDecimal goosId, Date deliveryTime, String state, Long operaterId, String noteInformation, BigDecimal companyId, Date lastModifyDate) {
        this.id = id;
        this.goosId = goosId;
        this.deliveryTime = deliveryTime;
        this.state = state;
        this.operaterId = operaterId;
        this.noteInformation = noteInformation;
        this.companyId = companyId;
        this.lastModifyDate = lastModifyDate;
    }

    public CgStockReplenishmentGoods() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public BigDecimal getGoosId() {
        return goosId;
    }

    public void setGoosId(BigDecimal goosId) {
        this.goosId = goosId;
    }

    public Date getDeliveryTime() {
        return deliveryTime;
    }

    public void setDeliveryTime(Date deliveryTime) {
        this.deliveryTime = deliveryTime;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    public Long getOperaterId() {
        return operaterId;
    }

    public void setOperaterId(Long operaterId) {
        this.operaterId = operaterId;
    }

    public String getNoteInformation() {
        return noteInformation;
    }

    public void setNoteInformation(String noteInformation) {
        this.noteInformation = noteInformation == null ? null : noteInformation.trim();
    }

    public BigDecimal getCompanyId() {
        return companyId;
    }

    public void setCompanyId(BigDecimal companyId) {
        this.companyId = companyId;
    }

    public Date getLastModifyDate() {
        return lastModifyDate;
    }

    public void setLastModifyDate(Date lastModifyDate) {
        this.lastModifyDate = lastModifyDate;
    }

	@Override
	public String toString() {
		return "CgStockReplenishmentGoods [id=" + id + ", goosId=" + goosId + ", deliveryTime=" + deliveryTime
				+ ", state=" + state + ", operaterId=" + operaterId + ", noteInformation=" + noteInformation
				+ ", companyId=" + companyId + ", lastModifyDate=" + lastModifyDate + "]";
	}
    
}