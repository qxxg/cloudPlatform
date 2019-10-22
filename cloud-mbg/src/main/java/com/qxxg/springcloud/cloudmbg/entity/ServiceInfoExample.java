package com.qxxg.springcloud.cloudmbg.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ServiceInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ServiceInfoExample() {
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

        public Criteria andIpAddrIsNull() {
            addCriterion("ip_addr is null");
            return (Criteria) this;
        }

        public Criteria andIpAddrIsNotNull() {
            addCriterion("ip_addr is not null");
            return (Criteria) this;
        }

        public Criteria andIpAddrEqualTo(String value) {
            addCriterion("ip_addr =", value, "ipAddr");
            return (Criteria) this;
        }

        public Criteria andIpAddrNotEqualTo(String value) {
            addCriterion("ip_addr <>", value, "ipAddr");
            return (Criteria) this;
        }

        public Criteria andIpAddrGreaterThan(String value) {
            addCriterion("ip_addr >", value, "ipAddr");
            return (Criteria) this;
        }

        public Criteria andIpAddrGreaterThanOrEqualTo(String value) {
            addCriterion("ip_addr >=", value, "ipAddr");
            return (Criteria) this;
        }

        public Criteria andIpAddrLessThan(String value) {
            addCriterion("ip_addr <", value, "ipAddr");
            return (Criteria) this;
        }

        public Criteria andIpAddrLessThanOrEqualTo(String value) {
            addCriterion("ip_addr <=", value, "ipAddr");
            return (Criteria) this;
        }

        public Criteria andIpAddrLike(String value) {
            addCriterion("ip_addr like", value, "ipAddr");
            return (Criteria) this;
        }

        public Criteria andIpAddrNotLike(String value) {
            addCriterion("ip_addr not like", value, "ipAddr");
            return (Criteria) this;
        }

        public Criteria andIpAddrIn(List<String> values) {
            addCriterion("ip_addr in", values, "ipAddr");
            return (Criteria) this;
        }

        public Criteria andIpAddrNotIn(List<String> values) {
            addCriterion("ip_addr not in", values, "ipAddr");
            return (Criteria) this;
        }

        public Criteria andIpAddrBetween(String value1, String value2) {
            addCriterion("ip_addr between", value1, value2, "ipAddr");
            return (Criteria) this;
        }

        public Criteria andIpAddrNotBetween(String value1, String value2) {
            addCriterion("ip_addr not between", value1, value2, "ipAddr");
            return (Criteria) this;
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

        public Criteria andMaxSupportIsNull() {
            addCriterion("max_support is null");
            return (Criteria) this;
        }

        public Criteria andMaxSupportIsNotNull() {
            addCriterion("max_support is not null");
            return (Criteria) this;
        }

        public Criteria andMaxSupportEqualTo(Integer value) {
            addCriterion("max_support =", value, "maxSupport");
            return (Criteria) this;
        }

        public Criteria andMaxSupportNotEqualTo(Integer value) {
            addCriterion("max_support <>", value, "maxSupport");
            return (Criteria) this;
        }

        public Criteria andMaxSupportGreaterThan(Integer value) {
            addCriterion("max_support >", value, "maxSupport");
            return (Criteria) this;
        }

        public Criteria andMaxSupportGreaterThanOrEqualTo(Integer value) {
            addCriterion("max_support >=", value, "maxSupport");
            return (Criteria) this;
        }

        public Criteria andMaxSupportLessThan(Integer value) {
            addCriterion("max_support <", value, "maxSupport");
            return (Criteria) this;
        }

        public Criteria andMaxSupportLessThanOrEqualTo(Integer value) {
            addCriterion("max_support <=", value, "maxSupport");
            return (Criteria) this;
        }

        public Criteria andMaxSupportIn(List<Integer> values) {
            addCriterion("max_support in", values, "maxSupport");
            return (Criteria) this;
        }

        public Criteria andMaxSupportNotIn(List<Integer> values) {
            addCriterion("max_support not in", values, "maxSupport");
            return (Criteria) this;
        }

        public Criteria andMaxSupportBetween(Integer value1, Integer value2) {
            addCriterion("max_support between", value1, value2, "maxSupport");
            return (Criteria) this;
        }

        public Criteria andMaxSupportNotBetween(Integer value1, Integer value2) {
            addCriterion("max_support not between", value1, value2, "maxSupport");
            return (Criteria) this;
        }

        public Criteria andNetDelayIsNull() {
            addCriterion("net_delay is null");
            return (Criteria) this;
        }

        public Criteria andNetDelayIsNotNull() {
            addCriterion("net_delay is not null");
            return (Criteria) this;
        }

        public Criteria andNetDelayEqualTo(Integer value) {
            addCriterion("net_delay =", value, "netDelay");
            return (Criteria) this;
        }

        public Criteria andNetDelayNotEqualTo(Integer value) {
            addCriterion("net_delay <>", value, "netDelay");
            return (Criteria) this;
        }

        public Criteria andNetDelayGreaterThan(Integer value) {
            addCriterion("net_delay >", value, "netDelay");
            return (Criteria) this;
        }

        public Criteria andNetDelayGreaterThanOrEqualTo(Integer value) {
            addCriterion("net_delay >=", value, "netDelay");
            return (Criteria) this;
        }

        public Criteria andNetDelayLessThan(Integer value) {
            addCriterion("net_delay <", value, "netDelay");
            return (Criteria) this;
        }

        public Criteria andNetDelayLessThanOrEqualTo(Integer value) {
            addCriterion("net_delay <=", value, "netDelay");
            return (Criteria) this;
        }

        public Criteria andNetDelayIn(List<Integer> values) {
            addCriterion("net_delay in", values, "netDelay");
            return (Criteria) this;
        }

        public Criteria andNetDelayNotIn(List<Integer> values) {
            addCriterion("net_delay not in", values, "netDelay");
            return (Criteria) this;
        }

        public Criteria andNetDelayBetween(Integer value1, Integer value2) {
            addCriterion("net_delay between", value1, value2, "netDelay");
            return (Criteria) this;
        }

        public Criteria andNetDelayNotBetween(Integer value1, Integer value2) {
            addCriterion("net_delay not between", value1, value2, "netDelay");
            return (Criteria) this;
        }

        public Criteria andTargetAreaIsNull() {
            addCriterion("target_area is null");
            return (Criteria) this;
        }

        public Criteria andTargetAreaIsNotNull() {
            addCriterion("target_area is not null");
            return (Criteria) this;
        }

        public Criteria andTargetAreaEqualTo(String value) {
            addCriterion("target_area =", value, "targetArea");
            return (Criteria) this;
        }

        public Criteria andTargetAreaNotEqualTo(String value) {
            addCriterion("target_area <>", value, "targetArea");
            return (Criteria) this;
        }

        public Criteria andTargetAreaGreaterThan(String value) {
            addCriterion("target_area >", value, "targetArea");
            return (Criteria) this;
        }

        public Criteria andTargetAreaGreaterThanOrEqualTo(String value) {
            addCriterion("target_area >=", value, "targetArea");
            return (Criteria) this;
        }

        public Criteria andTargetAreaLessThan(String value) {
            addCriterion("target_area <", value, "targetArea");
            return (Criteria) this;
        }

        public Criteria andTargetAreaLessThanOrEqualTo(String value) {
            addCriterion("target_area <=", value, "targetArea");
            return (Criteria) this;
        }

        public Criteria andTargetAreaLike(String value) {
            addCriterion("target_area like", value, "targetArea");
            return (Criteria) this;
        }

        public Criteria andTargetAreaNotLike(String value) {
            addCriterion("target_area not like", value, "targetArea");
            return (Criteria) this;
        }

        public Criteria andTargetAreaIn(List<String> values) {
            addCriterion("target_area in", values, "targetArea");
            return (Criteria) this;
        }

        public Criteria andTargetAreaNotIn(List<String> values) {
            addCriterion("target_area not in", values, "targetArea");
            return (Criteria) this;
        }

        public Criteria andTargetAreaBetween(String value1, String value2) {
            addCriterion("target_area between", value1, value2, "targetArea");
            return (Criteria) this;
        }

        public Criteria andTargetAreaNotBetween(String value1, String value2) {
            addCriterion("target_area not between", value1, value2, "targetArea");
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

        public Criteria andServerStatusEqualTo(String value) {
            addCriterion("server_status =", value, "serverStatus");
            return (Criteria) this;
        }

        public Criteria andServerStatusNotEqualTo(String value) {
            addCriterion("server_status <>", value, "serverStatus");
            return (Criteria) this;
        }

        public Criteria andServerStatusGreaterThan(String value) {
            addCriterion("server_status >", value, "serverStatus");
            return (Criteria) this;
        }

        public Criteria andServerStatusGreaterThanOrEqualTo(String value) {
            addCriterion("server_status >=", value, "serverStatus");
            return (Criteria) this;
        }

        public Criteria andServerStatusLessThan(String value) {
            addCriterion("server_status <", value, "serverStatus");
            return (Criteria) this;
        }

        public Criteria andServerStatusLessThanOrEqualTo(String value) {
            addCriterion("server_status <=", value, "serverStatus");
            return (Criteria) this;
        }

        public Criteria andServerStatusLike(String value) {
            addCriterion("server_status like", value, "serverStatus");
            return (Criteria) this;
        }

        public Criteria andServerStatusNotLike(String value) {
            addCriterion("server_status not like", value, "serverStatus");
            return (Criteria) this;
        }

        public Criteria andServerStatusIn(List<String> values) {
            addCriterion("server_status in", values, "serverStatus");
            return (Criteria) this;
        }

        public Criteria andServerStatusNotIn(List<String> values) {
            addCriterion("server_status not in", values, "serverStatus");
            return (Criteria) this;
        }

        public Criteria andServerStatusBetween(String value1, String value2) {
            addCriterion("server_status between", value1, value2, "serverStatus");
            return (Criteria) this;
        }

        public Criteria andServerStatusNotBetween(String value1, String value2) {
            addCriterion("server_status not between", value1, value2, "serverStatus");
            return (Criteria) this;
        }

        public Criteria andCpuUtilityIsNull() {
            addCriterion("cpu_utility is null");
            return (Criteria) this;
        }

        public Criteria andCpuUtilityIsNotNull() {
            addCriterion("cpu_utility is not null");
            return (Criteria) this;
        }

        public Criteria andCpuUtilityEqualTo(String value) {
            addCriterion("cpu_utility =", value, "cpuUtility");
            return (Criteria) this;
        }

        public Criteria andCpuUtilityNotEqualTo(String value) {
            addCriterion("cpu_utility <>", value, "cpuUtility");
            return (Criteria) this;
        }

        public Criteria andCpuUtilityGreaterThan(String value) {
            addCriterion("cpu_utility >", value, "cpuUtility");
            return (Criteria) this;
        }

        public Criteria andCpuUtilityGreaterThanOrEqualTo(String value) {
            addCriterion("cpu_utility >=", value, "cpuUtility");
            return (Criteria) this;
        }

        public Criteria andCpuUtilityLessThan(String value) {
            addCriterion("cpu_utility <", value, "cpuUtility");
            return (Criteria) this;
        }

        public Criteria andCpuUtilityLessThanOrEqualTo(String value) {
            addCriterion("cpu_utility <=", value, "cpuUtility");
            return (Criteria) this;
        }

        public Criteria andCpuUtilityLike(String value) {
            addCriterion("cpu_utility like", value, "cpuUtility");
            return (Criteria) this;
        }

        public Criteria andCpuUtilityNotLike(String value) {
            addCriterion("cpu_utility not like", value, "cpuUtility");
            return (Criteria) this;
        }

        public Criteria andCpuUtilityIn(List<String> values) {
            addCriterion("cpu_utility in", values, "cpuUtility");
            return (Criteria) this;
        }

        public Criteria andCpuUtilityNotIn(List<String> values) {
            addCriterion("cpu_utility not in", values, "cpuUtility");
            return (Criteria) this;
        }

        public Criteria andCpuUtilityBetween(String value1, String value2) {
            addCriterion("cpu_utility between", value1, value2, "cpuUtility");
            return (Criteria) this;
        }

        public Criteria andCpuUtilityNotBetween(String value1, String value2) {
            addCriterion("cpu_utility not between", value1, value2, "cpuUtility");
            return (Criteria) this;
        }

        public Criteria andMemFreeIsNull() {
            addCriterion("mem_free is null");
            return (Criteria) this;
        }

        public Criteria andMemFreeIsNotNull() {
            addCriterion("mem_free is not null");
            return (Criteria) this;
        }

        public Criteria andMemFreeEqualTo(String value) {
            addCriterion("mem_free =", value, "memFree");
            return (Criteria) this;
        }

        public Criteria andMemFreeNotEqualTo(String value) {
            addCriterion("mem_free <>", value, "memFree");
            return (Criteria) this;
        }

        public Criteria andMemFreeGreaterThan(String value) {
            addCriterion("mem_free >", value, "memFree");
            return (Criteria) this;
        }

        public Criteria andMemFreeGreaterThanOrEqualTo(String value) {
            addCriterion("mem_free >=", value, "memFree");
            return (Criteria) this;
        }

        public Criteria andMemFreeLessThan(String value) {
            addCriterion("mem_free <", value, "memFree");
            return (Criteria) this;
        }

        public Criteria andMemFreeLessThanOrEqualTo(String value) {
            addCriterion("mem_free <=", value, "memFree");
            return (Criteria) this;
        }

        public Criteria andMemFreeLike(String value) {
            addCriterion("mem_free like", value, "memFree");
            return (Criteria) this;
        }

        public Criteria andMemFreeNotLike(String value) {
            addCriterion("mem_free not like", value, "memFree");
            return (Criteria) this;
        }

        public Criteria andMemFreeIn(List<String> values) {
            addCriterion("mem_free in", values, "memFree");
            return (Criteria) this;
        }

        public Criteria andMemFreeNotIn(List<String> values) {
            addCriterion("mem_free not in", values, "memFree");
            return (Criteria) this;
        }

        public Criteria andMemFreeBetween(String value1, String value2) {
            addCriterion("mem_free between", value1, value2, "memFree");
            return (Criteria) this;
        }

        public Criteria andMemFreeNotBetween(String value1, String value2) {
            addCriterion("mem_free not between", value1, value2, "memFree");
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

        public Criteria andServerTypeEqualTo(String value) {
            addCriterion("server_type =", value, "serverType");
            return (Criteria) this;
        }

        public Criteria andServerTypeNotEqualTo(String value) {
            addCriterion("server_type <>", value, "serverType");
            return (Criteria) this;
        }

        public Criteria andServerTypeGreaterThan(String value) {
            addCriterion("server_type >", value, "serverType");
            return (Criteria) this;
        }

        public Criteria andServerTypeGreaterThanOrEqualTo(String value) {
            addCriterion("server_type >=", value, "serverType");
            return (Criteria) this;
        }

        public Criteria andServerTypeLessThan(String value) {
            addCriterion("server_type <", value, "serverType");
            return (Criteria) this;
        }

        public Criteria andServerTypeLessThanOrEqualTo(String value) {
            addCriterion("server_type <=", value, "serverType");
            return (Criteria) this;
        }

        public Criteria andServerTypeLike(String value) {
            addCriterion("server_type like", value, "serverType");
            return (Criteria) this;
        }

        public Criteria andServerTypeNotLike(String value) {
            addCriterion("server_type not like", value, "serverType");
            return (Criteria) this;
        }

        public Criteria andServerTypeIn(List<String> values) {
            addCriterion("server_type in", values, "serverType");
            return (Criteria) this;
        }

        public Criteria andServerTypeNotIn(List<String> values) {
            addCriterion("server_type not in", values, "serverType");
            return (Criteria) this;
        }

        public Criteria andServerTypeBetween(String value1, String value2) {
            addCriterion("server_type between", value1, value2, "serverType");
            return (Criteria) this;
        }

        public Criteria andServerTypeNotBetween(String value1, String value2) {
            addCriterion("server_type not between", value1, value2, "serverType");
            return (Criteria) this;
        }

        public Criteria andServerLevelIsNull() {
            addCriterion("server_level is null");
            return (Criteria) this;
        }

        public Criteria andServerLevelIsNotNull() {
            addCriterion("server_level is not null");
            return (Criteria) this;
        }

        public Criteria andServerLevelEqualTo(String value) {
            addCriterion("server_level =", value, "serverLevel");
            return (Criteria) this;
        }

        public Criteria andServerLevelNotEqualTo(String value) {
            addCriterion("server_level <>", value, "serverLevel");
            return (Criteria) this;
        }

        public Criteria andServerLevelGreaterThan(String value) {
            addCriterion("server_level >", value, "serverLevel");
            return (Criteria) this;
        }

        public Criteria andServerLevelGreaterThanOrEqualTo(String value) {
            addCriterion("server_level >=", value, "serverLevel");
            return (Criteria) this;
        }

        public Criteria andServerLevelLessThan(String value) {
            addCriterion("server_level <", value, "serverLevel");
            return (Criteria) this;
        }

        public Criteria andServerLevelLessThanOrEqualTo(String value) {
            addCriterion("server_level <=", value, "serverLevel");
            return (Criteria) this;
        }

        public Criteria andServerLevelLike(String value) {
            addCriterion("server_level like", value, "serverLevel");
            return (Criteria) this;
        }

        public Criteria andServerLevelNotLike(String value) {
            addCriterion("server_level not like", value, "serverLevel");
            return (Criteria) this;
        }

        public Criteria andServerLevelIn(List<String> values) {
            addCriterion("server_level in", values, "serverLevel");
            return (Criteria) this;
        }

        public Criteria andServerLevelNotIn(List<String> values) {
            addCriterion("server_level not in", values, "serverLevel");
            return (Criteria) this;
        }

        public Criteria andServerLevelBetween(String value1, String value2) {
            addCriterion("server_level between", value1, value2, "serverLevel");
            return (Criteria) this;
        }

        public Criteria andServerLevelNotBetween(String value1, String value2) {
            addCriterion("server_level not between", value1, value2, "serverLevel");
            return (Criteria) this;
        }

        public Criteria andSoftwareVerIsNull() {
            addCriterion("software_ver is null");
            return (Criteria) this;
        }

        public Criteria andSoftwareVerIsNotNull() {
            addCriterion("software_ver is not null");
            return (Criteria) this;
        }

        public Criteria andSoftwareVerEqualTo(String value) {
            addCriterion("software_ver =", value, "softwareVer");
            return (Criteria) this;
        }

        public Criteria andSoftwareVerNotEqualTo(String value) {
            addCriterion("software_ver <>", value, "softwareVer");
            return (Criteria) this;
        }

        public Criteria andSoftwareVerGreaterThan(String value) {
            addCriterion("software_ver >", value, "softwareVer");
            return (Criteria) this;
        }

        public Criteria andSoftwareVerGreaterThanOrEqualTo(String value) {
            addCriterion("software_ver >=", value, "softwareVer");
            return (Criteria) this;
        }

        public Criteria andSoftwareVerLessThan(String value) {
            addCriterion("software_ver <", value, "softwareVer");
            return (Criteria) this;
        }

        public Criteria andSoftwareVerLessThanOrEqualTo(String value) {
            addCriterion("software_ver <=", value, "softwareVer");
            return (Criteria) this;
        }

        public Criteria andSoftwareVerLike(String value) {
            addCriterion("software_ver like", value, "softwareVer");
            return (Criteria) this;
        }

        public Criteria andSoftwareVerNotLike(String value) {
            addCriterion("software_ver not like", value, "softwareVer");
            return (Criteria) this;
        }

        public Criteria andSoftwareVerIn(List<String> values) {
            addCriterion("software_ver in", values, "softwareVer");
            return (Criteria) this;
        }

        public Criteria andSoftwareVerNotIn(List<String> values) {
            addCriterion("software_ver not in", values, "softwareVer");
            return (Criteria) this;
        }

        public Criteria andSoftwareVerBetween(String value1, String value2) {
            addCriterion("software_ver between", value1, value2, "softwareVer");
            return (Criteria) this;
        }

        public Criteria andSoftwareVerNotBetween(String value1, String value2) {
            addCriterion("software_ver not between", value1, value2, "softwareVer");
            return (Criteria) this;
        }

        public Criteria andSystemVerIsNull() {
            addCriterion("system_ver is null");
            return (Criteria) this;
        }

        public Criteria andSystemVerIsNotNull() {
            addCriterion("system_ver is not null");
            return (Criteria) this;
        }

        public Criteria andSystemVerEqualTo(String value) {
            addCriterion("system_ver =", value, "systemVer");
            return (Criteria) this;
        }

        public Criteria andSystemVerNotEqualTo(String value) {
            addCriterion("system_ver <>", value, "systemVer");
            return (Criteria) this;
        }

        public Criteria andSystemVerGreaterThan(String value) {
            addCriterion("system_ver >", value, "systemVer");
            return (Criteria) this;
        }

        public Criteria andSystemVerGreaterThanOrEqualTo(String value) {
            addCriterion("system_ver >=", value, "systemVer");
            return (Criteria) this;
        }

        public Criteria andSystemVerLessThan(String value) {
            addCriterion("system_ver <", value, "systemVer");
            return (Criteria) this;
        }

        public Criteria andSystemVerLessThanOrEqualTo(String value) {
            addCriterion("system_ver <=", value, "systemVer");
            return (Criteria) this;
        }

        public Criteria andSystemVerLike(String value) {
            addCriterion("system_ver like", value, "systemVer");
            return (Criteria) this;
        }

        public Criteria andSystemVerNotLike(String value) {
            addCriterion("system_ver not like", value, "systemVer");
            return (Criteria) this;
        }

        public Criteria andSystemVerIn(List<String> values) {
            addCriterion("system_ver in", values, "systemVer");
            return (Criteria) this;
        }

        public Criteria andSystemVerNotIn(List<String> values) {
            addCriterion("system_ver not in", values, "systemVer");
            return (Criteria) this;
        }

        public Criteria andSystemVerBetween(String value1, String value2) {
            addCriterion("system_ver between", value1, value2, "systemVer");
            return (Criteria) this;
        }

        public Criteria andSystemVerNotBetween(String value1, String value2) {
            addCriterion("system_ver not between", value1, value2, "systemVer");
            return (Criteria) this;
        }

        public Criteria andCpuIsNull() {
            addCriterion("cpu is null");
            return (Criteria) this;
        }

        public Criteria andCpuIsNotNull() {
            addCriterion("cpu is not null");
            return (Criteria) this;
        }

        public Criteria andCpuEqualTo(String value) {
            addCriterion("cpu =", value, "cpu");
            return (Criteria) this;
        }

        public Criteria andCpuNotEqualTo(String value) {
            addCriterion("cpu <>", value, "cpu");
            return (Criteria) this;
        }

        public Criteria andCpuGreaterThan(String value) {
            addCriterion("cpu >", value, "cpu");
            return (Criteria) this;
        }

        public Criteria andCpuGreaterThanOrEqualTo(String value) {
            addCriterion("cpu >=", value, "cpu");
            return (Criteria) this;
        }

        public Criteria andCpuLessThan(String value) {
            addCriterion("cpu <", value, "cpu");
            return (Criteria) this;
        }

        public Criteria andCpuLessThanOrEqualTo(String value) {
            addCriterion("cpu <=", value, "cpu");
            return (Criteria) this;
        }

        public Criteria andCpuLike(String value) {
            addCriterion("cpu like", value, "cpu");
            return (Criteria) this;
        }

        public Criteria andCpuNotLike(String value) {
            addCriterion("cpu not like", value, "cpu");
            return (Criteria) this;
        }

        public Criteria andCpuIn(List<String> values) {
            addCriterion("cpu in", values, "cpu");
            return (Criteria) this;
        }

        public Criteria andCpuNotIn(List<String> values) {
            addCriterion("cpu not in", values, "cpu");
            return (Criteria) this;
        }

        public Criteria andCpuBetween(String value1, String value2) {
            addCriterion("cpu between", value1, value2, "cpu");
            return (Criteria) this;
        }

        public Criteria andCpuNotBetween(String value1, String value2) {
            addCriterion("cpu not between", value1, value2, "cpu");
            return (Criteria) this;
        }

        public Criteria andMemoryIsNull() {
            addCriterion("memory is null");
            return (Criteria) this;
        }

        public Criteria andMemoryIsNotNull() {
            addCriterion("memory is not null");
            return (Criteria) this;
        }

        public Criteria andMemoryEqualTo(String value) {
            addCriterion("memory =", value, "memory");
            return (Criteria) this;
        }

        public Criteria andMemoryNotEqualTo(String value) {
            addCriterion("memory <>", value, "memory");
            return (Criteria) this;
        }

        public Criteria andMemoryGreaterThan(String value) {
            addCriterion("memory >", value, "memory");
            return (Criteria) this;
        }

        public Criteria andMemoryGreaterThanOrEqualTo(String value) {
            addCriterion("memory >=", value, "memory");
            return (Criteria) this;
        }

        public Criteria andMemoryLessThan(String value) {
            addCriterion("memory <", value, "memory");
            return (Criteria) this;
        }

        public Criteria andMemoryLessThanOrEqualTo(String value) {
            addCriterion("memory <=", value, "memory");
            return (Criteria) this;
        }

        public Criteria andMemoryLike(String value) {
            addCriterion("memory like", value, "memory");
            return (Criteria) this;
        }

        public Criteria andMemoryNotLike(String value) {
            addCriterion("memory not like", value, "memory");
            return (Criteria) this;
        }

        public Criteria andMemoryIn(List<String> values) {
            addCriterion("memory in", values, "memory");
            return (Criteria) this;
        }

        public Criteria andMemoryNotIn(List<String> values) {
            addCriterion("memory not in", values, "memory");
            return (Criteria) this;
        }

        public Criteria andMemoryBetween(String value1, String value2) {
            addCriterion("memory between", value1, value2, "memory");
            return (Criteria) this;
        }

        public Criteria andMemoryNotBetween(String value1, String value2) {
            addCriterion("memory not between", value1, value2, "memory");
            return (Criteria) this;
        }

        public Criteria andHdiskIsNull() {
            addCriterion("hdisk is null");
            return (Criteria) this;
        }

        public Criteria andHdiskIsNotNull() {
            addCriterion("hdisk is not null");
            return (Criteria) this;
        }

        public Criteria andHdiskEqualTo(String value) {
            addCriterion("hdisk =", value, "hdisk");
            return (Criteria) this;
        }

        public Criteria andHdiskNotEqualTo(String value) {
            addCriterion("hdisk <>", value, "hdisk");
            return (Criteria) this;
        }

        public Criteria andHdiskGreaterThan(String value) {
            addCriterion("hdisk >", value, "hdisk");
            return (Criteria) this;
        }

        public Criteria andHdiskGreaterThanOrEqualTo(String value) {
            addCriterion("hdisk >=", value, "hdisk");
            return (Criteria) this;
        }

        public Criteria andHdiskLessThan(String value) {
            addCriterion("hdisk <", value, "hdisk");
            return (Criteria) this;
        }

        public Criteria andHdiskLessThanOrEqualTo(String value) {
            addCriterion("hdisk <=", value, "hdisk");
            return (Criteria) this;
        }

        public Criteria andHdiskLike(String value) {
            addCriterion("hdisk like", value, "hdisk");
            return (Criteria) this;
        }

        public Criteria andHdiskNotLike(String value) {
            addCriterion("hdisk not like", value, "hdisk");
            return (Criteria) this;
        }

        public Criteria andHdiskIn(List<String> values) {
            addCriterion("hdisk in", values, "hdisk");
            return (Criteria) this;
        }

        public Criteria andHdiskNotIn(List<String> values) {
            addCriterion("hdisk not in", values, "hdisk");
            return (Criteria) this;
        }

        public Criteria andHdiskBetween(String value1, String value2) {
            addCriterion("hdisk between", value1, value2, "hdisk");
            return (Criteria) this;
        }

        public Criteria andHdiskNotBetween(String value1, String value2) {
            addCriterion("hdisk not between", value1, value2, "hdisk");
            return (Criteria) this;
        }

        public Criteria andNetCardIsNull() {
            addCriterion("net_card is null");
            return (Criteria) this;
        }

        public Criteria andNetCardIsNotNull() {
            addCriterion("net_card is not null");
            return (Criteria) this;
        }

        public Criteria andNetCardEqualTo(String value) {
            addCriterion("net_card =", value, "netCard");
            return (Criteria) this;
        }

        public Criteria andNetCardNotEqualTo(String value) {
            addCriterion("net_card <>", value, "netCard");
            return (Criteria) this;
        }

        public Criteria andNetCardGreaterThan(String value) {
            addCriterion("net_card >", value, "netCard");
            return (Criteria) this;
        }

        public Criteria andNetCardGreaterThanOrEqualTo(String value) {
            addCriterion("net_card >=", value, "netCard");
            return (Criteria) this;
        }

        public Criteria andNetCardLessThan(String value) {
            addCriterion("net_card <", value, "netCard");
            return (Criteria) this;
        }

        public Criteria andNetCardLessThanOrEqualTo(String value) {
            addCriterion("net_card <=", value, "netCard");
            return (Criteria) this;
        }

        public Criteria andNetCardLike(String value) {
            addCriterion("net_card like", value, "netCard");
            return (Criteria) this;
        }

        public Criteria andNetCardNotLike(String value) {
            addCriterion("net_card not like", value, "netCard");
            return (Criteria) this;
        }

        public Criteria andNetCardIn(List<String> values) {
            addCriterion("net_card in", values, "netCard");
            return (Criteria) this;
        }

        public Criteria andNetCardNotIn(List<String> values) {
            addCriterion("net_card not in", values, "netCard");
            return (Criteria) this;
        }

        public Criteria andNetCardBetween(String value1, String value2) {
            addCriterion("net_card between", value1, value2, "netCard");
            return (Criteria) this;
        }

        public Criteria andNetCardNotBetween(String value1, String value2) {
            addCriterion("net_card not between", value1, value2, "netCard");
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