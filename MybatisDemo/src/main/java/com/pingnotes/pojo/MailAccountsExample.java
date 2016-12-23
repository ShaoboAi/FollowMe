package com.pingnotes.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MailAccountsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MailAccountsExample() {
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

        public Criteria andMailServerProfileIsNull() {
            addCriterion("mail_server_profile is null");
            return (Criteria) this;
        }

        public Criteria andMailServerProfileIsNotNull() {
            addCriterion("mail_server_profile is not null");
            return (Criteria) this;
        }

        public Criteria andMailServerProfileEqualTo(Integer value) {
            addCriterion("mail_server_profile =", value, "mailServerProfile");
            return (Criteria) this;
        }

        public Criteria andMailServerProfileNotEqualTo(Integer value) {
            addCriterion("mail_server_profile <>", value, "mailServerProfile");
            return (Criteria) this;
        }

        public Criteria andMailServerProfileGreaterThan(Integer value) {
            addCriterion("mail_server_profile >", value, "mailServerProfile");
            return (Criteria) this;
        }

        public Criteria andMailServerProfileGreaterThanOrEqualTo(Integer value) {
            addCriterion("mail_server_profile >=", value, "mailServerProfile");
            return (Criteria) this;
        }

        public Criteria andMailServerProfileLessThan(Integer value) {
            addCriterion("mail_server_profile <", value, "mailServerProfile");
            return (Criteria) this;
        }

        public Criteria andMailServerProfileLessThanOrEqualTo(Integer value) {
            addCriterion("mail_server_profile <=", value, "mailServerProfile");
            return (Criteria) this;
        }

        public Criteria andMailServerProfileIn(List<Integer> values) {
            addCriterion("mail_server_profile in", values, "mailServerProfile");
            return (Criteria) this;
        }

        public Criteria andMailServerProfileNotIn(List<Integer> values) {
            addCriterion("mail_server_profile not in", values, "mailServerProfile");
            return (Criteria) this;
        }

        public Criteria andMailServerProfileBetween(Integer value1, Integer value2) {
            addCriterion("mail_server_profile between", value1, value2, "mailServerProfile");
            return (Criteria) this;
        }

        public Criteria andMailServerProfileNotBetween(Integer value1, Integer value2) {
            addCriterion("mail_server_profile not between", value1, value2, "mailServerProfile");
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

        public Criteria andIsActivateIsNull() {
            addCriterion("is_activate is null");
            return (Criteria) this;
        }

        public Criteria andIsActivateIsNotNull() {
            addCriterion("is_activate is not null");
            return (Criteria) this;
        }

        public Criteria andIsActivateEqualTo(Boolean value) {
            addCriterion("is_activate =", value, "isActivate");
            return (Criteria) this;
        }

        public Criteria andIsActivateNotEqualTo(Boolean value) {
            addCriterion("is_activate <>", value, "isActivate");
            return (Criteria) this;
        }

        public Criteria andIsActivateGreaterThan(Boolean value) {
            addCriterion("is_activate >", value, "isActivate");
            return (Criteria) this;
        }

        public Criteria andIsActivateGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_activate >=", value, "isActivate");
            return (Criteria) this;
        }

        public Criteria andIsActivateLessThan(Boolean value) {
            addCriterion("is_activate <", value, "isActivate");
            return (Criteria) this;
        }

        public Criteria andIsActivateLessThanOrEqualTo(Boolean value) {
            addCriterion("is_activate <=", value, "isActivate");
            return (Criteria) this;
        }

        public Criteria andIsActivateIn(List<Boolean> values) {
            addCriterion("is_activate in", values, "isActivate");
            return (Criteria) this;
        }

        public Criteria andIsActivateNotIn(List<Boolean> values) {
            addCriterion("is_activate not in", values, "isActivate");
            return (Criteria) this;
        }

        public Criteria andIsActivateBetween(Boolean value1, Boolean value2) {
            addCriterion("is_activate between", value1, value2, "isActivate");
            return (Criteria) this;
        }

        public Criteria andIsActivateNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_activate not between", value1, value2, "isActivate");
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

        public Criteria andNickNameIsNull() {
            addCriterion("nick_name is null");
            return (Criteria) this;
        }

        public Criteria andNickNameIsNotNull() {
            addCriterion("nick_name is not null");
            return (Criteria) this;
        }

        public Criteria andNickNameEqualTo(String value) {
            addCriterion("nick_name =", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameNotEqualTo(String value) {
            addCriterion("nick_name <>", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameGreaterThan(String value) {
            addCriterion("nick_name >", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameGreaterThanOrEqualTo(String value) {
            addCriterion("nick_name >=", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameLessThan(String value) {
            addCriterion("nick_name <", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameLessThanOrEqualTo(String value) {
            addCriterion("nick_name <=", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameLike(String value) {
            addCriterion("nick_name like", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameNotLike(String value) {
            addCriterion("nick_name not like", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameIn(List<String> values) {
            addCriterion("nick_name in", values, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameNotIn(List<String> values) {
            addCriterion("nick_name not in", values, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameBetween(String value1, String value2) {
            addCriterion("nick_name between", value1, value2, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameNotBetween(String value1, String value2) {
            addCriterion("nick_name not between", value1, value2, "nickName");
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

        public Criteria andDomainUsernameIsNull() {
            addCriterion("domain_username is null");
            return (Criteria) this;
        }

        public Criteria andDomainUsernameIsNotNull() {
            addCriterion("domain_username is not null");
            return (Criteria) this;
        }

        public Criteria andDomainUsernameEqualTo(String value) {
            addCriterion("domain_username =", value, "domainUsername");
            return (Criteria) this;
        }

        public Criteria andDomainUsernameNotEqualTo(String value) {
            addCriterion("domain_username <>", value, "domainUsername");
            return (Criteria) this;
        }

        public Criteria andDomainUsernameGreaterThan(String value) {
            addCriterion("domain_username >", value, "domainUsername");
            return (Criteria) this;
        }

        public Criteria andDomainUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("domain_username >=", value, "domainUsername");
            return (Criteria) this;
        }

        public Criteria andDomainUsernameLessThan(String value) {
            addCriterion("domain_username <", value, "domainUsername");
            return (Criteria) this;
        }

        public Criteria andDomainUsernameLessThanOrEqualTo(String value) {
            addCriterion("domain_username <=", value, "domainUsername");
            return (Criteria) this;
        }

        public Criteria andDomainUsernameLike(String value) {
            addCriterion("domain_username like", value, "domainUsername");
            return (Criteria) this;
        }

        public Criteria andDomainUsernameNotLike(String value) {
            addCriterion("domain_username not like", value, "domainUsername");
            return (Criteria) this;
        }

        public Criteria andDomainUsernameIn(List<String> values) {
            addCriterion("domain_username in", values, "domainUsername");
            return (Criteria) this;
        }

        public Criteria andDomainUsernameNotIn(List<String> values) {
            addCriterion("domain_username not in", values, "domainUsername");
            return (Criteria) this;
        }

        public Criteria andDomainUsernameBetween(String value1, String value2) {
            addCriterion("domain_username between", value1, value2, "domainUsername");
            return (Criteria) this;
        }

        public Criteria andDomainUsernameNotBetween(String value1, String value2) {
            addCriterion("domain_username not between", value1, value2, "domainUsername");
            return (Criteria) this;
        }

        public Criteria andDomainPasswordIsNull() {
            addCriterion("domain_password is null");
            return (Criteria) this;
        }

        public Criteria andDomainPasswordIsNotNull() {
            addCriterion("domain_password is not null");
            return (Criteria) this;
        }

        public Criteria andDomainPasswordEqualTo(String value) {
            addCriterion("domain_password =", value, "domainPassword");
            return (Criteria) this;
        }

        public Criteria andDomainPasswordNotEqualTo(String value) {
            addCriterion("domain_password <>", value, "domainPassword");
            return (Criteria) this;
        }

        public Criteria andDomainPasswordGreaterThan(String value) {
            addCriterion("domain_password >", value, "domainPassword");
            return (Criteria) this;
        }

        public Criteria andDomainPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("domain_password >=", value, "domainPassword");
            return (Criteria) this;
        }

        public Criteria andDomainPasswordLessThan(String value) {
            addCriterion("domain_password <", value, "domainPassword");
            return (Criteria) this;
        }

        public Criteria andDomainPasswordLessThanOrEqualTo(String value) {
            addCriterion("domain_password <=", value, "domainPassword");
            return (Criteria) this;
        }

        public Criteria andDomainPasswordLike(String value) {
            addCriterion("domain_password like", value, "domainPassword");
            return (Criteria) this;
        }

        public Criteria andDomainPasswordNotLike(String value) {
            addCriterion("domain_password not like", value, "domainPassword");
            return (Criteria) this;
        }

        public Criteria andDomainPasswordIn(List<String> values) {
            addCriterion("domain_password in", values, "domainPassword");
            return (Criteria) this;
        }

        public Criteria andDomainPasswordNotIn(List<String> values) {
            addCriterion("domain_password not in", values, "domainPassword");
            return (Criteria) this;
        }

        public Criteria andDomainPasswordBetween(String value1, String value2) {
            addCriterion("domain_password between", value1, value2, "domainPassword");
            return (Criteria) this;
        }

        public Criteria andDomainPasswordNotBetween(String value1, String value2) {
            addCriterion("domain_password not between", value1, value2, "domainPassword");
            return (Criteria) this;
        }

        public Criteria andIsRushSignatureIsNull() {
            addCriterion("is_rush_signature is null");
            return (Criteria) this;
        }

        public Criteria andIsRushSignatureIsNotNull() {
            addCriterion("is_rush_signature is not null");
            return (Criteria) this;
        }

        public Criteria andIsRushSignatureEqualTo(Boolean value) {
            addCriterion("is_rush_signature =", value, "isRushSignature");
            return (Criteria) this;
        }

        public Criteria andIsRushSignatureNotEqualTo(Boolean value) {
            addCriterion("is_rush_signature <>", value, "isRushSignature");
            return (Criteria) this;
        }

        public Criteria andIsRushSignatureGreaterThan(Boolean value) {
            addCriterion("is_rush_signature >", value, "isRushSignature");
            return (Criteria) this;
        }

        public Criteria andIsRushSignatureGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_rush_signature >=", value, "isRushSignature");
            return (Criteria) this;
        }

        public Criteria andIsRushSignatureLessThan(Boolean value) {
            addCriterion("is_rush_signature <", value, "isRushSignature");
            return (Criteria) this;
        }

        public Criteria andIsRushSignatureLessThanOrEqualTo(Boolean value) {
            addCriterion("is_rush_signature <=", value, "isRushSignature");
            return (Criteria) this;
        }

        public Criteria andIsRushSignatureIn(List<Boolean> values) {
            addCriterion("is_rush_signature in", values, "isRushSignature");
            return (Criteria) this;
        }

        public Criteria andIsRushSignatureNotIn(List<Boolean> values) {
            addCriterion("is_rush_signature not in", values, "isRushSignature");
            return (Criteria) this;
        }

        public Criteria andIsRushSignatureBetween(Boolean value1, Boolean value2) {
            addCriterion("is_rush_signature between", value1, value2, "isRushSignature");
            return (Criteria) this;
        }

        public Criteria andIsRushSignatureNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_rush_signature not between", value1, value2, "isRushSignature");
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