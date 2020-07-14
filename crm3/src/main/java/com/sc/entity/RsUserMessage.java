package com.sc.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;
//人事——用户信息表
public class RsUserMessage implements Serializable {
    private Long staffId; //员工编号

    private String staffName; //员工姓名

    private String staffSex; //员工性别

    private String staffPhoto; //员工照片

    private BigDecimal idCard; //身份证号

    private String hometownAddress; //家乡地址ַ

    private String nowAddress; //现在地址ڵ�ַ

    private String staffEducationalBackground; //员工学历

    private String politicCountenance;//政治面貌

    private String graduateSchool; //毕业学校

    private String onlineContactInfromation; //网上联系方式

    private String onlineContactDetails; //网上联系详情

    private String examineState; //审核状态״̬

    private Long postId; //职务编号

    private String staffState; //员工状态״̬

    private String remarks; //备注ע

    
    private Long compnayId; //公司编号

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date lastModifyDate; //最后修改时间
    
  //扩展属性 用于日期和模糊查询
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date datemin; 
    
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date datemax; 
    
  //扩展属性 用于批量删除
  	private Long[] ids;	
    
    
    

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

	public Long[] getIds() {
		return ids;
	}

	public void setIds(Long[] ids) {
		this.ids = ids;
	}

	private static final long serialVersionUID = 1L;

    public RsUserMessage(Long staffId, String staffName, String staffSex, String staffPhoto, BigDecimal idCard, String hometownAddress, String nowAddress, String staffEducationalBackground, String politicCountenance, String graduateSchool, String onlineContactInfromation, String onlineContactDetails, String examineState, Long postId, String staffState, String remarks, Long compnayId, Date lastModifyDate) {
        this.staffId = staffId;
        this.staffName = staffName;
        this.staffSex = staffSex;
        this.staffPhoto = staffPhoto;
        this.idCard = idCard;
        this.hometownAddress = hometownAddress;
        this.nowAddress = nowAddress;
        this.staffEducationalBackground = staffEducationalBackground;
        this.politicCountenance = politicCountenance;
        this.graduateSchool = graduateSchool;
        this.onlineContactInfromation = onlineContactInfromation;
        this.onlineContactDetails = onlineContactDetails;
        this.examineState = examineState;
        this.postId = postId;
        this.staffState = staffState;
        this.remarks = remarks;
        this.compnayId = compnayId;
        this.lastModifyDate = lastModifyDate;
    }

    public RsUserMessage() {
        super();
    }

    public Long getStaffId() {
        return staffId;
    }

    public void setStaffId(Long staffId) {
        this.staffId = staffId;
    }

    public String getStaffName() {
        return staffName;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName == null ? null : staffName.trim();
    }

    public String getStaffSex() {
        return staffSex;
    }

    public void setStaffSex(String staffSex) {
        this.staffSex = staffSex == null ? null : staffSex.trim();
    }

    public String getStaffPhoto() {
        return staffPhoto;
    }

    public void setStaffPhoto(String staffPhoto) {
        this.staffPhoto = staffPhoto == null ? null : staffPhoto.trim();
    }

    public BigDecimal getIdCard() {
        return idCard;
    }

    public void setIdCard(BigDecimal idCard) {
        this.idCard = idCard;
    }

    public String getHometownAddress() {
        return hometownAddress;
    }

    public void setHometownAddress(String hometownAddress) {
        this.hometownAddress = hometownAddress == null ? null : hometownAddress.trim();
    }

    public String getNowAddress() {
        return nowAddress;
    }

    public void setNowAddress(String nowAddress) {
        this.nowAddress = nowAddress == null ? null : nowAddress.trim();
    }

    public String getStaffEducationalBackground() {
        return staffEducationalBackground;
    }

    public void setStaffEducationalBackground(String staffEducationalBackground) {
        this.staffEducationalBackground = staffEducationalBackground == null ? null : staffEducationalBackground.trim();
    }

    public String getPoliticCountenance() {
        return politicCountenance;
    }

    public void setPoliticCountenance(String politicCountenance) {
        this.politicCountenance = politicCountenance == null ? null : politicCountenance.trim();
    }

    public String getGraduateSchool() {
        return graduateSchool;
    }

    public void setGraduateSchool(String graduateSchool) {
        this.graduateSchool = graduateSchool == null ? null : graduateSchool.trim();
    }

    public String getOnlineContactInfromation() {
        return onlineContactInfromation;
    }

    public void setOnlineContactInfromation(String onlineContactInfromation) {
        this.onlineContactInfromation = onlineContactInfromation == null ? null : onlineContactInfromation.trim();
    }

    public String getOnlineContactDetails() {
        return onlineContactDetails;
    }

    public void setOnlineContactDetails(String onlineContactDetails) {
        this.onlineContactDetails = onlineContactDetails == null ? null : onlineContactDetails.trim();
    }

    public String getExamineState() {
        return examineState;
    }

    public void setExamineState(String examineState) {
        this.examineState = examineState == null ? null : examineState.trim();
    }

    public Long getPostId() {
        return postId;
    }

    public void setPostId(Long postId) {
        this.postId = postId;
    }

    public String getStaffState() {
        return staffState;
    }

    public void setStaffState(String staffState) {
        this.staffState = staffState == null ? null : staffState.trim();
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }

    public Long getCompnayId() {
        return compnayId;
    }

    public void setCompnayId(Long compnayId) {
        this.compnayId = compnayId;
    }

    public Date getLastModifyDate() {
        return lastModifyDate;
    }

    public void setLastModifyDate(Date lastModifyDate) {
        this.lastModifyDate = lastModifyDate;
    }

	@Override
	public String toString() {
		return "RsUserMessage [staffId=" + staffId + ", staffName=" + staffName + ", staffSex=" + staffSex
				+ ", staffPhoto=" + staffPhoto + ", idCard=" + idCard + ", hometownAddress=" + hometownAddress
				+ ", nowAddress=" + nowAddress + ", staffEducationalBackground=" + staffEducationalBackground
				+ ", politicCountenance=" + politicCountenance + ", graduateSchool=" + graduateSchool
				+ ", onlineContactInfromation=" + onlineContactInfromation + ", onlineContactDetails="
				+ onlineContactDetails + ", examineState=" + examineState + ", postId=" + postId + ", staffState="
				+ staffState + ", remarks=" + remarks + ", compnayId=" + compnayId + ", lastModifyDate="
				+ lastModifyDate + "]";
	}
    
    
    
    
}