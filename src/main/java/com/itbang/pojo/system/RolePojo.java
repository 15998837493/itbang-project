package com.itbang.pojo.system;

import com.itbang.pojo.BaseFormPojo;

/**
 * 角色POJO
 *
 * @author zcq
 * @date 2018/10/23 20:54
 */
public class RolePojo extends BaseFormPojo {

    private String userId;

    private String userCode;

    private String userPassword;

    private String userName;

    private String roleId;

    private String roleName;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }
}
