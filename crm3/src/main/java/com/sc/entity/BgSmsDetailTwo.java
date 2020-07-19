package com.sc.entity;

import java.util.Date;

public class BgSmsDetailTwo {
    private Long detailId; //详情编号

    private Long shortMessageId; //短信息编号
    private String title; //标题

    private String content; //内容

    private String sendPerson; //发送人
    
    private Long recipientId; //接收人
    
    private String messageState; //信息状态
    
    private Date lastModifyDate; //最后修改时间
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
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getSendPerson() {
		return sendPerson;
	}
	public void setSendPerson(String sendPerson) {
		this.sendPerson = sendPerson;
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
		this.messageState = messageState;
	}
	public Date getLastModifyDate() {
		return lastModifyDate;
	}
	public void setLastModifyDate(Date lastModifyDate) {
		this.lastModifyDate = lastModifyDate;
	}
	@Override
	public String toString() {
		return "BgSmsDetailTwo [detailId=" + detailId + ", shortMessageId=" + shortMessageId + ", title=" + title
				+ ", content=" + content + ", sendPerson=" + sendPerson + ", recipientId=" + recipientId
				+ ", messageState=" + messageState + ", lastModifyDate=" + lastModifyDate + "]";
	}
	public BgSmsDetailTwo(Long detailId, Long shortMessageId, String title, String content, String sendPerson,
			Long recipientId, String messageState, Date lastModifyDate) {
		super();
		this.detailId = detailId;
		this.shortMessageId = shortMessageId;
		this.title = title;
		this.content = content;
		this.sendPerson = sendPerson;
		this.recipientId = recipientId;
		this.messageState = messageState;
		this.lastModifyDate = lastModifyDate;
	}
	public BgSmsDetailTwo() {
		super();
		// TODO Auto-generated constructor stub
	}

    
}
