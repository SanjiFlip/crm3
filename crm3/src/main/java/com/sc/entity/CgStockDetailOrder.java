package com.sc.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

//进货_采购单详情表
public class CgStockDetailOrder implements Serializable {
    private BigDecimal purchaseOrderDetailId; //采购详情编号

    private BigDecimal purchaseOrderId;//采购单编号

    private BigDecimal goodsId;//产品编号

    private Long goodsNum;//产品数量

    private BigDecimal goodsPrice;//产品价格

    private String isnotInStorage;//是否入库

    private Long operaterId;//操作人员

    private String noteInformation;//备注信息

    private BigDecimal companyId;//公司编号
    
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date lastModifyDate;//最后修改时间

    private static final long serialVersionUID = 1L;

    public CgStockDetailOrder(BigDecimal purchaseOrderDetailId, BigDecimal purchaseOrderId, BigDecimal goodsId, Long goodsNum, BigDecimal goodsPrice, String isnotInStorage, Long operaterId, String noteInformation, BigDecimal companyId, Date lastModifyDate) {
        this.purchaseOrderDetailId = purchaseOrderDetailId;
        this.purchaseOrderId = purchaseOrderId;
        this.goodsId = goodsId;
        this.goodsNum = goodsNum;
        this.goodsPrice = goodsPrice;
        this.isnotInStorage = isnotInStorage;
        this.operaterId = operaterId;
        this.noteInformation = noteInformation;
        this.companyId = companyId;
        this.lastModifyDate = lastModifyDate;
    }

    public CgStockDetailOrder() {
        super();
    }

    public BigDecimal getPurchaseOrderDetailId() {
        return purchaseOrderDetailId;
    }

    public void setPurchaseOrderDetailId(BigDecimal purchaseOrderDetailId) {
        this.purchaseOrderDetailId = purchaseOrderDetailId;
    }

    public BigDecimal getPurchaseOrderId() {
        return purchaseOrderId;
    }

    public void setPurchaseOrderId(BigDecimal purchaseOrderId) {
        this.purchaseOrderId = purchaseOrderId;
    }

    public BigDecimal getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(BigDecimal goodsId) {
        this.goodsId = goodsId;
    }

    public Long getGoodsNum() {
        return goodsNum;
    }

    public void setGoodsNum(Long goodsNum) {
        this.goodsNum = goodsNum;
    }

    public BigDecimal getGoodsPrice() {
        return goodsPrice;
    }

    public void setGoodsPrice(BigDecimal goodsPrice) {
        this.goodsPrice = goodsPrice;
    }

    public String getIsnotInStorage() {
        return isnotInStorage;
    }

    public void setIsnotInStorage(String isnotInStorage) {
        this.isnotInStorage = isnotInStorage == null ? null : isnotInStorage.trim();
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
		return "CgStockDetailOrder [purchaseOrderDetailId=" + purchaseOrderDetailId + ", purchaseOrderId="
				+ purchaseOrderId + ", goodsId=" + goodsId + ", goodsNum=" + goodsNum + ", goodsPrice=" + goodsPrice
				+ ", isnotInStorage=" + isnotInStorage + ", operaterId=" + operaterId + ", noteInformation="
				+ noteInformation + ", companyId=" + companyId + ", lastModifyDate=" + lastModifyDate + "]";
	}
}