package com.sc.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BgExamineTaskExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BgExamineTaskExample() {
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

        public Criteria andTaskTitleIsNull() {
            addCriterion("TASK_TITLE is null");
            return (Criteria) this;
        }

        public Criteria andTaskTitleIsNotNull() {
            addCriterion("TASK_TITLE is not null");
            return (Criteria) this;
        }

        public Criteria andTaskTitleEqualTo(String value) {
            addCriterion("TASK_TITLE =", value, "taskTitle");
            return (Criteria) this;
        }

        public Criteria andTaskTitleNotEqualTo(String value) {
            addCriterion("TASK_TITLE <>", value, "taskTitle");
            return (Criteria) this;
        }

        public Criteria andTaskTitleGreaterThan(String value) {
            addCriterion("TASK_TITLE >", value, "taskTitle");
            return (Criteria) this;
        }

        public Criteria andTaskTitleGreaterThanOrEqualTo(String value) {
            addCriterion("TASK_TITLE >=", value, "taskTitle");
            return (Criteria) this;
        }

        public Criteria andTaskTitleLessThan(String value) {
            addCriterion("TASK_TITLE <", value, "taskTitle");
            return (Criteria) this;
        }

        public Criteria andTaskTitleLessThanOrEqualTo(String value) {
            addCriterion("TASK_TITLE <=", value, "taskTitle");
            return (Criteria) this;
        }

        public Criteria andTaskTitleLike(String value) {
            addCriterion("TASK_TITLE like", value, "taskTitle");
            return (Criteria) this;
        }

        public Criteria andTaskTitleNotLike(String value) {
            addCriterion("TASK_TITLE not like", value, "taskTitle");
            return (Criteria) this;
        }

        public Criteria andTaskTitleIn(List<String> values) {
            addCriterion("TASK_TITLE in", values, "taskTitle");
            return (Criteria) this;
        }

        public Criteria andTaskTitleNotIn(List<String> values) {
            addCriterion("TASK_TITLE not in", values, "taskTitle");
            return (Criteria) this;
        }

        public Criteria andTaskTitleBetween(String value1, String value2) {
            addCriterion("TASK_TITLE between", value1, value2, "taskTitle");
            return (Criteria) this;
        }

        public Criteria andTaskTitleNotBetween(String value1, String value2) {
            addCriterion("TASK_TITLE not between", value1, value2, "taskTitle");
            return (Criteria) this;
        }

        public Criteria andTaskSpecificContentIsNull() {
            addCriterion("TASK_SPECIFIC_CONTENT is null");
            return (Criteria) this;
        }

        public Criteria andTaskSpecificContentIsNotNull() {
            addCriterion("TASK_SPECIFIC_CONTENT is not null");
            return (Criteria) this;
        }

        public Criteria andTaskSpecificContentEqualTo(String value) {
            addCriterion("TASK_SPECIFIC_CONTENT =", value, "taskSpecificContent");
            return (Criteria) this;
        }

        public Criteria andTaskSpecificContentNotEqualTo(String value) {
            addCriterion("TASK_SPECIFIC_CONTENT <>", value, "taskSpecificContent");
            return (Criteria) this;
        }

        public Criteria andTaskSpecificContentGreaterThan(String value) {
            addCriterion("TASK_SPECIFIC_CONTENT >", value, "taskSpecificContent");
            return (Criteria) this;
        }

        public Criteria andTaskSpecificContentGreaterThanOrEqualTo(String value) {
            addCriterion("TASK_SPECIFIC_CONTENT >=", value, "taskSpecificContent");
            return (Criteria) this;
        }

        public Criteria andTaskSpecificContentLessThan(String value) {
            addCriterion("TASK_SPECIFIC_CONTENT <", value, "taskSpecificContent");
            return (Criteria) this;
        }

        public Criteria andTaskSpecificContentLessThanOrEqualTo(String value) {
            addCriterion("TASK_SPECIFIC_CONTENT <=", value, "taskSpecificContent");
            return (Criteria) this;
        }

        public Criteria andTaskSpecificContentLike(String value) {
            addCriterion("TASK_SPECIFIC_CONTENT like", value, "taskSpecificContent");
            return (Criteria) this;
        }

        public Criteria andTaskSpecificContentNotLike(String value) {
            addCriterion("TASK_SPECIFIC_CONTENT not like", value, "taskSpecificContent");
            return (Criteria) this;
        }

        public Criteria andTaskSpecificContentIn(List<String> values) {
            addCriterion("TASK_SPECIFIC_CONTENT in", values, "taskSpecificContent");
            return (Criteria) this;
        }

        public Criteria andTaskSpecificContentNotIn(List<String> values) {
            addCriterion("TASK_SPECIFIC_CONTENT not in", values, "taskSpecificContent");
            return (Criteria) this;
        }

        public Criteria andTaskSpecificContentBetween(String value1, String value2) {
            addCriterion("TASK_SPECIFIC_CONTENT between", value1, value2, "taskSpecificContent");
            return (Criteria) this;
        }

        public Criteria andTaskSpecificContentNotBetween(String value1, String value2) {
            addCriterion("TASK_SPECIFIC_CONTENT not between", value1, value2, "taskSpecificContent");
            return (Criteria) this;
        }

        public Criteria andTaskPublishPersonIsNull() {
            addCriterion("TASK_PUBLISH_PERSON is null");
            return (Criteria) this;
        }

        public Criteria andTaskPublishPersonIsNotNull() {
            addCriterion("TASK_PUBLISH_PERSON is not null");
            return (Criteria) this;
        }

        public Criteria andTaskPublishPersonEqualTo(String value) {
            addCriterion("TASK_PUBLISH_PERSON =", value, "taskPublishPerson");
            return (Criteria) this;
        }

        public Criteria andTaskPublishPersonNotEqualTo(String value) {
            addCriterion("TASK_PUBLISH_PERSON <>", value, "taskPublishPerson");
            return (Criteria) this;
        }

        public Criteria andTaskPublishPersonGreaterThan(String value) {
            addCriterion("TASK_PUBLISH_PERSON >", value, "taskPublishPerson");
            return (Criteria) this;
        }

        public Criteria andTaskPublishPersonGreaterThanOrEqualTo(String value) {
            addCriterion("TASK_PUBLISH_PERSON >=", value, "taskPublishPerson");
            return (Criteria) this;
        }

        public Criteria andTaskPublishPersonLessThan(String value) {
            addCriterion("TASK_PUBLISH_PERSON <", value, "taskPublishPerson");
            return (Criteria) this;
        }

        public Criteria andTaskPublishPersonLessThanOrEqualTo(String value) {
            addCriterion("TASK_PUBLISH_PERSON <=", value, "taskPublishPerson");
            return (Criteria) this;
        }

        public Criteria andTaskPublishPersonLike(String value) {
            addCriterion("TASK_PUBLISH_PERSON like", value, "taskPublishPerson");
            return (Criteria) this;
        }

        public Criteria andTaskPublishPersonNotLike(String value) {
            addCriterion("TASK_PUBLISH_PERSON not like", value, "taskPublishPerson");
            return (Criteria) this;
        }

        public Criteria andTaskPublishPersonIn(List<String> values) {
            addCriterion("TASK_PUBLISH_PERSON in", values, "taskPublishPerson");
            return (Criteria) this;
        }

        public Criteria andTaskPublishPersonNotIn(List<String> values) {
            addCriterion("TASK_PUBLISH_PERSON not in", values, "taskPublishPerson");
            return (Criteria) this;
        }

        public Criteria andTaskPublishPersonBetween(String value1, String value2) {
            addCriterion("TASK_PUBLISH_PERSON between", value1, value2, "taskPublishPerson");
            return (Criteria) this;
        }

        public Criteria andTaskPublishPersonNotBetween(String value1, String value2) {
            addCriterion("TASK_PUBLISH_PERSON not between", value1, value2, "taskPublishPerson");
            return (Criteria) this;
        }

        public Criteria andExamineTargetIsNull() {
            addCriterion("EXAMINE_TARGET is null");
            return (Criteria) this;
        }

        public Criteria andExamineTargetIsNotNull() {
            addCriterion("EXAMINE_TARGET is not null");
            return (Criteria) this;
        }

        public Criteria andExamineTargetEqualTo(String value) {
            addCriterion("EXAMINE_TARGET =", value, "examineTarget");
            return (Criteria) this;
        }

        public Criteria andExamineTargetNotEqualTo(String value) {
            addCriterion("EXAMINE_TARGET <>", value, "examineTarget");
            return (Criteria) this;
        }

        public Criteria andExamineTargetGreaterThan(String value) {
            addCriterion("EXAMINE_TARGET >", value, "examineTarget");
            return (Criteria) this;
        }

        public Criteria andExamineTargetGreaterThanOrEqualTo(String value) {
            addCriterion("EXAMINE_TARGET >=", value, "examineTarget");
            return (Criteria) this;
        }

        public Criteria andExamineTargetLessThan(String value) {
            addCriterion("EXAMINE_TARGET <", value, "examineTarget");
            return (Criteria) this;
        }

        public Criteria andExamineTargetLessThanOrEqualTo(String value) {
            addCriterion("EXAMINE_TARGET <=", value, "examineTarget");
            return (Criteria) this;
        }

        public Criteria andExamineTargetLike(String value) {
            addCriterion("EXAMINE_TARGET like", value, "examineTarget");
            return (Criteria) this;
        }

        public Criteria andExamineTargetNotLike(String value) {
            addCriterion("EXAMINE_TARGET not like", value, "examineTarget");
            return (Criteria) this;
        }

        public Criteria andExamineTargetIn(List<String> values) {
            addCriterion("EXAMINE_TARGET in", values, "examineTarget");
            return (Criteria) this;
        }

        public Criteria andExamineTargetNotIn(List<String> values) {
            addCriterion("EXAMINE_TARGET not in", values, "examineTarget");
            return (Criteria) this;
        }

        public Criteria andExamineTargetBetween(String value1, String value2) {
            addCriterion("EXAMINE_TARGET between", value1, value2, "examineTarget");
            return (Criteria) this;
        }

        public Criteria andExamineTargetNotBetween(String value1, String value2) {
            addCriterion("EXAMINE_TARGET not between", value1, value2, "examineTarget");
            return (Criteria) this;
        }

        public Criteria andTaskBeginTimeIsNull() {
            addCriterion("TASK_BEGIN_TIME is null");
            return (Criteria) this;
        }

        public Criteria andTaskBeginTimeIsNotNull() {
            addCriterion("TASK_BEGIN_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andTaskBeginTimeEqualTo(Date value) {
            addCriterion("TASK_BEGIN_TIME =", value, "taskBeginTime");
            return (Criteria) this;
        }

        public Criteria andTaskBeginTimeNotEqualTo(Date value) {
            addCriterion("TASK_BEGIN_TIME <>", value, "taskBeginTime");
            return (Criteria) this;
        }

        public Criteria andTaskBeginTimeGreaterThan(Date value) {
            addCriterion("TASK_BEGIN_TIME >", value, "taskBeginTime");
            return (Criteria) this;
        }

        public Criteria andTaskBeginTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("TASK_BEGIN_TIME >=", value, "taskBeginTime");
            return (Criteria) this;
        }

        public Criteria andTaskBeginTimeLessThan(Date value) {
            addCriterion("TASK_BEGIN_TIME <", value, "taskBeginTime");
            return (Criteria) this;
        }

        public Criteria andTaskBeginTimeLessThanOrEqualTo(Date value) {
            addCriterion("TASK_BEGIN_TIME <=", value, "taskBeginTime");
            return (Criteria) this;
        }

        public Criteria andTaskBeginTimeIn(List<Date> values) {
            addCriterion("TASK_BEGIN_TIME in", values, "taskBeginTime");
            return (Criteria) this;
        }

        public Criteria andTaskBeginTimeNotIn(List<Date> values) {
            addCriterion("TASK_BEGIN_TIME not in", values, "taskBeginTime");
            return (Criteria) this;
        }

        public Criteria andTaskBeginTimeBetween(Date value1, Date value2) {
            addCriterion("TASK_BEGIN_TIME between", value1, value2, "taskBeginTime");
            return (Criteria) this;
        }

        public Criteria andTaskBeginTimeNotBetween(Date value1, Date value2) {
            addCriterion("TASK_BEGIN_TIME not between", value1, value2, "taskBeginTime");
            return (Criteria) this;
        }

        public Criteria andTaskEndTimeIsNull() {
            addCriterion("TASK_END_TIME is null");
            return (Criteria) this;
        }

        public Criteria andTaskEndTimeIsNotNull() {
            addCriterion("TASK_END_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andTaskEndTimeEqualTo(Date value) {
            addCriterion("TASK_END_TIME =", value, "taskEndTime");
            return (Criteria) this;
        }

        public Criteria andTaskEndTimeNotEqualTo(Date value) {
            addCriterion("TASK_END_TIME <>", value, "taskEndTime");
            return (Criteria) this;
        }

        public Criteria andTaskEndTimeGreaterThan(Date value) {
            addCriterion("TASK_END_TIME >", value, "taskEndTime");
            return (Criteria) this;
        }

        public Criteria andTaskEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("TASK_END_TIME >=", value, "taskEndTime");
            return (Criteria) this;
        }

        public Criteria andTaskEndTimeLessThan(Date value) {
            addCriterion("TASK_END_TIME <", value, "taskEndTime");
            return (Criteria) this;
        }

        public Criteria andTaskEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("TASK_END_TIME <=", value, "taskEndTime");
            return (Criteria) this;
        }

        public Criteria andTaskEndTimeIn(List<Date> values) {
            addCriterion("TASK_END_TIME in", values, "taskEndTime");
            return (Criteria) this;
        }

        public Criteria andTaskEndTimeNotIn(List<Date> values) {
            addCriterion("TASK_END_TIME not in", values, "taskEndTime");
            return (Criteria) this;
        }

        public Criteria andTaskEndTimeBetween(Date value1, Date value2) {
            addCriterion("TASK_END_TIME between", value1, value2, "taskEndTime");
            return (Criteria) this;
        }

        public Criteria andTaskEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("TASK_END_TIME not between", value1, value2, "taskEndTime");
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