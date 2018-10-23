
package com.itbang.model;

/**
 * 错误码
 *
 * @author zcq
 * @date 2018/10/21 12:44
 */
public enum ErrorCode {

    SUCCESS("0", "正常"), ERROR("999", "内部错误"), BizError("1", "处理异常"), LOGINFAIL("2", "登录失败"), PASSWORDFAIL("3", "密码错误");

    private String msg;

    private String code;

    private ErrorCode(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public String getMsg() {
        return this.msg;
    }

    public String getCode() {
        return this.code;
    }

}
