package com.sc.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RsPostMessageExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RsPostMessageExample() {
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

        public Criteria andPostIdIsNull() {
            addCriterion("POST_ID is null");
            return (Criteria) this;
        }

        public Criteria andPostIdIsNotNull() {
            addCriterion("POST_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPostIdEqualTo(Long value) {
            addCriterion("POST_ID =", value, "postId");
            return (Criteria) this;
        }

        public Criteria andPostIdNotEqualTo(Long value) {
            addCriterion("POST_ID <>", value, "postId");
            return (Criteria) this;
        }

        public Criteria andPostIdGreaterThan(Long value) {
            addCriterion("POST_ID >", value, "postId");
            return (Criteria) this;
        }

        public Criteria andPostIdGreaterThanOrEqualTo(Long value) {
            addCriterion("POST_ID >=", value, "postId");
            return (Criteria) this;
        }

        public Criteria andPostIdLessThan(Long value) {
            addCriterion("POST_ID <", value, "postId");
            return (Criteria) this;
        }

        public Criteria andPostIdLessThanOrEqualTo(Long value) {
            addCriterion("POST_ID <=", value, "postId");
            return (Criteria) this;
        }

        public Criteria andPostIdIn(List<Long> values) {
            addCriterion("POST_ID in", values, "postId");
            return (Criteria) this;
        }

        public Criteria andPostIdNotIn(List<Long> values) {
            addCriterion("POST_ID not in", values, "postId");
            return (Criteria) this;
        }

        public Criteria andPostIdBetween(Long value1, Long value2) {
            addCriterion("POST_ID between", value1, value2, "postId");
            return (Criteria) this;
        }

        public Criteria andPostIdNotBetween(Long value1, Long value2) {
            addCriterion("POST_ID not between", value1, value2, "postId");
            return (Criteria) this;
        }

        public Criteria andPostNameIsNull() {
            addCriterion("POST_NAME is null");
            return (Criteria) this;
        }

        public Criteria andPostNameIsNotNull() {
            addCriterion("POST_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andPostNameEqualTo(String value) {
            addCriterion("POST_NAME =", value, "postName");
            return (Criteria) this;
        }

        public Criteria andPostNameNotEqualTo(String value) {
            addCriterion("POST_NAME <>", value, "postName");
            return (Criteria) this;
        }

        public Criteria andPostNameGreaterThan(String value) {
            addCriterion("POST_NAME >", value, "postName");
            return (Criteria) this;
        }

        public Criteria andPostNameGreaterThanOrEqualTo(String value) {
            addCriterion("POST_NAME >=", value, "postName");
            return (Criteria) this;
        }

        public Criteria andPostNameLessThan(String value) {
            addCriterion("POST_NAME <", value, "postName");
            return (Criteria) this;
        }

        public Criteria andPostNameLessThanOrEqualTo(String value) {
            addCriterion("POST_NAME <=", value, "postName");
            return (Criteria) this;
        }

        public Criteria andPostNameLike(String value) {
            addCriterion("POST_NAME like", value, "postName");
            return (Criteria) this;
        }

        public Criteria andPostNameNotLike(String value) {
            addCriterion("POST_NAME not like", value, "postName");
            return (Criteria) this;
        }

        public Criteria andPostNameIn(List<String> values) {
            addCriterion("POST_NAME in", values, "postName");
            return (Criteria) this;
        }

        public Criteria andPostNameNotIn(List<String> values) {
            addCriterion("POST_NAME not in", values, "postName");
            return (Criteria) this;
        }

        public Criteria andPostNameBetween(String value1, String value2) {
            addCriterion("POST_NAME between", value1, value2, "postName");
            return (Criteria) this;
        }

        public Criteria andPostNameNotBetween(String value1, String value2) {
            addCriterion("POST_NAME not between", value1, value2, "postName");
            return (Criteria) this;
        }

        public Criteria andDtmartmentIdIsNull() {
            addCriterion("DTMARTMENT_ID is null");
            return (Criteria) this;
        }

        public Criteria andDtmartmentIdIsNotNull() {
            addCriterion("DTMARTMENT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andDtmartmentIdEqualTo(Long value) {
            addCriterion("DTMARTMENT_ID =", value, "dtmartmentId");
            return (Criteria) this;
        }

        public Criteria andDtmartmentIdNotEqualTo(Long value) {
            addCriterion("DTMARTMENT_ID <>", value, "dtmartmentId");
            return (Criteria) this;
        }

        public Criteria andDtmartmentIdGreaterThan(Long value) {
            addCriterion("DTMARTMENT_ID >", value, "dtmartmentId");
            return (Criteria) this;
        }

        public Criteria andDtmartmentIdGreaterThanOrEqualTo(Long value) {
            addCriterion("DTMARTMENT_ID >=", value, "dtmartmentId");
            return (Criteria) this;
        }

        public Criteria andDtmartmentIdLessThan(Long value) {
            addCriterion("DTMARTMENT_ID <", value, "dtmartmentId");
            return (Criteria) this;
        }

        public Criteria andDtmartmentIdLessThanOrEqualTo(Long value) {
            addCriterion("DTMARTMENT_ID <=", value, "dtmartmentId");
            return (Criteria) this;
        }

        public Criteria andDtmartmentIdIn(List<Long> values) {
            addCriterion("DTMARTMENT_ID in", values, "dtmartmentId");
            return (Criteria) this;
        }

        public Criteria andDtmartmentIdNotIn(List<Long> values) {
            addCriterion("DTMARTMENT_ID not in", values, "dtmartmentId");
            return (Criteria) this;
        }

        public Criteria andDtmartmentIdBetween(Long value1, Long value2) {
            addCriterion("DTMARTMENT_ID between", value1, value2, "dtmartmentId");
            return (Criteria) this;
        }

        public Criteria andDtmartmentIdNotBetween(Long value1, Long value2) {
            addCriterion("DTMARTMENT_ID not between", value1, value2, "dtmartmentId");
            return (Criteria) this;
        }

        public Criteria andRemarkExplainIsNull() {
            addCriterion("REMARK_EXPLAIN is null");
            return (Criteria) this;
        }

        public Criteria andRemarkExplainIsNotNull() {
            addCriterion("REMARK_EXPLAIN is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkExplainEqualTo(String value) {
            addCriterion("REMARK_EXPLAIN =", value, "remarkExplain");
            return (Criteria) this;
        }

        public Criteria andRemarkExplainNotEqualTo(String value) {
            addCriterion("REMARK_EXPLAIN <>", value, "remarkExplain");
            return (Criteria) this;
        }

        public Criteria andRemarkExplainGreaterThan(String value) {
            addCriterion("REMARK_EXPLAIN >", value, "remarkExplain");
            return (Criteria) this;
        }

        public Criteria andRemarkExplainGreaterThanOrEqualTo(String value) {
            addCriterion("REMARK_EXPLAIN >=", value, "remarkExplain");
            return (Criteria) this;
        }

        public Criteria andRemarkExplainLessThan(String value) {
            addCriterion("REMARK_EXPLAIN <", value, "remarkExplain");
            return (Criteria) this;
        }

        public Criteria andRemarkExplainLessThanOrEqualTo(String value) {
            addCriterion("REMARK_EXPLAIN <=", value, "remarkExplain");
            return (Criteria) this;
        }

        public Criteria andRemarkExplainLike(String value) {
            addCriterion("REMARK_EXPLAIN like", value, "remarkExplain");
            return (Criteria) this;
        }

        public Criteria andRemarkExplainNotLike(String value) {
            addCriterion("REMARK_EXPLAIN not like", value, "remarkExplain");
            return (Criteria) this;
        }

        public Criteria andRemarkExplainIn(List<String> values) {
            addCriterion("REMARK_EXPLAIN in", values, "remarkExplain");
            return (Criteria) this;
        }

        public Criteria andRemarkExplainNotIn(List<String> values) {
            addCriterion("REMARK_EXPLAIN not in", values, "remarkExplain");
            return (Criteria) this;
        }

        public Criteria andRemarkExplainBetween(String value1, String value2) {
            addCriterion("REMARK_EXPLAIN between", value1, value2, "remarkExplain");
            return (Criteria) this;
        }

        public Criteria andRemarkExplainNotBetween(String value1, String value2) {
            addCriterion("REMARK_EXPLAIN not between", value1, value2, "remarkExplain");
            return (Criteria) this;
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