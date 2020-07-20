package com.sc.mapper;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class CgStockReplenishmentGoods implements Serializable {
    private Long id;

    private BigDecimal goodsId;

    private Date deliveryTime;

    private String state;

    private Long operaterId;

    private String noteInformation;

    private BigDecimal companyId;

    private Date lastModifyDate;

    private static final long serialVersionUID = 1L;

    public CgStockReplenishmentGoods(Long id, BigDecimal goodsId, Date deliveryTime, String state, Long operaterId, String noteInformation, BigDecimal companyId, Date lastModifyDate) {
        this.id = id;
        this.goodsId = goodsId;
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

    public BigDecimal getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(BigDecimal goodsId) {
        this.goodsId = goodsId;
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
}