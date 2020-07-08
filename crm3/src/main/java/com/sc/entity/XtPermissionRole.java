package com.sc.entity;

import java.io.Serializable;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

//系统_权限角色表
public class XtPermissionRole implements Serializable {
    private Long id;	//编号

    private Long permissionId;  //权限编号

    private Long roleId;		//角色编号

    private Long operaterId;	//操作人员编号
    
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss") //最后修改时间
    private Date lastModifyDate;

    private static final long serialVersionUID = 1L;

    public XtPermissionRole(Long id, Long permissionId, Long roleId, Long operaterId, Date lastModifyDate) {
        this.id = id;
        this.permissionId = permissionId;
        this.roleId = roleId;
        this.operaterId = operaterId;
        this.lastModifyDate = lastModifyDate;
    }

    public XtPermissionRole() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getPermissionId() {
        return permissionId;
    }

    public void setPermissionId(Long permissionId) {
        this.permissionId = permissionId;
    }

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public Long getOperaterId() {
        return operaterId;
    }

    public void setOperaterId(Long operaterId) {
        this.operaterId = operaterId;
    }

    public Date getLastModifyDate() {
        return lastModifyDate;
    }

    public void setLastModifyDate(Date lastModifyDate) {
        this.lastModifyDate = lastModifyDate;
    }
}