package com.sc.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class XtPermissionInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public XtPermissionInfoExample() {
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

        public Criteria andPermissonIdIsNull() {
            addCriterion("PERMISSON_ID is null");
            return (Criteria) this;
        }

        public Criteria andPermissonIdIsNotNull() {
            addCriterion("PERMISSON_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPermissonIdEqualTo(Long value) {
            addCriterion("PERMISSON_ID =", value, "permissonId");
            return (Criteria) this;
        }

        public Criteria andPermissonIdNotEqualTo(Long value) {
            addCriterion("PERMISSON_ID <>", value, "permissonId");
            return (Criteria) this;
        }

        public Criteria andPermissonIdGreaterThan(Long value) {
            addCriterion("PERMISSON_ID >", value, "permissonId");
            return (Criteria) this;
        }

        public Criteria andPermissonIdGreaterThanOrEqualTo(Long value) {
            addCriterion("PERMISSON_ID >=", value, "permissonId");
            return (Criteria) this;
        }

        public Criteria andPermissonIdLessThan(Long value) {
            addCriterion("PERMISSON_ID <", value, "permissonId");
            return (Criteria) this;
        }

        public Criteria andPermissonIdLessThanOrEqualTo(Long value) {
            addCriterion("PERMISSON_ID <=", value, "permissonId");
            return (Criteria) this;
        }

        public Criteria andPermissonIdIn(List<Long> values) {
            addCriterion("PERMISSON_ID in", values, "permissonId");
            return (Criteria) this;
        }

        public Criteria andPermissonIdNotIn(List<Long> values) {
            addCriterion("PERMISSON_ID not in", values, "permissonId");
            return (Criteria) this;
        }

        public Criteria andPermissonIdBetween(Long value1, Long value2) {
            addCriterion("PERMISSON_ID between", value1, value2, "permissonId");
            return (Criteria) this;
        }

        public Criteria andPermissonIdNotBetween(Long value1, Long value2) {
            addCriterion("PERMISSON_ID not between", value1, value2, "permissonId");
            return (Criteria) this;
        }

        public Criteria andPermissonNameIsNull() {
            addCriterion("PERMISSON_NAME is null");
            return (Criteria) this;
        }

        public Criteria andPermissonNameIsNotNull() {
            addCriterion("PERMISSON_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andPermissonNameEqualTo(String value) {
            addCriterion("PERMISSON_NAME =", value, "permissonName");
            return (Criteria) this;
        }

        public Criteria andPermissonNameNotEqualTo(String value) {
            addCriterion("PERMISSON_NAME <>", value, "permissonName");
            return (Criteria) this;
        }

        public Criteria andPermissonNameGreaterThan(String value) {
            addCriterion("PERMISSON_NAME >", value, "permissonName");
            return (Criteria) this;
        }

        public Criteria andPermissonNameGreaterThanOrEqualTo(String value) {
            addCriterion("PERMISSON_NAME >=", value, "permissonName");
            return (Criteria) this;
        }

        public Criteria andPermissonNameLessThan(String value) {
            addCriterion("PERMISSON_NAME <", value, "permissonName");
            return (Criteria) this;
        }

        public Criteria andPermissonNameLessThanOrEqualTo(String value) {
            addCriterion("PERMISSON_NAME <=", value, "permissonName");
            return (Criteria) this;
        }

        public Criteria andPermissonNameLike(String value) {
            addCriterion("PERMISSON_NAME like", value, "permissonName");
            return (Criteria) this;
        }

        public Criteria andPermissonNameNotLike(String value) {
            addCriterion("PERMISSON_NAME not like", value, "permissonName");
            return (Criteria) this;
        }

        public Criteria andPermissonNameIn(List<String> values) {
            addCriterion("PERMISSON_NAME in", values, "permissonName");
            return (Criteria) this;
        }

        public Criteria andPermissonNameNotIn(List<String> values) {
            addCriterion("PERMISSON_NAME not in", values, "permissonName");
            return (Criteria) this;
        }

        public Criteria andPermissonNameBetween(String value1, String value2) {
            addCriterion("PERMISSON_NAME between", value1, value2, "permissonName");
            return (Criteria) this;
        }

        public Criteria andPermissonNameNotBetween(String value1, String value2) {
            addCriterion("PERMISSON_NAME not between", value1, value2, "permissonName");
            return (Criteria) this;
        }

        public Criteria andPermissionIsNull() {
            addCriterion("PERMISSION is null");
            return (Criteria) this;
        }

        public Criteria andPermissionIsNotNull() {
            addCriterion("PERMISSION is not null");
            return (Criteria) this;
        }

        public Criteria andPermissionEqualTo(String value) {
            addCriterion("PERMISSION =", value, "permission");
            return (Criteria) this;
        }

        public Criteria andPermissionNotEqualTo(String value) {
            addCriterion("PERMISSION <>", value, "permission");
            return (Criteria) this;
        }

        public Criteria andPermissionGreaterThan(String value) {
            addCriterion("PERMISSION >", value, "permission");
            return (Criteria) this;
        }

        public Criteria andPermissionGreaterThanOrEqualTo(String value) {
            addCriterion("PERMISSION >=", value, "permission");
            return (Criteria) this;
        }

        public Criteria andPermissionLessThan(String value) {
            addCriterion("PERMISSION <", value, "permission");
            return (Criteria) this;
        }

        public Criteria andPermissionLessThanOrEqualTo(String value) {
            addCriterion("PERMISSION <=", value, "permission");
            return (Criteria) this;
        }

        public Criteria andPermissionLike(String value) {
            addCriterion("PERMISSION like", value, "permission");
            return (Criteria) this;
        }

        public Criteria andPermissionNotLike(String value) {
            addCriterion("PERMISSION not like", value, "permission");
            return (Criteria) this;
        }

        public Criteria andPermissionIn(List<String> values) {
            addCriterion("PERMISSION in", values, "permission");
            return (Criteria) this;
        }

        public Criteria andPermissionNotIn(List<String> values) {
            addCriterion("PERMISSION not in", values, "permission");
            return (Criteria) this;
        }

        public Criteria andPermissionBetween(String value1, String value2) {
            addCriterion("PERMISSION between", value1, value2, "permission");
            return (Criteria) this;
        }

        public Criteria andPermissionNotBetween(String value1, String value2) {
            addCriterion("PERMISSION not between", value1, value2, "permission");
            return (Criteria) this;
        }

        public Criteria andPermissionColumnsIdIsNull() {
            addCriterion("PERMISSION_COLUMNS_ID is null");
            return (Criteria) this;
        }

        public Criteria andPermissionColumnsIdIsNotNull() {
            addCriterion("PERMISSION_COLUMNS_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPermissionColumnsIdEqualTo(BigDecimal value) {
            addCriterion("PERMISSION_COLUMNS_ID =", value, "permissionColumnsId");
            return (Criteria) this;
        }

        public Criteria andPermissionColumnsIdNotEqualTo(BigDecimal value) {
            addCriterion("PERMISSION_COLUMNS_ID <>", value, "permissionColumnsId");
            return (Criteria) this;
        }

        public Criteria andPermissionColumnsIdGreaterThan(BigDecimal value) {
            addCriterion("PERMISSION_COLUMNS_ID >", value, "permissionColumnsId");
            return (Criteria) this;
        }

        public Criteria andPermissionColumnsIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PERMISSION_COLUMNS_ID >=", value, "permissionColumnsId");
            return (Criteria) this;
        }

        public Criteria andPermissionColumnsIdLessThan(BigDecimal value) {
            addCriterion("PERMISSION_COLUMNS_ID <", value, "permissionColumnsId");
            return (Criteria) this;
        }

        public Criteria andPermissionColumnsIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PERMISSION_COLUMNS_ID <=", value, "permissionColumnsId");
            return (Criteria) this;
        }

        public Criteria andPermissionColumnsIdIn(List<BigDecimal> values) {
            addCriterion("PERMISSION_COLUMNS_ID in", values, "permissionColumnsId");
            return (Criteria) this;
        }

        public Criteria andPermissionColumnsIdNotIn(List<BigDecimal> values) {
            addCriterion("PERMISSION_COLUMNS_ID not in", values, "permissionColumnsId");
            return (Criteria) this;
        }

        public Criteria andPermissionColumnsIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PERMISSION_COLUMNS_ID between", value1, value2, "permissionColumnsId");
            return (Criteria) this;
        }

        public Criteria andPermissionColumnsIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PERMISSION_COLUMNS_ID not between", value1, value2, "permissionColumnsId");
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