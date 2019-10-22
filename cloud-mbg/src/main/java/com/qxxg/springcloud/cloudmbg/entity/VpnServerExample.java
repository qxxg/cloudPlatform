package com.qxxg.springcloud.cloudmbg.entity;

import java.util.ArrayList;
import java.util.List;

public class VpnServerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public VpnServerExample() {
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

        public Criteria andServerIpIsNull() {
            addCriterion("server_ip is null");
            return (Criteria) this;
        }

        public Criteria andServerIpIsNotNull() {
            addCriterion("server_ip is not null");
            return (Criteria) this;
        }

        public Criteria andServerIpEqualTo(String value) {
            addCriterion("server_ip =", value, "serverIp");
            return (Criteria) this;
        }

        public Criteria andServerIpNotEqualTo(String value) {
            addCriterion("server_ip <>", value, "serverIp");
            return (Criteria) this;
        }

        public Criteria andServerIpGreaterThan(String value) {
            addCriterion("server_ip >", value, "serverIp");
            return (Criteria) this;
        }

        public Criteria andServerIpGreaterThanOrEqualTo(String value) {
            addCriterion("server_ip >=", value, "serverIp");
            return (Criteria) this;
        }

        public Criteria andServerIpLessThan(String value) {
            addCriterion("server_ip <", value, "serverIp");
            return (Criteria) this;
        }

        public Criteria andServerIpLessThanOrEqualTo(String value) {
            addCriterion("server_ip <=", value, "serverIp");
            return (Criteria) this;
        }

        public Criteria andServerIpLike(String value) {
            addCriterion("server_ip like", value, "serverIp");
            return (Criteria) this;
        }

        public Criteria andServerIpNotLike(String value) {
            addCriterion("server_ip not like", value, "serverIp");
            return (Criteria) this;
        }

        public Criteria andServerIpIn(List<String> values) {
            addCriterion("server_ip in", values, "serverIp");
            return (Criteria) this;
        }

        public Criteria andServerIpNotIn(List<String> values) {
            addCriterion("server_ip not in", values, "serverIp");
            return (Criteria) this;
        }

        public Criteria andServerIpBetween(String value1, String value2) {
            addCriterion("server_ip between", value1, value2, "serverIp");
            return (Criteria) this;
        }

        public Criteria andServerIpNotBetween(String value1, String value2) {
            addCriterion("server_ip not between", value1, value2, "serverIp");
            return (Criteria) this;
        }

        public Criteria andServerPortIsNull() {
            addCriterion("server_port is null");
            return (Criteria) this;
        }

        public Criteria andServerPortIsNotNull() {
            addCriterion("server_port is not null");
            return (Criteria) this;
        }

        public Criteria andServerPortEqualTo(String value) {
            addCriterion("server_port =", value, "serverPort");
            return (Criteria) this;
        }

        public Criteria andServerPortNotEqualTo(String value) {
            addCriterion("server_port <>", value, "serverPort");
            return (Criteria) this;
        }

        public Criteria andServerPortGreaterThan(String value) {
            addCriterion("server_port >", value, "serverPort");
            return (Criteria) this;
        }

        public Criteria andServerPortGreaterThanOrEqualTo(String value) {
            addCriterion("server_port >=", value, "serverPort");
            return (Criteria) this;
        }

        public Criteria andServerPortLessThan(String value) {
            addCriterion("server_port <", value, "serverPort");
            return (Criteria) this;
        }

        public Criteria andServerPortLessThanOrEqualTo(String value) {
            addCriterion("server_port <=", value, "serverPort");
            return (Criteria) this;
        }

        public Criteria andServerPortLike(String value) {
            addCriterion("server_port like", value, "serverPort");
            return (Criteria) this;
        }

        public Criteria andServerPortNotLike(String value) {
            addCriterion("server_port not like", value, "serverPort");
            return (Criteria) this;
        }

        public Criteria andServerPortIn(List<String> values) {
            addCriterion("server_port in", values, "serverPort");
            return (Criteria) this;
        }

        public Criteria andServerPortNotIn(List<String> values) {
            addCriterion("server_port not in", values, "serverPort");
            return (Criteria) this;
        }

        public Criteria andServerPortBetween(String value1, String value2) {
            addCriterion("server_port between", value1, value2, "serverPort");
            return (Criteria) this;
        }

        public Criteria andServerPortNotBetween(String value1, String value2) {
            addCriterion("server_port not between", value1, value2, "serverPort");
            return (Criteria) this;
        }

        public Criteria andEncryptionTypeIsNull() {
            addCriterion("encryption_type is null");
            return (Criteria) this;
        }

        public Criteria andEncryptionTypeIsNotNull() {
            addCriterion("encryption_type is not null");
            return (Criteria) this;
        }

        public Criteria andEncryptionTypeEqualTo(String value) {
            addCriterion("encryption_type =", value, "encryptionType");
            return (Criteria) this;
        }

        public Criteria andEncryptionTypeNotEqualTo(String value) {
            addCriterion("encryption_type <>", value, "encryptionType");
            return (Criteria) this;
        }

        public Criteria andEncryptionTypeGreaterThan(String value) {
            addCriterion("encryption_type >", value, "encryptionType");
            return (Criteria) this;
        }

        public Criteria andEncryptionTypeGreaterThanOrEqualTo(String value) {
            addCriterion("encryption_type >=", value, "encryptionType");
            return (Criteria) this;
        }

        public Criteria andEncryptionTypeLessThan(String value) {
            addCriterion("encryption_type <", value, "encryptionType");
            return (Criteria) this;
        }

        public Criteria andEncryptionTypeLessThanOrEqualTo(String value) {
            addCriterion("encryption_type <=", value, "encryptionType");
            return (Criteria) this;
        }

        public Criteria andEncryptionTypeLike(String value) {
            addCriterion("encryption_type like", value, "encryptionType");
            return (Criteria) this;
        }

        public Criteria andEncryptionTypeNotLike(String value) {
            addCriterion("encryption_type not like", value, "encryptionType");
            return (Criteria) this;
        }

        public Criteria andEncryptionTypeIn(List<String> values) {
            addCriterion("encryption_type in", values, "encryptionType");
            return (Criteria) this;
        }

        public Criteria andEncryptionTypeNotIn(List<String> values) {
            addCriterion("encryption_type not in", values, "encryptionType");
            return (Criteria) this;
        }

        public Criteria andEncryptionTypeBetween(String value1, String value2) {
            addCriterion("encryption_type between", value1, value2, "encryptionType");
            return (Criteria) this;
        }

        public Criteria andEncryptionTypeNotBetween(String value1, String value2) {
            addCriterion("encryption_type not between", value1, value2, "encryptionType");
            return (Criteria) this;
        }

        public Criteria andServerRegionIsNull() {
            addCriterion("server_region is null");
            return (Criteria) this;
        }

        public Criteria andServerRegionIsNotNull() {
            addCriterion("server_region is not null");
            return (Criteria) this;
        }

        public Criteria andServerRegionEqualTo(String value) {
            addCriterion("server_region =", value, "serverRegion");
            return (Criteria) this;
        }

        public Criteria andServerRegionNotEqualTo(String value) {
            addCriterion("server_region <>", value, "serverRegion");
            return (Criteria) this;
        }

        public Criteria andServerRegionGreaterThan(String value) {
            addCriterion("server_region >", value, "serverRegion");
            return (Criteria) this;
        }

        public Criteria andServerRegionGreaterThanOrEqualTo(String value) {
            addCriterion("server_region >=", value, "serverRegion");
            return (Criteria) this;
        }

        public Criteria andServerRegionLessThan(String value) {
            addCriterion("server_region <", value, "serverRegion");
            return (Criteria) this;
        }

        public Criteria andServerRegionLessThanOrEqualTo(String value) {
            addCriterion("server_region <=", value, "serverRegion");
            return (Criteria) this;
        }

        public Criteria andServerRegionLike(String value) {
            addCriterion("server_region like", value, "serverRegion");
            return (Criteria) this;
        }

        public Criteria andServerRegionNotLike(String value) {
            addCriterion("server_region not like", value, "serverRegion");
            return (Criteria) this;
        }

        public Criteria andServerRegionIn(List<String> values) {
            addCriterion("server_region in", values, "serverRegion");
            return (Criteria) this;
        }

        public Criteria andServerRegionNotIn(List<String> values) {
            addCriterion("server_region not in", values, "serverRegion");
            return (Criteria) this;
        }

        public Criteria andServerRegionBetween(String value1, String value2) {
            addCriterion("server_region between", value1, value2, "serverRegion");
            return (Criteria) this;
        }

        public Criteria andServerRegionNotBetween(String value1, String value2) {
            addCriterion("server_region not between", value1, value2, "serverRegion");
            return (Criteria) this;
        }

        public Criteria andServerStatusIsNull() {
            addCriterion("server_status is null");
            return (Criteria) this;
        }

        public Criteria andServerStatusIsNotNull() {
            addCriterion("server_status is not null");
            return (Criteria) this;
        }

        public Criteria andServerStatusEqualTo(Integer value) {
            addCriterion("server_status =", value, "serverStatus");
            return (Criteria) this;
        }

        public Criteria andServerStatusNotEqualTo(Integer value) {
            addCriterion("server_status <>", value, "serverStatus");
            return (Criteria) this;
        }

        public Criteria andServerStatusGreaterThan(Integer value) {
            addCriterion("server_status >", value, "serverStatus");
            return (Criteria) this;
        }

        public Criteria andServerStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("server_status >=", value, "serverStatus");
            return (Criteria) this;
        }

        public Criteria andServerStatusLessThan(Integer value) {
            addCriterion("server_status <", value, "serverStatus");
            return (Criteria) this;
        }

        public Criteria andServerStatusLessThanOrEqualTo(Integer value) {
            addCriterion("server_status <=", value, "serverStatus");
            return (Criteria) this;
        }

        public Criteria andServerStatusIn(List<Integer> values) {
            addCriterion("server_status in", values, "serverStatus");
            return (Criteria) this;
        }

        public Criteria andServerStatusNotIn(List<Integer> values) {
            addCriterion("server_status not in", values, "serverStatus");
            return (Criteria) this;
        }

        public Criteria andServerStatusBetween(Integer value1, Integer value2) {
            addCriterion("server_status between", value1, value2, "serverStatus");
            return (Criteria) this;
        }

        public Criteria andServerStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("server_status not between", value1, value2, "serverStatus");
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

        public Criteria andServerLineIsNull() {
            addCriterion("server_line is null");
            return (Criteria) this;
        }

        public Criteria andServerLineIsNotNull() {
            addCriterion("server_line is not null");
            return (Criteria) this;
        }

        public Criteria andServerLineEqualTo(String value) {
            addCriterion("server_line =", value, "serverLine");
            return (Criteria) this;
        }

        public Criteria andServerLineNotEqualTo(String value) {
            addCriterion("server_line <>", value, "serverLine");
            return (Criteria) this;
        }

        public Criteria andServerLineGreaterThan(String value) {
            addCriterion("server_line >", value, "serverLine");
            return (Criteria) this;
        }

        public Criteria andServerLineGreaterThanOrEqualTo(String value) {
            addCriterion("server_line >=", value, "serverLine");
            return (Criteria) this;
        }

        public Criteria andServerLineLessThan(String value) {
            addCriterion("server_line <", value, "serverLine");
            return (Criteria) this;
        }

        public Criteria andServerLineLessThanOrEqualTo(String value) {
            addCriterion("server_line <=", value, "serverLine");
            return (Criteria) this;
        }

        public Criteria andServerLineLike(String value) {
            addCriterion("server_line like", value, "serverLine");
            return (Criteria) this;
        }

        public Criteria andServerLineNotLike(String value) {
            addCriterion("server_line not like", value, "serverLine");
            return (Criteria) this;
        }

        public Criteria andServerLineIn(List<String> values) {
            addCriterion("server_line in", values, "serverLine");
            return (Criteria) this;
        }

        public Criteria andServerLineNotIn(List<String> values) {
            addCriterion("server_line not in", values, "serverLine");
            return (Criteria) this;
        }

        public Criteria andServerLineBetween(String value1, String value2) {
            addCriterion("server_line between", value1, value2, "serverLine");
            return (Criteria) this;
        }

        public Criteria andServerLineNotBetween(String value1, String value2) {
            addCriterion("server_line not between", value1, value2, "serverLine");
            return (Criteria) this;
        }

        public Criteria andServerTypeIsNull() {
            addCriterion("server_type is null");
            return (Criteria) this;
        }

        public Criteria andServerTypeIsNotNull() {
            addCriterion("server_type is not null");
            return (Criteria) this;
        }

        public Criteria andServerTypeEqualTo(Integer value) {
            addCriterion("server_type =", value, "serverType");
            return (Criteria) this;
        }

        public Criteria andServerTypeNotEqualTo(Integer value) {
            addCriterion("server_type <>", value, "serverType");
            return (Criteria) this;
        }

        public Criteria andServerTypeGreaterThan(Integer value) {
            addCriterion("server_type >", value, "serverType");
            return (Criteria) this;
        }

        public Criteria andServerTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("server_type >=", value, "serverType");
            return (Criteria) this;
        }

        public Criteria andServerTypeLessThan(Integer value) {
            addCriterion("server_type <", value, "serverType");
            return (Criteria) this;
        }

        public Criteria andServerTypeLessThanOrEqualTo(Integer value) {
            addCriterion("server_type <=", value, "serverType");
            return (Criteria) this;
        }

        public Criteria andServerTypeIn(List<Integer> values) {
            addCriterion("server_type in", values, "serverType");
            return (Criteria) this;
        }

        public Criteria andServerTypeNotIn(List<Integer> values) {
            addCriterion("server_type not in", values, "serverType");
            return (Criteria) this;
        }

        public Criteria andServerTypeBetween(Integer value1, Integer value2) {
            addCriterion("server_type between", value1, value2, "serverType");
            return (Criteria) this;
        }

        public Criteria andServerTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("server_type not between", value1, value2, "serverType");
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