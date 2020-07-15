package com.sc.entity;

import java.io.Serializable;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;
//销售_客户联系记录表
public class XsCustomerContactRecord implements Serializable {
    private Long contactRecordId;//联系记录编号

    private String contactHeading;//联系标题
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date contactDate;//联系时间

    private Long customerId;//客户编号

    private String contactContent;//联系内容

    private Long companyId;//公司编号
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date lastModifyDate;//最后修改时间

    private static final long serialVersionUID = 1L;

    public XsCustomerContactRecord(Long contactRecordId, String contactHeading, Date contactDate, Long customerId, String contactContent, Long companyId, Date lastModifyDate) {
        this.contactRecordId = contactRecordId;
        this.contactHeading = contactHeading;
        this.contactDate = contactDate;
        this.customerId = customerId;
        this.contactContent = contactContent;
        this.companyId = companyId;
        this.lastModifyDate = lastModifyDate;
    }

    public XsCustomerContactRecord() {
        super();
    }

    public Long getContactRecordId() {
        return contactRecordId;
    }

    public void setContactRecordId(Long contactRecordId) {
        this.contactRecordId = contactRecordId;
    }

    public String getContactHeading() {
        return contactHeading;
    }

    public void setContactHeading(String contactHeading) {
        this.contactHeading = contactHeading == null ? null : contactHeading.trim();
    }

    public Date getContactDate() {
        return contactDate;
    }

    public void setContactDate(Date contactDate) {
        this.contactDate = contactDate;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public String getContactContent() {
        return contactContent;
    }

    public void setContactContent(String contactContent) {
        this.contactContent = contactContent == null ? null : contactContent.trim();
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
		return "XsCustomerContactRecord [contactRecordId=" + contactRecordId + ", contactHeading=" + contactHeading
				+ ", contactDate=" + contactDate + ", customerId=" + customerId + ", contactContent=" + contactContent
				+ ", companyId=" + companyId + ", lastModifyDate=" + lastModifyDate + "]";
	}
}