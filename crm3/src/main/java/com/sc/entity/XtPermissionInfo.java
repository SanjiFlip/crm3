package com.sc.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

//系统_权限信息表
public class XtPermissionInfo implements Serializable {
    
	private Long permissonId;	//权限编号

    private String permissonName;	//权限名

    private String permission;  //权限

    private BigDecimal permissionColumnsId;		//权限分栏编号

    private String remarks;  //备注信息
    
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date lastModifyDate; //最后修改时间
    
    private boolean checkstate;
    
    //扩展属性
    private Long columnsId;

    private static final long serialVersionUID = 1L;

    public XtPermissionInfo(Long permissonId, String permissonName, String permission, BigDecimal permissionColumnsId, String remarks, Date lastModifyDate) {
        this.permissonId = permissonId;
        this.permissonName = permissonName;
        this.permission = permission;
        this.permissionColumnsId = permissionColumnsId;
        this.remarks = remarks;
        this.lastModifyDate = lastModifyDate;
    }

    public XtPermissionInfo() {
        super();
    }

    public Long getPermissonId() {
        return permissonId;
    }

    public void setPermissonId(Long permissonId) {
        this.permissonId = permissonId;
    }

    public String getPermissonName() {
        return permissonName;
    }

    public void setPermissonName(String permissonName) {
        this.permissonName = permissonName == null ? null : permissonName.trim();
    }

    public String getPermission() {
        return permission;
    }

    public void setPermission(String permission) {
        this.permission = permission == null ? null : permission.trim();
    }

    public BigDecimal getPermissionColumnsId() {
        return permissionColumnsId;
    }

    public void setPermissionColumnsId(BigDecimal permissionColumnsId) {
        this.permissionColumnsId = permissionColumnsId;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }

    public Date getLastModifyDate() {
        return lastModifyDate;
    }

    public void setLastModifyDate(Date lastModifyDate) {
        this.lastModifyDate = lastModifyDate;
    }
    
    
    
	public Long getColumnsId() {
		return columnsId;
	}

	public void setColumnsId(Long columnsId) {
		this.columnsId = columnsId;
	}
	
	

	public boolean isCheckstate() {
		return checkstate;
	}

	public void setCheckstate(boolean checkstate) {
		this.checkstate = checkstate;
	}

	@Override
	public String toString() {
		return "XtPermissionInfo [permissonId=" + permissonId + ", permissonName=" + permissonName + ", permission="
				+ permission + ", permissionColumnsId=" + permissionColumnsId + ", remarks=" + remarks
				+ ", lastModifyDate=" + lastModifyDate + ", checkstate=" + checkstate + ", columnsId=" + columnsId
				+ "]";
	}

	
    
}