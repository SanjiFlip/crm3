package com.sc.entity;

import java.io.Serializable;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;
//办公——考核任务表
public class BgExamineTask implements Serializable {
    private Long taskId; //任务编号

    private String taskTitle; //任务标题

    private String taskSpecificContent; //任务具体内容

    private String taskPublishPerson; //任务发布人

    private String examineTarget; //考核指标

    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date taskBeginTime; //任务开始时间
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date taskEndTime; //任务结束时间

    private Long companyId; //公司编号
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date lastModifyDate; //最后修改时间

    private static final long serialVersionUID = 1L;

    public BgExamineTask(Long taskId, String taskTitle, String taskSpecificContent, String taskPublishPerson, String examineTarget, Date taskBeginTime, Date taskEndTime, Long companyId, Date lastModifyDate) {
        this.taskId = taskId;
        this.taskTitle = taskTitle;
        this.taskSpecificContent = taskSpecificContent;
        this.taskPublishPerson = taskPublishPerson;
        this.examineTarget = examineTarget;
        this.taskBeginTime = taskBeginTime;
        this.taskEndTime = taskEndTime;
        this.companyId = companyId;
        this.lastModifyDate = lastModifyDate;
    }

    public BgExamineTask() {
        super();
    }

    public Long getTaskId() {
        return taskId;
    }

    public void setTaskId(Long taskId) {
        this.taskId = taskId;
    }

    public String getTaskTitle() {
        return taskTitle;
    }

    public void setTaskTitle(String taskTitle) {
        this.taskTitle = taskTitle == null ? null : taskTitle.trim();
    }

    public String getTaskSpecificContent() {
        return taskSpecificContent;
    }

    public void setTaskSpecificContent(String taskSpecificContent) {
        this.taskSpecificContent = taskSpecificContent == null ? null : taskSpecificContent.trim();
    }

    public String getTaskPublishPerson() {
        return taskPublishPerson;
    }

    public void setTaskPublishPerson(String taskPublishPerson) {
        this.taskPublishPerson = taskPublishPerson == null ? null : taskPublishPerson.trim();
    }

    public String getExamineTarget() {
        return examineTarget;
    }

    public void setExamineTarget(String examineTarget) {
        this.examineTarget = examineTarget == null ? null : examineTarget.trim();
    }

    public Date getTaskBeginTime() {
        return taskBeginTime;
    }

    public void setTaskBeginTime(Date taskBeginTime) {
        this.taskBeginTime = taskBeginTime;
    }

    public Date getTaskEndTime() {
        return taskEndTime;
    }

    public void setTaskEndTime(Date taskEndTime) {
        this.taskEndTime = taskEndTime;
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
		return "BgExamineTask [taskId=" + taskId + ", taskTitle=" + taskTitle + ", taskSpecificContent="
				+ taskSpecificContent + ", taskPublishPerson=" + taskPublishPerson + ", examineTarget=" + examineTarget
				+ ", taskBeginTime=" + taskBeginTime + ", taskEndTime=" + taskEndTime + ", companyId=" + companyId
				+ ", lastModifyDate=" + lastModifyDate + "]";
	}
    
}