package com.sc.entity;

import java.io.Serializable;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;
//�칫�������������
public class BgExamineTask implements Serializable {
    private Long taskId; //������

    private String taskTitle; //�������

    private String taskSpecificContent; //�����������

    private String taskPublishPerson; //���񷢲���

    private String examineTarget; //����ָ��

    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date taskBeginTime; //����ʼʱ��
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date taskEndTime; //�������ʱ��

    private Long companyId; //��˾���
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date lastModifyDate; //����޸�ʱ��
    
  //日期范围内查询
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date datemin;
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date datemax;
    

    public Date getDatemin() {
		return datemin;
	}

	public void setDatemin(Date datemin) {
		this.datemin = datemin;
	}

	public Date getDatemax() {
		return datemax;
	}

	public void setDatemax(Date datemax) {
		this.datemax = datemax;
	}
	//日期范围内查询 end
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