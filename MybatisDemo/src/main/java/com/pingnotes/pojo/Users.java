package com.pingnotes.pojo;

import java.util.Date;

public class Users {
    private Long id;

    private String email;

    private String encryptedRushPassword;

    private String encryptedMailRefreshToken;

    private String encryptMailAccessToken;

    private String nickname;

    private Integer companyId;

    private Integer organizationId;

    private Date birthday;

    private String gender;

    private Date createdAt;

    private Date updatedAt;

    private String salt;

    private String avatarUrl;

    private String avatarThumbnailUrl;

    private String signature;

    private Boolean isRegister;

    private Boolean isDelete;

    private String roles;

    private String city;

    private String interests;

    private String company;

    private String domainCompany;

    private Integer entry;

    private Boolean isFreeze;

    private Boolean isActive;

    private String phoneNumber;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getEncryptedRushPassword() {
        return encryptedRushPassword;
    }

    public void setEncryptedRushPassword(String encryptedRushPassword) {
        this.encryptedRushPassword = encryptedRushPassword == null ? null : encryptedRushPassword.trim();
    }

    public String getEncryptedMailRefreshToken() {
        return encryptedMailRefreshToken;
    }

    public void setEncryptedMailRefreshToken(String encryptedMailRefreshToken) {
        this.encryptedMailRefreshToken = encryptedMailRefreshToken == null ? null : encryptedMailRefreshToken.trim();
    }

    public String getEncryptMailAccessToken() {
        return encryptMailAccessToken;
    }

    public void setEncryptMailAccessToken(String encryptMailAccessToken) {
        this.encryptMailAccessToken = encryptMailAccessToken == null ? null : encryptMailAccessToken.trim();
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
    }

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public Integer getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(Integer organizationId) {
        this.organizationId = organizationId;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender == null ? null : gender.trim();
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt == null ? null : salt.trim();
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl == null ? null : avatarUrl.trim();
    }

    public String getAvatarThumbnailUrl() {
        return avatarThumbnailUrl;
    }

    public void setAvatarThumbnailUrl(String avatarThumbnailUrl) {
        this.avatarThumbnailUrl = avatarThumbnailUrl == null ? null : avatarThumbnailUrl.trim();
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature == null ? null : signature.trim();
    }

    public Boolean getIsRegister() {
        return isRegister;
    }

    public void setIsRegister(Boolean isRegister) {
        this.isRegister = isRegister;
    }

    public Boolean getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Boolean isDelete) {
        this.isDelete = isDelete;
    }

    public String getRoles() {
        return roles;
    }

    public void setRoles(String roles) {
        this.roles = roles == null ? null : roles.trim();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public String getInterests() {
        return interests;
    }

    public void setInterests(String interests) {
        this.interests = interests == null ? null : interests.trim();
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company == null ? null : company.trim();
    }

    public String getDomainCompany() {
        return domainCompany;
    }

    public void setDomainCompany(String domainCompany) {
        this.domainCompany = domainCompany == null ? null : domainCompany.trim();
    }

    public Integer getEntry() {
        return entry;
    }

    public void setEntry(Integer entry) {
        this.entry = entry;
    }

    public Boolean getIsFreeze() {
        return isFreeze;
    }

    public void setIsFreeze(Boolean isFreeze) {
        this.isFreeze = isFreeze;
    }

    public Boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber == null ? null : phoneNumber.trim();
    }
}