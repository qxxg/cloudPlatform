package com.qxxg.springcloud.cloudmbg.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class VpnEditionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public VpnEditionExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andPublishTimeIsNull() {
            addCriterion("publish_time is null");
            return (Criteria) this;
        }

        public Criteria andPublishTimeIsNotNull() {
            addCriterion("publish_time is not null");
            return (Criteria) this;
        }

        public Criteria andPublishTimeEqualTo(Date value) {
            addCriterion("publish_time =", value, "publishTime");
            return (Criteria) this;
        }

        public Criteria andPublishTimeNotEqualTo(Date value) {
            addCriterion("publish_time <>", value, "publishTime");
            return (Criteria) this;
        }

        public Criteria andPublishTimeGreaterThan(Date value) {
            addCriterion("publish_time >", value, "publishTime");
            return (Criteria) this;
        }

        public Criteria andPublishTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("publish_time >=", value, "publishTime");
            return (Criteria) this;
        }

        public Criteria andPublishTimeLessThan(Date value) {
            addCriterion("publish_time <", value, "publishTime");
            return (Criteria) this;
        }

        public Criteria andPublishTimeLessThanOrEqualTo(Date value) {
            addCriterion("publish_time <=", value, "publishTime");
            return (Criteria) this;
        }

        public Criteria andPublishTimeIn(List<Date> values) {
            addCriterion("publish_time in", values, "publishTime");
            return (Criteria) this;
        }

        public Criteria andPublishTimeNotIn(List<Date> values) {
            addCriterion("publish_time not in", values, "publishTime");
            return (Criteria) this;
        }

        public Criteria andPublishTimeBetween(Date value1, Date value2) {
            addCriterion("publish_time between", value1, value2, "publishTime");
            return (Criteria) this;
        }

        public Criteria andPublishTimeNotBetween(Date value1, Date value2) {
            addCriterion("publish_time not between", value1, value2, "publishTime");
            return (Criteria) this;
        }

        public Criteria andEditionNoIsNull() {
            addCriterion("edition_no is null");
            return (Criteria) this;
        }

        public Criteria andEditionNoIsNotNull() {
            addCriterion("edition_no is not null");
            return (Criteria) this;
        }

        public Criteria andEditionNoEqualTo(String value) {
            addCriterion("edition_no =", value, "editionNo");
            return (Criteria) this;
        }

        public Criteria andEditionNoNotEqualTo(String value) {
            addCriterion("edition_no <>", value, "editionNo");
            return (Criteria) this;
        }

        public Criteria andEditionNoGreaterThan(String value) {
            addCriterion("edition_no >", value, "editionNo");
            return (Criteria) this;
        }

        public Criteria andEditionNoGreaterThanOrEqualTo(String value) {
            addCriterion("edition_no >=", value, "editionNo");
            return (Criteria) this;
        }

        public Criteria andEditionNoLessThan(String value) {
            addCriterion("edition_no <", value, "editionNo");
            return (Criteria) this;
        }

        public Criteria andEditionNoLessThanOrEqualTo(String value) {
            addCriterion("edition_no <=", value, "editionNo");
            return (Criteria) this;
        }

        public Criteria andEditionNoLike(String value) {
            addCriterion("edition_no like", value, "editionNo");
            return (Criteria) this;
        }

        public Criteria andEditionNoNotLike(String value) {
            addCriterion("edition_no not like", value, "editionNo");
            return (Criteria) this;
        }

        public Criteria andEditionNoIn(List<String> values) {
            addCriterion("edition_no in", values, "editionNo");
            return (Criteria) this;
        }

        public Criteria andEditionNoNotIn(List<String> values) {
            addCriterion("edition_no not in", values, "editionNo");
            return (Criteria) this;
        }

        public Criteria andEditionNoBetween(String value1, String value2) {
            addCriterion("edition_no between", value1, value2, "editionNo");
            return (Criteria) this;
        }

        public Criteria andEditionNoNotBetween(String value1, String value2) {
            addCriterion("edition_no not between", value1, value2, "editionNo");
            return (Criteria) this;
        }

        public Criteria andDocNameIsNull() {
            addCriterion("doc_name is null");
            return (Criteria) this;
        }

        public Criteria andDocNameIsNotNull() {
            addCriterion("doc_name is not null");
            return (Criteria) this;
        }

        public Criteria andDocNameEqualTo(String value) {
            addCriterion("doc_name =", value, "docName");
            return (Criteria) this;
        }

        public Criteria andDocNameNotEqualTo(String value) {
            addCriterion("doc_name <>", value, "docName");
            return (Criteria) this;
        }

        public Criteria andDocNameGreaterThan(String value) {
            addCriterion("doc_name >", value, "docName");
            return (Criteria) this;
        }

        public Criteria andDocNameGreaterThanOrEqualTo(String value) {
            addCriterion("doc_name >=", value, "docName");
            return (Criteria) this;
        }

        public Criteria andDocNameLessThan(String value) {
            addCriterion("doc_name <", value, "docName");
            return (Criteria) this;
        }

        public Criteria andDocNameLessThanOrEqualTo(String value) {
            addCriterion("doc_name <=", value, "docName");
            return (Criteria) this;
        }

        public Criteria andDocNameLike(String value) {
            addCriterion("doc_name like", value, "docName");
            return (Criteria) this;
        }

        public Criteria andDocNameNotLike(String value) {
            addCriterion("doc_name not like", value, "docName");
            return (Criteria) this;
        }

        public Criteria andDocNameIn(List<String> values) {
            addCriterion("doc_name in", values, "docName");
            return (Criteria) this;
        }

        public Criteria andDocNameNotIn(List<String> values) {
            addCriterion("doc_name not in", values, "docName");
            return (Criteria) this;
        }

        public Criteria andDocNameBetween(String value1, String value2) {
            addCriterion("doc_name between", value1, value2, "docName");
            return (Criteria) this;
        }

        public Criteria andDocNameNotBetween(String value1, String value2) {
            addCriterion("doc_name not between", value1, value2, "docName");
            return (Criteria) this;
        }

        public Criteria andDocSizeIsNull() {
            addCriterion("doc_size is null");
            return (Criteria) this;
        }

        public Criteria andDocSizeIsNotNull() {
            addCriterion("doc_size is not null");
            return (Criteria) this;
        }

        public Criteria andDocSizeEqualTo(String value) {
            addCriterion("doc_size =", value, "docSize");
            return (Criteria) this;
        }

        public Criteria andDocSizeNotEqualTo(String value) {
            addCriterion("doc_size <>", value, "docSize");
            return (Criteria) this;
        }

        public Criteria andDocSizeGreaterThan(String value) {
            addCriterion("doc_size >", value, "docSize");
            return (Criteria) this;
        }

        public Criteria andDocSizeGreaterThanOrEqualTo(String value) {
            addCriterion("doc_size >=", value, "docSize");
            return (Criteria) this;
        }

        public Criteria andDocSizeLessThan(String value) {
            addCriterion("doc_size <", value, "docSize");
            return (Criteria) this;
        }

        public Criteria andDocSizeLessThanOrEqualTo(String value) {
            addCriterion("doc_size <=", value, "docSize");
            return (Criteria) this;
        }

        public Criteria andDocSizeLike(String value) {
            addCriterion("doc_size like", value, "docSize");
            return (Criteria) this;
        }

        public Criteria andDocSizeNotLike(String value) {
            addCriterion("doc_size not like", value, "docSize");
            return (Criteria) this;
        }

        public Criteria andDocSizeIn(List<String> values) {
            addCriterion("doc_size in", values, "docSize");
            return (Criteria) this;
        }

        public Criteria andDocSizeNotIn(List<String> values) {
            addCriterion("doc_size not in", values, "docSize");
            return (Criteria) this;
        }

        public Criteria andDocSizeBetween(String value1, String value2) {
            addCriterion("doc_size between", value1, value2, "docSize");
            return (Criteria) this;
        }

        public Criteria andDocSizeNotBetween(String value1, String value2) {
            addCriterion("doc_size not between", value1, value2, "docSize");
            return (Criteria) this;
        }

        public Criteria andVerifyValueIsNull() {
            addCriterion("verify_value is null");
            return (Criteria) this;
        }

        public Criteria andVerifyValueIsNotNull() {
            addCriterion("verify_value is not null");
            return (Criteria) this;
        }

        public Criteria andVerifyValueEqualTo(String value) {
            addCriterion("verify_value =", value, "verifyValue");
            return (Criteria) this;
        }

        public Criteria andVerifyValueNotEqualTo(String value) {
            addCriterion("verify_value <>", value, "verifyValue");
            return (Criteria) this;
        }

        public Criteria andVerifyValueGreaterThan(String value) {
            addCriterion("verify_value >", value, "verifyValue");
            return (Criteria) this;
        }

        public Criteria andVerifyValueGreaterThanOrEqualTo(String value) {
            addCriterion("verify_value >=", value, "verifyValue");
            return (Criteria) this;
        }

        public Criteria andVerifyValueLessThan(String value) {
            addCriterion("verify_value <", value, "verifyValue");
            return (Criteria) this;
        }

        public Criteria andVerifyValueLessThanOrEqualTo(String value) {
            addCriterion("verify_value <=", value, "verifyValue");
            return (Criteria) this;
        }

        public Criteria andVerifyValueLike(String value) {
            addCriterion("verify_value like", value, "verifyValue");
            return (Criteria) this;
        }

        public Criteria andVerifyValueNotLike(String value) {
            addCriterion("verify_value not like", value, "verifyValue");
            return (Criteria) this;
        }

        public Criteria andVerifyValueIn(List<String> values) {
            addCriterion("verify_value in", values, "verifyValue");
            return (Criteria) this;
        }

        public Criteria andVerifyValueNotIn(List<String> values) {
            addCriterion("verify_value not in", values, "verifyValue");
            return (Criteria) this;
        }

        public Criteria andVerifyValueBetween(String value1, String value2) {
            addCriterion("verify_value between", value1, value2, "verifyValue");
            return (Criteria) this;
        }

        public Criteria andVerifyValueNotBetween(String value1, String value2) {
            addCriterion("verify_value not between", value1, value2, "verifyValue");
            return (Criteria) this;
        }

        public Criteria andEditionTypeIsNull() {
            addCriterion("edition_type is null");
            return (Criteria) this;
        }

        public Criteria andEditionTypeIsNotNull() {
            addCriterion("edition_type is not null");
            return (Criteria) this;
        }

        public Criteria andEditionTypeEqualTo(Short value) {
            addCriterion("edition_type =", value, "editionType");
            return (Criteria) this;
        }

        public Criteria andEditionTypeNotEqualTo(Short value) {
            addCriterion("edition_type <>", value, "editionType");
            return (Criteria) this;
        }

        public Criteria andEditionTypeGreaterThan(Short value) {
            addCriterion("edition_type >", value, "editionType");
            return (Criteria) this;
        }

        public Criteria andEditionTypeGreaterThanOrEqualTo(Short value) {
            addCriterion("edition_type >=", value, "editionType");
            return (Criteria) this;
        }

        public Criteria andEditionTypeLessThan(Short value) {
            addCriterion("edition_type <", value, "editionType");
            return (Criteria) this;
        }

        public Criteria andEditionTypeLessThanOrEqualTo(Short value) {
            addCriterion("edition_type <=", value, "editionType");
            return (Criteria) this;
        }

        public Criteria andEditionTypeIn(List<Short> values) {
            addCriterion("edition_type in", values, "editionType");
            return (Criteria) this;
        }

        public Criteria andEditionTypeNotIn(List<Short> values) {
            addCriterion("edition_type not in", values, "editionType");
            return (Criteria) this;
        }

        public Criteria andEditionTypeBetween(Short value1, Short value2) {
            addCriterion("edition_type between", value1, value2, "editionType");
            return (Criteria) this;
        }

        public Criteria andEditionTypeNotBetween(Short value1, Short value2) {
            addCriterion("edition_type not between", value1, value2, "editionType");
            return (Criteria) this;
        }

        public Criteria andTerminalTypeIsNull() {
            addCriterion("terminal_type is null");
            return (Criteria) this;
        }

        public Criteria andTerminalTypeIsNotNull() {
            addCriterion("terminal_type is not null");
            return (Criteria) this;
        }

        public Criteria andTerminalTypeEqualTo(Short value) {
            addCriterion("terminal_type =", value, "terminalType");
            return (Criteria) this;
        }

        public Criteria andTerminalTypeNotEqualTo(Short value) {
            addCriterion("terminal_type <>", value, "terminalType");
            return (Criteria) this;
        }

        public Criteria andTerminalTypeGreaterThan(Short value) {
            addCriterion("terminal_type >", value, "terminalType");
            return (Criteria) this;
        }

        public Criteria andTerminalTypeGreaterThanOrEqualTo(Short value) {
            addCriterion("terminal_type >=", value, "terminalType");
            return (Criteria) this;
        }

        public Criteria andTerminalTypeLessThan(Short value) {
            addCriterion("terminal_type <", value, "terminalType");
            return (Criteria) this;
        }

        public Criteria andTerminalTypeLessThanOrEqualTo(Short value) {
            addCriterion("terminal_type <=", value, "terminalType");
            return (Criteria) this;
        }

        public Criteria andTerminalTypeIn(List<Short> values) {
            addCriterion("terminal_type in", values, "terminalType");
            return (Criteria) this;
        }

        public Criteria andTerminalTypeNotIn(List<Short> values) {
            addCriterion("terminal_type not in", values, "terminalType");
            return (Criteria) this;
        }

        public Criteria andTerminalTypeBetween(Short value1, Short value2) {
            addCriterion("terminal_type between", value1, value2, "terminalType");
            return (Criteria) this;
        }

        public Criteria andTerminalTypeNotBetween(Short value1, Short value2) {
            addCriterion("terminal_type not between", value1, value2, "terminalType");
            return (Criteria) this;
        }

        public Criteria andEditionStateIsNull() {
            addCriterion("edition_state is null");
            return (Criteria) this;
        }

        public Criteria andEditionStateIsNotNull() {
            addCriterion("edition_state is not null");
            return (Criteria) this;
        }

        public Criteria andEditionStateEqualTo(Short value) {
            addCriterion("edition_state =", value, "editionState");
            return (Criteria) this;
        }

        public Criteria andEditionStateNotEqualTo(Short value) {
            addCriterion("edition_state <>", value, "editionState");
            return (Criteria) this;
        }

        public Criteria andEditionStateGreaterThan(Short value) {
            addCriterion("edition_state >", value, "editionState");
            return (Criteria) this;
        }

        public Criteria andEditionStateGreaterThanOrEqualTo(Short value) {
            addCriterion("edition_state >=", value, "editionState");
            return (Criteria) this;
        }

        public Criteria andEditionStateLessThan(Short value) {
            addCriterion("edition_state <", value, "editionState");
            return (Criteria) this;
        }

        public Criteria andEditionStateLessThanOrEqualTo(Short value) {
            addCriterion("edition_state <=", value, "editionState");
            return (Criteria) this;
        }

        public Criteria andEditionStateIn(List<Short> values) {
            addCriterion("edition_state in", values, "editionState");
            return (Criteria) this;
        }

        public Criteria andEditionStateNotIn(List<Short> values) {
            addCriterion("edition_state not in", values, "editionState");
            return (Criteria) this;
        }

        public Criteria andEditionStateBetween(Short value1, Short value2) {
            addCriterion("edition_state between", value1, value2, "editionState");
            return (Criteria) this;
        }

        public Criteria andEditionStateNotBetween(Short value1, Short value2) {
            addCriterion("edition_state not between", value1, value2, "editionState");
            return (Criteria) this;
        }

        public Criteria andEditionCodeIsNull() {
            addCriterion("edition_code is null");
            return (Criteria) this;
        }

        public Criteria andEditionCodeIsNotNull() {
            addCriterion("edition_code is not null");
            return (Criteria) this;
        }

        public Criteria andEditionCodeEqualTo(String value) {
            addCriterion("edition_code =", value, "editionCode");
            return (Criteria) this;
        }

        public Criteria andEditionCodeNotEqualTo(String value) {
            addCriterion("edition_code <>", value, "editionCode");
            return (Criteria) this;
        }

        public Criteria andEditionCodeGreaterThan(String value) {
            addCriterion("edition_code >", value, "editionCode");
            return (Criteria) this;
        }

        public Criteria andEditionCodeGreaterThanOrEqualTo(String value) {
            addCriterion("edition_code >=", value, "editionCode");
            return (Criteria) this;
        }

        public Criteria andEditionCodeLessThan(String value) {
            addCriterion("edition_code <", value, "editionCode");
            return (Criteria) this;
        }

        public Criteria andEditionCodeLessThanOrEqualTo(String value) {
            addCriterion("edition_code <=", value, "editionCode");
            return (Criteria) this;
        }

        public Criteria andEditionCodeLike(String value) {
            addCriterion("edition_code like", value, "editionCode");
            return (Criteria) this;
        }

        public Criteria andEditionCodeNotLike(String value) {
            addCriterion("edition_code not like", value, "editionCode");
            return (Criteria) this;
        }

        public Criteria andEditionCodeIn(List<String> values) {
            addCriterion("edition_code in", values, "editionCode");
            return (Criteria) this;
        }

        public Criteria andEditionCodeNotIn(List<String> values) {
            addCriterion("edition_code not in", values, "editionCode");
            return (Criteria) this;
        }

        public Criteria andEditionCodeBetween(String value1, String value2) {
            addCriterion("edition_code between", value1, value2, "editionCode");
            return (Criteria) this;
        }

        public Criteria andEditionCodeNotBetween(String value1, String value2) {
            addCriterion("edition_code not between", value1, value2, "editionCode");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNull() {
            addCriterion("description is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("description is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("description =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("description <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("description >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("description >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("description <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("description <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("description like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("description not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("description in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("description not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("description between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("description not between", value1, value2, "description");
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