package com.sc.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RsCompnayMessageExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RsCompnayMessageExample() {
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

        public Criteria andCompnayIdIsNull() {
            addCriterion("COMPNAY_ID is null");
            return (Criteria) this;
        }

        public Criteria andCompnayIdIsNotNull() {
            addCriterion("COMPNAY_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCompnayIdEqualTo(Long value) {
            addCriterion("COMPNAY_ID =", value, "compnayId");
            return (Criteria) this;
        }

        public Criteria andCompnayIdNotEqualTo(Long value) {
            addCriterion("COMPNAY_ID <>", value, "compnayId");
            return (Criteria) this;
        }

        public Criteria andCompnayIdGreaterThan(Long value) {
            addCriterion("COMPNAY_ID >", value, "compnayId");
            return (Criteria) this;
        }

        public Criteria andCompnayIdGreaterThanOrEqualTo(Long value) {
            addCriterion("COMPNAY_ID >=", value, "compnayId");
            return (Criteria) this;
        }

        public Criteria andCompnayIdLessThan(Long value) {
            addCriterion("COMPNAY_ID <", value, "compnayId");
            return (Criteria) this;
        }

        public Criteria andCompnayIdLessThanOrEqualTo(Long value) {
            addCriterion("COMPNAY_ID <=", value, "compnayId");
            return (Criteria) this;
        }

        public Criteria andCompnayIdIn(List<Long> values) {
            addCriterion("COMPNAY_ID in", values, "compnayId");
            return (Criteria) this;
        }

        public Criteria andCompnayIdNotIn(List<Long> values) {
            addCriterion("COMPNAY_ID not in", values, "compnayId");
            return (Criteria) this;
        }

        public Criteria andCompnayIdBetween(Long value1, Long value2) {
            addCriterion("COMPNAY_ID between", value1, value2, "compnayId");
            return (Criteria) this;
        }

        public Criteria andCompnayIdNotBetween(Long value1, Long value2) {
            addCriterion("COMPNAY_ID not between", value1, value2, "compnayId");
            return (Criteria) this;
        }

        public Criteria andCompnayNameIsNull() {
            addCriterion("COMPNAY_NAME is null");
            return (Criteria) this;
        }

        public Criteria andCompnayNameIsNotNull() {
            addCriterion("COMPNAY_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andCompnayNameEqualTo(String value) {
            addCriterion("COMPNAY_NAME =", value, "compnayName");
            return (Criteria) this;
        }

        public Criteria andCompnayNameNotEqualTo(String value) {
            addCriterion("COMPNAY_NAME <>", value, "compnayName");
            return (Criteria) this;
        }

        public Criteria andCompnayNameGreaterThan(String value) {
            addCriterion("COMPNAY_NAME >", value, "compnayName");
            return (Criteria) this;
        }

        public Criteria andCompnayNameGreaterThanOrEqualTo(String value) {
            addCriterion("COMPNAY_NAME >=", value, "compnayName");
            return (Criteria) this;
        }

        public Criteria andCompnayNameLessThan(String value) {
            addCriterion("COMPNAY_NAME <", value, "compnayName");
            return (Criteria) this;
        }

        public Criteria andCompnayNameLessThanOrEqualTo(String value) {
            addCriterion("COMPNAY_NAME <=", value, "compnayName");
            return (Criteria) this;
        }

        public Criteria andCompnayNameLike(String value) {
            addCriterion("COMPNAY_NAME like", value, "compnayName");
            return (Criteria) this;
        }

        public Criteria andCompnayNameNotLike(String value) {
            addCriterion("COMPNAY_NAME not like", value, "compnayName");
            return (Criteria) this;
        }

        public Criteria andCompnayNameIn(List<String> values) {
            addCriterion("COMPNAY_NAME in", values, "compnayName");
            return (Criteria) this;
        }

        public Criteria andCompnayNameNotIn(List<String> values) {
            addCriterion("COMPNAY_NAME not in", values, "compnayName");
            return (Criteria) this;
        }

        public Criteria andCompnayNameBetween(String value1, String value2) {
            addCriterion("COMPNAY_NAME between", value1, value2, "compnayName");
            return (Criteria) this;
        }

        public Criteria andCompnayNameNotBetween(String value1, String value2) {
            addCriterion("COMPNAY_NAME not between", value1, value2, "compnayName");
            return (Criteria) this;
        }

        public Criteria andCompnayCodeIsNull() {
            addCriterion("COMPNAY_CODE is null");
            return (Criteria) this;
        }

        public Criteria andCompnayCodeIsNotNull() {
            addCriterion("COMPNAY_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andCompnayCodeEqualTo(Long value) {
            addCriterion("COMPNAY_CODE =", value, "compnayCode");
            return (Criteria) this;
        }

        public Criteria andCompnayCodeNotEqualTo(Long value) {
            addCriterion("COMPNAY_CODE <>", value, "compnayCode");
            return (Criteria) this;
        }

        public Criteria andCompnayCodeGreaterThan(Long value) {
            addCriterion("COMPNAY_CODE >", value, "compnayCode");
            return (Criteria) this;
        }

        public Criteria andCompnayCodeGreaterThanOrEqualTo(Long value) {
            addCriterion("COMPNAY_CODE >=", value, "compnayCode");
            return (Criteria) this;
        }

        public Criteria andCompnayCodeLessThan(Long value) {
            addCriterion("COMPNAY_CODE <", value, "compnayCode");
            return (Criteria) this;
        }

        public Criteria andCompnayCodeLessThanOrEqualTo(Long value) {
            addCriterion("COMPNAY_CODE <=", value, "compnayCode");
            return (Criteria) this;
        }

        public Criteria andCompnayCodeIn(List<Long> values) {
            addCriterion("COMPNAY_CODE in", values, "compnayCode");
            return (Criteria) this;
        }

        public Criteria andCompnayCodeNotIn(List<Long> values) {
            addCriterion("COMPNAY_CODE not in", values, "compnayCode");
            return (Criteria) this;
        }

        public Criteria andCompnayCodeBetween(Long value1, Long value2) {
            addCriterion("COMPNAY_CODE between", value1, value2, "compnayCode");
            return (Criteria) this;
        }

        public Criteria andCompnayCodeNotBetween(Long value1, Long value2) {
            addCriterion("COMPNAY_CODE not between", value1, value2, "compnayCode");
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

        public Criteria andContactsIsNull() {
            addCriterion("CONTACTS is null");
            return (Criteria) this;
        }

        public Criteria andContactsIsNotNull() {
            addCriterion("CONTACTS is not null");
            return (Criteria) this;
        }

        public Criteria andContactsEqualTo(String value) {
            addCriterion("CONTACTS =", value, "contacts");
            return (Criteria) this;
        }

        public Criteria andContactsNotEqualTo(String value) {
            addCriterion("CONTACTS <>", value, "contacts");
            return (Criteria) this;
        }

        public Criteria andContactsGreaterThan(String value) {
            addCriterion("CONTACTS >", value, "contacts");
            return (Criteria) this;
        }

        public Criteria andContactsGreaterThanOrEqualTo(String value) {
            addCriterion("CONTACTS >=", value, "contacts");
            return (Criteria) this;
        }

        public Criteria andContactsLessThan(String value) {
            addCriterion("CONTACTS <", value, "contacts");
            return (Criteria) this;
        }

        public Criteria andContactsLessThanOrEqualTo(String value) {
            addCriterion("CONTACTS <=", value, "contacts");
            return (Criteria) this;
        }

        public Criteria andContactsLike(String value) {
            addCriterion("CONTACTS like", value, "contacts");
            return (Criteria) this;
        }

        public Criteria andContactsNotLike(String value) {
            addCriterion("CONTACTS not like", value, "contacts");
            return (Criteria) this;
        }

        public Criteria andContactsIn(List<String> values) {
            addCriterion("CONTACTS in", values, "contacts");
            return (Criteria) this;
        }

        public Criteria andContactsNotIn(List<String> values) {
            addCriterion("CONTACTS not in", values, "contacts");
            return (Criteria) this;
        }

        public Criteria andContactsBetween(String value1, String value2) {
            addCriterion("CONTACTS between", value1, value2, "contacts");
            return (Criteria) this;
        }

        public Criteria andContactsNotBetween(String value1, String value2) {
            addCriterion("CONTACTS not between", value1, value2, "contacts");
            return (Criteria) this;
        }

        public Criteria andCompnayAddressIsNull() {
            addCriterion("COMPNAY_ADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andCompnayAddressIsNotNull() {
            addCriterion("COMPNAY_ADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andCompnayAddressEqualTo(String value) {
            addCriterion("COMPNAY_ADDRESS =", value, "compnayAddress");
            return (Criteria) this;
        }

        public Criteria andCompnayAddressNotEqualTo(String value) {
            addCriterion("COMPNAY_ADDRESS <>", value, "compnayAddress");
            return (Criteria) this;
        }

        public Criteria andCompnayAddressGreaterThan(String value) {
            addCriterion("COMPNAY_ADDRESS >", value, "compnayAddress");
            return (Criteria) this;
        }

        public Criteria andCompnayAddressGreaterThanOrEqualTo(String value) {
            addCriterion("COMPNAY_ADDRESS >=", value, "compnayAddress");
            return (Criteria) this;
        }

        public Criteria andCompnayAddressLessThan(String value) {
            addCriterion("COMPNAY_ADDRESS <", value, "compnayAddress");
            return (Criteria) this;
        }

        public Criteria andCompnayAddressLessThanOrEqualTo(String value) {
            addCriterion("COMPNAY_ADDRESS <=", value, "compnayAddress");
            return (Criteria) this;
        }

        public Criteria andCompnayAddressLike(String value) {
            addCriterion("COMPNAY_ADDRESS like", value, "compnayAddress");
            return (Criteria) this;
        }

        public Criteria andCompnayAddressNotLike(String value) {
            addCriterion("COMPNAY_ADDRESS not like", value, "compnayAddress");
            return (Criteria) this;
        }

        public Criteria andCompnayAddressIn(List<String> values) {
            addCriterion("COMPNAY_ADDRESS in", values, "compnayAddress");
            return (Criteria) this;
        }

        public Criteria andCompnayAddressNotIn(List<String> values) {
            addCriterion("COMPNAY_ADDRESS not in", values, "compnayAddress");
            return (Criteria) this;
        }

        public Criteria andCompnayAddressBetween(String value1, String value2) {
            addCriterion("COMPNAY_ADDRESS between", value1, value2, "compnayAddress");
            return (Criteria) this;
        }

        public Criteria andCompnayAddressNotBetween(String value1, String value2) {
            addCriterion("COMPNAY_ADDRESS not between", value1, value2, "compnayAddress");
            return (Criteria) this;
        }

        public Criteria andFixedTelephoneIsNull() {
            addCriterion("FIXED_TELEPHONE is null");
            return (Criteria) this;
        }

        public Criteria andFixedTelephoneIsNotNull() {
            addCriterion("FIXED_TELEPHONE is not null");
            return (Criteria) this;
        }

        public Criteria andFixedTelephoneEqualTo(BigDecimal value) {
            addCriterion("FIXED_TELEPHONE =", value, "fixedTelephone");
            return (Criteria) this;
        }

        public Criteria andFixedTelephoneNotEqualTo(BigDecimal value) {
            addCriterion("FIXED_TELEPHONE <>", value, "fixedTelephone");
            return (Criteria) this;
        }

        public Criteria andFixedTelephoneGreaterThan(BigDecimal value) {
            addCriterion("FIXED_TELEPHONE >", value, "fixedTelephone");
            return (Criteria) this;
        }

        public Criteria andFixedTelephoneGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FIXED_TELEPHONE >=", value, "fixedTelephone");
            return (Criteria) this;
        }

        public Criteria andFixedTelephoneLessThan(BigDecimal value) {
            addCriterion("FIXED_TELEPHONE <", value, "fixedTelephone");
            return (Criteria) this;
        }

        public Criteria andFixedTelephoneLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FIXED_TELEPHONE <=", value, "fixedTelephone");
            return (Criteria) this;
        }

        public Criteria andFixedTelephoneIn(List<BigDecimal> values) {
            addCriterion("FIXED_TELEPHONE in", values, "fixedTelephone");
            return (Criteria) this;
        }

        public Criteria andFixedTelephoneNotIn(List<BigDecimal> values) {
            addCriterion("FIXED_TELEPHONE not in", values, "fixedTelephone");
            return (Criteria) this;
        }

        public Criteria andFixedTelephoneBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FIXED_TELEPHONE between", value1, value2, "fixedTelephone");
            return (Criteria) this;
        }

        public Criteria andFixedTelephoneNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FIXED_TELEPHONE not between", value1, value2, "fixedTelephone");
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

        public Criteria andFaxIsNull() {
            addCriterion("FAX is null");
            return (Criteria) this;
        }

        public Criteria andFaxIsNotNull() {
            addCriterion("FAX is not null");
            return (Criteria) this;
        }

        public Criteria andFaxEqualTo(String value) {
            addCriterion("FAX =", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxNotEqualTo(String value) {
            addCriterion("FAX <>", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxGreaterThan(String value) {
            addCriterion("FAX >", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxGreaterThanOrEqualTo(String value) {
            addCriterion("FAX >=", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxLessThan(String value) {
            addCriterion("FAX <", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxLessThanOrEqualTo(String value) {
            addCriterion("FAX <=", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxLike(String value) {
            addCriterion("FAX like", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxNotLike(String value) {
            addCriterion("FAX not like", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxIn(List<String> values) {
            addCriterion("FAX in", values, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxNotIn(List<String> values) {
            addCriterion("FAX not in", values, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxBetween(String value1, String value2) {
            addCriterion("FAX between", value1, value2, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxNotBetween(String value1, String value2) {
            addCriterion("FAX not between", value1, value2, "fax");
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

        public Criteria andBankOfDepositEqualTo(BigDecimal value) {
            addCriterion("BANK_OF_DEPOSIT =", value, "bankOfDeposit");
            return (Criteria) this;
        }

        public Criteria andBankOfDepositNotEqualTo(BigDecimal value) {
            addCriterion("BANK_OF_DEPOSIT <>", value, "bankOfDeposit");
            return (Criteria) this;
        }

        public Criteria andBankOfDepositGreaterThan(BigDecimal value) {
            addCriterion("BANK_OF_DEPOSIT >", value, "bankOfDeposit");
            return (Criteria) this;
        }

        public Criteria andBankOfDepositGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("BANK_OF_DEPOSIT >=", value, "bankOfDeposit");
            return (Criteria) this;
        }

        public Criteria andBankOfDepositLessThan(BigDecimal value) {
            addCriterion("BANK_OF_DEPOSIT <", value, "bankOfDeposit");
            return (Criteria) this;
        }

        public Criteria andBankOfDepositLessThanOrEqualTo(BigDecimal value) {
            addCriterion("BANK_OF_DEPOSIT <=", value, "bankOfDeposit");
            return (Criteria) this;
        }

        public Criteria andBankOfDepositIn(List<BigDecimal> values) {
            addCriterion("BANK_OF_DEPOSIT in", values, "bankOfDeposit");
            return (Criteria) this;
        }

        public Criteria andBankOfDepositNotIn(List<BigDecimal> values) {
            addCriterion("BANK_OF_DEPOSIT not in", values, "bankOfDeposit");
            return (Criteria) this;
        }

        public Criteria andBankOfDepositBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BANK_OF_DEPOSIT between", value1, value2, "bankOfDeposit");
            return (Criteria) this;
        }

        public Criteria andBankOfDepositNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BANK_OF_DEPOSIT not between", value1, value2, "bankOfDeposit");
            return (Criteria) this;
        }

        public Criteria andBankAccountIsNull() {
            addCriterion("BANK_ACCOUNT is null");
            return (Criteria) this;
        }

        public Criteria andBankAccountIsNotNull() {
            addCriterion("BANK_ACCOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andBankAccountEqualTo(BigDecimal value) {
            addCriterion("BANK_ACCOUNT =", value, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountNotEqualTo(BigDecimal value) {
            addCriterion("BANK_ACCOUNT <>", value, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountGreaterThan(BigDecimal value) {
            addCriterion("BANK_ACCOUNT >", value, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("BANK_ACCOUNT >=", value, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountLessThan(BigDecimal value) {
            addCriterion("BANK_ACCOUNT <", value, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("BANK_ACCOUNT <=", value, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountIn(List<BigDecimal> values) {
            addCriterion("BANK_ACCOUNT in", values, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountNotIn(List<BigDecimal> values) {
            addCriterion("BANK_ACCOUNT not in", values, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BANK_ACCOUNT between", value1, value2, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BANK_ACCOUNT not between", value1, value2, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andEnabledIsNull() {
            addCriterion("ENABLED is null");
            return (Criteria) this;
        }

        public Criteria andEnabledIsNotNull() {
            addCriterion("ENABLED is not null");
            return (Criteria) this;
        }

        public Criteria andEnabledEqualTo(String value) {
            addCriterion("ENABLED =", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledNotEqualTo(String value) {
            addCriterion("ENABLED <>", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledGreaterThan(String value) {
            addCriterion("ENABLED >", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledGreaterThanOrEqualTo(String value) {
            addCriterion("ENABLED >=", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledLessThan(String value) {
            addCriterion("ENABLED <", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledLessThanOrEqualTo(String value) {
            addCriterion("ENABLED <=", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledLike(String value) {
            addCriterion("ENABLED like", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledNotLike(String value) {
            addCriterion("ENABLED not like", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledIn(List<String> values) {
            addCriterion("ENABLED in", values, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledNotIn(List<String> values) {
            addCriterion("ENABLED not in", values, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledBetween(String value1, String value2) {
            addCriterion("ENABLED between", value1, value2, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledNotBetween(String value1, String value2) {
            addCriterion("ENABLED not between", value1, value2, "enabled");
            return (Criteria) this;
        }

        public Criteria andRemarksIsNull() {
            addCriterion("REMARKS is null");
            return (Criteria) this;
        }

        public Criteria andRemarksIsNotNull() {
            addCriterion("REMARKS is not null");
            return (Criteria) this;
        }

        public Criteria andRemarksEqualTo(String value) {
            addCriterion("REMARKS =", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotEqualTo(String value) {
            addCriterion("REMARKS <>", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksGreaterThan(String value) {
            addCriterion("REMARKS >", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksGreaterThanOrEqualTo(String value) {
            addCriterion("REMARKS >=", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLessThan(String value) {
            addCriterion("REMARKS <", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLessThanOrEqualTo(String value) {
            addCriterion("REMARKS <=", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLike(String value) {
            addCriterion("REMARKS like", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotLike(String value) {
            addCriterion("REMARKS not like", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksIn(List<String> values) {
            addCriterion("REMARKS in", values, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotIn(List<String> values) {
            addCriterion("REMARKS not in", values, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksBetween(String value1, String value2) {
            addCriterion("REMARKS between", value1, value2, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotBetween(String value1, String value2) {
            addCriterion("REMARKS not between", value1, value2, "remarks");
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