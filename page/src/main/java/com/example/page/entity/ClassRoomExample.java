package com.example.page.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ClassRoomExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ClassRoomExample() {
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
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("ID like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("ID not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andJsbhIsNull() {
            addCriterion("JSBH is null");
            return (Criteria) this;
        }

        public Criteria andJsbhIsNotNull() {
            addCriterion("JSBH is not null");
            return (Criteria) this;
        }

        public Criteria andJsbhEqualTo(String value) {
            addCriterion("JSBH =", value, "jsbh");
            return (Criteria) this;
        }

        public Criteria andJsbhNotEqualTo(String value) {
            addCriterion("JSBH <>", value, "jsbh");
            return (Criteria) this;
        }

        public Criteria andJsbhGreaterThan(String value) {
            addCriterion("JSBH >", value, "jsbh");
            return (Criteria) this;
        }

        public Criteria andJsbhGreaterThanOrEqualTo(String value) {
            addCriterion("JSBH >=", value, "jsbh");
            return (Criteria) this;
        }

        public Criteria andJsbhLessThan(String value) {
            addCriterion("JSBH <", value, "jsbh");
            return (Criteria) this;
        }

        public Criteria andJsbhLessThanOrEqualTo(String value) {
            addCriterion("JSBH <=", value, "jsbh");
            return (Criteria) this;
        }

        public Criteria andJsbhLike(String value) {
            addCriterion("JSBH like", value, "jsbh");
            return (Criteria) this;
        }

        public Criteria andJsbhNotLike(String value) {
            addCriterion("JSBH not like", value, "jsbh");
            return (Criteria) this;
        }

        public Criteria andJsbhIn(List<String> values) {
            addCriterion("JSBH in", values, "jsbh");
            return (Criteria) this;
        }

        public Criteria andJsbhNotIn(List<String> values) {
            addCriterion("JSBH not in", values, "jsbh");
            return (Criteria) this;
        }

        public Criteria andJsbhBetween(String value1, String value2) {
            addCriterion("JSBH between", value1, value2, "jsbh");
            return (Criteria) this;
        }

        public Criteria andJsbhNotBetween(String value1, String value2) {
            addCriterion("JSBH not between", value1, value2, "jsbh");
            return (Criteria) this;
        }

        public Criteria andJsmcIsNull() {
            addCriterion("JSMC is null");
            return (Criteria) this;
        }

        public Criteria andJsmcIsNotNull() {
            addCriterion("JSMC is not null");
            return (Criteria) this;
        }

        public Criteria andJsmcEqualTo(String value) {
            addCriterion("JSMC =", value, "jsmc");
            return (Criteria) this;
        }

        public Criteria andJsmcNotEqualTo(String value) {
            addCriterion("JSMC <>", value, "jsmc");
            return (Criteria) this;
        }

        public Criteria andJsmcGreaterThan(String value) {
            addCriterion("JSMC >", value, "jsmc");
            return (Criteria) this;
        }

        public Criteria andJsmcGreaterThanOrEqualTo(String value) {
            addCriterion("JSMC >=", value, "jsmc");
            return (Criteria) this;
        }

        public Criteria andJsmcLessThan(String value) {
            addCriterion("JSMC <", value, "jsmc");
            return (Criteria) this;
        }

        public Criteria andJsmcLessThanOrEqualTo(String value) {
            addCriterion("JSMC <=", value, "jsmc");
            return (Criteria) this;
        }

        public Criteria andJsmcLike(String value) {
            addCriterion("JSMC like", value, "jsmc");
            return (Criteria) this;
        }

        public Criteria andJsmcNotLike(String value) {
            addCriterion("JSMC not like", value, "jsmc");
            return (Criteria) this;
        }

        public Criteria andJsmcIn(List<String> values) {
            addCriterion("JSMC in", values, "jsmc");
            return (Criteria) this;
        }

        public Criteria andJsmcNotIn(List<String> values) {
            addCriterion("JSMC not in", values, "jsmc");
            return (Criteria) this;
        }

        public Criteria andJsmcBetween(String value1, String value2) {
            addCriterion("JSMC between", value1, value2, "jsmc");
            return (Criteria) this;
        }

        public Criteria andJsmcNotBetween(String value1, String value2) {
            addCriterion("JSMC not between", value1, value2, "jsmc");
            return (Criteria) this;
        }

        public Criteria andJslbIsNull() {
            addCriterion("JSLB is null");
            return (Criteria) this;
        }

        public Criteria andJslbIsNotNull() {
            addCriterion("JSLB is not null");
            return (Criteria) this;
        }

        public Criteria andJslbEqualTo(String value) {
            addCriterion("JSLB =", value, "jslb");
            return (Criteria) this;
        }

        public Criteria andJslbNotEqualTo(String value) {
            addCriterion("JSLB <>", value, "jslb");
            return (Criteria) this;
        }

        public Criteria andJslbGreaterThan(String value) {
            addCriterion("JSLB >", value, "jslb");
            return (Criteria) this;
        }

        public Criteria andJslbGreaterThanOrEqualTo(String value) {
            addCriterion("JSLB >=", value, "jslb");
            return (Criteria) this;
        }

        public Criteria andJslbLessThan(String value) {
            addCriterion("JSLB <", value, "jslb");
            return (Criteria) this;
        }

        public Criteria andJslbLessThanOrEqualTo(String value) {
            addCriterion("JSLB <=", value, "jslb");
            return (Criteria) this;
        }

        public Criteria andJslbLike(String value) {
            addCriterion("JSLB like", value, "jslb");
            return (Criteria) this;
        }

        public Criteria andJslbNotLike(String value) {
            addCriterion("JSLB not like", value, "jslb");
            return (Criteria) this;
        }

        public Criteria andJslbIn(List<String> values) {
            addCriterion("JSLB in", values, "jslb");
            return (Criteria) this;
        }

        public Criteria andJslbNotIn(List<String> values) {
            addCriterion("JSLB not in", values, "jslb");
            return (Criteria) this;
        }

        public Criteria andJslbBetween(String value1, String value2) {
            addCriterion("JSLB between", value1, value2, "jslb");
            return (Criteria) this;
        }

        public Criteria andJslbNotBetween(String value1, String value2) {
            addCriterion("JSLB not between", value1, value2, "jslb");
            return (Criteria) this;
        }

        public Criteria andZwsIsNull() {
            addCriterion("ZWS is null");
            return (Criteria) this;
        }

        public Criteria andZwsIsNotNull() {
            addCriterion("ZWS is not null");
            return (Criteria) this;
        }

        public Criteria andZwsEqualTo(BigDecimal value) {
            addCriterion("ZWS =", value, "zws");
            return (Criteria) this;
        }

        public Criteria andZwsNotEqualTo(BigDecimal value) {
            addCriterion("ZWS <>", value, "zws");
            return (Criteria) this;
        }

        public Criteria andZwsGreaterThan(BigDecimal value) {
            addCriterion("ZWS >", value, "zws");
            return (Criteria) this;
        }

        public Criteria andZwsGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ZWS >=", value, "zws");
            return (Criteria) this;
        }

        public Criteria andZwsLessThan(BigDecimal value) {
            addCriterion("ZWS <", value, "zws");
            return (Criteria) this;
        }

        public Criteria andZwsLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ZWS <=", value, "zws");
            return (Criteria) this;
        }

        public Criteria andZwsIn(List<BigDecimal> values) {
            addCriterion("ZWS in", values, "zws");
            return (Criteria) this;
        }

        public Criteria andZwsNotIn(List<BigDecimal> values) {
            addCriterion("ZWS not in", values, "zws");
            return (Criteria) this;
        }

        public Criteria andZwsBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ZWS between", value1, value2, "zws");
            return (Criteria) this;
        }

        public Criteria andZwsNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ZWS not between", value1, value2, "zws");
            return (Criteria) this;
        }

        public Criteria andXqdmIsNull() {
            addCriterion("XQDM is null");
            return (Criteria) this;
        }

        public Criteria andXqdmIsNotNull() {
            addCriterion("XQDM is not null");
            return (Criteria) this;
        }

        public Criteria andXqdmEqualTo(BigDecimal value) {
            addCriterion("XQDM =", value, "xqdm");
            return (Criteria) this;
        }

        public Criteria andXqdmNotEqualTo(BigDecimal value) {
            addCriterion("XQDM <>", value, "xqdm");
            return (Criteria) this;
        }

        public Criteria andXqdmGreaterThan(BigDecimal value) {
            addCriterion("XQDM >", value, "xqdm");
            return (Criteria) this;
        }

        public Criteria andXqdmGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("XQDM >=", value, "xqdm");
            return (Criteria) this;
        }

        public Criteria andXqdmLessThan(BigDecimal value) {
            addCriterion("XQDM <", value, "xqdm");
            return (Criteria) this;
        }

        public Criteria andXqdmLessThanOrEqualTo(BigDecimal value) {
            addCriterion("XQDM <=", value, "xqdm");
            return (Criteria) this;
        }

        public Criteria andXqdmIn(List<BigDecimal> values) {
            addCriterion("XQDM in", values, "xqdm");
            return (Criteria) this;
        }

        public Criteria andXqdmNotIn(List<BigDecimal> values) {
            addCriterion("XQDM not in", values, "xqdm");
            return (Criteria) this;
        }

        public Criteria andXqdmBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("XQDM between", value1, value2, "xqdm");
            return (Criteria) this;
        }

        public Criteria andXqdmNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("XQDM not between", value1, value2, "xqdm");
            return (Criteria) this;
        }

        public Criteria andKszwsIsNull() {
            addCriterion("KSZWS is null");
            return (Criteria) this;
        }

        public Criteria andKszwsIsNotNull() {
            addCriterion("KSZWS is not null");
            return (Criteria) this;
        }

        public Criteria andKszwsEqualTo(BigDecimal value) {
            addCriterion("KSZWS =", value, "kszws");
            return (Criteria) this;
        }

        public Criteria andKszwsNotEqualTo(BigDecimal value) {
            addCriterion("KSZWS <>", value, "kszws");
            return (Criteria) this;
        }

        public Criteria andKszwsGreaterThan(BigDecimal value) {
            addCriterion("KSZWS >", value, "kszws");
            return (Criteria) this;
        }

        public Criteria andKszwsGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("KSZWS >=", value, "kszws");
            return (Criteria) this;
        }

        public Criteria andKszwsLessThan(BigDecimal value) {
            addCriterion("KSZWS <", value, "kszws");
            return (Criteria) this;
        }

        public Criteria andKszwsLessThanOrEqualTo(BigDecimal value) {
            addCriterion("KSZWS <=", value, "kszws");
            return (Criteria) this;
        }

        public Criteria andKszwsIn(List<BigDecimal> values) {
            addCriterion("KSZWS in", values, "kszws");
            return (Criteria) this;
        }

        public Criteria andKszwsNotIn(List<BigDecimal> values) {
            addCriterion("KSZWS not in", values, "kszws");
            return (Criteria) this;
        }

        public Criteria andKszwsBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("KSZWS between", value1, value2, "kszws");
            return (Criteria) this;
        }

        public Criteria andKszwsNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("KSZWS not between", value1, value2, "kszws");
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