package com.qxxg.springcloud.cloudmbg.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TerminalLoginLogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TerminalLoginLogExample() {
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

        public Criteria andLoginUserIdIsNull() {
            addCriterion("login_user_id is null");
            return (Criteria) this;
        }

        public Criteria andLoginUserIdIsNotNull() {
            addCriterion("login_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andLoginUserIdEqualTo(String value) {
            addCriterion("login_user_id =", value, "loginUserId");
            return (Criteria) this;
        }

        public Criteria andLoginUserIdNotEqualTo(String value) {
            addCriterion("login_user_id <>", value, "loginUserId");
            return (Criteria) this;
        }

        public Criteria andLoginUserIdGreaterThan(String value) {
            addCriterion("login_user_id >", value, "loginUserId");
            return (Criteria) this;
        }

        public Criteria andLoginUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("login_user_id >=", value, "loginUserId");
            return (Criteria) this;
        }

        public Criteria andLoginUserIdLessThan(String value) {
            addCriterion("login_user_id <", value, "loginUserId");
            return (Criteria) this;
        }

        public Criteria andLoginUserIdLessThanOrEqualTo(String value) {
            addCriterion("login_user_id <=", value, "loginUserId");
            return (Criteria) this;
        }

        public Criteria andLoginUserIdLike(String value) {
            addCriterion("login_user_id like", value, "loginUserId");
            return (Criteria) this;
        }

        public Criteria andLoginUserIdNotLike(String value) {
            addCriterion("login_user_id not like", value, "loginUserId");
            return (Criteria) this;
        }

        public Criteria andLoginUserIdIn(List<String> values) {
            addCriterion("login_user_id in", values, "loginUserId");
            return (Criteria) this;
        }

        public Criteria andLoginUserIdNotIn(List<String> values) {
            addCriterion("login_user_id not in", values, "loginUserId");
            return (Criteria) this;
        }

        public Criteria andLoginUserIdBetween(String value1, String value2) {
            addCriterion("login_user_id between", value1, value2, "loginUserId");
            return (Criteria) this;
        }

        public Criteria andLoginUserIdNotBetween(String value1, String value2) {
            addCriterion("login_user_id not between", value1, value2, "loginUserId");
            return (Criteria) this;
        }

        public Criteria andLoginUserNameIsNull() {
            addCriterion("login_user_name is null");
            return (Criteria) this;
        }

        public Criteria andLoginUserNameIsNotNull() {
            addCriterion("login_user_name is not null");
            return (Criteria) this;
        }

        public Criteria andLoginUserNameEqualTo(String value) {
            addCriterion("login_user_name =", value, "loginUserName");
            return (Criteria) this;
        }

        public Criteria andLoginUserNameNotEqualTo(String value) {
            addCriterion("login_user_name <>", value, "loginUserName");
            return (Criteria) this;
        }

        public Criteria andLoginUserNameGreaterThan(String value) {
            addCriterion("login_user_name >", value, "loginUserName");
            return (Criteria) this;
        }

        public Criteria andLoginUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("login_user_name >=", value, "loginUserName");
            return (Criteria) this;
        }

        public Criteria andLoginUserNameLessThan(String value) {
            addCriterion("login_user_name <", value, "loginUserName");
            return (Criteria) this;
        }

        public Criteria andLoginUserNameLessThanOrEqualTo(String value) {
            addCriterion("login_user_name <=", value, "loginUserName");
            return (Criteria) this;
        }

        public Criteria andLoginUserNameLike(String value) {
            addCriterion("login_user_name like", value, "loginUserName");
            return (Criteria) this;
        }

        public Criteria andLoginUserNameNotLike(String value) {
            addCriterion("login_user_name not like", value, "loginUserName");
            return (Criteria) this;
        }

        public Criteria andLoginUserNameIn(List<String> values) {
            addCriterion("login_user_name in", values, "loginUserName");
            return (Criteria) this;
        }

        public Criteria andLoginUserNameNotIn(List<String> values) {
            addCriterion("login_user_name not in", values, "loginUserName");
            return (Criteria) this;
        }

        public Criteria andLoginUserNameBetween(String value1, String value2) {
            addCriterion("login_user_name between", value1, value2, "loginUserName");
            return (Criteria) this;
        }

        public Criteria andLoginUserNameNotBetween(String value1, String value2) {
            addCriterion("login_user_name not between", value1, value2, "loginUserName");
            return (Criteria) this;
        }

        public Criteria andLoginIpIsNull() {
            addCriterion("login_ip is null");
            return (Criteria) this;
        }

        public Criteria andLoginIpIsNotNull() {
            addCriterion("login_ip is not null");
            return (Criteria) this;
        }

        public Criteria andLoginIpEqualTo(String value) {
            addCriterion("login_ip =", value, "loginIp");
            return (Criteria) this;
        }

        public Criteria andLoginIpNotEqualTo(String value) {
            addCriterion("login_ip <>", value, "loginIp");
            return (Criteria) this;
        }

        public Criteria andLoginIpGreaterThan(String value) {
            addCriterion("login_ip >", value, "loginIp");
            return (Criteria) this;
        }

        public Criteria andLoginIpGreaterThanOrEqualTo(String value) {
            addCriterion("login_ip >=", value, "loginIp");
            return (Criteria) this;
        }

        public Criteria andLoginIpLessThan(String value) {
            addCriterion("login_ip <", value, "loginIp");
            return (Criteria) this;
        }

        public Criteria andLoginIpLessThanOrEqualTo(String value) {
            addCriterion("login_ip <=", value, "loginIp");
            return (Criteria) this;
        }

        public Criteria andLoginIpLike(String value) {
            addCriterion("login_ip like", value, "loginIp");
            return (Criteria) this;
        }

        public Criteria andLoginIpNotLike(String value) {
            addCriterion("login_ip not like", value, "loginIp");
            return (Criteria) this;
        }

        public Criteria andLoginIpIn(List<String> values) {
            addCriterion("login_ip in", values, "loginIp");
            return (Criteria) this;
        }

        public Criteria andLoginIpNotIn(List<String> values) {
            addCriterion("login_ip not in", values, "loginIp");
            return (Criteria) this;
        }

        public Criteria andLoginIpBetween(String value1, String value2) {
            addCriterion("login_ip between", value1, value2, "loginIp");
            return (Criteria) this;
        }

        public Criteria andLoginIpNotBetween(String value1, String value2) {
            addCriterion("login_ip not between", value1, value2, "loginIp");
            return (Criteria) this;
        }

        public Criteria andLoginTimeIsNull() {
            addCriterion("login_time is null");
            return (Criteria) this;
        }

        public Criteria andLoginTimeIsNotNull() {
            addCriterion("login_time is not null");
            return (Criteria) this;
        }

        public Criteria andLoginTimeEqualTo(Date value) {
            addCriterion("login_time =", value, "loginTime");
            return (Criteria) this;
        }

        public Criteria andLoginTimeNotEqualTo(Date value) {
            addCriterion("login_time <>", value, "loginTime");
            return (Criteria) this;
        }

        public Criteria andLoginTimeGreaterThan(Date value) {
            addCriterion("login_time >", value, "loginTime");
            return (Criteria) this;
        }

        public Criteria andLoginTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("login_time >=", value, "loginTime");
            return (Criteria) this;
        }

        public Criteria andLoginTimeLessThan(Date value) {
            addCriterion("login_time <", value, "loginTime");
            return (Criteria) this;
        }

        public Criteria andLoginTimeLessThanOrEqualTo(Date value) {
            addCriterion("login_time <=", value, "loginTime");
            return (Criteria) this;
        }

        public Criteria andLoginTimeIn(List<Date> values) {
            addCriterion("login_time in", values, "loginTime");
            return (Criteria) this;
        }

        public Criteria andLoginTimeNotIn(List<Date> values) {
            addCriterion("login_time not in", values, "loginTime");
            return (Criteria) this;
        }

        public Criteria andLoginTimeBetween(Date value1, Date value2) {
            addCriterion("login_time between", value1, value2, "loginTime");
            return (Criteria) this;
        }

        public Criteria andLoginTimeNotBetween(Date value1, Date value2) {
            addCriterion("login_time not between", value1, value2, "loginTime");
            return (Criteria) this;
        }

        public Criteria andLoginTypeIsNull() {
            addCriterion("login_type is null");
            return (Criteria) this;
        }

        public Criteria andLoginTypeIsNotNull() {
            addCriterion("login_type is not null");
            return (Criteria) this;
        }

        public Criteria andLoginTypeEqualTo(Integer value) {
            addCriterion("login_type =", value, "loginType");
            return (Criteria) this;
        }

        public Criteria andLoginTypeNotEqualTo(Integer value) {
            addCriterion("login_type <>", value, "loginType");
            return (Criteria) this;
        }

        public Criteria andLoginTypeGreaterThan(Integer value) {
            addCriterion("login_type >", value, "loginType");
            return (Criteria) this;
        }

        public Criteria andLoginTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("login_type >=", value, "loginType");
            return (Criteria) this;
        }

        public Criteria andLoginTypeLessThan(Integer value) {
            addCriterion("login_type <", value, "loginType");
            return (Criteria) this;
        }

        public Criteria andLoginTypeLessThanOrEqualTo(Integer value) {
            addCriterion("login_type <=", value, "loginType");
            return (Criteria) this;
        }

        public Criteria andLoginTypeIn(List<Integer> values) {
            addCriterion("login_type in", values, "loginType");
            return (Criteria) this;
        }

        public Criteria andLoginTypeNotIn(List<Integer> values) {
            addCriterion("login_type not in", values, "loginType");
            return (Criteria) this;
        }

        public Criteria andLoginTypeBetween(Integer value1, Integer value2) {
            addCriterion("login_type between", value1, value2, "loginType");
            return (Criteria) this;
        }

        public Criteria andLoginTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("login_type not between", value1, value2, "loginType");
            return (Criteria) this;
        }

        public Criteria andLonginPhoneIsNull() {
            addCriterion("longin_phone is null");
            return (Criteria) this;
        }

        public Criteria andLonginPhoneIsNotNull() {
            addCriterion("longin_phone is not null");
            return (Criteria) this;
        }

        public Criteria andLonginPhoneEqualTo(String value) {
            addCriterion("longin_phone =", value, "longinPhone");
            return (Criteria) this;
        }

        public Criteria andLonginPhoneNotEqualTo(String value) {
            addCriterion("longin_phone <>", value, "longinPhone");
            return (Criteria) this;
        }

        public Criteria andLonginPhoneGreaterThan(String value) {
            addCriterion("longin_phone >", value, "longinPhone");
            return (Criteria) this;
        }

        public Criteria andLonginPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("longin_phone >=", value, "longinPhone");
            return (Criteria) this;
        }

        public Criteria andLonginPhoneLessThan(String value) {
            addCriterion("longin_phone <", value, "longinPhone");
            return (Criteria) this;
        }

        public Criteria andLonginPhoneLessThanOrEqualTo(String value) {
            addCriterion("longin_phone <=", value, "longinPhone");
            return (Criteria) this;
        }

        public Criteria andLonginPhoneLike(String value) {
            addCriterion("longin_phone like", value, "longinPhone");
            return (Criteria) this;
        }

        public Criteria andLonginPhoneNotLike(String value) {
            addCriterion("longin_phone not like", value, "longinPhone");
            return (Criteria) this;
        }

        public Criteria andLonginPhoneIn(List<String> values) {
            addCriterion("longin_phone in", values, "longinPhone");
            return (Criteria) this;
        }

        public Criteria andLonginPhoneNotIn(List<String> values) {
            addCriterion("longin_phone not in", values, "longinPhone");
            return (Criteria) this;
        }

        public Criteria andLonginPhoneBetween(String value1, String value2) {
            addCriterion("longin_phone between", value1, value2, "longinPhone");
            return (Criteria) this;
        }

        public Criteria andLonginPhoneNotBetween(String value1, String value2) {
            addCriterion("longin_phone not between", value1, value2, "longinPhone");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
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