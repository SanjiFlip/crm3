package com.sc.entity;

import java.io.Serializable;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

//系统_权限分栏表
public class XtPermissionColumns implements Serializable {
    private Long columnsId;	//分栏编号

    private String columnsName;	//分栏名

    private String remarks;	//备注信息
    
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date lastModifyDate;	//最后修改时间

    private static final long serialVersionUID = 1L;

    public XtPermissionColumns(Long columnsId, String columnsName, String remarks, Date lastModifyDate) {
        this.columnsId = columnsId;
        this.columnsName = columnsName;
        this.remarks = remarks;
        this.lastModifyDate = lastModifyDate;
    }

    public XtPermissionColumns() {
        super();
    }

    public Long getColumnsId() {
        return columnsId;
    }

    public void setColumnsId(Long columnsId) {
        this.columnsId = columnsId;
    }

    public String getColumnsName() {
        return columnsName;
    }

    public void setColumnsName(String columnsName) {
        this.columnsName = columnsName == null ? null : columnsName.trim();
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
}