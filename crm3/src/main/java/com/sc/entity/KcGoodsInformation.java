package com.sc.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

//库存_商品信息表
public class KcGoodsInformation implements Serializable {
    private BigDecimal goodsId;//商品编号

    private String goodsName;//商品名称

    private String goodsType;//商品类别

    private String standardsIllustrate;//规格说明

    private String unit;//单位

    private Long depositoryId;//仓库编号

    private BigDecimal stockNumber;//库存数量

    private BigDecimal costPrice;//成本价

    private BigDecimal retailPrice;//零售价

    private BigDecimal distributionPrice;//经销价

    private String noteInformation;//备注信息

    private BigDecimal companyId;//公司编号
    
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date lastModifyDate;//最后修改日期
    
    
    //扩展属性
    
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date datemax;
    
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date datemin;
    

    public Date getDatemax() {
		return datemax;
	}

	public void setDatemax(Date datemax) {
		this.datemax = datemax;
	}

	public Date getDatemin() {
		return datemin;
	}

	public void setDatemin(Date datemin) {
		this.datemin = datemin;
	}
	
	

	private static final long serialVersionUID = 1L;

    public KcGoodsInformation(BigDecimal goodsId, String goodsName, String goodsType, String standardsIllustrate, String unit, Long depositoryId, BigDecimal stockNumber, BigDecimal costPrice, BigDecimal retailPrice, BigDecimal distributionPrice, String noteInformation, BigDecimal companyId, Date lastModifyDate) {
        this.goodsId = goodsId;
        this.goodsName = goodsName;
        this.goodsType = goodsType;
        this.standardsIllustrate = standardsIllustrate;
        this.unit = unit;
        this.depositoryId = depositoryId;
        this.stockNumber = stockNumber;
        this.costPrice = costPrice;
        this.retailPrice = retailPrice;
        this.distributionPrice = distributionPrice;
        this.noteInformation = noteInformation;
        this.companyId = companyId;
        this.lastModifyDate = lastModifyDate;
    }

    public KcGoodsInformation() {
        super();
    }

    public BigDecimal getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(BigDecimal goodsId) {
        this.goodsId = goodsId;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName == null ? null : goodsName.trim();
    }

    public String getGoodsType() {
        return goodsType;
    }

    public void setGoodsType(String goodsType) {
        this.goodsType = goodsType == null ? null : goodsType.trim();
    }

    public String getStandardsIllustrate() {
        return standardsIllustrate;
    }

    public void setStandardsIllustrate(String standardsIllustrate) {
        this.standardsIllustrate = standardsIllustrate == null ? null : standardsIllustrate.trim();
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit == null ? null : unit.trim();
    }

    public Long getDepositoryId() {
        return depositoryId;
    }

    public void setDepositoryId(Long depositoryId) {
        this.depositoryId = depositoryId;
    }

    public BigDecimal getStockNumber() {
        return stockNumber;
    }

    public void setStockNumber(BigDecimal stockNumber) {
        this.stockNumber = stockNumber;
    }

    public BigDecimal getCostPrice() {
        return costPrice;
    }

    public void setCostPrice(BigDecimal costPrice) {
        this.costPrice = costPrice;
    }

    public BigDecimal getRetailPrice() {
        return retailPrice;
    }

    public void setRetailPrice(BigDecimal retailPrice) {
        this.retailPrice = retailPrice;
    }

    public BigDecimal getDistributionPrice() {
        return distributionPrice;
    }

    public void setDistributionPrice(BigDecimal distributionPrice) {
        this.distributionPrice = distributionPrice;
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
		return "KcGoodsInformation [goodsId=" + goodsId + ", goodsName=" + goodsName + ", goodsType=" + goodsType
				+ ", standardsIllustrate=" + standardsIllustrate + ", unit=" + unit + ", depositoryId=" + depositoryId
				+ ", stockNumber=" + stockNumber + ", costPrice=" + costPrice + ", retailPrice=" + retailPrice
				+ ", distributionPrice=" + distributionPrice + ", noteInformation=" + noteInformation + ", companyId="
				+ companyId + ", lastModifyDate=" + lastModifyDate + "]";
	}
    
}