package com.sc.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RsUserMessageExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RsUserMessageExample() {
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

        public Criteria andStaffIdIsNull() {
            addCriterion("STAFF_ID is null");
            return (Criteria) this;
        }

        public Criteria andStaffIdIsNotNull() {
            addCriterion("STAFF_ID is not null");
            return (Criteria) this;
        }

        public Criteria andStaffIdEqualTo(Long value) {
            addCriterion("STAFF_ID =", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdNotEqualTo(Long value) {
            addCriterion("STAFF_ID <>", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdGreaterThan(Long value) {
            addCriterion("STAFF_ID >", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdGreaterThanOrEqualTo(Long value) {
            addCriterion("STAFF_ID >=", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdLessThan(Long value) {
            addCriterion("STAFF_ID <", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdLessThanOrEqualTo(Long value) {
            addCriterion("STAFF_ID <=", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdIn(List<Long> values) {
            addCriterion("STAFF_ID in", values, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdNotIn(List<Long> values) {
            addCriterion("STAFF_ID not in", values, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdBetween(Long value1, Long value2) {
            addCriterion("STAFF_ID between", value1, value2, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdNotBetween(Long value1, Long value2) {
            addCriterion("STAFF_ID not between", value1, value2, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffNameIsNull() {
            addCriterion("STAFF_NAME is null");
            return (Criteria) this;
        }

        public Criteria andStaffNameIsNotNull() {
            addCriterion("STAFF_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andStaffNameEqualTo(String value) {
            addCriterion("STAFF_NAME =", value, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameNotEqualTo(String value) {
            addCriterion("STAFF_NAME <>", value, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameGreaterThan(String value) {
            addCriterion("STAFF_NAME >", value, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameGreaterThanOrEqualTo(String value) {
            addCriterion("STAFF_NAME >=", value, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameLessThan(String value) {
            addCriterion("STAFF_NAME <", value, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameLessThanOrEqualTo(String value) {
            addCriterion("STAFF_NAME <=", value, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameLike(String value) {
            addCriterion("STAFF_NAME like", value, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameNotLike(String value) {
            addCriterion("STAFF_NAME not like", value, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameIn(List<String> values) {
            addCriterion("STAFF_NAME in", values, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameNotIn(List<String> values) {
            addCriterion("STAFF_NAME not in", values, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameBetween(String value1, String value2) {
            addCriterion("STAFF_NAME between", value1, value2, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameNotBetween(String value1, String value2) {
            addCriterion("STAFF_NAME not between", value1, value2, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffSexIsNull() {
            addCriterion("STAFF_SEX is null");
            return (Criteria) this;
        }

        public Criteria andStaffSexIsNotNull() {
            addCriterion("STAFF_SEX is not null");
            return (Criteria) this;
        }

        public Criteria andStaffSexEqualTo(String value) {
            addCriterion("STAFF_SEX =", value, "staffSex");
            return (Criteria) this;
        }

        public Criteria andStaffSexNotEqualTo(String value) {
            addCriterion("STAFF_SEX <>", value, "staffSex");
            return (Criteria) this;
        }

        public Criteria andStaffSexGreaterThan(String value) {
            addCriterion("STAFF_SEX >", value, "staffSex");
            return (Criteria) this;
        }

        public Criteria andStaffSexGreaterThanOrEqualTo(String value) {
            addCriterion("STAFF_SEX >=", value, "staffSex");
            return (Criteria) this;
        }

        public Criteria andStaffSexLessThan(String value) {
            addCriterion("STAFF_SEX <", value, "staffSex");
            return (Criteria) this;
        }

        public Criteria andStaffSexLessThanOrEqualTo(String value) {
            addCriterion("STAFF_SEX <=", value, "staffSex");
            return (Criteria) this;
        }

        public Criteria andStaffSexLike(String value) {
            addCriterion("STAFF_SEX like", value, "staffSex");
            return (Criteria) this;
        }

        public Criteria andStaffSexNotLike(String value) {
            addCriterion("STAFF_SEX not like", value, "staffSex");
            return (Criteria) this;
        }

        public Criteria andStaffSexIn(List<String> values) {
            addCriterion("STAFF_SEX in", values, "staffSex");
            return (Criteria) this;
        }

        public Criteria andStaffSexNotIn(List<String> values) {
            addCriterion("STAFF_SEX not in", values, "staffSex");
            return (Criteria) this;
        }

        public Criteria andStaffSexBetween(String value1, String value2) {
            addCriterion("STAFF_SEX between", value1, value2, "staffSex");
            return (Criteria) this;
        }

        public Criteria andStaffSexNotBetween(String value1, String value2) {
            addCriterion("STAFF_SEX not between", value1, value2, "staffSex");
            return (Criteria) this;
        }

        public Criteria andStaffPhotoIsNull() {
            addCriterion("STAFF_PHOTO is null");
            return (Criteria) this;
        }

        public Criteria andStaffPhotoIsNotNull() {
            addCriterion("STAFF_PHOTO is not null");
            return (Criteria) this;
        }

        public Criteria andStaffPhotoEqualTo(String value) {
            addCriterion("STAFF_PHOTO =", value, "staffPhoto");
            return (Criteria) this;
        }

        public Criteria andStaffPhotoNotEqualTo(String value) {
            addCriterion("STAFF_PHOTO <>", value, "staffPhoto");
            return (Criteria) this;
        }

        public Criteria andStaffPhotoGreaterThan(String value) {
            addCriterion("STAFF_PHOTO >", value, "staffPhoto");
            return (Criteria) this;
        }

        public Criteria andStaffPhotoGreaterThanOrEqualTo(String value) {
            addCriterion("STAFF_PHOTO >=", value, "staffPhoto");
            return (Criteria) this;
        }

        public Criteria andStaffPhotoLessThan(String value) {
            addCriterion("STAFF_PHOTO <", value, "staffPhoto");
            return (Criteria) this;
        }

        public Criteria andStaffPhotoLessThanOrEqualTo(String value) {
            addCriterion("STAFF_PHOTO <=", value, "staffPhoto");
            return (Criteria) this;
        }

        public Criteria andStaffPhotoLike(String value) {
            addCriterion("STAFF_PHOTO like", value, "staffPhoto");
            return (Criteria) this;
        }

        public Criteria andStaffPhotoNotLike(String value) {
            addCriterion("STAFF_PHOTO not like", value, "staffPhoto");
            return (Criteria) this;
        }

        public Criteria andStaffPhotoIn(List<String> values) {
            addCriterion("STAFF_PHOTO in", values, "staffPhoto");
            return (Criteria) this;
        }

        public Criteria andStaffPhotoNotIn(List<String> values) {
            addCriterion("STAFF_PHOTO not in", values, "staffPhoto");
            return (Criteria) this;
        }

        public Criteria andStaffPhotoBetween(String value1, String value2) {
            addCriterion("STAFF_PHOTO between", value1, value2, "staffPhoto");
            return (Criteria) this;
        }

        public Criteria andStaffPhotoNotBetween(String value1, String value2) {
            addCriterion("STAFF_PHOTO not between", value1, value2, "staffPhoto");
            return (Criteria) this;
        }

        public Criteria andIdCardIsNull() {
            addCriterion("ID_CARD is null");
            return (Criteria) this;
        }

        public Criteria andIdCardIsNotNull() {
            addCriterion("ID_CARD is not null");
            return (Criteria) this;
        }

        public Criteria andIdCardEqualTo(BigDecimal value) {
            addCriterion("ID_CARD =", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardNotEqualTo(BigDecimal value) {
            addCriterion("ID_CARD <>", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardGreaterThan(BigDecimal value) {
            addCriterion("ID_CARD >", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ID_CARD >=", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardLessThan(BigDecimal value) {
            addCriterion("ID_CARD <", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ID_CARD <=", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardIn(List<BigDecimal> values) {
            addCriterion("ID_CARD in", values, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardNotIn(List<BigDecimal> values) {
            addCriterion("ID_CARD not in", values, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ID_CARD between", value1, value2, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ID_CARD not between", value1, value2, "idCard");
            return (Criteria) this;
        }

        public Criteria andHometownAddressIsNull() {
            addCriterion("HOMETOWN_ADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andHometownAddressIsNotNull() {
            addCriterion("HOMETOWN_ADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andHometownAddressEqualTo(String value) {
            addCriterion("HOMETOWN_ADDRESS =", value, "hometownAddress");
            return (Criteria) this;
        }

        public Criteria andHometownAddressNotEqualTo(String value) {
            addCriterion("HOMETOWN_ADDRESS <>", value, "hometownAddress");
            return (Criteria) this;
        }

        public Criteria andHometownAddressGreaterThan(String value) {
            addCriterion("HOMETOWN_ADDRESS >", value, "hometownAddress");
            return (Criteria) this;
        }

        public Criteria andHometownAddressGreaterThanOrEqualTo(String value) {
            addCriterion("HOMETOWN_ADDRESS >=", value, "hometownAddress");
            return (Criteria) this;
        }

        public Criteria andHometownAddressLessThan(String value) {
            addCriterion("HOMETOWN_ADDRESS <", value, "hometownAddress");
            return (Criteria) this;
        }

        public Criteria andHometownAddressLessThanOrEqualTo(String value) {
            addCriterion("HOMETOWN_ADDRESS <=", value, "hometownAddress");
            return (Criteria) this;
        }

        public Criteria andHometownAddressLike(String value) {
            addCriterion("HOMETOWN_ADDRESS like", value, "hometownAddress");
            return (Criteria) this;
        }

        public Criteria andHometownAddressNotLike(String value) {
            addCriterion("HOMETOWN_ADDRESS not like", value, "hometownAddress");
            return (Criteria) this;
        }

        public Criteria andHometownAddressIn(List<String> values) {
            addCriterion("HOMETOWN_ADDRESS in", values, "hometownAddress");
            return (Criteria) this;
        }

        public Criteria andHometownAddressNotIn(List<String> values) {
            addCriterion("HOMETOWN_ADDRESS not in", values, "hometownAddress");
            return (Criteria) this;
        }

        public Criteria andHometownAddressBetween(String value1, String value2) {
            addCriterion("HOMETOWN_ADDRESS between", value1, value2, "hometownAddress");
            return (Criteria) this;
        }

        public Criteria andHometownAddressNotBetween(String value1, String value2) {
            addCriterion("HOMETOWN_ADDRESS not between", value1, value2, "hometownAddress");
            return (Criteria) this;
        }

        public Criteria andNowAddressIsNull() {
            addCriterion("NOW_ADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andNowAddressIsNotNull() {
            addCriterion("NOW_ADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andNowAddressEqualTo(String value) {
            addCriterion("NOW_ADDRESS =", value, "nowAddress");
            return (Criteria) this;
        }

        public Criteria andNowAddressNotEqualTo(String value) {
            addCriterion("NOW_ADDRESS <>", value, "nowAddress");
            return (Criteria) this;
        }

        public Criteria andNowAddressGreaterThan(String value) {
            addCriterion("NOW_ADDRESS >", value, "nowAddress");
            return (Criteria) this;
        }

        public Criteria andNowAddressGreaterThanOrEqualTo(String value) {
            addCriterion("NOW_ADDRESS >=", value, "nowAddress");
            return (Criteria) this;
        }

        public Criteria andNowAddressLessThan(String value) {
            addCriterion("NOW_ADDRESS <", value, "nowAddress");
            return (Criteria) this;
        }

        public Criteria andNowAddressLessThanOrEqualTo(String value) {
            addCriterion("NOW_ADDRESS <=", value, "nowAddress");
            return (Criteria) this;
        }

        public Criteria andNowAddressLike(String value) {
            addCriterion("NOW_ADDRESS like", value, "nowAddress");
            return (Criteria) this;
        }

        public Criteria andNowAddressNotLike(String value) {
            addCriterion("NOW_ADDRESS not like", value, "nowAddress");
            return (Criteria) this;
        }

        public Criteria andNowAddressIn(List<String> values) {
            addCriterion("NOW_ADDRESS in", values, "nowAddress");
            return (Criteria) this;
        }

        public Criteria andNowAddressNotIn(List<String> values) {
            addCriterion("NOW_ADDRESS not in", values, "nowAddress");
            return (Criteria) this;
        }

        public Criteria andNowAddressBetween(String value1, String value2) {
            addCriterion("NOW_ADDRESS between", value1, value2, "nowAddress");
            return (Criteria) this;
        }

        public Criteria andNowAddressNotBetween(String value1, String value2) {
            addCriterion("NOW_ADDRESS not between", value1, value2, "nowAddress");
            return (Criteria) this;
        }

        public Criteria andStaffEducationalBackgroundIsNull() {
            addCriterion("STAFF_EDUCATIONAL_BACKGROUND is null");
            return (Criteria) this;
        }

        public Criteria andStaffEducationalBackgroundIsNotNull() {
            addCriterion("STAFF_EDUCATIONAL_BACKGROUND is not null");
            return (Criteria) this;
        }

        public Criteria andStaffEducationalBackgroundEqualTo(String value) {
            addCriterion("STAFF_EDUCATIONAL_BACKGROUND =", value, "staffEducationalBackground");
            return (Criteria) this;
        }

        public Criteria andStaffEducationalBackgroundNotEqualTo(String value) {
            addCriterion("STAFF_EDUCATIONAL_BACKGROUND <>", value, "staffEducationalBackground");
            return (Criteria) this;
        }

        public Criteria andStaffEducationalBackgroundGreaterThan(String value) {
            addCriterion("STAFF_EDUCATIONAL_BACKGROUND >", value, "staffEducationalBackground");
            return (Criteria) this;
        }

        public Criteria andStaffEducationalBackgroundGreaterThanOrEqualTo(String value) {
            addCriterion("STAFF_EDUCATIONAL_BACKGROUND >=", value, "staffEducationalBackground");
            return (Criteria) this;
        }

        public Criteria andStaffEducationalBackgroundLessThan(String value) {
            addCriterion("STAFF_EDUCATIONAL_BACKGROUND <", value, "staffEducationalBackground");
            return (Criteria) this;
        }

        public Criteria andStaffEducationalBackgroundLessThanOrEqualTo(String value) {
            addCriterion("STAFF_EDUCATIONAL_BACKGROUND <=", value, "staffEducationalBackground");
            return (Criteria) this;
        }

        public Criteria andStaffEducationalBackgroundLike(String value) {
            addCriterion("STAFF_EDUCATIONAL_BACKGROUND like", value, "staffEducationalBackground");
            return (Criteria) this;
        }

        public Criteria andStaffEducationalBackgroundNotLike(String value) {
            addCriterion("STAFF_EDUCATIONAL_BACKGROUND not like", value, "staffEducationalBackground");
            return (Criteria) this;
        }

        public Criteria andStaffEducationalBackgroundIn(List<String> values) {
            addCriterion("STAFF_EDUCATIONAL_BACKGROUND in", values, "staffEducationalBackground");
            return (Criteria) this;
        }

        public Criteria andStaffEducationalBackgroundNotIn(List<String> values) {
            addCriterion("STAFF_EDUCATIONAL_BACKGROUND not in", values, "staffEducationalBackground");
            return (Criteria) this;
        }

        public Criteria andStaffEducationalBackgroundBetween(String value1, String value2) {
            addCriterion("STAFF_EDUCATIONAL_BACKGROUND between", value1, value2, "staffEducationalBackground");
            return (Criteria) this;
        }

        public Criteria andStaffEducationalBackgroundNotBetween(String value1, String value2) {
            addCriterion("STAFF_EDUCATIONAL_BACKGROUND not between", value1, value2, "staffEducationalBackground");
            return (Criteria) this;
        }

        public Criteria andPoliticCountenanceIsNull() {
            addCriterion("POLITIC_COUNTENANCE is null");
            return (Criteria) this;
        }

        public Criteria andPoliticCountenanceIsNotNull() {
            addCriterion("POLITIC_COUNTENANCE is not null");
            return (Criteria) this;
        }

        public Criteria andPoliticCountenanceEqualTo(String value) {
            addCriterion("POLITIC_COUNTENANCE =", value, "politicCountenance");
            return (Criteria) this;
        }

        public Criteria andPoliticCountenanceNotEqualTo(String value) {
            addCriterion("POLITIC_COUNTENANCE <>", value, "politicCountenance");
            return (Criteria) this;
        }

        public Criteria andPoliticCountenanceGreaterThan(String value) {
            addCriterion("POLITIC_COUNTENANCE >", value, "politicCountenance");
            return (Criteria) this;
        }

        public Criteria andPoliticCountenanceGreaterThanOrEqualTo(String value) {
            addCriterion("POLITIC_COUNTENANCE >=", value, "politicCountenance");
            return (Criteria) this;
        }

        public Criteria andPoliticCountenanceLessThan(String value) {
            addCriterion("POLITIC_COUNTENANCE <", value, "politicCountenance");
            return (Criteria) this;
        }

        public Criteria andPoliticCountenanceLessThanOrEqualTo(String value) {
            addCriterion("POLITIC_COUNTENANCE <=", value, "politicCountenance");
            return (Criteria) this;
        }

        public Criteria andPoliticCountenanceLike(String value) {
            addCriterion("POLITIC_COUNTENANCE like", value, "politicCountenance");
            return (Criteria) this;
        }

        public Criteria andPoliticCountenanceNotLike(String value) {
            addCriterion("POLITIC_COUNTENANCE not like", value, "politicCountenance");
            return (Criteria) this;
        }

        public Criteria andPoliticCountenanceIn(List<String> values) {
            addCriterion("POLITIC_COUNTENANCE in", values, "politicCountenance");
            return (Criteria) this;
        }

        public Criteria andPoliticCountenanceNotIn(List<String> values) {
            addCriterion("POLITIC_COUNTENANCE not in", values, "politicCountenance");
            return (Criteria) this;
        }

        public Criteria andPoliticCountenanceBetween(String value1, String value2) {
            addCriterion("POLITIC_COUNTENANCE between", value1, value2, "politicCountenance");
            return (Criteria) this;
        }

        public Criteria andPoliticCountenanceNotBetween(String value1, String value2) {
            addCriterion("POLITIC_COUNTENANCE not between", value1, value2, "politicCountenance");
            return (Criteria) this;
        }

        public Criteria andGraduateSchoolIsNull() {
            addCriterion("GRADUATE_SCHOOL is null");
            return (Criteria) this;
        }

        public Criteria andGraduateSchoolIsNotNull() {
            addCriterion("GRADUATE_SCHOOL is not null");
            return (Criteria) this;
        }

        public Criteria andGraduateSchoolEqualTo(String value) {
            addCriterion("GRADUATE_SCHOOL =", value, "graduateSchool");
            return (Criteria) this;
        }

        public Criteria andGraduateSchoolNotEqualTo(String value) {
            addCriterion("GRADUATE_SCHOOL <>", value, "graduateSchool");
            return (Criteria) this;
        }

        public Criteria andGraduateSchoolGreaterThan(String value) {
            addCriterion("GRADUATE_SCHOOL >", value, "graduateSchool");
            return (Criteria) this;
        }

        public Criteria andGraduateSchoolGreaterThanOrEqualTo(String value) {
            addCriterion("GRADUATE_SCHOOL >=", value, "graduateSchool");
            return (Criteria) this;
        }

        public Criteria andGraduateSchoolLessThan(String value) {
            addCriterion("GRADUATE_SCHOOL <", value, "graduateSchool");
            return (Criteria) this;
        }

        public Criteria andGraduateSchoolLessThanOrEqualTo(String value) {
            addCriterion("GRADUATE_SCHOOL <=", value, "graduateSchool");
            return (Criteria) this;
        }

        public Criteria andGraduateSchoolLike(String value) {
            addCriterion("GRADUATE_SCHOOL like", value, "graduateSchool");
            return (Criteria) this;
        }

        public Criteria andGraduateSchoolNotLike(String value) {
            addCriterion("GRADUATE_SCHOOL not like", value, "graduateSchool");
            return (Criteria) this;
        }

        public Criteria andGraduateSchoolIn(List<String> values) {
            addCriterion("GRADUATE_SCHOOL in", values, "graduateSchool");
            return (Criteria) this;
        }

        public Criteria andGraduateSchoolNotIn(List<String> values) {
            addCriterion("GRADUATE_SCHOOL not in", values, "graduateSchool");
            return (Criteria) this;
        }

        public Criteria andGraduateSchoolBetween(String value1, String value2) {
            addCriterion("GRADUATE_SCHOOL between", value1, value2, "graduateSchool");
            return (Criteria) this;
        }

        public Criteria andGraduateSchoolNotBetween(String value1, String value2) {
            addCriterion("GRADUATE_SCHOOL not between", value1, value2, "graduateSchool");
            return (Criteria) this;
        }

        public Criteria andOnlineContactInfromationIsNull() {
            addCriterion("ONLINE_CONTACT_INFROMATION is null");
            return (Criteria) this;
        }

        public Criteria andOnlineContactInfromationIsNotNull() {
            addCriterion("ONLINE_CONTACT_INFROMATION is not null");
            return (Criteria) this;
        }

        public Criteria andOnlineContactInfromationEqualTo(String value) {
            addCriterion("ONLINE_CONTACT_INFROMATION =", value, "onlineContactInfromation");
            return (Criteria) this;
        }

        public Criteria andOnlineContactInfromationNotEqualTo(String value) {
            addCriterion("ONLINE_CONTACT_INFROMATION <>", value, "onlineContactInfromation");
            return (Criteria) this;
        }

        public Criteria andOnlineContactInfromationGreaterThan(String value) {
            addCriterion("ONLINE_CONTACT_INFROMATION >", value, "onlineContactInfromation");
            return (Criteria) this;
        }

        public Criteria andOnlineContactInfromationGreaterThanOrEqualTo(String value) {
            addCriterion("ONLINE_CONTACT_INFROMATION >=", value, "onlineContactInfromation");
            return (Criteria) this;
        }

        public Criteria andOnlineContactInfromationLessThan(String value) {
            addCriterion("ONLINE_CONTACT_INFROMATION <", value, "onlineContactInfromation");
            return (Criteria) this;
        }

        public Criteria andOnlineContactInfromationLessThanOrEqualTo(String value) {
            addCriterion("ONLINE_CONTACT_INFROMATION <=", value, "onlineContactInfromation");
            return (Criteria) this;
        }

        public Criteria andOnlineContactInfromationLike(String value) {
            addCriterion("ONLINE_CONTACT_INFROMATION like", value, "onlineContactInfromation");
            return (Criteria) this;
        }

        public Criteria andOnlineContactInfromationNotLike(String value) {
            addCriterion("ONLINE_CONTACT_INFROMATION not like", value, "onlineContactInfromation");
            return (Criteria) this;
        }

        public Criteria andOnlineContactInfromationIn(List<String> values) {
            addCriterion("ONLINE_CONTACT_INFROMATION in", values, "onlineContactInfromation");
            return (Criteria) this;
        }

        public Criteria andOnlineContactInfromationNotIn(List<String> values) {
            addCriterion("ONLINE_CONTACT_INFROMATION not in", values, "onlineContactInfromation");
            return (Criteria) this;
        }

        public Criteria andOnlineContactInfromationBetween(String value1, String value2) {
            addCriterion("ONLINE_CONTACT_INFROMATION between", value1, value2, "onlineContactInfromation");
            return (Criteria) this;
        }

        public Criteria andOnlineContactInfromationNotBetween(String value1, String value2) {
            addCriterion("ONLINE_CONTACT_INFROMATION not between", value1, value2, "onlineContactInfromation");
            return (Criteria) this;
        }

        public Criteria andOnlineContactDetailsIsNull() {
            addCriterion("\"ONLINE CONTACT DETAILS\" is null");
            return (Criteria) this;
        }

        public Criteria andOnlineContactDetailsIsNotNull() {
            addCriterion("\"ONLINE CONTACT DETAILS\" is not null");
            return (Criteria) this;
        }

        public Criteria andOnlineContactDetailsEqualTo(String value) {
            addCriterion("\"ONLINE CONTACT DETAILS\" =", value, "onlineContactDetails");
            return (Criteria) this;
        }

        public Criteria andOnlineContactDetailsNotEqualTo(String value) {
            addCriterion("\"ONLINE CONTACT DETAILS\" <>", value, "onlineContactDetails");
            return (Criteria) this;
        }

        public Criteria andOnlineContactDetailsGreaterThan(String value) {
            addCriterion("\"ONLINE CONTACT DETAILS\" >", value, "onlineContactDetails");
            return (Criteria) this;
        }

        public Criteria andOnlineContactDetailsGreaterThanOrEqualTo(String value) {
            addCriterion("\"ONLINE CONTACT DETAILS\" >=", value, "onlineContactDetails");
            return (Criteria) this;
        }

        public Criteria andOnlineContactDetailsLessThan(String value) {
            addCriterion("\"ONLINE CONTACT DETAILS\" <", value, "onlineContactDetails");
            return (Criteria) this;
        }

        public Criteria andOnlineContactDetailsLessThanOrEqualTo(String value) {
            addCriterion("\"ONLINE CONTACT DETAILS\" <=", value, "onlineContactDetails");
            return (Criteria) this;
        }

        public Criteria andOnlineContactDetailsLike(String value) {
            addCriterion("\"ONLINE CONTACT DETAILS\" like", value, "onlineContactDetails");
            return (Criteria) this;
        }

        public Criteria andOnlineContactDetailsNotLike(String value) {
            addCriterion("\"ONLINE CONTACT DETAILS\" not like", value, "onlineContactDetails");
            return (Criteria) this;
        }

        public Criteria andOnlineContactDetailsIn(List<String> values) {
            addCriterion("\"ONLINE CONTACT DETAILS\" in", values, "onlineContactDetails");
            return (Criteria) this;
        }

        public Criteria andOnlineContactDetailsNotIn(List<String> values) {
            addCriterion("\"ONLINE CONTACT DETAILS\" not in", values, "onlineContactDetails");
            return (Criteria) this;
        }

        public Criteria andOnlineContactDetailsBetween(String value1, String value2) {
            addCriterion("\"ONLINE CONTACT DETAILS\" between", value1, value2, "onlineContactDetails");
            return (Criteria) this;
        }

        public Criteria andOnlineContactDetailsNotBetween(String value1, String value2) {
            addCriterion("\"ONLINE CONTACT DETAILS\" not between", value1, value2, "onlineContactDetails");
            return (Criteria) this;
        }

        public Criteria andExamineStateIsNull() {
            addCriterion("EXAMINE_STATE is null");
            return (Criteria) this;
        }

        public Criteria andExamineStateIsNotNull() {
            addCriterion("EXAMINE_STATE is not null");
            return (Criteria) this;
        }

        public Criteria andExamineStateEqualTo(String value) {
            addCriterion("EXAMINE_STATE =", value, "examineState");
            return (Criteria) this;
        }

        public Criteria andExamineStateNotEqualTo(String value) {
            addCriterion("EXAMINE_STATE <>", value, "examineState");
            return (Criteria) this;
        }

        public Criteria andExamineStateGreaterThan(String value) {
            addCriterion("EXAMINE_STATE >", value, "examineState");
            return (Criteria) this;
        }

        public Criteria andExamineStateGreaterThanOrEqualTo(String value) {
            addCriterion("EXAMINE_STATE >=", value, "examineState");
            return (Criteria) this;
        }

        public Criteria andExamineStateLessThan(String value) {
            addCriterion("EXAMINE_STATE <", value, "examineState");
            return (Criteria) this;
        }

        public Criteria andExamineStateLessThanOrEqualTo(String value) {
            addCriterion("EXAMINE_STATE <=", value, "examineState");
            return (Criteria) this;
        }

        public Criteria andExamineStateLike(String value) {
            addCriterion("EXAMINE_STATE like", value, "examineState");
            return (Criteria) this;
        }

        public Criteria andExamineStateNotLike(String value) {
            addCriterion("EXAMINE_STATE not like", value, "examineState");
            return (Criteria) this;
        }

        public Criteria andExamineStateIn(List<String> values) {
            addCriterion("EXAMINE_STATE in", values, "examineState");
            return (Criteria) this;
        }

        public Criteria andExamineStateNotIn(List<String> values) {
            addCriterion("EXAMINE_STATE not in", values, "examineState");
            return (Criteria) this;
        }

        public Criteria andExamineStateBetween(String value1, String value2) {
            addCriterion("EXAMINE_STATE between", value1, value2, "examineState");
            return (Criteria) this;
        }

        public Criteria andExamineStateNotBetween(String value1, String value2) {
            addCriterion("EXAMINE_STATE not between", value1, value2, "examineState");
            return (Criteria) this;
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

        public Criteria andStaffStateIsNull() {
            addCriterion("STAFF_STATE is null");
            return (Criteria) this;
        }

        public Criteria andStaffStateIsNotNull() {
            addCriterion("STAFF_STATE is not null");
            return (Criteria) this;
        }

        public Criteria andStaffStateEqualTo(String value) {
            addCriterion("STAFF_STATE =", value, "staffState");
            return (Criteria) this;
        }

        public Criteria andStaffStateNotEqualTo(String value) {
            addCriterion("STAFF_STATE <>", value, "staffState");
            return (Criteria) this;
        }

        public Criteria andStaffStateGreaterThan(String value) {
            addCriterion("STAFF_STATE >", value, "staffState");
            return (Criteria) this;
        }

        public Criteria andStaffStateGreaterThanOrEqualTo(String value) {
            addCriterion("STAFF_STATE >=", value, "staffState");
            return (Criteria) this;
        }

        public Criteria andStaffStateLessThan(String value) {
            addCriterion("STAFF_STATE <", value, "staffState");
            return (Criteria) this;
        }

        public Criteria andStaffStateLessThanOrEqualTo(String value) {
            addCriterion("STAFF_STATE <=", value, "staffState");
            return (Criteria) this;
        }

        public Criteria andStaffStateLike(String value) {
            addCriterion("STAFF_STATE like", value, "staffState");
            return (Criteria) this;
        }

        public Criteria andStaffStateNotLike(String value) {
            addCriterion("STAFF_STATE not like", value, "staffState");
            return (Criteria) this;
        }

        public Criteria andStaffStateIn(List<String> values) {
            addCriterion("STAFF_STATE in", values, "staffState");
            return (Criteria) this;
        }

        public Criteria andStaffStateNotIn(List<String> values) {
            addCriterion("STAFF_STATE not in", values, "staffState");
            return (Criteria) this;
        }

        public Criteria andStaffStateBetween(String value1, String value2) {
            addCriterion("STAFF_STATE between", value1, value2, "staffState");
            return (Criteria) this;
        }

        public Criteria andStaffStateNotBetween(String value1, String value2) {
            addCriterion("STAFF_STATE not between", value1, value2, "staffState");
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