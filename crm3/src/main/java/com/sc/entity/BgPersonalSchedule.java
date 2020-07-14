package com.sc.entity;

import java.io.Serializable;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;
//办公_个人日程表
public class BgPersonalSchedule implements Serializable {
    private Long schedulePlanId; //日程安排编号

    private String planCategory; //安排类别

    private String planTheme; //安排主题
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date beginDate; //开始日期
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date beginTime; //开始时间

    private Long writePersonnelId; //填写人员编号

    private String planDescribe; //安排描述

    private Long companyId; //公司编号
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date lastModifyDate; //最后修改时间

    private static final long serialVersionUID = 1L;

    public BgPersonalSchedule(Long schedulePlanId, String planCategory, String planTheme, Date beginDate, Date beginTime, Long writePersonnelId, String planDescribe, Long companyId, Date lastModifyDate) {
        this.schedulePlanId = schedulePlanId;
        this.planCategory = planCategory;
        this.planTheme = planTheme;
        this.beginDate = beginDate;
        this.beginTime = beginTime;
        this.writePersonnelId = writePersonnelId;
        this.planDescribe = planDescribe;
        this.companyId = companyId;
        this.lastModifyDate = lastModifyDate;
    }

    public BgPersonalSchedule() {
        super();
    }

    public Long getSchedulePlanId() {
        return schedulePlanId;
    }

    public void setSchedulePlanId(Long schedulePlanId) {
        this.schedulePlanId = schedulePlanId;
    }

    public String getPlanCategory() {
        return planCategory;
    }

    public void setPlanCategory(String planCategory) {
        this.planCategory = planCategory == null ? null : planCategory.trim();
    }

    public String getPlanTheme() {
        return planTheme;
    }

    public void setPlanTheme(String planTheme) {
        this.planTheme = planTheme == null ? null : planTheme.trim();
    }

    public Date getBeginDate() {
        return beginDate;
    }

    public void setBeginDate(Date beginDate) {
        this.beginDate = beginDate;
    }

    public Date getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(Date beginTime) {
        this.beginTime = beginTime;
    }

    public Long getWritePersonnelId() {
        return writePersonnelId;
    }

    public void setWritePersonnelId(Long writePersonnelId) {
        this.writePersonnelId = writePersonnelId;
    }

    public String getPlanDescribe() {
        return planDescribe;
    }

    public void setPlanDescribe(String planDescribe) {
        this.planDescribe = planDescribe == null ? null : planDescribe.trim();
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
		return "BgPersonalSchedule [schedulePlanId=" + schedulePlanId + ", planCategory=" + planCategory
				+ ", planTheme=" + planTheme + ", beginDate=" + beginDate + ", beginTime=" + beginTime
				+ ", writePersonnelId=" + writePersonnelId + ", planDescribe=" + planDescribe + ", companyId="
				+ companyId + ", lastModifyDate=" + lastModifyDate + "]";
	}
    
}