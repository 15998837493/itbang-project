package com.itbang.entity.system;

import java.io.Serializable;
import java.util.Date;

public class SysUser implements Serializable {
    private String userId;

    private String userCode;

    private String userPassword;

    private String userName;

    private String userSex;

    private Date userBirthday;

    private String userEmail;

    private String userIcard;

    private String userPhone;

    private Date createTime;

    private Date updateTime;

    private Integer flag;

    private String createUserId;

    private String updateUserId;

    private String createInsId;

    private static final long serialVersionUID = 1L;

    public SysUser(String userId, String userCode, String userPassword, String userName, String userSex, Date userBirthday, String userEmail, String userIcard, String userPhone, Date createTime, Date updateTime, Integer flag, String createUserId, String updateUserId, String createInsId) {
        this.userId = userId;
        this.userCode = userCode;
        this.userPassword = userPassword;
        this.userName = userName;
        this.userSex = userSex;
        this.userBirthday = userBirthday;
        this.userEmail = userEmail;
        this.userIcard = userIcard;
        this.userPhone = userPhone;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.flag = flag;
        this.createUserId = createUserId;
        this.updateUserId = updateUserId;
        this.createInsId = createInsId;
    }

    public SysUser() {
        super();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode == null ? null : userCode.trim();
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword == null ? null : userPassword.trim();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getUserSex() {
        return userSex;
    }

    public void setUserSex(String userSex) {
        this.userSex = userSex == null ? null : userSex.trim();
    }

    public Date getUserBirthday() {
        return userBirthday;
    }

    public void setUserBirthday(Date userBirthday) {
        this.userBirthday = userBirthday;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail == null ? null : userEmail.trim();
    }

    public String getUserIcard() {
        return userIcard;
    }

    public void setUserIcard(String userIcard) {
        this.userIcard = userIcard == null ? null : userIcard.trim();
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone == null ? null : userPhone.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    public String getCreateUserId() {
        return createUserId;
    }

    public void setCreateUserId(String createUserId) {
        this.createUserId = createUserId == null ? null : createUserId.trim();
    }

    public String getUpdateUserId() {
        return updateUserId;
    }

    public void setUpdateUserId(String updateUserId) {
        this.updateUserId = updateUserId == null ? null : updateUserId.trim();
    }

    public String getCreateInsId() {
        return createInsId;
    }

    public void setCreateInsId(String createInsId) {
        this.createInsId = createInsId == null ? null : createInsId.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", userId=").append(userId);
        sb.append(", userCode=").append(userCode);
        sb.append(", userPassword=").append(userPassword);
        sb.append(", userName=").append(userName);
        sb.append(", userSex=").append(userSex);
        sb.append(", userBirthday=").append(userBirthday);
        sb.append(", userEmail=").append(userEmail);
        sb.append(", userIcard=").append(userIcard);
        sb.append(", userPhone=").append(userPhone);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", flag=").append(flag);
        sb.append(", createUserId=").append(createUserId);
        sb.append(", updateUserId=").append(updateUserId);
        sb.append(", createInsId=").append(createInsId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
