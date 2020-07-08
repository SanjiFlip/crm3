package com.sc.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BgTaskDedailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BgTaskDedailExample() {
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

        public Criteria andBhIdIsNull() {
            addCriterion("BH_ID is null");
            return (Criteria) this;
        }

        public Criteria andBhIdIsNotNull() {
            addCriterion("BH_ID is not null");
            return (Criteria) this;
        }

        public Criteria andBhIdEqualTo(Long value) {
            addCriterion("BH_ID =", value, "bhId");
            return (Criteria) this;
        }

        public Criteria andBhIdNotEqualTo(Long value) {
            addCriterion("BH_ID <>", value, "bhId");
            return (Criteria) this;
        }

        public Criteria andBhIdGreaterThan(Long value) {
            addCriterion("BH_ID >", value, "bhId");
            return (Criteria) this;
        }

        public Criteria andBhIdGreaterThanOrEqualTo(Long value) {
            addCriterion("BH_ID >=", value, "bhId");
            return (Criteria) this;
        }

        public Criteria andBhIdLessThan(Long value) {
            addCriterion("BH_ID <", value, "bhId");
            return (Criteria) this;
        }

        public Criteria andBhIdLessThanOrEqualTo(Long value) {
            addCriterion("BH_ID <=", value, "bhId");
            return (Criteria) this;
        }

        public Criteria andBhIdIn(List<Long> values) {
            addCriterion("BH_ID in", values, "bhId");
            return (Criteria) this;
        }

        public Criteria andBhIdNotIn(List<Long> values) {
            addCriterion("BH_ID not in", values, "bhId");
            return (Criteria) this;
        }

        public Criteria andBhIdBetween(Long value1, Long value2) {
            addCriterion("BH_ID between", value1, value2, "bhId");
            return (Criteria) this;
        }

        public Criteria andBhIdNotBetween(Long value1, Long value2) {
            addCriterion("BH_ID not between", value1, value2, "bhId");
            return (Criteria) this;
        }

        public Criteria andTaskIdIsNull() {
            addCriterion("TASK_ID is null");
            return (Criteria) this;
        }

        public Criteria andTaskIdIsNotNull() {
            addCriterion("TASK_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTaskIdEqualTo(Long value) {
            addCriterion("TASK_ID =", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdNotEqualTo(Long value) {
            addCriterion("TASK_ID <>", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdGreaterThan(Long value) {
            addCriterion("TASK_ID >", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdGreaterThanOrEqualTo(Long value) {
            addCriterion("TASK_ID >=", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdLessThan(Long value) {
            addCriterion("TASK_ID <", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdLessThanOrEqualTo(Long value) {
            addCriterion("TASK_ID <=", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdIn(List<Long> values) {
            addCriterion("TASK_ID in", values, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdNotIn(List<Long> values) {
            addCriterion("TASK_ID not in", values, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdBetween(Long value1, Long value2) {
            addCriterion("TASK_ID between", value1, value2, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdNotBetween(Long value1, Long value2) {
            addCriterion("TASK_ID not between", value1, value2, "taskId");
            return (Criteria) this;
        }

        public Criteria andAcceptUserIdIsNull() {
            addCriterion("ACCEPT_USER_ID is null");
            return (Criteria) this;
        }

        public Criteria andAcceptUserIdIsNotNull() {
            addCriterion("ACCEPT_USER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andAcceptUserIdEqualTo(Long value) {
            addCriterion("ACCEPT_USER_ID =", value, "acceptUserId");
            return (Criteria) this;
        }

        public Criteria andAcceptUserIdNotEqualTo(Long value) {
            addCriterion("ACCEPT_USER_ID <>", value, "acceptUserId");
            return (Criteria) this;
        }

        public Criteria andAcceptUserIdGreaterThan(Long value) {
            addCriterion("ACCEPT_USER_ID >", value, "acceptUserId");
            return (Criteria) this;
        }

        public Criteria andAcceptUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("ACCEPT_USER_ID >=", value, "acceptUserId");
            return (Criteria) this;
        }

        public Criteria andAcceptUserIdLessThan(Long value) {
            addCriterion("ACCEPT_USER_ID <", value, "acceptUserId");
            return (Criteria) this;
        }

        public Criteria andAcceptUserIdLessThanOrEqualTo(Long value) {
            addCriterion("ACCEPT_USER_ID <=", value, "acceptUserId");
            return (Criteria) this;
        }

        public Criteria andAcceptUserIdIn(List<Long> values) {
            addCriterion("ACCEPT_USER_ID in", values, "acceptUserId");
            return (Criteria) this;
        }

        public Criteria andAcceptUserIdNotIn(List<Long> values) {
            addCriterion("ACCEPT_USER_ID not in", values, "acceptUserId");
            return (Criteria) this;
        }

        public Criteria andAcceptUserIdBetween(Long value1, Long value2) {
            addCriterion("ACCEPT_USER_ID between", value1, value2, "acceptUserId");
            return (Criteria) this;
        }

        public Criteria andAcceptUserIdNotBetween(Long value1, Long value2) {
            addCriterion("ACCEPT_USER_ID not between", value1, value2, "acceptUserId");
            return (Criteria) this;
        }

        public Criteria andWhetherFinishIsNull() {
            addCriterion("WHETHER_FINISH is null");
            return (Criteria) this;
        }

        public Criteria andWhetherFinishIsNotNull() {
            addCriterion("WHETHER_FINISH is not null");
            return (Criteria) this;
        }

        public Criteria andWhetherFinishEqualTo(String value) {
            addCriterion("WHETHER_FINISH =", value, "whetherFinish");
            return (Criteria) this;
        }

        public Criteria andWhetherFinishNotEqualTo(String value) {
            addCriterion("WHETHER_FINISH <>", value, "whetherFinish");
            return (Criteria) this;
        }

        public Criteria andWhetherFinishGreaterThan(String value) {
            addCriterion("WHETHER_FINISH >", value, "whetherFinish");
            return (Criteria) this;
        }

        public Criteria andWhetherFinishGreaterThanOrEqualTo(String value) {
            addCriterion("WHETHER_FINISH >=", value, "whetherFinish");
            return (Criteria) this;
        }

        public Criteria andWhetherFinishLessThan(String value) {
            addCriterion("WHETHER_FINISH <", value, "whetherFinish");
            return (Criteria) this;
        }

        public Criteria andWhetherFinishLessThanOrEqualTo(String value) {
            addCriterion("WHETHER_FINISH <=", value, "whetherFinish");
            return (Criteria) this;
        }

        public Criteria andWhetherFinishLike(String value) {
            addCriterion("WHETHER_FINISH like", value, "whetherFinish");
            return (Criteria) this;
        }

        public Criteria andWhetherFinishNotLike(String value) {
            addCriterion("WHETHER_FINISH not like", value, "whetherFinish");
            return (Criteria) this;
        }

        public Criteria andWhetherFinishIn(List<String> values) {
            addCriterion("WHETHER_FINISH in", values, "whetherFinish");
            return (Criteria) this;
        }

        public Criteria andWhetherFinishNotIn(List<String> values) {
            addCriterion("WHETHER_FINISH not in", values, "whetherFinish");
            return (Criteria) this;
        }

        public Criteria andWhetherFinishBetween(String value1, String value2) {
            addCriterion("WHETHER_FINISH between", value1, value2, "whetherFinish");
            return (Criteria) this;
        }

        public Criteria andWhetherFinishNotBetween(String value1, String value2) {
            addCriterion("WHETHER_FINISH not between", value1, value2, "whetherFinish");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("STATE is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("STATE is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(String value) {
            addCriterion("STATE =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(String value) {
            addCriterion("STATE <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(String value) {
            addCriterion("STATE >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(String value) {
            addCriterion("STATE >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(String value) {
            addCriterion("STATE <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(String value) {
            addCriterion("STATE <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLike(String value) {
            addCriterion("STATE like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotLike(String value) {
            addCriterion("STATE not like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<String> values) {
            addCriterion("STATE in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<String> values) {
            addCriterion("STATE not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(String value1, String value2) {
            addCriterion("STATE between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(String value1, String value2) {
            addCriterion("STATE not between", value1, value2, "state");
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