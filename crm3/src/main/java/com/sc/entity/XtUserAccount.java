package com.sc.entity;

import java.io.Serializable;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

//系统_用户_账户表
public class XtUserAccount implements Serializable {
    
	private Long userId;  //用户编号

    private String userName;  //用户名称

    private String userPassword;  //用户密码
 
    private Long staffId;  //员工编号

    private Long companyId; //公司编号

    private String accountState;  //账户状态
    
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date lastModifyDate;  //最后修改时间
    
    //扩展属性
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date datemin;
    
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date datemax;
    
    private Long roleId;

    private static final long serialVersionUID = 1L;

    public XtUserAccount(Long userId, String userName, String userPassword, Long staffId, Long companyId, String accountState, Date lastModifyDate) {
        this.userId = userId;
        this.userName = userName;
        this.userPassword = userPassword;
        this.staffId = staffId;
        this.companyId = companyId;
        this.accountState = accountState;
        this.lastModifyDate = lastModifyDate;
    }

    public XtUserAccount() {
        super();
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword == null ? null : userPassword.trim();
    }

    public Long getStaffId() {
        return staffId;
    }

    public void setStaffId(Long staffId) {
        this.staffId = staffId;
    }

    public Long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }

    public String getAccountState() {
        return accountState;
    }

    public void setAccountState(String accountState) {
        this.accountState = accountState == null ? null : accountState.trim();
    }

    public Date getLastModifyDate() {
        return lastModifyDate;
    }

    public void setLastModifyDate(Date lastModifyDate) {
        this.lastModifyDate = lastModifyDate;
    }
    
    
    
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
	
	

	public Long getRoleId() {
		return roleId;
	}

	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}

	@Override
	public String toString() {
		return "XtUserAccount [userId=" + userId + ", userName=" + userName + ", userPassword=" + userPassword
				+ ", staffId=" + staffId + ", companyId=" + companyId + ", accountState=" + accountState
				+ ", lastModifyDate=" + lastModifyDate + "]";
	}
    
    
    
}