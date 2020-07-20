package com.sc.entity;

import java.io.Serializable;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;
//人事——职务信息表
public class RsPostMessage implements Serializable {
    private Long postId; //职务编号

    private String postName; //职务名称

    private Long dtmartmentId;//部门编号

    private String remarkExplain; //备注说明

    private Long compnayId; //公司编号

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date lastModifyDate; //最后修改时间
    
    //扩展属性
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date datemin; 
    
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date datemax; 
    
  //扩展属性 用于批量删除
  	private Long[] ids;	
  	
  	
    

    public Long[] getIds() {
		return ids;
	}

	public void setIds(Long[] ids) {
		this.ids = ids;
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

	private static final long serialVersionUID = 1L;

    public RsPostMessage(Long postId, String postName, Long dtmartmentId, String remarkExplain, Long compnayId, Date lastModifyDate) {
        this.postId = postId;
        this.postName = postName;
        this.dtmartmentId = dtmartmentId;
        this.remarkExplain = remarkExplain;
        this.compnayId = compnayId;
        this.lastModifyDate = lastModifyDate;
    }

    public RsPostMessage() {
        super();
    }

    public Long getPostId() {
        return postId;
    }

    public void setPostId(Long postId) {
        this.postId = postId;
    }

    public String getPostName() {
        return postName;
    }

    public void setPostName(String postName) {
        this.postName = postName == null ? null : postName.trim();
    }

    public Long getDtmartmentId() {
        return dtmartmentId;
    }

    public void setDtmartmentId(Long dtmartmentId) {
        this.dtmartmentId = dtmartmentId;
    }

    public String getRemarkExplain() {
        return remarkExplain;
    }

    public void setRemarkExplain(String remarkExplain) {
        this.remarkExplain = remarkExplain == null ? null : remarkExplain.trim();
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
		return "RsPostMessage [postId=" + postId + ", postName=" + postName + ", dtmartmentId=" + dtmartmentId
				+ ", remarkExplain=" + remarkExplain + ", compnayId=" + compnayId + ", lastModifyDate=" + lastModifyDate
				+ "]";
	}
    
    
    
    
    
}