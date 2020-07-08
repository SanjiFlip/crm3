package com.sc.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BgSmsDetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BgSmsDetailExample() {
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

        public Criteria andDetailIdIsNull() {
            addCriterion("DETAIL_ID is null");
            return (Criteria) this;
        }

        public Criteria andDetailIdIsNotNull() {
            addCriterion("DETAIL_ID is not null");
            return (Criteria) this;
        }

        public Criteria andDetailIdEqualTo(Long value) {
            addCriterion("DETAIL_ID =", value, "detailId");
            return (Criteria) this;
        }

        public Criteria andDetailIdNotEqualTo(Long value) {
            addCriterion("DETAIL_ID <>", value, "detailId");
            return (Criteria) this;
        }

        public Criteria andDetailIdGreaterThan(Long value) {
            addCriterion("DETAIL_ID >", value, "detailId");
            return (Criteria) this;
        }

        public Criteria andDetailIdGreaterThanOrEqualTo(Long value) {
            addCriterion("DETAIL_ID >=", value, "detailId");
            return (Criteria) this;
        }

        public Criteria andDetailIdLessThan(Long value) {
            addCriterion("DETAIL_ID <", value, "detailId");
            return (Criteria) this;
        }

        public Criteria andDetailIdLessThanOrEqualTo(Long value) {
            addCriterion("DETAIL_ID <=", value, "detailId");
            return (Criteria) this;
        }

        public Criteria andDetailIdIn(List<Long> values) {
            addCriterion("DETAIL_ID in", values, "detailId");
            return (Criteria) this;
        }

        public Criteria andDetailIdNotIn(List<Long> values) {
            addCriterion("DETAIL_ID not in", values, "detailId");
            return (Criteria) this;
        }

        public Criteria andDetailIdBetween(Long value1, Long value2) {
            addCriterion("DETAIL_ID between", value1, value2, "detailId");
            return (Criteria) this;
        }

        public Criteria andDetailIdNotBetween(Long value1, Long value2) {
            addCriterion("DETAIL_ID not between", value1, value2, "detailId");
            return (Criteria) this;
        }

        public Criteria andShortMessageIdIsNull() {
            addCriterion("SHORT_MESSAGE_ID is null");
            return (Criteria) this;
        }

        public Criteria andShortMessageIdIsNotNull() {
            addCriterion("SHORT_MESSAGE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andShortMessageIdEqualTo(Long value) {
            addCriterion("SHORT_MESSAGE_ID =", value, "shortMessageId");
            return (Criteria) this;
        }

        public Criteria andShortMessageIdNotEqualTo(Long value) {
            addCriterion("SHORT_MESSAGE_ID <>", value, "shortMessageId");
            return (Criteria) this;
        }

        public Criteria andShortMessageIdGreaterThan(Long value) {
            addCriterion("SHORT_MESSAGE_ID >", value, "shortMessageId");
            return (Criteria) this;
        }

        public Criteria andShortMessageIdGreaterThanOrEqualTo(Long value) {
            addCriterion("SHORT_MESSAGE_ID >=", value, "shortMessageId");
            return (Criteria) this;
        }

        public Criteria andShortMessageIdLessThan(Long value) {
            addCriterion("SHORT_MESSAGE_ID <", value, "shortMessageId");
            return (Criteria) this;
        }

        public Criteria andShortMessageIdLessThanOrEqualTo(Long value) {
            addCriterion("SHORT_MESSAGE_ID <=", value, "shortMessageId");
            return (Criteria) this;
        }

        public Criteria andShortMessageIdIn(List<Long> values) {
            addCriterion("SHORT_MESSAGE_ID in", values, "shortMessageId");
            return (Criteria) this;
        }

        public Criteria andShortMessageIdNotIn(List<Long> values) {
            addCriterion("SHORT_MESSAGE_ID not in", values, "shortMessageId");
            return (Criteria) this;
        }

        public Criteria andShortMessageIdBetween(Long value1, Long value2) {
            addCriterion("SHORT_MESSAGE_ID between", value1, value2, "shortMessageId");
            return (Criteria) this;
        }

        public Criteria andShortMessageIdNotBetween(Long value1, Long value2) {
            addCriterion("SHORT_MESSAGE_ID not between", value1, value2, "shortMessageId");
            return (Criteria) this;
        }

        public Criteria andRecipientIdIsNull() {
            addCriterion("RECIPIENT_ID is null");
            return (Criteria) this;
        }

        public Criteria andRecipientIdIsNotNull() {
            addCriterion("RECIPIENT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andRecipientIdEqualTo(Long value) {
            addCriterion("RECIPIENT_ID =", value, "recipientId");
            return (Criteria) this;
        }

        public Criteria andRecipientIdNotEqualTo(Long value) {
            addCriterion("RECIPIENT_ID <>", value, "recipientId");
            return (Criteria) this;
        }

        public Criteria andRecipientIdGreaterThan(Long value) {
            addCriterion("RECIPIENT_ID >", value, "recipientId");
            return (Criteria) this;
        }

        public Criteria andRecipientIdGreaterThanOrEqualTo(Long value) {
            addCriterion("RECIPIENT_ID >=", value, "recipientId");
            return (Criteria) this;
        }

        public Criteria andRecipientIdLessThan(Long value) {
            addCriterion("RECIPIENT_ID <", value, "recipientId");
            return (Criteria) this;
        }

        public Criteria andRecipientIdLessThanOrEqualTo(Long value) {
            addCriterion("RECIPIENT_ID <=", value, "recipientId");
            return (Criteria) this;
        }

        public Criteria andRecipientIdIn(List<Long> values) {
            addCriterion("RECIPIENT_ID in", values, "recipientId");
            return (Criteria) this;
        }

        public Criteria andRecipientIdNotIn(List<Long> values) {
            addCriterion("RECIPIENT_ID not in", values, "recipientId");
            return (Criteria) this;
        }

        public Criteria andRecipientIdBetween(Long value1, Long value2) {
            addCriterion("RECIPIENT_ID between", value1, value2, "recipientId");
            return (Criteria) this;
        }

        public Criteria andRecipientIdNotBetween(Long value1, Long value2) {
            addCriterion("RECIPIENT_ID not between", value1, value2, "recipientId");
            return (Criteria) this;
        }

        public Criteria andMessageStateIsNull() {
            addCriterion("MESSAGE_STATE is null");
            return (Criteria) this;
        }

        public Criteria andMessageStateIsNotNull() {
            addCriterion("MESSAGE_STATE is not null");
            return (Criteria) this;
        }

        public Criteria andMessageStateEqualTo(String value) {
            addCriterion("MESSAGE_STATE =", value, "messageState");
            return (Criteria) this;
        }

        public Criteria andMessageStateNotEqualTo(String value) {
            addCriterion("MESSAGE_STATE <>", value, "messageState");
            return (Criteria) this;
        }

        public Criteria andMessageStateGreaterThan(String value) {
            addCriterion("MESSAGE_STATE >", value, "messageState");
            return (Criteria) this;
        }

        public Criteria andMessageStateGreaterThanOrEqualTo(String value) {
            addCriterion("MESSAGE_STATE >=", value, "messageState");
            return (Criteria) this;
        }

        public Criteria andMessageStateLessThan(String value) {
            addCriterion("MESSAGE_STATE <", value, "messageState");
            return (Criteria) this;
        }

        public Criteria andMessageStateLessThanOrEqualTo(String value) {
            addCriterion("MESSAGE_STATE <=", value, "messageState");
            return (Criteria) this;
        }

        public Criteria andMessageStateLike(String value) {
            addCriterion("MESSAGE_STATE like", value, "messageState");
            return (Criteria) this;
        }

        public Criteria andMessageStateNotLike(String value) {
            addCriterion("MESSAGE_STATE not like", value, "messageState");
            return (Criteria) this;
        }

        public Criteria andMessageStateIn(List<String> values) {
            addCriterion("MESSAGE_STATE in", values, "messageState");
            return (Criteria) this;
        }

        public Criteria andMessageStateNotIn(List<String> values) {
            addCriterion("MESSAGE_STATE not in", values, "messageState");
            return (Criteria) this;
        }

        public Criteria andMessageStateBetween(String value1, String value2) {
            addCriterion("MESSAGE_STATE between", value1, value2, "messageState");
            return (Criteria) this;
        }

        public Criteria andMessageStateNotBetween(String value1, String value2) {
            addCriterion("MESSAGE_STATE not between", value1, value2, "messageState");
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

        public Criteria andCompanyIdEqualTo(Long value) {
            addCriterion("COMPANY_ID =", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotEqualTo(Long value) {
            addCriterion("COMPANY_ID <>", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdGreaterThan(Long value) {
            addCriterion("COMPANY_ID >", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdGreaterThanOrEqualTo(Long value) {
            addCriterion("COMPANY_ID >=", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdLessThan(Long value) {
            addCriterion("COMPANY_ID <", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdLessThanOrEqualTo(Long value) {
            addCriterion("COMPANY_ID <=", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdIn(List<Long> values) {
            addCriterion("COMPANY_ID in", values, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotIn(List<Long> values) {
            addCriterion("COMPANY_ID not in", values, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdBetween(Long value1, Long value2) {
            addCriterion("COMPANY_ID between", value1, value2, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotBetween(Long value1, Long value2) {
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