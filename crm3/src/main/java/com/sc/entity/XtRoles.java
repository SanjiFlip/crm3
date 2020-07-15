package com.sc.entity;

import java.io.Serializable;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

//系统_角色表
public class XtRoles implements Serializable {
    private Long roleId;	//角色编号

    private String roleName;   //角色名称

    private String roleDes;		//角色描述

    private Long upRoleId;		//上级操作人员

    private String operator;	//操作员
    
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date lastModifyDate;  //最后修改时间
    
    //扩展属性
    private String upRoleName;

    private static final long serialVersionUID = 1L;

    public XtRoles(Long roleId, String roleName, String roleDes, Long upRoleId, String operator, Date lastModifyDate) {
        this.roleId = roleId;
        this.roleName = roleName;
        this.roleDes = roleDes;
        this.upRoleId = upRoleId;
        this.operator = operator;
        this.lastModifyDate = lastModifyDate;
    }

    public XtRoles() {
        super();
    }

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName == null ? null : roleName.trim();
    }

    public String getRoleDes() {
        return roleDes;
    }

    public void setRoleDes(String roleDes) {
        this.roleDes = roleDes == null ? null : roleDes.trim();
    }

    public Long getUpRoleId() {
        return upRoleId;
    }

    public void setUpRoleId(Long upRoleId) {
        this.upRoleId = upRoleId;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator == null ? null : operator.trim();
    }

    public Date getLastModifyDate() {
        return lastModifyDate;
    }

    public void setLastModifyDate(Date lastModifyDate) {
        this.lastModifyDate = lastModifyDate;
    }

	public String getUpRoleName() {
		return upRoleName;
	}

	public void setUpRoleName(String upRoleName) {
		this.upRoleName = upRoleName;
	}

	@Override
	public String toString() {
		return "XtRoles [roleId=" + roleId + ", roleName=" + roleName + ", roleDes=" + roleDes + ", upRoleId="
				+ upRoleId + ", operator=" + operator + ", lastModifyDate=" + lastModifyDate + ", upRoleName="
				+ upRoleName + "]";
	}
    
    
}