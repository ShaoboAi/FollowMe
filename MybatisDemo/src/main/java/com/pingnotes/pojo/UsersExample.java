package com.pingnotes.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class UsersExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UsersExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
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

        public Criteria andEmailIsNull() {
            addCriterion("email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("email not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEncryptedRushPasswordIsNull() {
            addCriterion("encrypted_rush_password is null");
            return (Criteria) this;
        }

        public Criteria andEncryptedRushPasswordIsNotNull() {
            addCriterion("encrypted_rush_password is not null");
            return (Criteria) this;
        }

        public Criteria andEncryptedRushPasswordEqualTo(String value) {
            addCriterion("encrypted_rush_password =", value, "encryptedRushPassword");
            return (Criteria) this;
        }

        public Criteria andEncryptedRushPasswordNotEqualTo(String value) {
            addCriterion("encrypted_rush_password <>", value, "encryptedRushPassword");
            return (Criteria) this;
        }

        public Criteria andEncryptedRushPasswordGreaterThan(String value) {
            addCriterion("encrypted_rush_password >", value, "encryptedRushPassword");
            return (Criteria) this;
        }

        public Criteria andEncryptedRushPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("encrypted_rush_password >=", value, "encryptedRushPassword");
            return (Criteria) this;
        }

        public Criteria andEncryptedRushPasswordLessThan(String value) {
            addCriterion("encrypted_rush_password <", value, "encryptedRushPassword");
            return (Criteria) this;
        }

        public Criteria andEncryptedRushPasswordLessThanOrEqualTo(String value) {
            addCriterion("encrypted_rush_password <=", value, "encryptedRushPassword");
            return (Criteria) this;
        }

        public Criteria andEncryptedRushPasswordLike(String value) {
            addCriterion("encrypted_rush_password like", value, "encryptedRushPassword");
            return (Criteria) this;
        }

        public Criteria andEncryptedRushPasswordNotLike(String value) {
            addCriterion("encrypted_rush_password not like", value, "encryptedRushPassword");
            return (Criteria) this;
        }

        public Criteria andEncryptedRushPasswordIn(List<String> values) {
            addCriterion("encrypted_rush_password in", values, "encryptedRushPassword");
            return (Criteria) this;
        }

        public Criteria andEncryptedRushPasswordNotIn(List<String> values) {
            addCriterion("encrypted_rush_password not in", values, "encryptedRushPassword");
            return (Criteria) this;
        }

        public Criteria andEncryptedRushPasswordBetween(String value1, String value2) {
            addCriterion("encrypted_rush_password between", value1, value2, "encryptedRushPassword");
            return (Criteria) this;
        }

        public Criteria andEncryptedRushPasswordNotBetween(String value1, String value2) {
            addCriterion("encrypted_rush_password not between", value1, value2, "encryptedRushPassword");
            return (Criteria) this;
        }

        public Criteria andEncryptedMailRefreshTokenIsNull() {
            addCriterion("encrypted_mail_refresh_token is null");
            return (Criteria) this;
        }

        public Criteria andEncryptedMailRefreshTokenIsNotNull() {
            addCriterion("encrypted_mail_refresh_token is not null");
            return (Criteria) this;
        }

        public Criteria andEncryptedMailRefreshTokenEqualTo(String value) {
            addCriterion("encrypted_mail_refresh_token =", value, "encryptedMailRefreshToken");
            return (Criteria) this;
        }

        public Criteria andEncryptedMailRefreshTokenNotEqualTo(String value) {
            addCriterion("encrypted_mail_refresh_token <>", value, "encryptedMailRefreshToken");
            return (Criteria) this;
        }

        public Criteria andEncryptedMailRefreshTokenGreaterThan(String value) {
            addCriterion("encrypted_mail_refresh_token >", value, "encryptedMailRefreshToken");
            return (Criteria) this;
        }

        public Criteria andEncryptedMailRefreshTokenGreaterThanOrEqualTo(String value) {
            addCriterion("encrypted_mail_refresh_token >=", value, "encryptedMailRefreshToken");
            return (Criteria) this;
        }

        public Criteria andEncryptedMailRefreshTokenLessThan(String value) {
            addCriterion("encrypted_mail_refresh_token <", value, "encryptedMailRefreshToken");
            return (Criteria) this;
        }

        public Criteria andEncryptedMailRefreshTokenLessThanOrEqualTo(String value) {
            addCriterion("encrypted_mail_refresh_token <=", value, "encryptedMailRefreshToken");
            return (Criteria) this;
        }

        public Criteria andEncryptedMailRefreshTokenLike(String value) {
            addCriterion("encrypted_mail_refresh_token like", value, "encryptedMailRefreshToken");
            return (Criteria) this;
        }

        public Criteria andEncryptedMailRefreshTokenNotLike(String value) {
            addCriterion("encrypted_mail_refresh_token not like", value, "encryptedMailRefreshToken");
            return (Criteria) this;
        }

        public Criteria andEncryptedMailRefreshTokenIn(List<String> values) {
            addCriterion("encrypted_mail_refresh_token in", values, "encryptedMailRefreshToken");
            return (Criteria) this;
        }

        public Criteria andEncryptedMailRefreshTokenNotIn(List<String> values) {
            addCriterion("encrypted_mail_refresh_token not in", values, "encryptedMailRefreshToken");
            return (Criteria) this;
        }

        public Criteria andEncryptedMailRefreshTokenBetween(String value1, String value2) {
            addCriterion("encrypted_mail_refresh_token between", value1, value2, "encryptedMailRefreshToken");
            return (Criteria) this;
        }

        public Criteria andEncryptedMailRefreshTokenNotBetween(String value1, String value2) {
            addCriterion("encrypted_mail_refresh_token not between", value1, value2, "encryptedMailRefreshToken");
            return (Criteria) this;
        }

        public Criteria andEncryptMailAccessTokenIsNull() {
            addCriterion("encrypt_mail_access_token is null");
            return (Criteria) this;
        }

        public Criteria andEncryptMailAccessTokenIsNotNull() {
            addCriterion("encrypt_mail_access_token is not null");
            return (Criteria) this;
        }

        public Criteria andEncryptMailAccessTokenEqualTo(String value) {
            addCriterion("encrypt_mail_access_token =", value, "encryptMailAccessToken");
            return (Criteria) this;
        }

        public Criteria andEncryptMailAccessTokenNotEqualTo(String value) {
            addCriterion("encrypt_mail_access_token <>", value, "encryptMailAccessToken");
            return (Criteria) this;
        }

        public Criteria andEncryptMailAccessTokenGreaterThan(String value) {
            addCriterion("encrypt_mail_access_token >", value, "encryptMailAccessToken");
            return (Criteria) this;
        }

        public Criteria andEncryptMailAccessTokenGreaterThanOrEqualTo(String value) {
            addCriterion("encrypt_mail_access_token >=", value, "encryptMailAccessToken");
            return (Criteria) this;
        }

        public Criteria andEncryptMailAccessTokenLessThan(String value) {
            addCriterion("encrypt_mail_access_token <", value, "encryptMailAccessToken");
            return (Criteria) this;
        }

        public Criteria andEncryptMailAccessTokenLessThanOrEqualTo(String value) {
            addCriterion("encrypt_mail_access_token <=", value, "encryptMailAccessToken");
            return (Criteria) this;
        }

        public Criteria andEncryptMailAccessTokenLike(String value) {
            addCriterion("encrypt_mail_access_token like", value, "encryptMailAccessToken");
            return (Criteria) this;
        }

        public Criteria andEncryptMailAccessTokenNotLike(String value) {
            addCriterion("encrypt_mail_access_token not like", value, "encryptMailAccessToken");
            return (Criteria) this;
        }

        public Criteria andEncryptMailAccessTokenIn(List<String> values) {
            addCriterion("encrypt_mail_access_token in", values, "encryptMailAccessToken");
            return (Criteria) this;
        }

        public Criteria andEncryptMailAccessTokenNotIn(List<String> values) {
            addCriterion("encrypt_mail_access_token not in", values, "encryptMailAccessToken");
            return (Criteria) this;
        }

        public Criteria andEncryptMailAccessTokenBetween(String value1, String value2) {
            addCriterion("encrypt_mail_access_token between", value1, value2, "encryptMailAccessToken");
            return (Criteria) this;
        }

        public Criteria andEncryptMailAccessTokenNotBetween(String value1, String value2) {
            addCriterion("encrypt_mail_access_token not between", value1, value2, "encryptMailAccessToken");
            return (Criteria) this;
        }

        public Criteria andNicknameIsNull() {
            addCriterion("nickname is null");
            return (Criteria) this;
        }

        public Criteria andNicknameIsNotNull() {
            addCriterion("nickname is not null");
            return (Criteria) this;
        }

        public Criteria andNicknameEqualTo(String value) {
            addCriterion("nickname =", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotEqualTo(String value) {
            addCriterion("nickname <>", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameGreaterThan(String value) {
            addCriterion("nickname >", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameGreaterThanOrEqualTo(String value) {
            addCriterion("nickname >=", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameLessThan(String value) {
            addCriterion("nickname <", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameLessThanOrEqualTo(String value) {
            addCriterion("nickname <=", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameLike(String value) {
            addCriterion("nickname like", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotLike(String value) {
            addCriterion("nickname not like", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameIn(List<String> values) {
            addCriterion("nickname in", values, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotIn(List<String> values) {
            addCriterion("nickname not in", values, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameBetween(String value1, String value2) {
            addCriterion("nickname between", value1, value2, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotBetween(String value1, String value2) {
            addCriterion("nickname not between", value1, value2, "nickname");
            return (Criteria) this;
        }

        public Criteria andCompanyIdIsNull() {
            addCriterion("company_id is null");
            return (Criteria) this;
        }

        public Criteria andCompanyIdIsNotNull() {
            addCriterion("company_id is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyIdEqualTo(Integer value) {
            addCriterion("company_id =", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotEqualTo(Integer value) {
            addCriterion("company_id <>", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdGreaterThan(Integer value) {
            addCriterion("company_id >", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("company_id >=", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdLessThan(Integer value) {
            addCriterion("company_id <", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdLessThanOrEqualTo(Integer value) {
            addCriterion("company_id <=", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdIn(List<Integer> values) {
            addCriterion("company_id in", values, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotIn(List<Integer> values) {
            addCriterion("company_id not in", values, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdBetween(Integer value1, Integer value2) {
            addCriterion("company_id between", value1, value2, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotBetween(Integer value1, Integer value2) {
            addCriterion("company_id not between", value1, value2, "companyId");
            return (Criteria) this;
        }

        public Criteria andOrganizationIdIsNull() {
            addCriterion("organization_id is null");
            return (Criteria) this;
        }

        public Criteria andOrganizationIdIsNotNull() {
            addCriterion("organization_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrganizationIdEqualTo(Integer value) {
            addCriterion("organization_id =", value, "organizationId");
            return (Criteria) this;
        }

        public Criteria andOrganizationIdNotEqualTo(Integer value) {
            addCriterion("organization_id <>", value, "organizationId");
            return (Criteria) this;
        }

        public Criteria andOrganizationIdGreaterThan(Integer value) {
            addCriterion("organization_id >", value, "organizationId");
            return (Criteria) this;
        }

        public Criteria andOrganizationIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("organization_id >=", value, "organizationId");
            return (Criteria) this;
        }

        public Criteria andOrganizationIdLessThan(Integer value) {
            addCriterion("organization_id <", value, "organizationId");
            return (Criteria) this;
        }

        public Criteria andOrganizationIdLessThanOrEqualTo(Integer value) {
            addCriterion("organization_id <=", value, "organizationId");
            return (Criteria) this;
        }

        public Criteria andOrganizationIdIn(List<Integer> values) {
            addCriterion("organization_id in", values, "organizationId");
            return (Criteria) this;
        }

        public Criteria andOrganizationIdNotIn(List<Integer> values) {
            addCriterion("organization_id not in", values, "organizationId");
            return (Criteria) this;
        }

        public Criteria andOrganizationIdBetween(Integer value1, Integer value2) {
            addCriterion("organization_id between", value1, value2, "organizationId");
            return (Criteria) this;
        }

        public Criteria andOrganizationIdNotBetween(Integer value1, Integer value2) {
            addCriterion("organization_id not between", value1, value2, "organizationId");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNull() {
            addCriterion("birthday is null");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNotNull() {
            addCriterion("birthday is not null");
            return (Criteria) this;
        }

        public Criteria andBirthdayEqualTo(Date value) {
            addCriterionForJDBCDate("birthday =", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotEqualTo(Date value) {
            addCriterionForJDBCDate("birthday <>", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThan(Date value) {
            addCriterionForJDBCDate("birthday >", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("birthday >=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThan(Date value) {
            addCriterionForJDBCDate("birthday <", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("birthday <=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayIn(List<Date> values) {
            addCriterionForJDBCDate("birthday in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotIn(List<Date> values) {
            addCriterionForJDBCDate("birthday not in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("birthday between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("birthday not between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andGenderIsNull() {
            addCriterion("gender is null");
            return (Criteria) this;
        }

        public Criteria andGenderIsNotNull() {
            addCriterion("gender is not null");
            return (Criteria) this;
        }

        public Criteria andGenderEqualTo(String value) {
            addCriterion("gender =", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotEqualTo(String value) {
            addCriterion("gender <>", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThan(String value) {
            addCriterion("gender >", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThanOrEqualTo(String value) {
            addCriterion("gender >=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThan(String value) {
            addCriterion("gender <", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThanOrEqualTo(String value) {
            addCriterion("gender <=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLike(String value) {
            addCriterion("gender like", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotLike(String value) {
            addCriterion("gender not like", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderIn(List<String> values) {
            addCriterion("gender in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotIn(List<String> values) {
            addCriterion("gender not in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderBetween(String value1, String value2) {
            addCriterion("gender between", value1, value2, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotBetween(String value1, String value2) {
            addCriterion("gender not between", value1, value2, "gender");
            return (Criteria) this;
        }

        public Criteria andCreatedAtIsNull() {
            addCriterion("created_at is null");
            return (Criteria) this;
        }

        public Criteria andCreatedAtIsNotNull() {
            addCriterion("created_at is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedAtEqualTo(Date value) {
            addCriterion("created_at =", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotEqualTo(Date value) {
            addCriterion("created_at <>", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtGreaterThan(Date value) {
            addCriterion("created_at >", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtGreaterThanOrEqualTo(Date value) {
            addCriterion("created_at >=", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtLessThan(Date value) {
            addCriterion("created_at <", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtLessThanOrEqualTo(Date value) {
            addCriterion("created_at <=", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtIn(List<Date> values) {
            addCriterion("created_at in", values, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotIn(List<Date> values) {
            addCriterion("created_at not in", values, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtBetween(Date value1, Date value2) {
            addCriterion("created_at between", value1, value2, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotBetween(Date value1, Date value2) {
            addCriterion("created_at not between", value1, value2, "createdAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtIsNull() {
            addCriterion("updated_at is null");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtIsNotNull() {
            addCriterion("updated_at is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtEqualTo(Date value) {
            addCriterion("updated_at =", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtNotEqualTo(Date value) {
            addCriterion("updated_at <>", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtGreaterThan(Date value) {
            addCriterion("updated_at >", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtGreaterThanOrEqualTo(Date value) {
            addCriterion("updated_at >=", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtLessThan(Date value) {
            addCriterion("updated_at <", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtLessThanOrEqualTo(Date value) {
            addCriterion("updated_at <=", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtIn(List<Date> values) {
            addCriterion("updated_at in", values, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtNotIn(List<Date> values) {
            addCriterion("updated_at not in", values, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtBetween(Date value1, Date value2) {
            addCriterion("updated_at between", value1, value2, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtNotBetween(Date value1, Date value2) {
            addCriterion("updated_at not between", value1, value2, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andSaltIsNull() {
            addCriterion("salt is null");
            return (Criteria) this;
        }

        public Criteria andSaltIsNotNull() {
            addCriterion("salt is not null");
            return (Criteria) this;
        }

        public Criteria andSaltEqualTo(String value) {
            addCriterion("salt =", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltNotEqualTo(String value) {
            addCriterion("salt <>", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltGreaterThan(String value) {
            addCriterion("salt >", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltGreaterThanOrEqualTo(String value) {
            addCriterion("salt >=", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltLessThan(String value) {
            addCriterion("salt <", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltLessThanOrEqualTo(String value) {
            addCriterion("salt <=", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltLike(String value) {
            addCriterion("salt like", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltNotLike(String value) {
            addCriterion("salt not like", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltIn(List<String> values) {
            addCriterion("salt in", values, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltNotIn(List<String> values) {
            addCriterion("salt not in", values, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltBetween(String value1, String value2) {
            addCriterion("salt between", value1, value2, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltNotBetween(String value1, String value2) {
            addCriterion("salt not between", value1, value2, "salt");
            return (Criteria) this;
        }

        public Criteria andAvatarUrlIsNull() {
            addCriterion("avatar_url is null");
            return (Criteria) this;
        }

        public Criteria andAvatarUrlIsNotNull() {
            addCriterion("avatar_url is not null");
            return (Criteria) this;
        }

        public Criteria andAvatarUrlEqualTo(String value) {
            addCriterion("avatar_url =", value, "avatarUrl");
            return (Criteria) this;
        }

        public Criteria andAvatarUrlNotEqualTo(String value) {
            addCriterion("avatar_url <>", value, "avatarUrl");
            return (Criteria) this;
        }

        public Criteria andAvatarUrlGreaterThan(String value) {
            addCriterion("avatar_url >", value, "avatarUrl");
            return (Criteria) this;
        }

        public Criteria andAvatarUrlGreaterThanOrEqualTo(String value) {
            addCriterion("avatar_url >=", value, "avatarUrl");
            return (Criteria) this;
        }

        public Criteria andAvatarUrlLessThan(String value) {
            addCriterion("avatar_url <", value, "avatarUrl");
            return (Criteria) this;
        }

        public Criteria andAvatarUrlLessThanOrEqualTo(String value) {
            addCriterion("avatar_url <=", value, "avatarUrl");
            return (Criteria) this;
        }

        public Criteria andAvatarUrlLike(String value) {
            addCriterion("avatar_url like", value, "avatarUrl");
            return (Criteria) this;
        }

        public Criteria andAvatarUrlNotLike(String value) {
            addCriterion("avatar_url not like", value, "avatarUrl");
            return (Criteria) this;
        }

        public Criteria andAvatarUrlIn(List<String> values) {
            addCriterion("avatar_url in", values, "avatarUrl");
            return (Criteria) this;
        }

        public Criteria andAvatarUrlNotIn(List<String> values) {
            addCriterion("avatar_url not in", values, "avatarUrl");
            return (Criteria) this;
        }

        public Criteria andAvatarUrlBetween(String value1, String value2) {
            addCriterion("avatar_url between", value1, value2, "avatarUrl");
            return (Criteria) this;
        }

        public Criteria andAvatarUrlNotBetween(String value1, String value2) {
            addCriterion("avatar_url not between", value1, value2, "avatarUrl");
            return (Criteria) this;
        }

        public Criteria andAvatarThumbnailUrlIsNull() {
            addCriterion("avatar_thumbnail_url is null");
            return (Criteria) this;
        }

        public Criteria andAvatarThumbnailUrlIsNotNull() {
            addCriterion("avatar_thumbnail_url is not null");
            return (Criteria) this;
        }

        public Criteria andAvatarThumbnailUrlEqualTo(String value) {
            addCriterion("avatar_thumbnail_url =", value, "avatarThumbnailUrl");
            return (Criteria) this;
        }

        public Criteria andAvatarThumbnailUrlNotEqualTo(String value) {
            addCriterion("avatar_thumbnail_url <>", value, "avatarThumbnailUrl");
            return (Criteria) this;
        }

        public Criteria andAvatarThumbnailUrlGreaterThan(String value) {
            addCriterion("avatar_thumbnail_url >", value, "avatarThumbnailUrl");
            return (Criteria) this;
        }

        public Criteria andAvatarThumbnailUrlGreaterThanOrEqualTo(String value) {
            addCriterion("avatar_thumbnail_url >=", value, "avatarThumbnailUrl");
            return (Criteria) this;
        }

        public Criteria andAvatarThumbnailUrlLessThan(String value) {
            addCriterion("avatar_thumbnail_url <", value, "avatarThumbnailUrl");
            return (Criteria) this;
        }

        public Criteria andAvatarThumbnailUrlLessThanOrEqualTo(String value) {
            addCriterion("avatar_thumbnail_url <=", value, "avatarThumbnailUrl");
            return (Criteria) this;
        }

        public Criteria andAvatarThumbnailUrlLike(String value) {
            addCriterion("avatar_thumbnail_url like", value, "avatarThumbnailUrl");
            return (Criteria) this;
        }

        public Criteria andAvatarThumbnailUrlNotLike(String value) {
            addCriterion("avatar_thumbnail_url not like", value, "avatarThumbnailUrl");
            return (Criteria) this;
        }

        public Criteria andAvatarThumbnailUrlIn(List<String> values) {
            addCriterion("avatar_thumbnail_url in", values, "avatarThumbnailUrl");
            return (Criteria) this;
        }

        public Criteria andAvatarThumbnailUrlNotIn(List<String> values) {
            addCriterion("avatar_thumbnail_url not in", values, "avatarThumbnailUrl");
            return (Criteria) this;
        }

        public Criteria andAvatarThumbnailUrlBetween(String value1, String value2) {
            addCriterion("avatar_thumbnail_url between", value1, value2, "avatarThumbnailUrl");
            return (Criteria) this;
        }

        public Criteria andAvatarThumbnailUrlNotBetween(String value1, String value2) {
            addCriterion("avatar_thumbnail_url not between", value1, value2, "avatarThumbnailUrl");
            return (Criteria) this;
        }

        public Criteria andSignatureIsNull() {
            addCriterion("signature is null");
            return (Criteria) this;
        }

        public Criteria andSignatureIsNotNull() {
            addCriterion("signature is not null");
            return (Criteria) this;
        }

        public Criteria andSignatureEqualTo(String value) {
            addCriterion("signature =", value, "signature");
            return (Criteria) this;
        }

        public Criteria andSignatureNotEqualTo(String value) {
            addCriterion("signature <>", value, "signature");
            return (Criteria) this;
        }

        public Criteria andSignatureGreaterThan(String value) {
            addCriterion("signature >", value, "signature");
            return (Criteria) this;
        }

        public Criteria andSignatureGreaterThanOrEqualTo(String value) {
            addCriterion("signature >=", value, "signature");
            return (Criteria) this;
        }

        public Criteria andSignatureLessThan(String value) {
            addCriterion("signature <", value, "signature");
            return (Criteria) this;
        }

        public Criteria andSignatureLessThanOrEqualTo(String value) {
            addCriterion("signature <=", value, "signature");
            return (Criteria) this;
        }

        public Criteria andSignatureLike(String value) {
            addCriterion("signature like", value, "signature");
            return (Criteria) this;
        }

        public Criteria andSignatureNotLike(String value) {
            addCriterion("signature not like", value, "signature");
            return (Criteria) this;
        }

        public Criteria andSignatureIn(List<String> values) {
            addCriterion("signature in", values, "signature");
            return (Criteria) this;
        }

        public Criteria andSignatureNotIn(List<String> values) {
            addCriterion("signature not in", values, "signature");
            return (Criteria) this;
        }

        public Criteria andSignatureBetween(String value1, String value2) {
            addCriterion("signature between", value1, value2, "signature");
            return (Criteria) this;
        }

        public Criteria andSignatureNotBetween(String value1, String value2) {
            addCriterion("signature not between", value1, value2, "signature");
            return (Criteria) this;
        }

        public Criteria andIsRegisterIsNull() {
            addCriterion("is_register is null");
            return (Criteria) this;
        }

        public Criteria andIsRegisterIsNotNull() {
            addCriterion("is_register is not null");
            return (Criteria) this;
        }

        public Criteria andIsRegisterEqualTo(Boolean value) {
            addCriterion("is_register =", value, "isRegister");
            return (Criteria) this;
        }

        public Criteria andIsRegisterNotEqualTo(Boolean value) {
            addCriterion("is_register <>", value, "isRegister");
            return (Criteria) this;
        }

        public Criteria andIsRegisterGreaterThan(Boolean value) {
            addCriterion("is_register >", value, "isRegister");
            return (Criteria) this;
        }

        public Criteria andIsRegisterGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_register >=", value, "isRegister");
            return (Criteria) this;
        }

        public Criteria andIsRegisterLessThan(Boolean value) {
            addCriterion("is_register <", value, "isRegister");
            return (Criteria) this;
        }

        public Criteria andIsRegisterLessThanOrEqualTo(Boolean value) {
            addCriterion("is_register <=", value, "isRegister");
            return (Criteria) this;
        }

        public Criteria andIsRegisterIn(List<Boolean> values) {
            addCriterion("is_register in", values, "isRegister");
            return (Criteria) this;
        }

        public Criteria andIsRegisterNotIn(List<Boolean> values) {
            addCriterion("is_register not in", values, "isRegister");
            return (Criteria) this;
        }

        public Criteria andIsRegisterBetween(Boolean value1, Boolean value2) {
            addCriterion("is_register between", value1, value2, "isRegister");
            return (Criteria) this;
        }

        public Criteria andIsRegisterNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_register not between", value1, value2, "isRegister");
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

        public Criteria andIsDeleteEqualTo(Boolean value) {
            addCriterion("is_delete =", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotEqualTo(Boolean value) {
            addCriterion("is_delete <>", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteGreaterThan(Boolean value) {
            addCriterion("is_delete >", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_delete >=", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteLessThan(Boolean value) {
            addCriterion("is_delete <", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteLessThanOrEqualTo(Boolean value) {
            addCriterion("is_delete <=", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteIn(List<Boolean> values) {
            addCriterion("is_delete in", values, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotIn(List<Boolean> values) {
            addCriterion("is_delete not in", values, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteBetween(Boolean value1, Boolean value2) {
            addCriterion("is_delete between", value1, value2, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_delete not between", value1, value2, "isDelete");
            return (Criteria) this;
        }

        public Criteria andRolesIsNull() {
            addCriterion("roles is null");
            return (Criteria) this;
        }

        public Criteria andRolesIsNotNull() {
            addCriterion("roles is not null");
            return (Criteria) this;
        }

        public Criteria andRolesEqualTo(String value) {
            addCriterion("roles =", value, "roles");
            return (Criteria) this;
        }

        public Criteria andRolesNotEqualTo(String value) {
            addCriterion("roles <>", value, "roles");
            return (Criteria) this;
        }

        public Criteria andRolesGreaterThan(String value) {
            addCriterion("roles >", value, "roles");
            return (Criteria) this;
        }

        public Criteria andRolesGreaterThanOrEqualTo(String value) {
            addCriterion("roles >=", value, "roles");
            return (Criteria) this;
        }

        public Criteria andRolesLessThan(String value) {
            addCriterion("roles <", value, "roles");
            return (Criteria) this;
        }

        public Criteria andRolesLessThanOrEqualTo(String value) {
            addCriterion("roles <=", value, "roles");
            return (Criteria) this;
        }

        public Criteria andRolesLike(String value) {
            addCriterion("roles like", value, "roles");
            return (Criteria) this;
        }

        public Criteria andRolesNotLike(String value) {
            addCriterion("roles not like", value, "roles");
            return (Criteria) this;
        }

        public Criteria andRolesIn(List<String> values) {
            addCriterion("roles in", values, "roles");
            return (Criteria) this;
        }

        public Criteria andRolesNotIn(List<String> values) {
            addCriterion("roles not in", values, "roles");
            return (Criteria) this;
        }

        public Criteria andRolesBetween(String value1, String value2) {
            addCriterion("roles between", value1, value2, "roles");
            return (Criteria) this;
        }

        public Criteria andRolesNotBetween(String value1, String value2) {
            addCriterion("roles not between", value1, value2, "roles");
            return (Criteria) this;
        }

        public Criteria andCityIsNull() {
            addCriterion("city is null");
            return (Criteria) this;
        }

        public Criteria andCityIsNotNull() {
            addCriterion("city is not null");
            return (Criteria) this;
        }

        public Criteria andCityEqualTo(String value) {
            addCriterion("city =", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotEqualTo(String value) {
            addCriterion("city <>", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThan(String value) {
            addCriterion("city >", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThanOrEqualTo(String value) {
            addCriterion("city >=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThan(String value) {
            addCriterion("city <", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThanOrEqualTo(String value) {
            addCriterion("city <=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLike(String value) {
            addCriterion("city like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotLike(String value) {
            addCriterion("city not like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityIn(List<String> values) {
            addCriterion("city in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotIn(List<String> values) {
            addCriterion("city not in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityBetween(String value1, String value2) {
            addCriterion("city between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotBetween(String value1, String value2) {
            addCriterion("city not between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andInterestsIsNull() {
            addCriterion("interests is null");
            return (Criteria) this;
        }

        public Criteria andInterestsIsNotNull() {
            addCriterion("interests is not null");
            return (Criteria) this;
        }

        public Criteria andInterestsEqualTo(String value) {
            addCriterion("interests =", value, "interests");
            return (Criteria) this;
        }

        public Criteria andInterestsNotEqualTo(String value) {
            addCriterion("interests <>", value, "interests");
            return (Criteria) this;
        }

        public Criteria andInterestsGreaterThan(String value) {
            addCriterion("interests >", value, "interests");
            return (Criteria) this;
        }

        public Criteria andInterestsGreaterThanOrEqualTo(String value) {
            addCriterion("interests >=", value, "interests");
            return (Criteria) this;
        }

        public Criteria andInterestsLessThan(String value) {
            addCriterion("interests <", value, "interests");
            return (Criteria) this;
        }

        public Criteria andInterestsLessThanOrEqualTo(String value) {
            addCriterion("interests <=", value, "interests");
            return (Criteria) this;
        }

        public Criteria andInterestsLike(String value) {
            addCriterion("interests like", value, "interests");
            return (Criteria) this;
        }

        public Criteria andInterestsNotLike(String value) {
            addCriterion("interests not like", value, "interests");
            return (Criteria) this;
        }

        public Criteria andInterestsIn(List<String> values) {
            addCriterion("interests in", values, "interests");
            return (Criteria) this;
        }

        public Criteria andInterestsNotIn(List<String> values) {
            addCriterion("interests not in", values, "interests");
            return (Criteria) this;
        }

        public Criteria andInterestsBetween(String value1, String value2) {
            addCriterion("interests between", value1, value2, "interests");
            return (Criteria) this;
        }

        public Criteria andInterestsNotBetween(String value1, String value2) {
            addCriterion("interests not between", value1, value2, "interests");
            return (Criteria) this;
        }

        public Criteria andCompanyIsNull() {
            addCriterion("company is null");
            return (Criteria) this;
        }

        public Criteria andCompanyIsNotNull() {
            addCriterion("company is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyEqualTo(String value) {
            addCriterion("company =", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyNotEqualTo(String value) {
            addCriterion("company <>", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyGreaterThan(String value) {
            addCriterion("company >", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyGreaterThanOrEqualTo(String value) {
            addCriterion("company >=", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyLessThan(String value) {
            addCriterion("company <", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyLessThanOrEqualTo(String value) {
            addCriterion("company <=", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyLike(String value) {
            addCriterion("company like", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyNotLike(String value) {
            addCriterion("company not like", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyIn(List<String> values) {
            addCriterion("company in", values, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyNotIn(List<String> values) {
            addCriterion("company not in", values, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyBetween(String value1, String value2) {
            addCriterion("company between", value1, value2, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyNotBetween(String value1, String value2) {
            addCriterion("company not between", value1, value2, "company");
            return (Criteria) this;
        }

        public Criteria andDomainCompanyIsNull() {
            addCriterion("domain_company is null");
            return (Criteria) this;
        }

        public Criteria andDomainCompanyIsNotNull() {
            addCriterion("domain_company is not null");
            return (Criteria) this;
        }

        public Criteria andDomainCompanyEqualTo(String value) {
            addCriterion("domain_company =", value, "domainCompany");
            return (Criteria) this;
        }

        public Criteria andDomainCompanyNotEqualTo(String value) {
            addCriterion("domain_company <>", value, "domainCompany");
            return (Criteria) this;
        }

        public Criteria andDomainCompanyGreaterThan(String value) {
            addCriterion("domain_company >", value, "domainCompany");
            return (Criteria) this;
        }

        public Criteria andDomainCompanyGreaterThanOrEqualTo(String value) {
            addCriterion("domain_company >=", value, "domainCompany");
            return (Criteria) this;
        }

        public Criteria andDomainCompanyLessThan(String value) {
            addCriterion("domain_company <", value, "domainCompany");
            return (Criteria) this;
        }

        public Criteria andDomainCompanyLessThanOrEqualTo(String value) {
            addCriterion("domain_company <=", value, "domainCompany");
            return (Criteria) this;
        }

        public Criteria andDomainCompanyLike(String value) {
            addCriterion("domain_company like", value, "domainCompany");
            return (Criteria) this;
        }

        public Criteria andDomainCompanyNotLike(String value) {
            addCriterion("domain_company not like", value, "domainCompany");
            return (Criteria) this;
        }

        public Criteria andDomainCompanyIn(List<String> values) {
            addCriterion("domain_company in", values, "domainCompany");
            return (Criteria) this;
        }

        public Criteria andDomainCompanyNotIn(List<String> values) {
            addCriterion("domain_company not in", values, "domainCompany");
            return (Criteria) this;
        }

        public Criteria andDomainCompanyBetween(String value1, String value2) {
            addCriterion("domain_company between", value1, value2, "domainCompany");
            return (Criteria) this;
        }

        public Criteria andDomainCompanyNotBetween(String value1, String value2) {
            addCriterion("domain_company not between", value1, value2, "domainCompany");
            return (Criteria) this;
        }

        public Criteria andEntryIsNull() {
            addCriterion("entry is null");
            return (Criteria) this;
        }

        public Criteria andEntryIsNotNull() {
            addCriterion("entry is not null");
            return (Criteria) this;
        }

        public Criteria andEntryEqualTo(Integer value) {
            addCriterion("entry =", value, "entry");
            return (Criteria) this;
        }

        public Criteria andEntryNotEqualTo(Integer value) {
            addCriterion("entry <>", value, "entry");
            return (Criteria) this;
        }

        public Criteria andEntryGreaterThan(Integer value) {
            addCriterion("entry >", value, "entry");
            return (Criteria) this;
        }

        public Criteria andEntryGreaterThanOrEqualTo(Integer value) {
            addCriterion("entry >=", value, "entry");
            return (Criteria) this;
        }

        public Criteria andEntryLessThan(Integer value) {
            addCriterion("entry <", value, "entry");
            return (Criteria) this;
        }

        public Criteria andEntryLessThanOrEqualTo(Integer value) {
            addCriterion("entry <=", value, "entry");
            return (Criteria) this;
        }

        public Criteria andEntryIn(List<Integer> values) {
            addCriterion("entry in", values, "entry");
            return (Criteria) this;
        }

        public Criteria andEntryNotIn(List<Integer> values) {
            addCriterion("entry not in", values, "entry");
            return (Criteria) this;
        }

        public Criteria andEntryBetween(Integer value1, Integer value2) {
            addCriterion("entry between", value1, value2, "entry");
            return (Criteria) this;
        }

        public Criteria andEntryNotBetween(Integer value1, Integer value2) {
            addCriterion("entry not between", value1, value2, "entry");
            return (Criteria) this;
        }

        public Criteria andIsFreezeIsNull() {
            addCriterion("is_freeze is null");
            return (Criteria) this;
        }

        public Criteria andIsFreezeIsNotNull() {
            addCriterion("is_freeze is not null");
            return (Criteria) this;
        }

        public Criteria andIsFreezeEqualTo(Boolean value) {
            addCriterion("is_freeze =", value, "isFreeze");
            return (Criteria) this;
        }

        public Criteria andIsFreezeNotEqualTo(Boolean value) {
            addCriterion("is_freeze <>", value, "isFreeze");
            return (Criteria) this;
        }

        public Criteria andIsFreezeGreaterThan(Boolean value) {
            addCriterion("is_freeze >", value, "isFreeze");
            return (Criteria) this;
        }

        public Criteria andIsFreezeGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_freeze >=", value, "isFreeze");
            return (Criteria) this;
        }

        public Criteria andIsFreezeLessThan(Boolean value) {
            addCriterion("is_freeze <", value, "isFreeze");
            return (Criteria) this;
        }

        public Criteria andIsFreezeLessThanOrEqualTo(Boolean value) {
            addCriterion("is_freeze <=", value, "isFreeze");
            return (Criteria) this;
        }

        public Criteria andIsFreezeIn(List<Boolean> values) {
            addCriterion("is_freeze in", values, "isFreeze");
            return (Criteria) this;
        }

        public Criteria andIsFreezeNotIn(List<Boolean> values) {
            addCriterion("is_freeze not in", values, "isFreeze");
            return (Criteria) this;
        }

        public Criteria andIsFreezeBetween(Boolean value1, Boolean value2) {
            addCriterion("is_freeze between", value1, value2, "isFreeze");
            return (Criteria) this;
        }

        public Criteria andIsFreezeNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_freeze not between", value1, value2, "isFreeze");
            return (Criteria) this;
        }

        public Criteria andIsActiveIsNull() {
            addCriterion("is_active is null");
            return (Criteria) this;
        }

        public Criteria andIsActiveIsNotNull() {
            addCriterion("is_active is not null");
            return (Criteria) this;
        }

        public Criteria andIsActiveEqualTo(Boolean value) {
            addCriterion("is_active =", value, "isActive");
            return (Criteria) this;
        }

        public Criteria andIsActiveNotEqualTo(Boolean value) {
            addCriterion("is_active <>", value, "isActive");
            return (Criteria) this;
        }

        public Criteria andIsActiveGreaterThan(Boolean value) {
            addCriterion("is_active >", value, "isActive");
            return (Criteria) this;
        }

        public Criteria andIsActiveGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_active >=", value, "isActive");
            return (Criteria) this;
        }

        public Criteria andIsActiveLessThan(Boolean value) {
            addCriterion("is_active <", value, "isActive");
            return (Criteria) this;
        }

        public Criteria andIsActiveLessThanOrEqualTo(Boolean value) {
            addCriterion("is_active <=", value, "isActive");
            return (Criteria) this;
        }

        public Criteria andIsActiveIn(List<Boolean> values) {
            addCriterion("is_active in", values, "isActive");
            return (Criteria) this;
        }

        public Criteria andIsActiveNotIn(List<Boolean> values) {
            addCriterion("is_active not in", values, "isActive");
            return (Criteria) this;
        }

        public Criteria andIsActiveBetween(Boolean value1, Boolean value2) {
            addCriterion("is_active between", value1, value2, "isActive");
            return (Criteria) this;
        }

        public Criteria andIsActiveNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_active not between", value1, value2, "isActive");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberIsNull() {
            addCriterion("phone_number is null");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberIsNotNull() {
            addCriterion("phone_number is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberEqualTo(String value) {
            addCriterion("phone_number =", value, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberNotEqualTo(String value) {
            addCriterion("phone_number <>", value, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberGreaterThan(String value) {
            addCriterion("phone_number >", value, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberGreaterThanOrEqualTo(String value) {
            addCriterion("phone_number >=", value, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberLessThan(String value) {
            addCriterion("phone_number <", value, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberLessThanOrEqualTo(String value) {
            addCriterion("phone_number <=", value, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberLike(String value) {
            addCriterion("phone_number like", value, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberNotLike(String value) {
            addCriterion("phone_number not like", value, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberIn(List<String> values) {
            addCriterion("phone_number in", values, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberNotIn(List<String> values) {
            addCriterion("phone_number not in", values, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberBetween(String value1, String value2) {
            addCriterion("phone_number between", value1, value2, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberNotBetween(String value1, String value2) {
            addCriterion("phone_number not between", value1, value2, "phoneNumber");
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