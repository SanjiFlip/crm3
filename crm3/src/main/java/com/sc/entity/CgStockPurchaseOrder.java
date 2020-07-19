package com.sc.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

//进货_采购单
public class CgStockPurchaseOrder implements Serializable { 
    private BigDecimal purchaseOrderId;//采购单编号

    private String purchaseSubject;//采购主题

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date purchaseDate;//采购日期

    private Long supplierId;//供应商编号

    private BigDecimal loanAmount;//贷款金额

    private BigDecimal invoiceNumber;//发票号码

    private String paymentStatus;//付款情况

    private String purchaseProgress;//采购进展

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date deliveryDate;//交货日期

    private String deliveryPlace;//交货地点

    private String deliveryMode;//交货方式

    private Long operaterId;//操作人员

	private String noteInformation;//备注信息

    private BigDecimal companyId;//公司编号

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date lastModifyDate;//最后修改日期
    
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date datemax;
    
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date datemin;
    

    public Date getDatemax() {
		return datemax;
	}

	public void setDatemax(Date datemax) {
		this.datemax = datemax;
	}

	public Date getDatemin() {
		return datemin;
	}

	public void setDatemin(Date datemin) {
		this.datemin = datemin;
	}
    

	private static final long serialVersionUID = 1L;

    public CgStockPurchaseOrder(BigDecimal purchaseOrderId, String purchaseSubject, Date purchaseDate, Long supplierId, BigDecimal loanAmount, BigDecimal invoiceNumber, String paymentStatus, String purchaseProgress, Date deliveryDate, String deliveryPlace, String deliveryMode, Long operaterId, String noteInformation, BigDecimal companyId, Date lastModifyDate) {
        this.purchaseOrderId = purchaseOrderId;
        this.purchaseSubject = purchaseSubject;
        this.purchaseDate = purchaseDate;
        this.supplierId = supplierId;
        this.loanAmount = loanAmount;
        this.invoiceNumber = invoiceNumber;
        this.paymentStatus = paymentStatus;
        this.purchaseProgress = purchaseProgress;
        this.deliveryDate = deliveryDate;
        this.deliveryPlace = deliveryPlace;
        this.deliveryMode = deliveryMode;
        this.operaterId = operaterId;
        this.noteInformation = noteInformation;
        this.companyId = companyId;
        this.lastModifyDate = lastModifyDate;
    }

    public CgStockPurchaseOrder() {
        super();
    }

    public BigDecimal getPurchaseOrderId() {
        return purchaseOrderId;
    }

    public void setPurchaseOrderId(BigDecimal purchaseOrderId) {
        this.purchaseOrderId = purchaseOrderId;
    }

    public String getPurchaseSubject() {
        return purchaseSubject;
    }

    public void setPurchaseSubject(String purchaseSubject) {
        this.purchaseSubject = purchaseSubject == null ? null : purchaseSubject.trim();
    }

    public Date getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(Date purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public Long getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(Long supplierId) {
        this.supplierId = supplierId;
    }

    public BigDecimal getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(BigDecimal loanAmount) {
        this.loanAmount = loanAmount;
    }

    public BigDecimal getInvoiceNumber() {
        return invoiceNumber;
    }

    public void setInvoiceNumber(BigDecimal invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    public String getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus == null ? null : paymentStatus.trim();
    }

    public String getPurchaseProgress() {
        return purchaseProgress;
    }

    public void setPurchaseProgress(String purchaseProgress) {
        this.purchaseProgress = purchaseProgress == null ? null : purchaseProgress.trim();
    }

    public Date getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(Date deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public String getDeliveryPlace() {
        return deliveryPlace;
    }

    public void setDeliveryPlace(String deliveryPlace) {
        this.deliveryPlace = deliveryPlace == null ? null : deliveryPlace.trim();
    }

    public String getDeliveryMode() {
        return deliveryMode;
    }

    public void setDeliveryMode(String deliveryMode) {
        this.deliveryMode = deliveryMode == null ? null : deliveryMode.trim();
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
		return "CgStockPurchaseOrder [purchaseOrderId=" + purchaseOrderId + ", purchaseSubject=" + purchaseSubject
				+ ", purchaseDate=" + purchaseDate + ", supplierId=" + supplierId + ", loanAmount=" + loanAmount
				+ ", invoiceNumber=" + invoiceNumber + ", paymentStatus=" + paymentStatus + ", purchaseProgress="
				+ purchaseProgress + ", deliveryDate=" + deliveryDate + ", deliveryPlace=" + deliveryPlace
				+ ", deliveryMode=" + deliveryMode + ", operaterId=" + operaterId + ", noteInformation="
				+ noteInformation + ", companyId=" + companyId + ", lastModifyDate=" + lastModifyDate + "]";
	}
}