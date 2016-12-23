package com.pingnotes.pojo;

import java.util.Date;

public class MailAccounts {
    private Long id;

    private String email;

    private Integer mailServerProfile;

    private String encryptedMailRefreshToken;

    private String encryptMailAccessToken;

    private Date createdAt;

    private Date updatedAt;

    private Boolean isActivate;

    private Boolean isRegister;

    private String nickName;

    private String signature;

    private String domainUsername;

    private String domainPassword;

    private Boolean isRushSignature;

    private Integer loginType;

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

    public Integer getMailServerProfile() {
        return mailServerProfile;
    }

    public void setMailServerProfile(Integer mailServerProfile) {
        this.mailServerProfile = mailServerProfile;
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

    public Boolean getIsActivate() {
        return isActivate;
    }

    public void setIsActivate(Boolean isActivate) {
        this.isActivate = isActivate;
    }

    public Boolean getIsRegister() {
        return isRegister;
    }

    public void setIsRegister(Boolean isRegister) {
        this.isRegister = isRegister;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName == null ? null : nickName.trim();
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature == null ? null : signature.trim();
    }

    public String getDomainUsername() {
        return domainUsername;
    }

    public void setDomainUsername(String domainUsername) {
        this.domainUsername = domainUsername == null ? null : domainUsername.trim();
    }

    public String getDomainPassword() {
        return domainPassword;
    }

    public void setDomainPassword(String domainPassword) {
        this.domainPassword = domainPassword == null ? null : domainPassword.trim();
    }

    public Boolean getIsRushSignature() {
        return isRushSignature;
    }

    public void setIsRushSignature(Boolean isRushSignature) {
        this.isRushSignature = isRushSignature;
    }

    public Integer getLoginType() {
        return loginType;
    }

    public void setLoginType(Integer loginType) {
        this.loginType = loginType;
    }
}