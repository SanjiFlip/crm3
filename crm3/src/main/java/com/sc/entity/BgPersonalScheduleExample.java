package com.sc.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BgPersonalScheduleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BgPersonalScheduleExample() {
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

        public Criteria andSchedulePlanIdIsNull() {
            addCriterion("SCHEDULE_PLAN_ID is null");
            return (Criteria) this;
        }

        public Criteria andSchedulePlanIdIsNotNull() {
            addCriterion("SCHEDULE_PLAN_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSchedulePlanIdEqualTo(Long value) {
            addCriterion("SCHEDULE_PLAN_ID =", value, "schedulePlanId");
            return (Criteria) this;
        }

        public Criteria andSchedulePlanIdNotEqualTo(Long value) {
            addCriterion("SCHEDULE_PLAN_ID <>", value, "schedulePlanId");
            return (Criteria) this;
        }

        public Criteria andSchedulePlanIdGreaterThan(Long value) {
            addCriterion("SCHEDULE_PLAN_ID >", value, "schedulePlanId");
            return (Criteria) this;
        }

        public Criteria andSchedulePlanIdGreaterThanOrEqualTo(Long value) {
            addCriterion("SCHEDULE_PLAN_ID >=", value, "schedulePlanId");
            return (Criteria) this;
        }

        public Criteria andSchedulePlanIdLessThan(Long value) {
            addCriterion("SCHEDULE_PLAN_ID <", value, "schedulePlanId");
            return (Criteria) this;
        }

        public Criteria andSchedulePlanIdLessThanOrEqualTo(Long value) {
            addCriterion("SCHEDULE_PLAN_ID <=", value, "schedulePlanId");
            return (Criteria) this;
        }

        public Criteria andSchedulePlanIdIn(List<Long> values) {
            addCriterion("SCHEDULE_PLAN_ID in", values, "schedulePlanId");
            return (Criteria) this;
        }

        public Criteria andSchedulePlanIdNotIn(List<Long> values) {
            addCriterion("SCHEDULE_PLAN_ID not in", values, "schedulePlanId");
            return (Criteria) this;
        }

        public Criteria andSchedulePlanIdBetween(Long value1, Long value2) {
            addCriterion("SCHEDULE_PLAN_ID between", value1, value2, "schedulePlanId");
            return (Criteria) this;
        }

        public Criteria andSchedulePlanIdNotBetween(Long value1, Long value2) {
            addCriterion("SCHEDULE_PLAN_ID not between", value1, value2, "schedulePlanId");
            return (Criteria) this;
        }

        public Criteria andPlanCategoryIsNull() {
            addCriterion("PLAN_CATEGORY is null");
            return (Criteria) this;
        }

        public Criteria andPlanCategoryIsNotNull() {
            addCriterion("PLAN_CATEGORY is not null");
            return (Criteria) this;
        }

        public Criteria andPlanCategoryEqualTo(String value) {
            addCriterion("PLAN_CATEGORY =", value, "planCategory");
            return (Criteria) this;
        }

        public Criteria andPlanCategoryNotEqualTo(String value) {
            addCriterion("PLAN_CATEGORY <>", value, "planCategory");
            return (Criteria) this;
        }

        public Criteria andPlanCategoryGreaterThan(String value) {
            addCriterion("PLAN_CATEGORY >", value, "planCategory");
            return (Criteria) this;
        }

        public Criteria andPlanCategoryGreaterThanOrEqualTo(String value) {
            addCriterion("PLAN_CATEGORY >=", value, "planCategory");
            return (Criteria) this;
        }

        public Criteria andPlanCategoryLessThan(String value) {
            addCriterion("PLAN_CATEGORY <", value, "planCategory");
            return (Criteria) this;
        }

        public Criteria andPlanCategoryLessThanOrEqualTo(String value) {
            addCriterion("PLAN_CATEGORY <=", value, "planCategory");
            return (Criteria) this;
        }

        public Criteria andPlanCategoryLike(String value) {
            addCriterion("PLAN_CATEGORY like", value, "planCategory");
            return (Criteria) this;
        }

        public Criteria andPlanCategoryNotLike(String value) {
            addCriterion("PLAN_CATEGORY not like", value, "planCategory");
            return (Criteria) this;
        }

        public Criteria andPlanCategoryIn(List<String> values) {
            addCriterion("PLAN_CATEGORY in", values, "planCategory");
            return (Criteria) this;
        }

        public Criteria andPlanCategoryNotIn(List<String> values) {
            addCriterion("PLAN_CATEGORY not in", values, "planCategory");
            return (Criteria) this;
        }

        public Criteria andPlanCategoryBetween(String value1, String value2) {
            addCriterion("PLAN_CATEGORY between", value1, value2, "planCategory");
            return (Criteria) this;
        }

        public Criteria andPlanCategoryNotBetween(String value1, String value2) {
            addCriterion("PLAN_CATEGORY not between", value1, value2, "planCategory");
            return (Criteria) this;
        }

        public Criteria andPlanThemeIsNull() {
            addCriterion("PLAN_THEME is null");
            return (Criteria) this;
        }

        public Criteria andPlanThemeIsNotNull() {
            addCriterion("PLAN_THEME is not null");
            return (Criteria) this;
        }

        public Criteria andPlanThemeEqualTo(String value) {
            addCriterion("PLAN_THEME =", value, "planTheme");
            return (Criteria) this;
        }

        public Criteria andPlanThemeNotEqualTo(String value) {
            addCriterion("PLAN_THEME <>", value, "planTheme");
            return (Criteria) this;
        }

        public Criteria andPlanThemeGreaterThan(String value) {
            addCriterion("PLAN_THEME >", value, "planTheme");
            return (Criteria) this;
        }

        public Criteria andPlanThemeGreaterThanOrEqualTo(String value) {
            addCriterion("PLAN_THEME >=", value, "planTheme");
            return (Criteria) this;
        }

        public Criteria andPlanThemeLessThan(String value) {
            addCriterion("PLAN_THEME <", value, "planTheme");
            return (Criteria) this;
        }

        public Criteria andPlanThemeLessThanOrEqualTo(String value) {
            addCriterion("PLAN_THEME <=", value, "planTheme");
            return (Criteria) this;
        }

        public Criteria andPlanThemeLike(String value) {
            addCriterion("PLAN_THEME like", value, "planTheme");
            return (Criteria) this;
        }

        public Criteria andPlanThemeNotLike(String value) {
            addCriterion("PLAN_THEME not like", value, "planTheme");
            return (Criteria) this;
        }

        public Criteria andPlanThemeIn(List<String> values) {
            addCriterion("PLAN_THEME in", values, "planTheme");
            return (Criteria) this;
        }

        public Criteria andPlanThemeNotIn(List<String> values) {
            addCriterion("PLAN_THEME not in", values, "planTheme");
            return (Criteria) this;
        }

        public Criteria andPlanThemeBetween(String value1, String value2) {
            addCriterion("PLAN_THEME between", value1, value2, "planTheme");
            return (Criteria) this;
        }

        public Criteria andPlanThemeNotBetween(String value1, String value2) {
            addCriterion("PLAN_THEME not between", value1, value2, "planTheme");
            return (Criteria) this;
        }

        public Criteria andBeginDateIsNull() {
            addCriterion("BEGIN_DATE is null");
            return (Criteria) this;
        }

        public Criteria andBeginDateIsNotNull() {
            addCriterion("BEGIN_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andBeginDateEqualTo(Date value) {
            addCriterion("BEGIN_DATE =", value, "beginDate");
            return (Criteria) this;
        }

        public Criteria andBeginDateNotEqualTo(Date value) {
            addCriterion("BEGIN_DATE <>", value, "beginDate");
            return (Criteria) this;
        }

        public Criteria andBeginDateGreaterThan(Date value) {
            addCriterion("BEGIN_DATE >", value, "beginDate");
            return (Criteria) this;
        }

        public Criteria andBeginDateGreaterThanOrEqualTo(Date value) {
            addCriterion("BEGIN_DATE >=", value, "beginDate");
            return (Criteria) this;
        }

        public Criteria andBeginDateLessThan(Date value) {
            addCriterion("BEGIN_DATE <", value, "beginDate");
            return (Criteria) this;
        }

        public Criteria andBeginDateLessThanOrEqualTo(Date value) {
            addCriterion("BEGIN_DATE <=", value, "beginDate");
            return (Criteria) this;
        }

        public Criteria andBeginDateIn(List<Date> values) {
            addCriterion("BEGIN_DATE in", values, "beginDate");
            return (Criteria) this;
        }

        public Criteria andBeginDateNotIn(List<Date> values) {
            addCriterion("BEGIN_DATE not in", values, "beginDate");
            return (Criteria) this;
        }

        public Criteria andBeginDateBetween(Date value1, Date value2) {
            addCriterion("BEGIN_DATE between", value1, value2, "beginDate");
            return (Criteria) this;
        }

        public Criteria andBeginDateNotBetween(Date value1, Date value2) {
            addCriterion("BEGIN_DATE not between", value1, value2, "beginDate");
            return (Criteria) this;
        }

        public Criteria andBeginTimeIsNull() {
            addCriterion("BEGIN_TIME is null");
            return (Criteria) this;
        }

        public Criteria andBeginTimeIsNotNull() {
            addCriterion("BEGIN_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andBeginTimeEqualTo(Date value) {
            addCriterion("BEGIN_TIME =", value, "beginTime");
            return (Criteria) this;
        }

        public Criteria andBeginTimeNotEqualTo(Date value) {
            addCriterion("BEGIN_TIME <>", value, "beginTime");
            return (Criteria) this;
        }

        public Criteria andBeginTimeGreaterThan(Date value) {
            addCriterion("BEGIN_TIME >", value, "beginTime");
            return (Criteria) this;
        }

        public Criteria andBeginTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("BEGIN_TIME >=", value, "beginTime");
            return (Criteria) this;
        }

        public Criteria andBeginTimeLessThan(Date value) {
            addCriterion("BEGIN_TIME <", value, "beginTime");
            return (Criteria) this;
        }

        public Criteria andBeginTimeLessThanOrEqualTo(Date value) {
            addCriterion("BEGIN_TIME <=", value, "beginTime");
            return (Criteria) this;
        }

        public Criteria andBeginTimeIn(List<Date> values) {
            addCriterion("BEGIN_TIME in", values, "beginTime");
            return (Criteria) this;
        }

        public Criteria andBeginTimeNotIn(List<Date> values) {
            addCriterion("BEGIN_TIME not in", values, "beginTime");
            return (Criteria) this;
        }

        public Criteria andBeginTimeBetween(Date value1, Date value2) {
            addCriterion("BEGIN_TIME between", value1, value2, "beginTime");
            return (Criteria) this;
        }

        public Criteria andBeginTimeNotBetween(Date value1, Date value2) {
            addCriterion("BEGIN_TIME not between", value1, value2, "beginTime");
            return (Criteria) this;
        }

        public Criteria andWritePersonnelIdIsNull() {
            addCriterion("WRITE_PERSONNEL_ID is null");
            return (Criteria) this;
        }

        public Criteria andWritePersonnelIdIsNotNull() {
            addCriterion("WRITE_PERSONNEL_ID is not null");
            return (Criteria) this;
        }

        public Criteria andWritePersonnelIdEqualTo(Long value) {
            addCriterion("WRITE_PERSONNEL_ID =", value, "writePersonnelId");
            return (Criteria) this;
        }

        public Criteria andWritePersonnelIdNotEqualTo(Long value) {
            addCriterion("WRITE_PERSONNEL_ID <>", value, "writePersonnelId");
            return (Criteria) this;
        }

        public Criteria andWritePersonnelIdGreaterThan(Long value) {
            addCriterion("WRITE_PERSONNEL_ID >", value, "writePersonnelId");
            return (Criteria) this;
        }

        public Criteria andWritePersonnelIdGreaterThanOrEqualTo(Long value) {
            addCriterion("WRITE_PERSONNEL_ID >=", value, "writePersonnelId");
            return (Criteria) this;
        }

        public Criteria andWritePersonnelIdLessThan(Long value) {
            addCriterion("WRITE_PERSONNEL_ID <", value, "writePersonnelId");
            return (Criteria) this;
        }

        public Criteria andWritePersonnelIdLessThanOrEqualTo(Long value) {
            addCriterion("WRITE_PERSONNEL_ID <=", value, "writePersonnelId");
            return (Criteria) this;
        }

        public Criteria andWritePersonnelIdIn(List<Long> values) {
            addCriterion("WRITE_PERSONNEL_ID in", values, "writePersonnelId");
            return (Criteria) this;
        }

        public Criteria andWritePersonnelIdNotIn(List<Long> values) {
            addCriterion("WRITE_PERSONNEL_ID not in", values, "writePersonnelId");
            return (Criteria) this;
        }

        public Criteria andWritePersonnelIdBetween(Long value1, Long value2) {
            addCriterion("WRITE_PERSONNEL_ID between", value1, value2, "writePersonnelId");
            return (Criteria) this;
        }

        public Criteria andWritePersonnelIdNotBetween(Long value1, Long value2) {
            addCriterion("WRITE_PERSONNEL_ID not between", value1, value2, "writePersonnelId");
            return (Criteria) this;
        }

        public Criteria andPlanDescribeIsNull() {
            addCriterion("PLAN_DESCRIBE is null");
            return (Criteria) this;
        }

        public Criteria andPlanDescribeIsNotNull() {
            addCriterion("PLAN_DESCRIBE is not null");
            return (Criteria) this;
        }

        public Criteria andPlanDescribeEqualTo(String value) {
            addCriterion("PLAN_DESCRIBE =", value, "planDescribe");
            return (Criteria) this;
        }

        public Criteria andPlanDescribeNotEqualTo(String value) {
            addCriterion("PLAN_DESCRIBE <>", value, "planDescribe");
            return (Criteria) this;
        }

        public Criteria andPlanDescribeGreaterThan(String value) {
            addCriterion("PLAN_DESCRIBE >", value, "planDescribe");
            return (Criteria) this;
        }

        public Criteria andPlanDescribeGreaterThanOrEqualTo(String value) {
            addCriterion("PLAN_DESCRIBE >=", value, "planDescribe");
            return (Criteria) this;
        }

        public Criteria andPlanDescribeLessThan(String value) {
            addCriterion("PLAN_DESCRIBE <", value, "planDescribe");
            return (Criteria) this;
        }

        public Criteria andPlanDescribeLessThanOrEqualTo(String value) {
            addCriterion("PLAN_DESCRIBE <=", value, "planDescribe");
            return (Criteria) this;
        }

        public Criteria andPlanDescribeLike(String value) {
            addCriterion("PLAN_DESCRIBE like", value, "planDescribe");
            return (Criteria) this;
        }

        public Criteria andPlanDescribeNotLike(String value) {
            addCriterion("PLAN_DESCRIBE not like", value, "planDescribe");
            return (Criteria) this;
        }

        public Criteria andPlanDescribeIn(List<String> values) {
            addCriterion("PLAN_DESCRIBE in", values, "planDescribe");
            return (Criteria) this;
        }

        public Criteria andPlanDescribeNotIn(List<String> values) {
            addCriterion("PLAN_DESCRIBE not in", values, "planDescribe");
            return (Criteria) this;
        }

        public Criteria andPlanDescribeBetween(String value1, String value2) {
            addCriterion("PLAN_DESCRIBE between", value1, value2, "planDescribe");
            return (Criteria) this;
        }

        public Criteria andPlanDescribeNotBetween(String value1, String value2) {
            addCriterion("PLAN_DESCRIBE not between", value1, value2, "planDescribe");
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