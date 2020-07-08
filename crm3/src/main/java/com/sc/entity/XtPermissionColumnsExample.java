package com.sc.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class XtPermissionColumnsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public XtPermissionColumnsExample() {
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

        public Criteria andColumnsIdIsNull() {
            addCriterion("COLUMNS_ID is null");
            return (Criteria) this;
        }

        public Criteria andColumnsIdIsNotNull() {
            addCriterion("COLUMNS_ID is not null");
            return (Criteria) this;
        }

        public Criteria andColumnsIdEqualTo(Long value) {
            addCriterion("COLUMNS_ID =", value, "columnsId");
            return (Criteria) this;
        }

        public Criteria andColumnsIdNotEqualTo(Long value) {
            addCriterion("COLUMNS_ID <>", value, "columnsId");
            return (Criteria) this;
        }

        public Criteria andColumnsIdGreaterThan(Long value) {
            addCriterion("COLUMNS_ID >", value, "columnsId");
            return (Criteria) this;
        }

        public Criteria andColumnsIdGreaterThanOrEqualTo(Long value) {
            addCriterion("COLUMNS_ID >=", value, "columnsId");
            return (Criteria) this;
        }

        public Criteria andColumnsIdLessThan(Long value) {
            addCriterion("COLUMNS_ID <", value, "columnsId");
            return (Criteria) this;
        }

        public Criteria andColumnsIdLessThanOrEqualTo(Long value) {
            addCriterion("COLUMNS_ID <=", value, "columnsId");
            return (Criteria) this;
        }

        public Criteria andColumnsIdIn(List<Long> values) {
            addCriterion("COLUMNS_ID in", values, "columnsId");
            return (Criteria) this;
        }

        public Criteria andColumnsIdNotIn(List<Long> values) {
            addCriterion("COLUMNS_ID not in", values, "columnsId");
            return (Criteria) this;
        }

        public Criteria andColumnsIdBetween(Long value1, Long value2) {
            addCriterion("COLUMNS_ID between", value1, value2, "columnsId");
            return (Criteria) this;
        }

        public Criteria andColumnsIdNotBetween(Long value1, Long value2) {
            addCriterion("COLUMNS_ID not between", value1, value2, "columnsId");
            return (Criteria) this;
        }

        public Criteria andColumnsNameIsNull() {
            addCriterion("COLUMNS_NAME is null");
            return (Criteria) this;
        }

        public Criteria andColumnsNameIsNotNull() {
            addCriterion("COLUMNS_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andColumnsNameEqualTo(String value) {
            addCriterion("COLUMNS_NAME =", value, "columnsName");
            return (Criteria) this;
        }

        public Criteria andColumnsNameNotEqualTo(String value) {
            addCriterion("COLUMNS_NAME <>", value, "columnsName");
            return (Criteria) this;
        }

        public Criteria andColumnsNameGreaterThan(String value) {
            addCriterion("COLUMNS_NAME >", value, "columnsName");
            return (Criteria) this;
        }

        public Criteria andColumnsNameGreaterThanOrEqualTo(String value) {
            addCriterion("COLUMNS_NAME >=", value, "columnsName");
            return (Criteria) this;
        }

        public Criteria andColumnsNameLessThan(String value) {
            addCriterion("COLUMNS_NAME <", value, "columnsName");
            return (Criteria) this;
        }

        public Criteria andColumnsNameLessThanOrEqualTo(String value) {
            addCriterion("COLUMNS_NAME <=", value, "columnsName");
            return (Criteria) this;
        }

        public Criteria andColumnsNameLike(String value) {
            addCriterion("COLUMNS_NAME like", value, "columnsName");
            return (Criteria) this;
        }

        public Criteria andColumnsNameNotLike(String value) {
            addCriterion("COLUMNS_NAME not like", value, "columnsName");
            return (Criteria) this;
        }

        public Criteria andColumnsNameIn(List<String> values) {
            addCriterion("COLUMNS_NAME in", values, "columnsName");
            return (Criteria) this;
        }

        public Criteria andColumnsNameNotIn(List<String> values) {
            addCriterion("COLUMNS_NAME not in", values, "columnsName");
            return (Criteria) this;
        }

        public Criteria andColumnsNameBetween(String value1, String value2) {
            addCriterion("COLUMNS_NAME between", value1, value2, "columnsName");
            return (Criteria) this;
        }

        public Criteria andColumnsNameNotBetween(String value1, String value2) {
            addCriterion("COLUMNS_NAME not between", value1, value2, "columnsName");
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