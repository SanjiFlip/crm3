package com.sc.entity;

import java.io.Serializable;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;
//客户流失表
public class XsCustomerLose implements Serializable {
    private Long loseId;//客户流失编号

    private Long customerId;//客户编号

    private Long manageId;//操作人员编号

    private String way;//处理方式

    private String measures;//处理措施

    private String islose;//是否流失

    private Long companyId;//公司编号

    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss") 
    private Date lastModifyDate;//最后修改时间
    
     //扩展属性 用于查询-start
      @DateTimeFormat(pattern="yyyy-MM-dd")
      private Date datemin;
      
      @DateTimeFormat(pattern="yyyy-MM-dd")
      private Date datemax;
      
      
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
  	//扩展属性 用于查询-end
    private static final long serialVersionUID = 1L;

    public XsCustomerLose(Long loseId, Long customerId, Long manageId, String way, String measures, String islose, Long companyId, Date lastModifyDate) {
        this.loseId = loseId;
        this.customerId = customerId;
        this.manageId = manageId;
        this.way = way;
        this.measures = measures;
        this.islose = islose;
        this.companyId = companyId;
        this.lastModifyDate = lastModifyDate;
    }

    public XsCustomerLose() {
        super();
    }

    public Long getLoseId() {
        return loseId;
    }

    public void setLoseId(Long loseId) {
        this.loseId = loseId;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public Long getManageId() {
        return manageId;
    }

    public void setManageId(Long manageId) {
        this.manageId = manageId;
    }

    public String getWay() {
        return way;
    }

    public void setWay(String way) {
        this.way = way == null ? null : way.trim();
    }

    public String getMeasures() {
        return measures;
    }

    public void setMeasures(String measures) {
        this.measures = measures == null ? null : measures.trim();
    }

    public String getIslose() {
        return islose;
    }

    public void setIslose(String islose) {
        this.islose = islose == null ? null : islose.trim();
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
}