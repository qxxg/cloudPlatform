package com.qxxg.springcloud.cloudmbg.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class VpnPackageExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public VpnPackageExample() {
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

        public Criteria andPkDurationIsNull() {
            addCriterion("pk_duration is null");
            return (Criteria) this;
        }

        public Criteria andPkDurationIsNotNull() {
            addCriterion("pk_duration is not null");
            return (Criteria) this;
        }

        public Criteria andPkDurationEqualTo(Integer value) {
            addCriterion("pk_duration =", value, "pkDuration");
            return (Criteria) this;
        }

        public Criteria andPkDurationNotEqualTo(Integer value) {
            addCriterion("pk_duration <>", value, "pkDuration");
            return (Criteria) this;
        }

        public Criteria andPkDurationGreaterThan(Integer value) {
            addCriterion("pk_duration >", value, "pkDuration");
            return (Criteria) this;
        }

        public Criteria andPkDurationGreaterThanOrEqualTo(Integer value) {
            addCriterion("pk_duration >=", value, "pkDuration");
            return (Criteria) this;
        }

        public Criteria andPkDurationLessThan(Integer value) {
            addCriterion("pk_duration <", value, "pkDuration");
            return (Criteria) this;
        }

        public Criteria andPkDurationLessThanOrEqualTo(Integer value) {
            addCriterion("pk_duration <=", value, "pkDuration");
            return (Criteria) this;
        }

        public Criteria andPkDurationIn(List<Integer> values) {
            addCriterion("pk_duration in", values, "pkDuration");
            return (Criteria) this;
        }

        public Criteria andPkDurationNotIn(List<Integer> values) {
            addCriterion("pk_duration not in", values, "pkDuration");
            return (Criteria) this;
        }

        public Criteria andPkDurationBetween(Integer value1, Integer value2) {
            addCriterion("pk_duration between", value1, value2, "pkDuration");
            return (Criteria) this;
        }

        public Criteria andPkDurationNotBetween(Integer value1, Integer value2) {
            addCriterion("pk_duration not between", value1, value2, "pkDuration");
            return (Criteria) this;
        }

        public Criteria andPkTypeIsNull() {
            addCriterion("pk_type is null");
            return (Criteria) this;
        }

        public Criteria andPkTypeIsNotNull() {
            addCriterion("pk_type is not null");
            return (Criteria) this;
        }

        public Criteria andPkTypeEqualTo(Integer value) {
            addCriterion("pk_type =", value, "pkType");
            return (Criteria) this;
        }

        public Criteria andPkTypeNotEqualTo(Integer value) {
            addCriterion("pk_type <>", value, "pkType");
            return (Criteria) this;
        }

        public Criteria andPkTypeGreaterThan(Integer value) {
            addCriterion("pk_type >", value, "pkType");
            return (Criteria) this;
        }

        public Criteria andPkTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("pk_type >=", value, "pkType");
            return (Criteria) this;
        }

        public Criteria andPkTypeLessThan(Integer value) {
            addCriterion("pk_type <", value, "pkType");
            return (Criteria) this;
        }

        public Criteria andPkTypeLessThanOrEqualTo(Integer value) {
            addCriterion("pk_type <=", value, "pkType");
            return (Criteria) this;
        }

        public Criteria andPkTypeIn(List<Integer> values) {
            addCriterion("pk_type in", values, "pkType");
            return (Criteria) this;
        }

        public Criteria andPkTypeNotIn(List<Integer> values) {
            addCriterion("pk_type not in", values, "pkType");
            return (Criteria) this;
        }

        public Criteria andPkTypeBetween(Integer value1, Integer value2) {
            addCriterion("pk_type between", value1, value2, "pkType");
            return (Criteria) this;
        }

        public Criteria andPkTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("pk_type not between", value1, value2, "pkType");
            return (Criteria) this;
        }

        public Criteria andPkNameIsNull() {
            addCriterion("pk_name is null");
            return (Criteria) this;
        }

        public Criteria andPkNameIsNotNull() {
            addCriterion("pk_name is not null");
            return (Criteria) this;
        }

        public Criteria andPkNameEqualTo(String value) {
            addCriterion("pk_name =", value, "pkName");
            return (Criteria) this;
        }

        public Criteria andPkNameNotEqualTo(String value) {
            addCriterion("pk_name <>", value, "pkName");
            return (Criteria) this;
        }

        public Criteria andPkNameGreaterThan(String value) {
            addCriterion("pk_name >", value, "pkName");
            return (Criteria) this;
        }

        public Criteria andPkNameGreaterThanOrEqualTo(String value) {
            addCriterion("pk_name >=", value, "pkName");
            return (Criteria) this;
        }

        public Criteria andPkNameLessThan(String value) {
            addCriterion("pk_name <", value, "pkName");
            return (Criteria) this;
        }

        public Criteria andPkNameLessThanOrEqualTo(String value) {
            addCriterion("pk_name <=", value, "pkName");
            return (Criteria) this;
        }

        public Criteria andPkNameLike(String value) {
            addCriterion("pk_name like", value, "pkName");
            return (Criteria) this;
        }

        public Criteria andPkNameNotLike(String value) {
            addCriterion("pk_name not like", value, "pkName");
            return (Criteria) this;
        }

        public Criteria andPkNameIn(List<String> values) {
            addCriterion("pk_name in", values, "pkName");
            return (Criteria) this;
        }

        public Criteria andPkNameNotIn(List<String> values) {
            addCriterion("pk_name not in", values, "pkName");
            return (Criteria) this;
        }

        public Criteria andPkNameBetween(String value1, String value2) {
            addCriterion("pk_name between", value1, value2, "pkName");
            return (Criteria) this;
        }

        public Criteria andPkNameNotBetween(String value1, String value2) {
            addCriterion("pk_name not between", value1, value2, "pkName");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
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

        public Criteria andPkBandwidthIsNull() {
            addCriterion("pk_bandwidth is null");
            return (Criteria) this;
        }

        public Criteria andPkBandwidthIsNotNull() {
            addCriterion("pk_bandwidth is not null");
            return (Criteria) this;
        }

        public Criteria andPkBandwidthEqualTo(Double value) {
            addCriterion("pk_bandwidth =", value, "pkBandwidth");
            return (Criteria) this;
        }

        public Criteria andPkBandwidthNotEqualTo(Double value) {
            addCriterion("pk_bandwidth <>", value, "pkBandwidth");
            return (Criteria) this;
        }

        public Criteria andPkBandwidthGreaterThan(Double value) {
            addCriterion("pk_bandwidth >", value, "pkBandwidth");
            return (Criteria) this;
        }

        public Criteria andPkBandwidthGreaterThanOrEqualTo(Double value) {
            addCriterion("pk_bandwidth >=", value, "pkBandwidth");
            return (Criteria) this;
        }

        public Criteria andPkBandwidthLessThan(Double value) {
            addCriterion("pk_bandwidth <", value, "pkBandwidth");
            return (Criteria) this;
        }

        public Criteria andPkBandwidthLessThanOrEqualTo(Double value) {
            addCriterion("pk_bandwidth <=", value, "pkBandwidth");
            return (Criteria) this;
        }

        public Criteria andPkBandwidthIn(List<Double> values) {
            addCriterion("pk_bandwidth in", values, "pkBandwidth");
            return (Criteria) this;
        }

        public Criteria andPkBandwidthNotIn(List<Double> values) {
            addCriterion("pk_bandwidth not in", values, "pkBandwidth");
            return (Criteria) this;
        }

        public Criteria andPkBandwidthBetween(Double value1, Double value2) {
            addCriterion("pk_bandwidth between", value1, value2, "pkBandwidth");
            return (Criteria) this;
        }

        public Criteria andPkBandwidthNotBetween(Double value1, Double value2) {
            addCriterion("pk_bandwidth not between", value1, value2, "pkBandwidth");
            return (Criteria) this;
        }

        public Criteria andPkFlowIsNull() {
            addCriterion("pk_flow is null");
            return (Criteria) this;
        }

        public Criteria andPkFlowIsNotNull() {
            addCriterion("pk_flow is not null");
            return (Criteria) this;
        }

        public Criteria andPkFlowEqualTo(Double value) {
            addCriterion("pk_flow =", value, "pkFlow");
            return (Criteria) this;
        }

        public Criteria andPkFlowNotEqualTo(Double value) {
            addCriterion("pk_flow <>", value, "pkFlow");
            return (Criteria) this;
        }

        public Criteria andPkFlowGreaterThan(Double value) {
            addCriterion("pk_flow >", value, "pkFlow");
            return (Criteria) this;
        }

        public Criteria andPkFlowGreaterThanOrEqualTo(Double value) {
            addCriterion("pk_flow >=", value, "pkFlow");
            return (Criteria) this;
        }

        public Criteria andPkFlowLessThan(Double value) {
            addCriterion("pk_flow <", value, "pkFlow");
            return (Criteria) this;
        }

        public Criteria andPkFlowLessThanOrEqualTo(Double value) {
            addCriterion("pk_flow <=", value, "pkFlow");
            return (Criteria) this;
        }

        public Criteria andPkFlowIn(List<Double> values) {
            addCriterion("pk_flow in", values, "pkFlow");
            return (Criteria) this;
        }

        public Criteria andPkFlowNotIn(List<Double> values) {
            addCriterion("pk_flow not in", values, "pkFlow");
            return (Criteria) this;
        }

        public Criteria andPkFlowBetween(Double value1, Double value2) {
            addCriterion("pk_flow between", value1, value2, "pkFlow");
            return (Criteria) this;
        }

        public Criteria andPkFlowNotBetween(Double value1, Double value2) {
            addCriterion("pk_flow not between", value1, value2, "pkFlow");
            return (Criteria) this;
        }

        public Criteria andPkAmountIsNull() {
            addCriterion("pk_amount is null");
            return (Criteria) this;
        }

        public Criteria andPkAmountIsNotNull() {
            addCriterion("pk_amount is not null");
            return (Criteria) this;
        }

        public Criteria andPkAmountEqualTo(Long value) {
            addCriterion("pk_amount =", value, "pkAmount");
            return (Criteria) this;
        }

        public Criteria andPkAmountNotEqualTo(Long value) {
            addCriterion("pk_amount <>", value, "pkAmount");
            return (Criteria) this;
        }

        public Criteria andPkAmountGreaterThan(Long value) {
            addCriterion("pk_amount >", value, "pkAmount");
            return (Criteria) this;
        }

        public Criteria andPkAmountGreaterThanOrEqualTo(Long value) {
            addCriterion("pk_amount >=", value, "pkAmount");
            return (Criteria) this;
        }

        public Criteria andPkAmountLessThan(Long value) {
            addCriterion("pk_amount <", value, "pkAmount");
            return (Criteria) this;
        }

        public Criteria andPkAmountLessThanOrEqualTo(Long value) {
            addCriterion("pk_amount <=", value, "pkAmount");
            return (Criteria) this;
        }

        public Criteria andPkAmountIn(List<Long> values) {
            addCriterion("pk_amount in", values, "pkAmount");
            return (Criteria) this;
        }

        public Criteria andPkAmountNotIn(List<Long> values) {
            addCriterion("pk_amount not in", values, "pkAmount");
            return (Criteria) this;
        }

        public Criteria andPkAmountBetween(Long value1, Long value2) {
            addCriterion("pk_amount between", value1, value2, "pkAmount");
            return (Criteria) this;
        }

        public Criteria andPkAmountNotBetween(Long value1, Long value2) {
            addCriterion("pk_amount not between", value1, value2, "pkAmount");
            return (Criteria) this;
        }

        public Criteria andPkDiscountIsNull() {
            addCriterion("pk_discount is null");
            return (Criteria) this;
        }

        public Criteria andPkDiscountIsNotNull() {
            addCriterion("pk_discount is not null");
            return (Criteria) this;
        }

        public Criteria andPkDiscountEqualTo(Integer value) {
            addCriterion("pk_discount =", value, "pkDiscount");
            return (Criteria) this;
        }

        public Criteria andPkDiscountNotEqualTo(Integer value) {
            addCriterion("pk_discount <>", value, "pkDiscount");
            return (Criteria) this;
        }

        public Criteria andPkDiscountGreaterThan(Integer value) {
            addCriterion("pk_discount >", value, "pkDiscount");
            return (Criteria) this;
        }

        public Criteria andPkDiscountGreaterThanOrEqualTo(Integer value) {
            addCriterion("pk_discount >=", value, "pkDiscount");
            return (Criteria) this;
        }

        public Criteria andPkDiscountLessThan(Integer value) {
            addCriterion("pk_discount <", value, "pkDiscount");
            return (Criteria) this;
        }

        public Criteria andPkDiscountLessThanOrEqualTo(Integer value) {
            addCriterion("pk_discount <=", value, "pkDiscount");
            return (Criteria) this;
        }

        public Criteria andPkDiscountIn(List<Integer> values) {
            addCriterion("pk_discount in", values, "pkDiscount");
            return (Criteria) this;
        }

        public Criteria andPkDiscountNotIn(List<Integer> values) {
            addCriterion("pk_discount not in", values, "pkDiscount");
            return (Criteria) this;
        }

        public Criteria andPkDiscountBetween(Integer value1, Integer value2) {
            addCriterion("pk_discount between", value1, value2, "pkDiscount");
            return (Criteria) this;
        }

        public Criteria andPkDiscountNotBetween(Integer value1, Integer value2) {
            addCriterion("pk_discount not between", value1, value2, "pkDiscount");
            return (Criteria) this;
        }

        public Criteria andIsDeleteIsNull() {
            addCriterion("is_delete is null");
            return (Criteria) this;
        }

        public Criteria andIsDeleteIsNotNull() {
            addCriterion("is_delete is not null");
            return (Criteria) this;
        }

        public Criteria andIsDeleteEqualTo(Integer value) {
            addCriterion("is_delete =", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotEqualTo(Integer value) {
            addCriterion("is_delete <>", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteGreaterThan(Integer value) {
            addCriterion("is_delete >", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_delete >=", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteLessThan(Integer value) {
            addCriterion("is_delete <", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteLessThanOrEqualTo(Integer value) {
            addCriterion("is_delete <=", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteIn(List<Integer> values) {
            addCriterion("is_delete in", values, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotIn(List<Integer> values) {
            addCriterion("is_delete not in", values, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteBetween(Integer value1, Integer value2) {
            addCriterion("is_delete between", value1, value2, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotBetween(Integer value1, Integer value2) {
            addCriterion("is_delete not between", value1, value2, "isDelete");
            return (Criteria) this;
        }

        public Criteria andValidTimeIsNull() {
            addCriterion("valid_time is null");
            return (Criteria) this;
        }

        public Criteria andValidTimeIsNotNull() {
            addCriterion("valid_time is not null");
            return (Criteria) this;
        }

        public Criteria andValidTimeEqualTo(Date value) {
            addCriterion("valid_time =", value, "validTime");
            return (Criteria) this;
        }

        public Criteria andValidTimeNotEqualTo(Date value) {
            addCriterion("valid_time <>", value, "validTime");
            return (Criteria) this;
        }

        public Criteria andValidTimeGreaterThan(Date value) {
            addCriterion("valid_time >", value, "validTime");
            return (Criteria) this;
        }

        public Criteria andValidTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("valid_time >=", value, "validTime");
            return (Criteria) this;
        }

        public Criteria andValidTimeLessThan(Date value) {
            addCriterion("valid_time <", value, "validTime");
            return (Criteria) this;
        }

        public Criteria andValidTimeLessThanOrEqualTo(Date value) {
            addCriterion("valid_time <=", value, "validTime");
            return (Criteria) this;
        }

        public Criteria andValidTimeIn(List<Date> values) {
            addCriterion("valid_time in", values, "validTime");
            return (Criteria) this;
        }

        public Criteria andValidTimeNotIn(List<Date> values) {
            addCriterion("valid_time not in", values, "validTime");
            return (Criteria) this;
        }

        public Criteria andValidTimeBetween(Date value1, Date value2) {
            addCriterion("valid_time between", value1, value2, "validTime");
            return (Criteria) this;
        }

        public Criteria andValidTimeNotBetween(Date value1, Date value2) {
            addCriterion("valid_time not between", value1, value2, "validTime");
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