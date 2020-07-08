package com.sc.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CgStockSupplierInformationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CgStockSupplierInformationExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andSupplierIdIsNull() {
            addCriterion("SUPPLIER_ID is null");
            return (Criteria) this;
        }

        public Criteria andSupplierIdIsNotNull() {
            addCriterion("SUPPLIER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierIdEqualTo(Long value) {
            addCriterion("SUPPLIER_ID =", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdNotEqualTo(Long value) {
            addCriterion("SUPPLIER_ID <>", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdGreaterThan(Long value) {
            addCriterion("SUPPLIER_ID >", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdGreaterThanOrEqualTo(Long value) {
            addCriterion("SUPPLIER_ID >=", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdLessThan(Long value) {
            addCriterion("SUPPLIER_ID <", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdLessThanOrEqualTo(Long value) {
            addCriterion("SUPPLIER_ID <=", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdIn(List<Long> values) {
            addCriterion("SUPPLIER_ID in", values, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdNotIn(List<Long> values) {
            addCriterion("SUPPLIER_ID not in", values, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdBetween(Long value1, Long value2) {
            addCriterion("SUPPLIER_ID between", value1, value2, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdNotBetween(Long value1, Long value2) {
            addCriterion("SUPPLIER_ID not between", value1, value2, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierNameIsNull() {
            addCriterion("SUPPLIER_NAME is null");
            return (Criteria) this;
        }

        public Criteria andSupplierNameIsNotNull() {
            addCriterion("SUPPLIER_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierNameEqualTo(String value) {
            addCriterion("SUPPLIER_NAME =", value, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameNotEqualTo(String value) {
            addCriterion("SUPPLIER_NAME <>", value, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameGreaterThan(String value) {
            addCriterion("SUPPLIER_NAME >", value, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameGreaterThanOrEqualTo(String value) {
            addCriterion("SUPPLIER_NAME >=", value, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameLessThan(String value) {
            addCriterion("SUPPLIER_NAME <", value, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameLessThanOrEqualTo(String value) {
            addCriterion("SUPPLIER_NAME <=", value, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameLike(String value) {
            addCriterion("SUPPLIER_NAME like", value, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameNotLike(String value) {
            addCriterion("SUPPLIER_NAME not like", value, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameIn(List<String> values) {
            addCriterion("SUPPLIER_NAME in", values, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameNotIn(List<String> values) {
            addCriterion("SUPPLIER_NAME not in", values, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameBetween(String value1, String value2) {
            addCriterion("SUPPLIER_NAME between", value1, value2, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameNotBetween(String value1, String value2) {
            addCriterion("SUPPLIER_NAME not between", value1, value2, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierAbbreviationIsNull() {
            addCriterion("SUPPLIER_ABBREVIATION is null");
            return (Criteria) this;
        }

        public Criteria andSupplierAbbreviationIsNotNull() {
            addCriterion("SUPPLIER_ABBREVIATION is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierAbbreviationEqualTo(String value) {
            addCriterion("SUPPLIER_ABBREVIATION =", value, "supplierAbbreviation");
            return (Criteria) this;
        }

        public Criteria andSupplierAbbreviationNotEqualTo(String value) {
            addCriterion("SUPPLIER_ABBREVIATION <>", value, "supplierAbbreviation");
            return (Criteria) this;
        }

        public Criteria andSupplierAbbreviationGreaterThan(String value) {
            addCriterion("SUPPLIER_ABBREVIATION >", value, "supplierAbbreviation");
            return (Criteria) this;
        }

        public Criteria andSupplierAbbreviationGreaterThanOrEqualTo(String value) {
            addCriterion("SUPPLIER_ABBREVIATION >=", value, "supplierAbbreviation");
            return (Criteria) this;
        }

        public Criteria andSupplierAbbreviationLessThan(String value) {
            addCriterion("SUPPLIER_ABBREVIATION <", value, "supplierAbbreviation");
            return (Criteria) this;
        }

        public Criteria andSupplierAbbreviationLessThanOrEqualTo(String value) {
            addCriterion("SUPPLIER_ABBREVIATION <=", value, "supplierAbbreviation");
            return (Criteria) this;
        }

        public Criteria andSupplierAbbreviationLike(String value) {
            addCriterion("SUPPLIER_ABBREVIATION like", value, "supplierAbbreviation");
            return (Criteria) this;
        }

        public Criteria andSupplierAbbreviationNotLike(String value) {
            addCriterion("SUPPLIER_ABBREVIATION not like", value, "supplierAbbreviation");
            return (Criteria) this;
        }

        public Criteria andSupplierAbbreviationIn(List<String> values) {
            addCriterion("SUPPLIER_ABBREVIATION in", values, "supplierAbbreviation");
            return (Criteria) this;
        }

        public Criteria andSupplierAbbreviationNotIn(List<String> values) {
            addCriterion("SUPPLIER_ABBREVIATION not in", values, "supplierAbbreviation");
            return (Criteria) this;
        }

        public Criteria andSupplierAbbreviationBetween(String value1, String value2) {
            addCriterion("SUPPLIER_ABBREVIATION between", value1, value2, "supplierAbbreviation");
            return (Criteria) this;
        }

        public Criteria andSupplierAbbreviationNotBetween(String value1, String value2) {
            addCriterion("SUPPLIER_ABBREVIATION not between", value1, value2, "supplierAbbreviation");
            return (Criteria) this;
        }

        public Criteria andLiaisonsIsNull() {
            addCriterion("LIAISONS is null");
            return (Criteria) this;
        }

        public Criteria andLiaisonsIsNotNull() {
            addCriterion("LIAISONS is not null");
            return (Criteria) this;
        }

        public Criteria andLiaisonsEqualTo(String value) {
            addCriterion("LIAISONS =", value, "liaisons");
            return (Criteria) this;
        }

        public Criteria andLiaisonsNotEqualTo(String value) {
            addCriterion("LIAISONS <>", value, "liaisons");
            return (Criteria) this;
        }

        public Criteria andLiaisonsGreaterThan(String value) {
            addCriterion("LIAISONS >", value, "liaisons");
            return (Criteria) this;
        }

        public Criteria andLiaisonsGreaterThanOrEqualTo(String value) {
            addCriterion("LIAISONS >=", value, "liaisons");
            return (Criteria) this;
        }

        public Criteria andLiaisonsLessThan(String value) {
            addCriterion("LIAISONS <", value, "liaisons");
            return (Criteria) this;
        }

        public Criteria andLiaisonsLessThanOrEqualTo(String value) {
            addCriterion("LIAISONS <=", value, "liaisons");
            return (Criteria) this;
        }

        public Criteria andLiaisonsLike(String value) {
            addCriterion("LIAISONS like", value, "liaisons");
            return (Criteria) this;
        }

        public Criteria andLiaisonsNotLike(String value) {
            addCriterion("LIAISONS not like", value, "liaisons");
            return (Criteria) this;
        }

        public Criteria andLiaisonsIn(List<String> values) {
            addCriterion("LIAISONS in", values, "liaisons");
            return (Criteria) this;
        }

        public Criteria andLiaisonsNotIn(List<String> values) {
            addCriterion("LIAISONS not in", values, "liaisons");
            return (Criteria) this;
        }

        public Criteria andLiaisonsBetween(String value1, String value2) {
            addCriterion("LIAISONS between", value1, value2, "liaisons");
            return (Criteria) this;
        }

        public Criteria andLiaisonsNotBetween(String value1, String value2) {
            addCriterion("LIAISONS not between", value1, value2, "liaisons");
            return (Criteria) this;
        }

        public Criteria andFixedPhoneIsNull() {
            addCriterion("FIXED_PHONE is null");
            return (Criteria) this;
        }

        public Criteria andFixedPhoneIsNotNull() {
            addCriterion("FIXED_PHONE is not null");
            return (Criteria) this;
        }

        public Criteria andFixedPhoneEqualTo(BigDecimal value) {
            addCriterion("FIXED_PHONE =", value, "fixedPhone");
            return (Criteria) this;
        }

        public Criteria andFixedPhoneNotEqualTo(BigDecimal value) {
            addCriterion("FIXED_PHONE <>", value, "fixedPhone");
            return (Criteria) this;
        }

        public Criteria andFixedPhoneGreaterThan(BigDecimal value) {
            addCriterion("FIXED_PHONE >", value, "fixedPhone");
            return (Criteria) this;
        }

        public Criteria andFixedPhoneGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FIXED_PHONE >=", value, "fixedPhone");
            return (Criteria) this;
        }

        public Criteria andFixedPhoneLessThan(BigDecimal value) {
            addCriterion("FIXED_PHONE <", value, "fixedPhone");
            return (Criteria) this;
        }

        public Criteria andFixedPhoneLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FIXED_PHONE <=", value, "fixedPhone");
            return (Criteria) this;
        }

        public Criteria andFixedPhoneIn(List<BigDecimal> values) {
            addCriterion("FIXED_PHONE in", values, "fixedPhone");
            return (Criteria) this;
        }

        public Criteria andFixedPhoneNotIn(List<BigDecimal> values) {
            addCriterion("FIXED_PHONE not in", values, "fixedPhone");
            return (Criteria) this;
        }

        public Criteria andFixedPhoneBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FIXED_PHONE between", value1, value2, "fixedPhone");
            return (Criteria) this;
        }

        public Criteria andFixedPhoneNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FIXED_PHONE not between", value1, value2, "fixedPhone");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneIsNull() {
            addCriterion("MOBILE_PHONE is null");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneIsNotNull() {
            addCriterion("MOBILE_PHONE is not null");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneEqualTo(BigDecimal value) {
            addCriterion("MOBILE_PHONE =", value, "mobilePhone");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneNotEqualTo(BigDecimal value) {
            addCriterion("MOBILE_PHONE <>", value, "mobilePhone");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneGreaterThan(BigDecimal value) {
            addCriterion("MOBILE_PHONE >", value, "mobilePhone");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("MOBILE_PHONE >=", value, "mobilePhone");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneLessThan(BigDecimal value) {
            addCriterion("MOBILE_PHONE <", value, "mobilePhone");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneLessThanOrEqualTo(BigDecimal value) {
            addCriterion("MOBILE_PHONE <=", value, "mobilePhone");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneIn(List<BigDecimal> values) {
            addCriterion("MOBILE_PHONE in", values, "mobilePhone");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneNotIn(List<BigDecimal> values) {
            addCriterion("MOBILE_PHONE not in", values, "mobilePhone");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MOBILE_PHONE between", value1, value2, "mobilePhone");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MOBILE_PHONE not between", value1, value2, "mobilePhone");
            return (Criteria) this;
        }

        public Criteria andContactFaxIsNull() {
            addCriterion("CONTACT_FAX is null");
            return (Criteria) this;
        }

        public Criteria andContactFaxIsNotNull() {
            addCriterion("CONTACT_FAX is not null");
            return (Criteria) this;
        }

        public Criteria andContactFaxEqualTo(BigDecimal value) {
            addCriterion("CONTACT_FAX =", value, "contactFax");
            return (Criteria) this;
        }

        public Criteria andContactFaxNotEqualTo(BigDecimal value) {
            addCriterion("CONTACT_FAX <>", value, "contactFax");
            return (Criteria) this;
        }

        public Criteria andContactFaxGreaterThan(BigDecimal value) {
            addCriterion("CONTACT_FAX >", value, "contactFax");
            return (Criteria) this;
        }

        public Criteria andContactFaxGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CONTACT_FAX >=", value, "contactFax");
            return (Criteria) this;
        }

        public Criteria andContactFaxLessThan(BigDecimal value) {
            addCriterion("CONTACT_FAX <", value, "contactFax");
            return (Criteria) this;
        }

        public Criteria andContactFaxLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CONTACT_FAX <=", value, "contactFax");
            return (Criteria) this;
        }

        public Criteria andContactFaxIn(List<BigDecimal> values) {
            addCriterion("CONTACT_FAX in", values, "contactFax");
            return (Criteria) this;
        }

        public Criteria andContactFaxNotIn(List<BigDecimal> values) {
            addCriterion("CONTACT_FAX not in", values, "contactFax");
            return (Criteria) this;
        }

        public Criteria andContactFaxBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CONTACT_FAX between", value1, value2, "contactFax");
            return (Criteria) this;
        }

        public Criteria andContactFaxNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CONTACT_FAX not between", value1, value2, "contactFax");
            return (Criteria) this;
        }

        public Criteria andContactAddressIsNull() {
            addCriterion("CONTACT_ADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andContactAddressIsNotNull() {
            addCriterion("CONTACT_ADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andContactAddressEqualTo(String value) {
            addCriterion("CONTACT_ADDRESS =", value, "contactAddress");
            return (Criteria) this;
        }

        public Criteria andContactAddressNotEqualTo(String value) {
            addCriterion("CONTACT_ADDRESS <>", value, "contactAddress");
            return (Criteria) this;
        }

        public Criteria andContactAddressGreaterThan(String value) {
            addCriterion("CONTACT_ADDRESS >", value, "contactAddress");
            return (Criteria) this;
        }

        public Criteria andContactAddressGreaterThanOrEqualTo(String value) {
            addCriterion("CONTACT_ADDRESS >=", value, "contactAddress");
            return (Criteria) this;
        }

        public Criteria andContactAddressLessThan(String value) {
            addCriterion("CONTACT_ADDRESS <", value, "contactAddress");
            return (Criteria) this;
        }

        public Criteria andContactAddressLessThanOrEqualTo(String value) {
            addCriterion("CONTACT_ADDRESS <=", value, "contactAddress");
            return (Criteria) this;
        }

        public Criteria andContactAddressLike(String value) {
            addCriterion("CONTACT_ADDRESS like", value, "contactAddress");
            return (Criteria) this;
        }

        public Criteria andContactAddressNotLike(String value) {
            addCriterion("CONTACT_ADDRESS not like", value, "contactAddress");
            return (Criteria) this;
        }

        public Criteria andContactAddressIn(List<String> values) {
            addCriterion("CONTACT_ADDRESS in", values, "contactAddress");
            return (Criteria) this;
        }

        public Criteria andContactAddressNotIn(List<String> values) {
            addCriterion("CONTACT_ADDRESS not in", values, "contactAddress");
            return (Criteria) this;
        }

        public Criteria andContactAddressBetween(String value1, String value2) {
            addCriterion("CONTACT_ADDRESS between", value1, value2, "contactAddress");
            return (Criteria) this;
        }

        public Criteria andContactAddressNotBetween(String value1, String value2) {
            addCriterion("CONTACT_ADDRESS not between", value1, value2, "contactAddress");
            return (Criteria) this;
        }

        public Criteria andContactPostcodeIsNull() {
            addCriterion("CONTACT_POSTCODE is null");
            return (Criteria) this;
        }

        public Criteria andContactPostcodeIsNotNull() {
            addCriterion("CONTACT_POSTCODE is not null");
            return (Criteria) this;
        }

        public Criteria andContactPostcodeEqualTo(BigDecimal value) {
            addCriterion("CONTACT_POSTCODE =", value, "contactPostcode");
            return (Criteria) this;
        }

        public Criteria andContactPostcodeNotEqualTo(BigDecimal value) {
            addCriterion("CONTACT_POSTCODE <>", value, "contactPostcode");
            return (Criteria) this;
        }

        public Criteria andContactPostcodeGreaterThan(BigDecimal value) {
            addCriterion("CONTACT_POSTCODE >", value, "contactPostcode");
            return (Criteria) this;
        }

        public Criteria andContactPostcodeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CONTACT_POSTCODE >=", value, "contactPostcode");
            return (Criteria) this;
        }

        public Criteria andContactPostcodeLessThan(BigDecimal value) {
            addCriterion("CONTACT_POSTCODE <", value, "contactPostcode");
            return (Criteria) this;
        }

        public Criteria andContactPostcodeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CONTACT_POSTCODE <=", value, "contactPostcode");
            return (Criteria) this;
        }

        public Criteria andContactPostcodeIn(List<BigDecimal> values) {
            addCriterion("CONTACT_POSTCODE in", values, "contactPostcode");
            return (Criteria) this;
        }

        public Criteria andContactPostcodeNotIn(List<BigDecimal> values) {
            addCriterion("CONTACT_POSTCODE not in", values, "contactPostcode");
            return (Criteria) this;
        }

        public Criteria andContactPostcodeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CONTACT_POSTCODE between", value1, value2, "contactPostcode");
            return (Criteria) this;
        }

        public Criteria andContactPostcodeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CONTACT_POSTCODE not between", value1, value2, "contactPostcode");
            return (Criteria) this;
        }

        public Criteria andMailboxIsNull() {
            addCriterion("MAILBOX is null");
            return (Criteria) this;
        }

        public Criteria andMailboxIsNotNull() {
            addCriterion("MAILBOX is not null");
            return (Criteria) this;
        }

        public Criteria andMailboxEqualTo(String value) {
            addCriterion("MAILBOX =", value, "mailbox");
            return (Criteria) this;
        }

        public Criteria andMailboxNotEqualTo(String value) {
            addCriterion("MAILBOX <>", value, "mailbox");
            return (Criteria) this;
        }

        public Criteria andMailboxGreaterThan(String value) {
            addCriterion("MAILBOX >", value, "mailbox");
            return (Criteria) this;
        }

        public Criteria andMailboxGreaterThanOrEqualTo(String value) {
            addCriterion("MAILBOX >=", value, "mailbox");
            return (Criteria) this;
        }

        public Criteria andMailboxLessThan(String value) {
            addCriterion("MAILBOX <", value, "mailbox");
            return (Criteria) this;
        }

        public Criteria andMailboxLessThanOrEqualTo(String value) {
            addCriterion("MAILBOX <=", value, "mailbox");
            return (Criteria) this;
        }

        public Criteria andMailboxLike(String value) {
            addCriterion("MAILBOX like", value, "mailbox");
            return (Criteria) this;
        }

        public Criteria andMailboxNotLike(String value) {
            addCriterion("MAILBOX not like", value, "mailbox");
            return (Criteria) this;
        }

        public Criteria andMailboxIn(List<String> values) {
            addCriterion("MAILBOX in", values, "mailbox");
            return (Criteria) this;
        }

        public Criteria andMailboxNotIn(List<String> values) {
            addCriterion("MAILBOX not in", values, "mailbox");
            return (Criteria) this;
        }

        public Criteria andMailboxBetween(String value1, String value2) {
            addCriterion("MAILBOX between", value1, value2, "mailbox");
            return (Criteria) this;
        }

        public Criteria andMailboxNotBetween(String value1, String value2) {
            addCriterion("MAILBOX not between", value1, value2, "mailbox");
            return (Criteria) this;
        }

        public Criteria andBankOfDepositIsNull() {
            addCriterion("BANK_OF_DEPOSIT is null");
            return (Criteria) this;
        }

        public Criteria andBankOfDepositIsNotNull() {
            addCriterion("BANK_OF_DEPOSIT is not null");
            return (Criteria) this;
        }

        public Criteria andBankOfDepositEqualTo(String value) {
            addCriterion("BANK_OF_DEPOSIT =", value, "bankOfDeposit");
            return (Criteria) this;
        }

        public Criteria andBankOfDepositNotEqualTo(String value) {
            addCriterion("BANK_OF_DEPOSIT <>", value, "bankOfDeposit");
            return (Criteria) this;
        }

        public Criteria andBankOfDepositGreaterThan(String value) {
            addCriterion("BANK_OF_DEPOSIT >", value, "bankOfDeposit");
            return (Criteria) this;
        }

        public Criteria andBankOfDepositGreaterThanOrEqualTo(String value) {
            addCriterion("BANK_OF_DEPOSIT >=", value, "bankOfDeposit");
            return (Criteria) this;
        }

        public Criteria andBankOfDepositLessThan(String value) {
            addCriterion("BANK_OF_DEPOSIT <", value, "bankOfDeposit");
            return (Criteria) this;
        }

        public Criteria andBankOfDepositLessThanOrEqualTo(String value) {
            addCriterion("BANK_OF_DEPOSIT <=", value, "bankOfDeposit");
            return (Criteria) this;
        }

        public Criteria andBankOfDepositLike(String value) {
            addCriterion("BANK_OF_DEPOSIT like", value, "bankOfDeposit");
            return (Criteria) this;
        }

        public Criteria andBankOfDepositNotLike(String value) {
            addCriterion("BANK_OF_DEPOSIT not like", value, "bankOfDeposit");
            return (Criteria) this;
        }

        public Criteria andBankOfDepositIn(List<String> values) {
            addCriterion("BANK_OF_DEPOSIT in", values, "bankOfDeposit");
            return (Criteria) this;
        }

        public Criteria andBankOfDepositNotIn(List<String> values) {
            addCriterion("BANK_OF_DEPOSIT not in", values, "bankOfDeposit");
            return (Criteria) this;
        }

        public Criteria andBankOfDepositBetween(String value1, String value2) {
            addCriterion("BANK_OF_DEPOSIT between", value1, value2, "bankOfDeposit");
            return (Criteria) this;
        }

        public Criteria andBankOfDepositNotBetween(String value1, String value2) {
            addCriterion("BANK_OF_DEPOSIT not between", value1, value2, "bankOfDeposit");
            return (Criteria) this;
        }

        public Criteria andAccountNumberIsNull() {
            addCriterion("ACCOUNT_NUMBER is null");
            return (Criteria) this;
        }

        public Criteria andAccountNumberIsNotNull() {
            addCriterion("ACCOUNT_NUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andAccountNumberEqualTo(BigDecimal value) {
            addCriterion("ACCOUNT_NUMBER =", value, "accountNumber");
            return (Criteria) this;
        }

        public Criteria andAccountNumberNotEqualTo(BigDecimal value) {
            addCriterion("ACCOUNT_NUMBER <>", value, "accountNumber");
            return (Criteria) this;
        }

        public Criteria andAccountNumberGreaterThan(BigDecimal value) {
            addCriterion("ACCOUNT_NUMBER >", value, "accountNumber");
            return (Criteria) this;
        }

        public Criteria andAccountNumberGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ACCOUNT_NUMBER >=", value, "accountNumber");
            return (Criteria) this;
        }

        public Criteria andAccountNumberLessThan(BigDecimal value) {
            addCriterion("ACCOUNT_NUMBER <", value, "accountNumber");
            return (Criteria) this;
        }

        public Criteria andAccountNumberLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ACCOUNT_NUMBER <=", value, "accountNumber");
            return (Criteria) this;
        }

        public Criteria andAccountNumberIn(List<BigDecimal> values) {
            addCriterion("ACCOUNT_NUMBER in", values, "accountNumber");
            return (Criteria) this;
        }

        public Criteria andAccountNumberNotIn(List<BigDecimal> values) {
            addCriterion("ACCOUNT_NUMBER not in", values, "accountNumber");
            return (Criteria) this;
        }

        public Criteria andAccountNumberBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ACCOUNT_NUMBER between", value1, value2, "accountNumber");
            return (Criteria) this;
        }

        public Criteria andAccountNumberNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ACCOUNT_NUMBER not between", value1, value2, "accountNumber");
            return (Criteria) this;
        }

        public Criteria andCompanyHomepageIsNull() {
            addCriterion("COMPANY_HOMEPAGE is null");
            return (Criteria) this;
        }

        public Criteria andCompanyHomepageIsNotNull() {
            addCriterion("COMPANY_HOMEPAGE is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyHomepageEqualTo(String value) {
            addCriterion("COMPANY_HOMEPAGE =", value, "companyHomepage");
            return (Criteria) this;
        }

        public Criteria andCompanyHomepageNotEqualTo(String value) {
            addCriterion("COMPANY_HOMEPAGE <>", value, "companyHomepage");
            return (Criteria) this;
        }

        public Criteria andCompanyHomepageGreaterThan(String value) {
            addCriterion("COMPANY_HOMEPAGE >", value, "companyHomepage");
            return (Criteria) this;
        }

        public Criteria andCompanyHomepageGreaterThanOrEqualTo(String value) {
            addCriterion("COMPANY_HOMEPAGE >=", value, "companyHomepage");
            return (Criteria) this;
        }

        public Criteria andCompanyHomepageLessThan(String value) {
            addCriterion("COMPANY_HOMEPAGE <", value, "companyHomepage");
            return (Criteria) this;
        }

        public Criteria andCompanyHomepageLessThanOrEqualTo(String value) {
            addCriterion("COMPANY_HOMEPAGE <=", value, "companyHomepage");
            return (Criteria) this;
        }

        public Criteria andCompanyHomepageLike(String value) {
            addCriterion("COMPANY_HOMEPAGE like", value, "companyHomepage");
            return (Criteria) this;
        }

        public Criteria andCompanyHomepageNotLike(String value) {
            addCriterion("COMPANY_HOMEPAGE not like", value, "companyHomepage");
            return (Criteria) this;
        }

        public Criteria andCompanyHomepageIn(List<String> values) {
            addCriterion("COMPANY_HOMEPAGE in", values, "companyHomepage");
            return (Criteria) this;
        }

        public Criteria andCompanyHomepageNotIn(List<String> values) {
            addCriterion("COMPANY_HOMEPAGE not in", values, "companyHomepage");
            return (Criteria) this;
        }

        public Criteria andCompanyHomepageBetween(String value1, String value2) {
            addCriterion("COMPANY_HOMEPAGE between", value1, value2, "companyHomepage");
            return (Criteria) this;
        }

        public Criteria andCompanyHomepageNotBetween(String value1, String value2) {
            addCriterion("COMPANY_HOMEPAGE not between", value1, value2, "companyHomepage");
            return (Criteria) this;
        }

        public Criteria andIsnotEffectiveIsNull() {
            addCriterion("ISNOT_EFFECTIVE is null");
            return (Criteria) this;
        }

        public Criteria andIsnotEffectiveIsNotNull() {
            addCriterion("ISNOT_EFFECTIVE is not null");
            return (Criteria) this;
        }

        public Criteria andIsnotEffectiveEqualTo(String value) {
            addCriterion("ISNOT_EFFECTIVE =", value, "isnotEffective");
            return (Criteria) this;
        }

        public Criteria andIsnotEffectiveNotEqualTo(String value) {
            addCriterion("ISNOT_EFFECTIVE <>", value, "isnotEffective");
            return (Criteria) this;
        }

        public Criteria andIsnotEffectiveGreaterThan(String value) {
            addCriterion("ISNOT_EFFECTIVE >", value, "isnotEffective");
            return (Criteria) this;
        }

        public Criteria andIsnotEffectiveGreaterThanOrEqualTo(String value) {
            addCriterion("ISNOT_EFFECTIVE >=", value, "isnotEffective");
            return (Criteria) this;
        }

        public Criteria andIsnotEffectiveLessThan(String value) {
            addCriterion("ISNOT_EFFECTIVE <", value, "isnotEffective");
            return (Criteria) this;
        }

        public Criteria andIsnotEffectiveLessThanOrEqualTo(String value) {
            addCriterion("ISNOT_EFFECTIVE <=", value, "isnotEffective");
            return (Criteria) this;
        }

        public Criteria andIsnotEffectiveLike(String value) {
            addCriterion("ISNOT_EFFECTIVE like", value, "isnotEffective");
            return (Criteria) this;
        }

        public Criteria andIsnotEffectiveNotLike(String value) {
            addCriterion("ISNOT_EFFECTIVE not like", value, "isnotEffective");
            return (Criteria) this;
        }

        public Criteria andIsnotEffectiveIn(List<String> values) {
            addCriterion("ISNOT_EFFECTIVE in", values, "isnotEffective");
            return (Criteria) this;
        }

        public Criteria andIsnotEffectiveNotIn(List<String> values) {
            addCriterion("ISNOT_EFFECTIVE not in", values, "isnotEffective");
            return (Criteria) this;
        }

        public Criteria andIsnotEffectiveBetween(String value1, String value2) {
            addCriterion("ISNOT_EFFECTIVE between", value1, value2, "isnotEffective");
            return (Criteria) this;
        }

        public Criteria andIsnotEffectiveNotBetween(String value1, String value2) {
            addCriterion("ISNOT_EFFECTIVE not between", value1, value2, "isnotEffective");
            return (Criteria) this;
        }

        public Criteria andOperaterIdIsNull() {
            addCriterion("OPERATER_ID is null");
            return (Criteria) this;
        }

        public Criteria andOperaterIdIsNotNull() {
            addCriterion("OPERATER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andOperaterIdEqualTo(Long value) {
            addCriterion("OPERATER_ID =", value, "operaterId");
            return (Criteria) this;
        }

        public Criteria andOperaterIdNotEqualTo(Long value) {
            addCriterion("OPERATER_ID <>", value, "operaterId");
            return (Criteria) this;
        }

        public Criteria andOperaterIdGreaterThan(Long value) {
            addCriterion("OPERATER_ID >", value, "operaterId");
            return (Criteria) this;
        }

        public Criteria andOperaterIdGreaterThanOrEqualTo(Long value) {
            addCriterion("OPERATER_ID >=", value, "operaterId");
            return (Criteria) this;
        }

        public Criteria andOperaterIdLessThan(Long value) {
            addCriterion("OPERATER_ID <", value, "operaterId");
            return (Criteria) this;
        }

        public Criteria andOperaterIdLessThanOrEqualTo(Long value) {
            addCriterion("OPERATER_ID <=", value, "operaterId");
            return (Criteria) this;
        }

        public Criteria andOperaterIdIn(List<Long> values) {
            addCriterion("OPERATER_ID in", values, "operaterId");
            return (Criteria) this;
        }

        public Criteria andOperaterIdNotIn(List<Long> values) {
            addCriterion("OPERATER_ID not in", values, "operaterId");
            return (Criteria) this;
        }

        public Criteria andOperaterIdBetween(Long value1, Long value2) {
            addCriterion("OPERATER_ID between", value1, value2, "operaterId");
            return (Criteria) this;
        }

        public Criteria andOperaterIdNotBetween(Long value1, Long value2) {
            addCriterion("OPERATER_ID not between", value1, value2, "operaterId");
            return (Criteria) this;
        }

        public Criteria andNoteInformationIsNull() {
            addCriterion("NOTE_INFORMATION is null");
            return (Criteria) this;
        }

        public Criteria andNoteInformationIsNotNull() {
            addCriterion("NOTE_INFORMATION is not null");
            return (Criteria) this;
        }

        public Criteria andNoteInformationEqualTo(String value) {
            addCriterion("NOTE_INFORMATION =", value, "noteInformation");
            return (Criteria) this;
        }

        public Criteria andNoteInformationNotEqualTo(String value) {
            addCriterion("NOTE_INFORMATION <>", value, "noteInformation");
            return (Criteria) this;
        }

        public Criteria andNoteInformationGreaterThan(String value) {
            addCriterion("NOTE_INFORMATION >", value, "noteInformation");
            return (Criteria) this;
        }

        public Criteria andNoteInformationGreaterThanOrEqualTo(String value) {
            addCriterion("NOTE_INFORMATION >=", value, "noteInformation");
            return (Criteria) this;
        }

        public Criteria andNoteInformationLessThan(String value) {
            addCriterion("NOTE_INFORMATION <", value, "noteInformation");
            return (Criteria) this;
        }

        public Criteria andNoteInformationLessThanOrEqualTo(String value) {
            addCriterion("NOTE_INFORMATION <=", value, "noteInformation");
            return (Criteria) this;
        }

        public Criteria andNoteInformationLike(String value) {
            addCriterion("NOTE_INFORMATION like", value, "noteInformation");
            return (Criteria) this;
        }

        public Criteria andNoteInformationNotLike(String value) {
            addCriterion("NOTE_INFORMATION not like", value, "noteInformation");
            return (Criteria) this;
        }

        public Criteria andNoteInformationIn(List<String> values) {
            addCriterion("NOTE_INFORMATION in", values, "noteInformation");
            return (Criteria) this;
        }

        public Criteria andNoteInformationNotIn(List<String> values) {
            addCriterion("NOTE_INFORMATION not in", values, "noteInformation");
            return (Criteria) this;
        }

        public Criteria andNoteInformationBetween(String value1, String value2) {
            addCriterion("NOTE_INFORMATION between", value1, value2, "noteInformation");
            return (Criteria) this;
        }

        public Criteria andNoteInformationNotBetween(String value1, String value2) {
            addCriterion("NOTE_INFORMATION not between", value1, value2, "noteInformation");
            return (Criteria) this;
        }

        public Criteria andCompanyIdIsNull() {
            addCriterion("COMPANY_ID is null");
            return (Criteria) this;
        }

        public Criteria andCompanyIdIsNotNull() {
            addCriterion("COMPANY_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyIdEqualTo(BigDecimal value) {
            addCriterion("COMPANY_ID =", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotEqualTo(BigDecimal value) {
            addCriterion("COMPANY_ID <>", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdGreaterThan(BigDecimal value) {
            addCriterion("COMPANY_ID >", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("COMPANY_ID >=", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdLessThan(BigDecimal value) {
            addCriterion("COMPANY_ID <", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("COMPANY_ID <=", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdIn(List<BigDecimal> values) {
            addCriterion("COMPANY_ID in", values, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotIn(List<BigDecimal> values) {
            addCriterion("COMPANY_ID not in", values, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("COMPANY_ID between", value1, value2, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("COMPANY_ID not between", value1, value2, "companyId");
            return (Criteria) this;
        }

        public Criteria andLastModifyDateIsNull() {
            addCriterion("LAST_MODIFY_DATE is null");
            return (Criteria) this;
        }

        public Criteria andLastModifyDateIsNotNull() {
            addCriterion("LAST_MODIFY_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andLastModifyDateEqualTo(Date value) {
            addCriterion("LAST_MODIFY_DATE =", value, "lastModifyDate");
            return (Criteria) this;
        }

        public Criteria andLastModifyDateNotEqualTo(Date value) {
            addCriterion("LAST_MODIFY_DATE <>", value, "lastModifyDate");
            return (Criteria) this;
        }

        public Criteria andLastModifyDateGreaterThan(Date value) {
            addCriterion("LAST_MODIFY_DATE >", value, "lastModifyDate");
            return (Criteria) this;
        }

        public Criteria andLastModifyDateGreaterThanOrEqualTo(Date value) {
            addCriterion("LAST_MODIFY_DATE >=", value, "lastModifyDate");
            return (Criteria) this;
        }

        public Criteria andLastModifyDateLessThan(Date value) {
            addCriterion("LAST_MODIFY_DATE <", value, "lastModifyDate");
            return (Criteria) this;
        }

        public Criteria andLastModifyDateLessThanOrEqualTo(Date value) {
            addCriterion("LAST_MODIFY_DATE <=", value, "lastModifyDate");
            return (Criteria) this;
        }

        public Criteria andLastModifyDateIn(List<Date> values) {
            addCriterion("LAST_MODIFY_DATE in", values, "lastModifyDate");
            return (Criteria) this;
        }

        public Criteria andLastModifyDateNotIn(List<Date> values) {
            addCriterion("LAST_MODIFY_DATE not in", values, "lastModifyDate");
            return (Criteria) this;
        }

        public Criteria andLastModifyDateBetween(Date value1, Date value2) {
            addCriterion("LAST_MODIFY_DATE between", value1, value2, "lastModifyDate");
            return (Criteria) this;
        }

        public Criteria andLastModifyDateNotBetween(Date value1, Date value2) {
            addCriterion("LAST_MODIFY_DATE not between", value1, value2, "lastModifyDate");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}