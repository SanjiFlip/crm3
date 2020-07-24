package com.sc.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class XsCustomerLoseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public XsCustomerLoseExample() {
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

        public Criteria andLoseIdIsNull() {
            addCriterion("LOSE_ID is null");
            return (Criteria) this;
        }

        public Criteria andLoseIdIsNotNull() {
            addCriterion("LOSE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andLoseIdEqualTo(Long value) {
            addCriterion("LOSE_ID =", value, "loseId");
            return (Criteria) this;
        }

        public Criteria andLoseIdNotEqualTo(Long value) {
            addCriterion("LOSE_ID <>", value, "loseId");
            return (Criteria) this;
        }

        public Criteria andLoseIdGreaterThan(Long value) {
            addCriterion("LOSE_ID >", value, "loseId");
            return (Criteria) this;
        }

        public Criteria andLoseIdGreaterThanOrEqualTo(Long value) {
            addCriterion("LOSE_ID >=", value, "loseId");
            return (Criteria) this;
        }

        public Criteria andLoseIdLessThan(Long value) {
            addCriterion("LOSE_ID <", value, "loseId");
            return (Criteria) this;
        }

        public Criteria andLoseIdLessThanOrEqualTo(Long value) {
            addCriterion("LOSE_ID <=", value, "loseId");
            return (Criteria) this;
        }

        public Criteria andLoseIdIn(List<Long> values) {
            addCriterion("LOSE_ID in", values, "loseId");
            return (Criteria) this;
        }

        public Criteria andLoseIdNotIn(List<Long> values) {
            addCriterion("LOSE_ID not in", values, "loseId");
            return (Criteria) this;
        }

        public Criteria andLoseIdBetween(Long value1, Long value2) {
            addCriterion("LOSE_ID between", value1, value2, "loseId");
            return (Criteria) this;
        }

        public Criteria andLoseIdNotBetween(Long value1, Long value2) {
            addCriterion("LOSE_ID not between", value1, value2, "loseId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdIsNull() {
            addCriterion("CUSTOMER_ID is null");
            return (Criteria) this;
        }

        public Criteria andCustomerIdIsNotNull() {
            addCriterion("CUSTOMER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerIdEqualTo(Long value) {
            addCriterion("CUSTOMER_ID =", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotEqualTo(Long value) {
            addCriterion("CUSTOMER_ID <>", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdGreaterThan(Long value) {
            addCriterion("CUSTOMER_ID >", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdGreaterThanOrEqualTo(Long value) {
            addCriterion("CUSTOMER_ID >=", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdLessThan(Long value) {
            addCriterion("CUSTOMER_ID <", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdLessThanOrEqualTo(Long value) {
            addCriterion("CUSTOMER_ID <=", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdIn(List<Long> values) {
            addCriterion("CUSTOMER_ID in", values, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotIn(List<Long> values) {
            addCriterion("CUSTOMER_ID not in", values, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdBetween(Long value1, Long value2) {
            addCriterion("CUSTOMER_ID between", value1, value2, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotBetween(Long value1, Long value2) {
            addCriterion("CUSTOMER_ID not between", value1, value2, "customerId");
            return (Criteria) this;
        }

        public Criteria andManageIdIsNull() {
            addCriterion("MANAGE_ID is null");
            return (Criteria) this;
        }

        public Criteria andManageIdIsNotNull() {
            addCriterion("MANAGE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andManageIdEqualTo(Long value) {
            addCriterion("MANAGE_ID =", value, "manageId");
            return (Criteria) this;
        }

        public Criteria andManageIdNotEqualTo(Long value) {
            addCriterion("MANAGE_ID <>", value, "manageId");
            return (Criteria) this;
        }

        public Criteria andManageIdGreaterThan(Long value) {
            addCriterion("MANAGE_ID >", value, "manageId");
            return (Criteria) this;
        }

        public Criteria andManageIdGreaterThanOrEqualTo(Long value) {
            addCriterion("MANAGE_ID >=", value, "manageId");
            return (Criteria) this;
        }

        public Criteria andManageIdLessThan(Long value) {
            addCriterion("MANAGE_ID <", value, "manageId");
            return (Criteria) this;
        }

        public Criteria andManageIdLessThanOrEqualTo(Long value) {
            addCriterion("MANAGE_ID <=", value, "manageId");
            return (Criteria) this;
        }

        public Criteria andManageIdIn(List<Long> values) {
            addCriterion("MANAGE_ID in", values, "manageId");
            return (Criteria) this;
        }

        public Criteria andManageIdNotIn(List<Long> values) {
            addCriterion("MANAGE_ID not in", values, "manageId");
            return (Criteria) this;
        }

        public Criteria andManageIdBetween(Long value1, Long value2) {
            addCriterion("MANAGE_ID between", value1, value2, "manageId");
            return (Criteria) this;
        }

        public Criteria andManageIdNotBetween(Long value1, Long value2) {
            addCriterion("MANAGE_ID not between", value1, value2, "manageId");
            return (Criteria) this;
        }

        public Criteria andWayIsNull() {
            addCriterion("WAY is null");
            return (Criteria) this;
        }

        public Criteria andWayIsNotNull() {
            addCriterion("WAY is not null");
            return (Criteria) this;
        }

        public Criteria andWayEqualTo(String value) {
            addCriterion("WAY =", value, "way");
            return (Criteria) this;
        }

        public Criteria andWayNotEqualTo(String value) {
            addCriterion("WAY <>", value, "way");
            return (Criteria) this;
        }

        public Criteria andWayGreaterThan(String value) {
            addCriterion("WAY >", value, "way");
            return (Criteria) this;
        }

        public Criteria andWayGreaterThanOrEqualTo(String value) {
            addCriterion("WAY >=", value, "way");
            return (Criteria) this;
        }

        public Criteria andWayLessThan(String value) {
            addCriterion("WAY <", value, "way");
            return (Criteria) this;
        }

        public Criteria andWayLessThanOrEqualTo(String value) {
            addCriterion("WAY <=", value, "way");
            return (Criteria) this;
        }

        public Criteria andWayLike(String value) {
            addCriterion("WAY like", value, "way");
            return (Criteria) this;
        }

        public Criteria andWayNotLike(String value) {
            addCriterion("WAY not like", value, "way");
            return (Criteria) this;
        }

        public Criteria andWayIn(List<String> values) {
            addCriterion("WAY in", values, "way");
            return (Criteria) this;
        }

        public Criteria andWayNotIn(List<String> values) {
            addCriterion("WAY not in", values, "way");
            return (Criteria) this;
        }

        public Criteria andWayBetween(String value1, String value2) {
            addCriterion("WAY between", value1, value2, "way");
            return (Criteria) this;
        }

        public Criteria andWayNotBetween(String value1, String value2) {
            addCriterion("WAY not between", value1, value2, "way");
            return (Criteria) this;
        }

        public Criteria andMeasuresIsNull() {
            addCriterion("MEASURES is null");
            return (Criteria) this;
        }

        public Criteria andMeasuresIsNotNull() {
            addCriterion("MEASURES is not null");
            return (Criteria) this;
        }

        public Criteria andMeasuresEqualTo(String value) {
            addCriterion("MEASURES =", value, "measures");
            return (Criteria) this;
        }

        public Criteria andMeasuresNotEqualTo(String value) {
            addCriterion("MEASURES <>", value, "measures");
            return (Criteria) this;
        }

        public Criteria andMeasuresGreaterThan(String value) {
            addCriterion("MEASURES >", value, "measures");
            return (Criteria) this;
        }

        public Criteria andMeasuresGreaterThanOrEqualTo(String value) {
            addCriterion("MEASURES >=", value, "measures");
            return (Criteria) this;
        }

        public Criteria andMeasuresLessThan(String value) {
            addCriterion("MEASURES <", value, "measures");
            return (Criteria) this;
        }

        public Criteria andMeasuresLessThanOrEqualTo(String value) {
            addCriterion("MEASURES <=", value, "measures");
            return (Criteria) this;
        }

        public Criteria andMeasuresLike(String value) {
            addCriterion("MEASURES like", value, "measures");
            return (Criteria) this;
        }

        public Criteria andMeasuresNotLike(String value) {
            addCriterion("MEASURES not like", value, "measures");
            return (Criteria) this;
        }

        public Criteria andMeasuresIn(List<String> values) {
            addCriterion("MEASURES in", values, "measures");
            return (Criteria) this;
        }

        public Criteria andMeasuresNotIn(List<String> values) {
            addCriterion("MEASURES not in", values, "measures");
            return (Criteria) this;
        }

        public Criteria andMeasuresBetween(String value1, String value2) {
            addCriterion("MEASURES between", value1, value2, "measures");
            return (Criteria) this;
        }

        public Criteria andMeasuresNotBetween(String value1, String value2) {
            addCriterion("MEASURES not between", value1, value2, "measures");
            return (Criteria) this;
        }

        public Criteria andIsloseIsNull() {
            addCriterion("ISLOSE is null");
            return (Criteria) this;
        }

        public Criteria andIsloseIsNotNull() {
            addCriterion("ISLOSE is not null");
            return (Criteria) this;
        }

        public Criteria andIsloseEqualTo(String value) {
            addCriterion("ISLOSE =", value, "islose");
            return (Criteria) this;
        }

        public Criteria andIsloseNotEqualTo(String value) {
            addCriterion("ISLOSE <>", value, "islose");
            return (Criteria) this;
        }

        public Criteria andIsloseGreaterThan(String value) {
            addCriterion("ISLOSE >", value, "islose");
            return (Criteria) this;
        }

        public Criteria andIsloseGreaterThanOrEqualTo(String value) {
            addCriterion("ISLOSE >=", value, "islose");
            return (Criteria) this;
        }

        public Criteria andIsloseLessThan(String value) {
            addCriterion("ISLOSE <", value, "islose");
            return (Criteria) this;
        }

        public Criteria andIsloseLessThanOrEqualTo(String value) {
            addCriterion("ISLOSE <=", value, "islose");
            return (Criteria) this;
        }

        public Criteria andIsloseLike(String value) {
            addCriterion("ISLOSE like", value, "islose");
            return (Criteria) this;
        }

        public Criteria andIsloseNotLike(String value) {
            addCriterion("ISLOSE not like", value, "islose");
            return (Criteria) this;
        }

        public Criteria andIsloseIn(List<String> values) {
            addCriterion("ISLOSE in", values, "islose");
            return (Criteria) this;
        }

        public Criteria andIsloseNotIn(List<String> values) {
            addCriterion("ISLOSE not in", values, "islose");
            return (Criteria) this;
        }

        public Criteria andIsloseBetween(String value1, String value2) {
            addCriterion("ISLOSE between", value1, value2, "islose");
            return (Criteria) this;
        }

        public Criteria andIsloseNotBetween(String value1, String value2) {
            addCriterion("ISLOSE not between", value1, value2, "islose");
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