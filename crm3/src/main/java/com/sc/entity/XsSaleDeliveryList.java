package com.sc.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;
//销售_销售出库单
public class XsSaleDeliveryList implements Serializable {
    private Long salesId;//销售单编号
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date creatListDate;//制单日期

    private String invoiceNumber;//发票号码

    private Long userId;//用户编号

    private Long customerId;//客户编号

    private BigDecimal saleAmount;//销售金额

    private String saleDeliveryStatus;//销售出库状态

    private String isRebate;//是否返利

    private String orderStatus;//订单状态

    private String noteInformation;//备注信息

    private Long companyId;//公司编号
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date lastModifyDate;//最后修改时间

    private static final long serialVersionUID = 1L;

    public XsSaleDeliveryList(Long salesId, Date creatListDate, String invoiceNumber, Long userId, Long customerId, BigDecimal saleAmount, String saleDeliveryStatus, String isRebate, String orderStatus, String noteInformation, Long companyId, Date lastModifyDate) {
        this.salesId = salesId;
        this.creatListDate = creatListDate;
        this.invoiceNumber = invoiceNumber;
        this.userId = userId;
        this.customerId = customerId;
        this.saleAmount = saleAmount;
        this.saleDeliveryStatus = saleDeliveryStatus;
        this.isRebate = isRebate;
        this.orderStatus = orderStatus;
        this.noteInformation = noteInformation;
        this.companyId = companyId;
        this.lastModifyDate = lastModifyDate;
    }

    public XsSaleDeliveryList() {
        super();
    }

    public Long getSalesId() {
        return salesId;
    }

    public void setSalesId(Long salesId) {
        this.salesId = salesId;
    }

    public Date getCreatListDate() {
        return creatListDate;
    }

    public void setCreatListDate(Date creatListDate) {
        this.creatListDate = creatListDate;
    }

    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    public void setInvoiceNumber(String invoiceNumber) {
        this.invoiceNumber = invoiceNumber == null ? null : invoiceNumber.trim();
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public BigDecimal getSaleAmount() {
        return saleAmount;
    }

    public void setSaleAmount(BigDecimal saleAmount) {
        this.saleAmount = saleAmount;
    }

    public String getSaleDeliveryStatus() {
        return saleDeliveryStatus;
    }

    public void setSaleDeliveryStatus(String saleDeliveryStatus) {
        this.saleDeliveryStatus = saleDeliveryStatus == null ? null : saleDeliveryStatus.trim();
    }

    public String getIsRebate() {
        return isRebate;
    }

    public void setIsRebate(String isRebate) {
        this.isRebate = isRebate == null ? null : isRebate.trim();
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus == null ? null : orderStatus.trim();
    }

    public String getNoteInformation() {
        return noteInformation;
    }

    public void setNoteInformation(String noteInformation) {
        this.noteInformation = noteInformation == null ? null : noteInformation.trim();
    }

    public Long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Long companyId) {
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
		return "XsSaleDeliveryList [salesId=" + salesId + ", creatListDate=" + creatListDate + ", invoiceNumber="
				+ invoiceNumber + ", userId=" + userId + ", customerId=" + customerId + ", saleAmount=" + saleAmount
				+ ", saleDeliveryStatus=" + saleDeliveryStatus + ", isRebate=" + isRebate + ", orderStatus="
				+ orderStatus + ", noteInformation=" + noteInformation + ", companyId=" + companyId
				+ ", lastModifyDate=" + lastModifyDate + "]";
	}
    
}