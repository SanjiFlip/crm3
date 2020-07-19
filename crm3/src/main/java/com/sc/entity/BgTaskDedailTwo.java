package com.sc.entity;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class BgTaskDedailTwo {
    private Long bhId; //���

    private Long taskId; //������

    private Long acceptUserId; //����������

    private String whetherFinish; //�Ƿ����

    private String state; //״��
    
    private String taskPublishPerson;

    private Long companyId; //��˾���
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date lastModifyDate; //����޸�ʱ��

    private static final long serialVersionUID = 1L;

	public Long getBhId() {
		return bhId;
	}

	public void setBhId(Long bhId) {
		this.bhId = bhId;
	}

	public Long getTaskId() {
		return taskId;
	}

	public void setTaskId(Long taskId) {
		this.taskId = taskId;
	}

	public Long getAcceptUserId() {
		return acceptUserId;
	}

	public void setAcceptUserId(Long acceptUserId) {
		this.acceptUserId = acceptUserId;
	}

	public String getWhetherFinish() {
		return whetherFinish;
	}

	public void setWhetherFinish(String whetherFinish) {
		this.whetherFinish = whetherFinish;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getTaskPublishPerson() {
		return taskPublishPerson;
	}

	public void setTaskPublishPerson(String taskPublishPerson) {
		this.taskPublishPerson = taskPublishPerson;
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

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "BgTaskDedailTwo [bhId=" + bhId + ", taskId=" + taskId + ", acceptUserId=" + acceptUserId
				+ ", whetherFinish=" + whetherFinish + ", state=" + state + ", taskPublishPerson=" + taskPublishPerson
				+ ", companyId=" + companyId + ", lastModifyDate=" + lastModifyDate + "]";
	}

	public BgTaskDedailTwo(Long bhId, Long taskId, Long acceptUserId, String whetherFinish, String state,
			String taskPublishPerson, Long companyId, Date lastModifyDate) {
		super();
		this.bhId = bhId;
		this.taskId = taskId;
		this.acceptUserId = acceptUserId;
		this.whetherFinish = whetherFinish;
		this.state = state;
		this.taskPublishPerson = taskPublishPerson;
		this.companyId = companyId;
		this.lastModifyDate = lastModifyDate;
	}

	public BgTaskDedailTwo() {
		super();
		// TODO Auto-generated constructor stub
	}
    
}
