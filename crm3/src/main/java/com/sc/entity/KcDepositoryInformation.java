package com.sc.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;
//库存_仓库信息表
public class KcDepositoryInformation implements Serializable {
    private Long depositoryId;//仓库编号

    private String depositoryName;//仓库名称

    private String noteInformation;//备注信息

    private BigDecimal companyId;//公司编号

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date lastModifyDate;//最后修改时间

    private static final long serialVersionUID = 1L;

    public KcDepositoryInformation(Long depositoryId, String depositoryName, String noteInformation, BigDecimal companyId, Date lastModifyDate) {
        this.depositoryId = depositoryId;
        this.depositoryName = depositoryName;
        this.noteInformation = noteInformation;
        this.companyId = companyId;
        this.lastModifyDate = lastModifyDate;
    }

    public KcDepositoryInformation() {
        super();
    }

    public Long getDepositoryId() {
        return depositoryId;
    }

    public void setDepositoryId(Long depositoryId) {
        this.depositoryId = depositoryId;
    }

    public String getDepositoryName() {
        return depositoryName;
    }

    public void setDepositoryName(String depositoryName) {
        this.depositoryName = depositoryName == null ? null : depositoryName.trim();
    }

    public String getNoteInformation() {
        return noteInformation;
    }

    public void setNoteInformation(String noteInformation) {
        this.noteInformation = noteInformation == null ? null : noteInformation.trim();
    }

    public BigDecimal getCompanyId() {
        return companyId;
    }

    public void setCompanyId(BigDecimal companyId) {
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
		return "KcDepositoryInformation [depositoryId=" + depositoryId + ", depositoryName=" + depositoryName
				+ ", noteInformation=" + noteInformation + ", companyId=" + companyId + ", lastModifyDate="
				+ lastModifyDate + "]";
	}
    
}