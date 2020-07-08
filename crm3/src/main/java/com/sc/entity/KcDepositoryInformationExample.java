package com.sc.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class KcDepositoryInformationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public KcDepositoryInformationExample() {
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

        public Criteria andDepositoryIdIsNull() {
            addCriterion("DEPOSITORY_ID is null");
            return (Criteria) this;
        }

        public Criteria andDepositoryIdIsNotNull() {
            addCriterion("DEPOSITORY_ID is not null");
            return (Criteria) this;
        }

        public Criteria andDepositoryIdEqualTo(Long value) {
            addCriterion("DEPOSITORY_ID =", value, "depositoryId");
            return (Criteria) this;
        }

        public Criteria andDepositoryIdNotEqualTo(Long value) {
            addCriterion("DEPOSITORY_ID <>", value, "depositoryId");
            return (Criteria) this;
        }

        public Criteria andDepositoryIdGreaterThan(Long value) {
            addCriterion("DEPOSITORY_ID >", value, "depositoryId");
            return (Criteria) this;
        }

        public Criteria andDepositoryIdGreaterThanOrEqualTo(Long value) {
            addCriterion("DEPOSITORY_ID >=", value, "depositoryId");
            return (Criteria) this;
        }

        public Criteria andDepositoryIdLessThan(Long value) {
            addCriterion("DEPOSITORY_ID <", value, "depositoryId");
            return (Criteria) this;
        }

        public Criteria andDepositoryIdLessThanOrEqualTo(Long value) {
            addCriterion("DEPOSITORY_ID <=", value, "depositoryId");
            return (Criteria) this;
        }

        public Criteria andDepositoryIdIn(List<Long> values) {
            addCriterion("DEPOSITORY_ID in", values, "depositoryId");
            return (Criteria) this;
        }

        public Criteria andDepositoryIdNotIn(List<Long> values) {
            addCriterion("DEPOSITORY_ID not in", values, "depositoryId");
            return (Criteria) this;
        }

        public Criteria andDepositoryIdBetween(Long value1, Long value2) {
            addCriterion("DEPOSITORY_ID between", value1, value2, "depositoryId");
            return (Criteria) this;
        }

        public Criteria andDepositoryIdNotBetween(Long value1, Long value2) {
            addCriterion("DEPOSITORY_ID not between", value1, value2, "depositoryId");
            return (Criteria) this;
        }

        public Criteria andDepositoryNameIsNull() {
            addCriterion("DEPOSITORY_NAME is null");
            return (Criteria) this;
        }

        public Criteria andDepositoryNameIsNotNull() {
            addCriterion("DEPOSITORY_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andDepositoryNameEqualTo(String value) {
            addCriterion("DEPOSITORY_NAME =", value, "depositoryName");
            return (Criteria) this;
        }

        public Criteria andDepositoryNameNotEqualTo(String value) {
            addCriterion("DEPOSITORY_NAME <>", value, "depositoryName");
            return (Criteria) this;
        }

        public Criteria andDepositoryNameGreaterThan(String value) {
            addCriterion("DEPOSITORY_NAME >", value, "depositoryName");
            return (Criteria) this;
        }

        public Criteria andDepositoryNameGreaterThanOrEqualTo(String value) {
            addCriterion("DEPOSITORY_NAME >=", value, "depositoryName");
            return (Criteria) this;
        }

        public Criteria andDepositoryNameLessThan(String value) {
            addCriterion("DEPOSITORY_NAME <", value, "depositoryName");
            return (Criteria) this;
        }

        public Criteria andDepositoryNameLessThanOrEqualTo(String value) {
            addCriterion("DEPOSITORY_NAME <=", value, "depositoryName");
            return (Criteria) this;
        }

        public Criteria andDepositoryNameLike(String value) {
            addCriterion("DEPOSITORY_NAME like", value, "depositoryName");
            return (Criteria) this;
        }

        public Criteria andDepositoryNameNotLike(String value) {
            addCriterion("DEPOSITORY_NAME not like", value, "depositoryName");
            return (Criteria) this;
        }

        public Criteria andDepositoryNameIn(List<String> values) {
            addCriterion("DEPOSITORY_NAME in", values, "depositoryName");
            return (Criteria) this;
        }

        public Criteria andDepositoryNameNotIn(List<String> values) {
            addCriterion("DEPOSITORY_NAME not in", values, "depositoryName");
            return (Criteria) this;
        }

        public Criteria andDepositoryNameBetween(String value1, String value2) {
            addCriterion("DEPOSITORY_NAME between", value1, value2, "depositoryName");
            return (Criteria) this;
        }

        public Criteria andDepositoryNameNotBetween(String value1, String value2) {
            addCriterion("DEPOSITORY_NAME not between", value1, value2, "depositoryName");
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