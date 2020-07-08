package com.sc.entity;

import java.io.Serializable;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;
//人事——部门表
public class RsDepartment implements Serializable {
    private Long departmentId; 	//部门编号

    private String departmentName;  //部门名称

    private String remarkExplain;	//备注说明

    private Long companyId;		//公司编号
    
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date lastModifyDate;	//最后修改时间

    private static final long serialVersionUID = 1L;

    public RsDepartment(Long departmentId, String departmentName, String remarkExplain, Long companyId, Date lastModifyDate) {
        this.departmentId = departmentId;
        this.departmentName = departmentName;
        this.remarkExplain = remarkExplain;
        this.companyId = companyId;
        this.lastModifyDate = lastModifyDate;
    }

    public RsDepartment() {
        super();
    }

    public Long getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Long departmentId) {
        this.departmentId = departmentId;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName == null ? null : departmentName.trim();
    }

    public String getRemarkExplain() {
        return remarkExplain;
    }

    public void setRemarkExplain(String remarkExplain) {
        this.remarkExplain = remarkExplain == null ? null : remarkExplain.trim();
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
		return "RsDepartment [departmentId=" + departmentId + ", departmentName=" + departmentName + ", remarkExplain="
				+ remarkExplain + ", companyId=" + companyId + ", lastModifyDate=" + lastModifyDate + "]";
	}
    
    
    
    
}