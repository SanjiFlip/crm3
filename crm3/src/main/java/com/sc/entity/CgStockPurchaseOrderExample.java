package com.sc.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CgStockPurchaseOrderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CgStockPurchaseOrderExample() {
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

        public Criteria andPurchaseOrderIdIsNull() {
            addCriterion("PURCHASE_ORDER_ID is null");
            return (Criteria) this;
        }

        public Criteria andPurchaseOrderIdIsNotNull() {
            addCriterion("PURCHASE_ORDER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPurchaseOrderIdEqualTo(BigDecimal value) {
            addCriterion("PURCHASE_ORDER_ID =", value, "purchaseOrderId");
            return (Criteria) this;
        }

        public Criteria andPurchaseOrderIdNotEqualTo(BigDecimal value) {
            addCriterion("PURCHASE_ORDER_ID <>", value, "purchaseOrderId");
            return (Criteria) this;
        }

        public Criteria andPurchaseOrderIdGreaterThan(BigDecimal value) {
            addCriterion("PURCHASE_ORDER_ID >", value, "purchaseOrderId");
            return (Criteria) this;
        }

        public Criteria andPurchaseOrderIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PURCHASE_ORDER_ID >=", value, "purchaseOrderId");
            return (Criteria) this;
        }

        public Criteria andPurchaseOrderIdLessThan(BigDecimal value) {
            addCriterion("PURCHASE_ORDER_ID <", value, "purchaseOrderId");
            return (Criteria) this;
        }

        public Criteria andPurchaseOrderIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PURCHASE_ORDER_ID <=", value, "purchaseOrderId");
            return (Criteria) this;
        }

        public Criteria andPurchaseOrderIdIn(List<BigDecimal> values) {
            addCriterion("PURCHASE_ORDER_ID in", values, "purchaseOrderId");
            return (Criteria) this;
        }

        public Criteria andPurchaseOrderIdNotIn(List<BigDecimal> values) {
            addCriterion("PURCHASE_ORDER_ID not in", values, "purchaseOrderId");
            return (Criteria) this;
        }

        public Criteria andPurchaseOrderIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PURCHASE_ORDER_ID between", value1, value2, "purchaseOrderId");
            return (Criteria) this;
        }

        public Criteria andPurchaseOrderIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PURCHASE_ORDER_ID not between", value1, value2, "purchaseOrderId");
            return (Criteria) this;
        }

        public Criteria andPurchaseSubjectIsNull() {
            addCriterion("PURCHASE_SUBJECT is null");
            return (Criteria) this;
        }

        public Criteria andPurchaseSubjectIsNotNull() {
            addCriterion("PURCHASE_SUBJECT is not null");
            return (Criteria) this;
        }

        public Criteria andPurchaseSubjectEqualTo(String value) {
            addCriterion("PURCHASE_SUBJECT =", value, "purchaseSubject");
            return (Criteria) this;
        }

        public Criteria andPurchaseSubjectNotEqualTo(String value) {
            addCriterion("PURCHASE_SUBJECT <>", value, "purchaseSubject");
            return (Criteria) this;
        }

        public Criteria andPurchaseSubjectGreaterThan(String value) {
            addCriterion("PURCHASE_SUBJECT >", value, "purchaseSubject");
            return (Criteria) this;
        }

        public Criteria andPurchaseSubjectGreaterThanOrEqualTo(String value) {
            addCriterion("PURCHASE_SUBJECT >=", value, "purchaseSubject");
            return (Criteria) this;
        }

        public Criteria andPurchaseSubjectLessThan(String value) {
            addCriterion("PURCHASE_SUBJECT <", value, "purchaseSubject");
            return (Criteria) this;
        }

        public Criteria andPurchaseSubjectLessThanOrEqualTo(String value) {
            addCriterion("PURCHASE_SUBJECT <=", value, "purchaseSubject");
            return (Criteria) this;
        }

        public Criteria andPurchaseSubjectLike(String value) {
            addCriterion("PURCHASE_SUBJECT like", value, "purchaseSubject");
            return (Criteria) this;
        }

        public Criteria andPurchaseSubjectNotLike(String value) {
            addCriterion("PURCHASE_SUBJECT not like", value, "purchaseSubject");
            return (Criteria) this;
        }

        public Criteria andPurchaseSubjectIn(List<String> values) {
            addCriterion("PURCHASE_SUBJECT in", values, "purchaseSubject");
            return (Criteria) this;
        }

        public Criteria andPurchaseSubjectNotIn(List<String> values) {
            addCriterion("PURCHASE_SUBJECT not in", values, "purchaseSubject");
            return (Criteria) this;
        }

        public Criteria andPurchaseSubjectBetween(String value1, String value2) {
            addCriterion("PURCHASE_SUBJECT between", value1, value2, "purchaseSubject");
            return (Criteria) this;
        }

        public Criteria andPurchaseSubjectNotBetween(String value1, String value2) {
            addCriterion("PURCHASE_SUBJECT not between", value1, value2, "purchaseSubject");
            return (Criteria) this;
        }

        public Criteria andPurchaseDateIsNull() {
            addCriterion("PURCHASE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andPurchaseDateIsNotNull() {
            addCriterion("PURCHASE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andPurchaseDateEqualTo(Date value) {
            addCriterion("PURCHASE_DATE =", value, "purchaseDate");
            return (Criteria) this;
        }

        public Criteria andPurchaseDateNotEqualTo(Date value) {
            addCriterion("PURCHASE_DATE <>", value, "purchaseDate");
            return (Criteria) this;
        }

        public Criteria andPurchaseDateGreaterThan(Date value) {
            addCriterion("PURCHASE_DATE >", value, "purchaseDate");
            return (Criteria) this;
        }

        public Criteria andPurchaseDateGreaterThanOrEqualTo(Date value) {
            addCriterion("PURCHASE_DATE >=", value, "purchaseDate");
            return (Criteria) this;
        }

        public Criteria andPurchaseDateLessThan(Date value) {
            addCriterion("PURCHASE_DATE <", value, "purchaseDate");
            return (Criteria) this;
        }

        public Criteria andPurchaseDateLessThanOrEqualTo(Date value) {
            addCriterion("PURCHASE_DATE <=", value, "purchaseDate");
            return (Criteria) this;
        }

        public Criteria andPurchaseDateIn(List<Date> values) {
            addCriterion("PURCHASE_DATE in", values, "purchaseDate");
            return (Criteria) this;
        }

        public Criteria andPurchaseDateNotIn(List<Date> values) {
            addCriterion("PURCHASE_DATE not in", values, "purchaseDate");
            return (Criteria) this;
        }

        public Criteria andPurchaseDateBetween(Date value1, Date value2) {
            addCriterion("PURCHASE_DATE between", value1, value2, "purchaseDate");
            return (Criteria) this;
        }

        public Criteria andPurchaseDateNotBetween(Date value1, Date value2) {
            addCriterion("PURCHASE_DATE not between", value1, value2, "purchaseDate");
            return (Criteria) this;
        }

        public Criteria andSupplierIdIsNull() {
            addCriterion("SUPPLIER_ID is null");
            return (Criteria) this;
        }

        public Criteria andSupplierIdIsNotNull() {
            addCriterion("SUPPLIER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierIdEqualTo(Long value) {
            addCriterion("SUPPLIER_ID =", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdNotEqualTo(Long value) {
            addCriterion("SUPPLIER_ID <>", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdGreaterThan(Long value) {
            addCriterion("SUPPLIER_ID >", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdGreaterThanOrEqualTo(Long value) {
            addCriterion("SUPPLIER_ID >=", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdLessThan(Long value) {
            addCriterion("SUPPLIER_ID <", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdLessThanOrEqualTo(Long value) {
            addCriterion("SUPPLIER_ID <=", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdIn(List<Long> values) {
            addCriterion("SUPPLIER_ID in", values, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdNotIn(List<Long> values) {
            addCriterion("SUPPLIER_ID not in", values, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdBetween(Long value1, Long value2) {
            addCriterion("SUPPLIER_ID between", value1, value2, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdNotBetween(Long value1, Long value2) {
            addCriterion("SUPPLIER_ID not between", value1, value2, "supplierId");
            return (Criteria) this;
        }

        public Criteria andLoanAmountIsNull() {
            addCriterion("LOAN_AMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andLoanAmountIsNotNull() {
            addCriterion("LOAN_AMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andLoanAmountEqualTo(BigDecimal value) {
            addCriterion("LOAN_AMOUNT =", value, "loanAmount");
            return (Criteria) this;
        }

        public Criteria andLoanAmountNotEqualTo(BigDecimal value) {
            addCriterion("LOAN_AMOUNT <>", value, "loanAmount");
            return (Criteria) this;
        }

        public Criteria andLoanAmountGreaterThan(BigDecimal value) {
            addCriterion("LOAN_AMOUNT >", value, "loanAmount");
            return (Criteria) this;
        }

        public Criteria andLoanAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("LOAN_AMOUNT >=", value, "loanAmount");
            return (Criteria) this;
        }

        public Criteria andLoanAmountLessThan(BigDecimal value) {
            addCriterion("LOAN_AMOUNT <", value, "loanAmount");
            return (Criteria) this;
        }

        public Criteria andLoanAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("LOAN_AMOUNT <=", value, "loanAmount");
            return (Criteria) this;
        }

        public Criteria andLoanAmountIn(List<BigDecimal> values) {
            addCriterion("LOAN_AMOUNT in", values, "loanAmount");
            return (Criteria) this;
        }

        public Criteria andLoanAmountNotIn(List<BigDecimal> values) {
            addCriterion("LOAN_AMOUNT not in", values, "loanAmount");
            return (Criteria) this;
        }

        public Criteria andLoanAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LOAN_AMOUNT between", value1, value2, "loanAmount");
            return (Criteria) this;
        }

        public Criteria andLoanAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LOAN_AMOUNT not between", value1, value2, "loanAmount");
            return (Criteria) this;
        }

        public Criteria andInvoiceNumberIsNull() {
            addCriterion("\"INVOICE NUMBER\" is null");
            return (Criteria) this;
        }

        public Criteria andInvoiceNumberIsNotNull() {
            addCriterion("\"INVOICE NUMBER\" is not null");
            return (Criteria) this;
        }

        public Criteria andInvoiceNumberEqualTo(BigDecimal value) {
            addCriterion("\"INVOICE NUMBER\" =", value, "invoiceNumber");
            return (Criteria) this;
        }

        public Criteria andInvoiceNumberNotEqualTo(BigDecimal value) {
            addCriterion("\"INVOICE NUMBER\" <>", value, "invoiceNumber");
            return (Criteria) this;
        }

        public Criteria andInvoiceNumberGreaterThan(BigDecimal value) {
            addCriterion("\"INVOICE NUMBER\" >", value, "invoiceNumber");
            return (Criteria) this;
        }

        public Criteria andInvoiceNumberGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("\"INVOICE NUMBER\" >=", value, "invoiceNumber");
            return (Criteria) this;
        }

        public Criteria andInvoiceNumberLessThan(BigDecimal value) {
            addCriterion("\"INVOICE NUMBER\" <", value, "invoiceNumber");
            return (Criteria) this;
        }

        public Criteria andInvoiceNumberLessThanOrEqualTo(BigDecimal value) {
            addCriterion("\"INVOICE NUMBER\" <=", value, "invoiceNumber");
            return (Criteria) this;
        }

        public Criteria andInvoiceNumberIn(List<BigDecimal> values) {
            addCriterion("\"INVOICE NUMBER\" in", values, "invoiceNumber");
            return (Criteria) this;
        }

        public Criteria andInvoiceNumberNotIn(List<BigDecimal> values) {
            addCriterion("\"INVOICE NUMBER\" not in", values, "invoiceNumber");
            return (Criteria) this;
        }

        public Criteria andInvoiceNumberBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("\"INVOICE NUMBER\" between", value1, value2, "invoiceNumber");
            return (Criteria) this;
        }

        public Criteria andInvoiceNumberNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("\"INVOICE NUMBER\" not between", value1, value2, "invoiceNumber");
            return (Criteria) this;
        }

        public Criteria andPaymentStatusIsNull() {
            addCriterion("PAYMENT_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andPaymentStatusIsNotNull() {
            addCriterion("PAYMENT_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentStatusEqualTo(String value) {
            addCriterion("PAYMENT_STATUS =", value, "paymentStatus");
            return (Criteria) this;
        }

        public Criteria andPaymentStatusNotEqualTo(String value) {
            addCriterion("PAYMENT_STATUS <>", value, "paymentStatus");
            return (Criteria) this;
        }

        public Criteria andPaymentStatusGreaterThan(String value) {
            addCriterion("PAYMENT_STATUS >", value, "paymentStatus");
            return (Criteria) this;
        }

        public Criteria andPaymentStatusGreaterThanOrEqualTo(String value) {
            addCriterion("PAYMENT_STATUS >=", value, "paymentStatus");
            return (Criteria) this;
        }

        public Criteria andPaymentStatusLessThan(String value) {
            addCriterion("PAYMENT_STATUS <", value, "paymentStatus");
            return (Criteria) this;
        }

        public Criteria andPaymentStatusLessThanOrEqualTo(String value) {
            addCriterion("PAYMENT_STATUS <=", value, "paymentStatus");
            return (Criteria) this;
        }

        public Criteria andPaymentStatusLike(String value) {
            addCriterion("PAYMENT_STATUS like", value, "paymentStatus");
            return (Criteria) this;
        }

        public Criteria andPaymentStatusNotLike(String value) {
            addCriterion("PAYMENT_STATUS not like", value, "paymentStatus");
            return (Criteria) this;
        }

        public Criteria andPaymentStatusIn(List<String> values) {
            addCriterion("PAYMENT_STATUS in", values, "paymentStatus");
            return (Criteria) this;
        }

        public Criteria andPaymentStatusNotIn(List<String> values) {
            addCriterion("PAYMENT_STATUS not in", values, "paymentStatus");
            return (Criteria) this;
        }

        public Criteria andPaymentStatusBetween(String value1, String value2) {
            addCriterion("PAYMENT_STATUS between", value1, value2, "paymentStatus");
            return (Criteria) this;
        }

        public Criteria andPaymentStatusNotBetween(String value1, String value2) {
            addCriterion("PAYMENT_STATUS not between", value1, value2, "paymentStatus");
            return (Criteria) this;
        }

        public Criteria andPurchaseProgressIsNull() {
            addCriterion("PURCHASE_PROGRESS is null");
            return (Criteria) this;
        }

        public Criteria andPurchaseProgressIsNotNull() {
            addCriterion("PURCHASE_PROGRESS is not null");
            return (Criteria) this;
        }

        public Criteria andPurchaseProgressEqualTo(String value) {
            addCriterion("PURCHASE_PROGRESS =", value, "purchaseProgress");
            return (Criteria) this;
        }

        public Criteria andPurchaseProgressNotEqualTo(String value) {
            addCriterion("PURCHASE_PROGRESS <>", value, "purchaseProgress");
            return (Criteria) this;
        }

        public Criteria andPurchaseProgressGreaterThan(String value) {
            addCriterion("PURCHASE_PROGRESS >", value, "purchaseProgress");
            return (Criteria) this;
        }

        public Criteria andPurchaseProgressGreaterThanOrEqualTo(String value) {
            addCriterion("PURCHASE_PROGRESS >=", value, "purchaseProgress");
            return (Criteria) this;
        }

        public Criteria andPurchaseProgressLessThan(String value) {
            addCriterion("PURCHASE_PROGRESS <", value, "purchaseProgress");
            return (Criteria) this;
        }

        public Criteria andPurchaseProgressLessThanOrEqualTo(String value) {
            addCriterion("PURCHASE_PROGRESS <=", value, "purchaseProgress");
            return (Criteria) this;
        }

        public Criteria andPurchaseProgressLike(String value) {
            addCriterion("PURCHASE_PROGRESS like", value, "purchaseProgress");
            return (Criteria) this;
        }

        public Criteria andPurchaseProgressNotLike(String value) {
            addCriterion("PURCHASE_PROGRESS not like", value, "purchaseProgress");
            return (Criteria) this;
        }

        public Criteria andPurchaseProgressIn(List<String> values) {
            addCriterion("PURCHASE_PROGRESS in", values, "purchaseProgress");
            return (Criteria) this;
        }

        public Criteria andPurchaseProgressNotIn(List<String> values) {
            addCriterion("PURCHASE_PROGRESS not in", values, "purchaseProgress");
            return (Criteria) this;
        }

        public Criteria andPurchaseProgressBetween(String value1, String value2) {
            addCriterion("PURCHASE_PROGRESS between", value1, value2, "purchaseProgress");
            return (Criteria) this;
        }

        public Criteria andPurchaseProgressNotBetween(String value1, String value2) {
            addCriterion("PURCHASE_PROGRESS not between", value1, value2, "purchaseProgress");
            return (Criteria) this;
        }

        public Criteria andDeliveryDateIsNull() {
            addCriterion("DELIVERY_DATE is null");
            return (Criteria) this;
        }

        public Criteria andDeliveryDateIsNotNull() {
            addCriterion("DELIVERY_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andDeliveryDateEqualTo(Date value) {
            addCriterion("DELIVERY_DATE =", value, "deliveryDate");
            return (Criteria) this;
        }

        public Criteria andDeliveryDateNotEqualTo(Date value) {
            addCriterion("DELIVERY_DATE <>", value, "deliveryDate");
            return (Criteria) this;
        }

        public Criteria andDeliveryDateGreaterThan(Date value) {
            addCriterion("DELIVERY_DATE >", value, "deliveryDate");
            return (Criteria) this;
        }

        public Criteria andDeliveryDateGreaterThanOrEqualTo(Date value) {
            addCriterion("DELIVERY_DATE >=", value, "deliveryDate");
            return (Criteria) this;
        }

        public Criteria andDeliveryDateLessThan(Date value) {
            addCriterion("DELIVERY_DATE <", value, "deliveryDate");
            return (Criteria) this;
        }

        public Criteria andDeliveryDateLessThanOrEqualTo(Date value) {
            addCriterion("DELIVERY_DATE <=", value, "deliveryDate");
            return (Criteria) this;
        }

        public Criteria andDeliveryDateIn(List<Date> values) {
            addCriterion("DELIVERY_DATE in", values, "deliveryDate");
            return (Criteria) this;
        }

        public Criteria andDeliveryDateNotIn(List<Date> values) {
            addCriterion("DELIVERY_DATE not in", values, "deliveryDate");
            return (Criteria) this;
        }

        public Criteria andDeliveryDateBetween(Date value1, Date value2) {
            addCriterion("DELIVERY_DATE between", value1, value2, "deliveryDate");
            return (Criteria) this;
        }

        public Criteria andDeliveryDateNotBetween(Date value1, Date value2) {
            addCriterion("DELIVERY_DATE not between", value1, value2, "deliveryDate");
            return (Criteria) this;
        }

        public Criteria andDeliveryPlaceIsNull() {
            addCriterion("DELIVERY_PLACE is null");
            return (Criteria) this;
        }

        public Criteria andDeliveryPlaceIsNotNull() {
            addCriterion("DELIVERY_PLACE is not null");
            return (Criteria) this;
        }

        public Criteria andDeliveryPlaceEqualTo(String value) {
            addCriterion("DELIVERY_PLACE =", value, "deliveryPlace");
            return (Criteria) this;
        }

        public Criteria andDeliveryPlaceNotEqualTo(String value) {
            addCriterion("DELIVERY_PLACE <>", value, "deliveryPlace");
            return (Criteria) this;
        }

        public Criteria andDeliveryPlaceGreaterThan(String value) {
            addCriterion("DELIVERY_PLACE >", value, "deliveryPlace");
            return (Criteria) this;
        }

        public Criteria andDeliveryPlaceGreaterThanOrEqualTo(String value) {
            addCriterion("DELIVERY_PLACE >=", value, "deliveryPlace");
            return (Criteria) this;
        }

        public Criteria andDeliveryPlaceLessThan(String value) {
            addCriterion("DELIVERY_PLACE <", value, "deliveryPlace");
            return (Criteria) this;
        }

        public Criteria andDeliveryPlaceLessThanOrEqualTo(String value) {
            addCriterion("DELIVERY_PLACE <=", value, "deliveryPlace");
            return (Criteria) this;
        }

        public Criteria andDeliveryPlaceLike(String value) {
            addCriterion("DELIVERY_PLACE like", value, "deliveryPlace");
            return (Criteria) this;
        }

        public Criteria andDeliveryPlaceNotLike(String value) {
            addCriterion("DELIVERY_PLACE not like", value, "deliveryPlace");
            return (Criteria) this;
        }

        public Criteria andDeliveryPlaceIn(List<String> values) {
            addCriterion("DELIVERY_PLACE in", values, "deliveryPlace");
            return (Criteria) this;
        }

        public Criteria andDeliveryPlaceNotIn(List<String> values) {
            addCriterion("DELIVERY_PLACE not in", values, "deliveryPlace");
            return (Criteria) this;
        }

        public Criteria andDeliveryPlaceBetween(String value1, String value2) {
            addCriterion("DELIVERY_PLACE between", value1, value2, "deliveryPlace");
            return (Criteria) this;
        }

        public Criteria andDeliveryPlaceNotBetween(String value1, String value2) {
            addCriterion("DELIVERY_PLACE not between", value1, value2, "deliveryPlace");
            return (Criteria) this;
        }

        public Criteria andDeliveryModeIsNull() {
            addCriterion("DELIVERY_MODE is null");
            return (Criteria) this;
        }

        public Criteria andDeliveryModeIsNotNull() {
            addCriterion("DELIVERY_MODE is not null");
            return (Criteria) this;
        }

        public Criteria andDeliveryModeEqualTo(String value) {
            addCriterion("DELIVERY_MODE =", value, "deliveryMode");
            return (Criteria) this;
        }

        public Criteria andDeliveryModeNotEqualTo(String value) {
            addCriterion("DELIVERY_MODE <>", value, "deliveryMode");
            return (Criteria) this;
        }

        public Criteria andDeliveryModeGreaterThan(String value) {
            addCriterion("DELIVERY_MODE >", value, "deliveryMode");
            return (Criteria) this;
        }

        public Criteria andDeliveryModeGreaterThanOrEqualTo(String value) {
            addCriterion("DELIVERY_MODE >=", value, "deliveryMode");
            return (Criteria) this;
        }

        public Criteria andDeliveryModeLessThan(String value) {
            addCriterion("DELIVERY_MODE <", value, "deliveryMode");
            return (Criteria) this;
        }

        public Criteria andDeliveryModeLessThanOrEqualTo(String value) {
            addCriterion("DELIVERY_MODE <=", value, "deliveryMode");
            return (Criteria) this;
        }

        public Criteria andDeliveryModeLike(String value) {
            addCriterion("DELIVERY_MODE like", value, "deliveryMode");
            return (Criteria) this;
        }

        public Criteria andDeliveryModeNotLike(String value) {
            addCriterion("DELIVERY_MODE not like", value, "deliveryMode");
            return (Criteria) this;
        }

        public Criteria andDeliveryModeIn(List<String> values) {
            addCriterion("DELIVERY_MODE in", values, "deliveryMode");
            return (Criteria) this;
        }

        public Criteria andDeliveryModeNotIn(List<String> values) {
            addCriterion("DELIVERY_MODE not in", values, "deliveryMode");
            return (Criteria) this;
        }

        public Criteria andDeliveryModeBetween(String value1, String value2) {
            addCriterion("DELIVERY_MODE between", value1, value2, "deliveryMode");
            return (Criteria) this;
        }

        public Criteria andDeliveryModeNotBetween(String value1, String value2) {
            addCriterion("DELIVERY_MODE not between", value1, value2, "deliveryMode");
            return (Criteria) this;
        }

        public Criteria andOperaterIdIsNull() {
            addCriterion("OPERATER_ID is null");
            return (Criteria) this;
        }

        public Criteria andOperaterIdIsNotNull() {
            addCriterion("OPERATER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andOperaterIdEqualTo(Long value) {
            addCriterion("OPERATER_ID =", value, "operaterId");
            return (Criteria) this;
        }

        public Criteria andOperaterIdNotEqualTo(Long value) {
            addCriterion("OPERATER_ID <>", value, "operaterId");
            return (Criteria) this;
        }

        public Criteria andOperaterIdGreaterThan(Long value) {
            addCriterion("OPERATER_ID >", value, "operaterId");
            return (Criteria) this;
        }

        public Criteria andOperaterIdGreaterThanOrEqualTo(Long value) {
            addCriterion("OPERATER_ID >=", value, "operaterId");
            return (Criteria) this;
        }

        public Criteria andOperaterIdLessThan(Long value) {
            addCriterion("OPERATER_ID <", value, "operaterId");
            return (Criteria) this;
        }

        public Criteria andOperaterIdLessThanOrEqualTo(Long value) {
            addCriterion("OPERATER_ID <=", value, "operaterId");
            return (Criteria) this;
        }

        public Criteria andOperaterIdIn(List<Long> values) {
            addCriterion("OPERATER_ID in", values, "operaterId");
            return (Criteria) this;
        }

        public Criteria andOperaterIdNotIn(List<Long> values) {
            addCriterion("OPERATER_ID not in", values, "operaterId");
            return (Criteria) this;
        }

        public Criteria andOperaterIdBetween(Long value1, Long value2) {
            addCriterion("OPERATER_ID between", value1, value2, "operaterId");
            return (Criteria) this;
        }

        public Criteria andOperaterIdNotBetween(Long value1, Long value2) {
            addCriterion("OPERATER_ID not between", value1, value2, "operaterId");
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