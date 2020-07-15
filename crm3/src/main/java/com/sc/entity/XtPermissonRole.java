package com.sc.entity;

import java.io.Serializable;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

//系统_权限角色表
public class XtPermissonRole implements Serializable {
    private Long id;	//编号

    private Long permissonId;  //权限编号

    private Long roleId;		//角色编号

    private Long operaterId;	//操作人员编号
    
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss") //最后修改时间
    private Date lastModifyDate;

    private static final long serialVersionUID = 1L;

    public XtPermissonRole(Long id, Long permissonId, Long roleId, Long operaterId, Date lastModifyDate) {
        this.id = id;
        this.permissonId = permissonId;
        this.roleId = roleId;
        this.operaterId = operaterId;
        this.lastModifyDate = lastModifyDate;
    }

    public XtPermissonRole() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getPermissonId() {
        return permissonId;
    }

    public void setPermissonId(Long permissonId) {
        this.permissonId = permissonId;
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