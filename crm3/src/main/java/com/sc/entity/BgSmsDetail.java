package com.sc.entity;

import java.io.Serializable;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;
//办公——短信息详情表
public class BgSmsDetail implements Serializable {
    private Long detailId; //详情编号

    private Long shortMessageId; //短信息编号

    private Long recipientId; //接收者编号

    private String messageState; //信息状态

    private Long companyId; //公司编号
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date lastModifyDate; //最后修改时间

    private static final long serialVersionUID = 1L;

    public BgSmsDetail(Long detailId, Long shortMessageId, Long recipientId, String messageState, Long companyId, Date lastModifyDate) {
        this.detailId = detailId;
        this.shortMessageId = shortMessageId;
        this.recipientId = recipientId;
        this.messageState = messageState;
        this.companyId = companyId;
        this.lastModifyDate = lastModifyDate;
    }

    public BgSmsDetail() {
        super();
    }

    public Long getDetailId() {
        return detailId;
    }

    public void setDetailId(Long detailId) {
        this.detailId = detailId;
    }

    public Long getShortMessageId() {
        return shortMessageId;
    }

    public void setShortMessageId(Long shortMessageId) {
        this.shortMessageId = shortMessageId;
    }

    public Long getRecipientId() {
        return recipientId;
    }

    public void setRecipientId(Long recipientId) {
        this.recipientId = recipientId;
    }

    public String getMessageState() {
        return messageState;
    }

    public void setMessageState(String messageState) {
        this.messageState = messageState == null ? null : messageState.trim();
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
		return "BgSmsDetail [detailId=" + detailId + ", shortMessageId=" + shortMessageId + ", recipientId="
				+ recipientId + ", messageState=" + messageState + ", companyId=" + companyId + ", lastModifyDate="
				+ lastModifyDate + "]";
	}
    
}