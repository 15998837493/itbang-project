
package com.itbang.model;


import java.util.List;

/**
 * 返回結果数据
 *
 * @author zcq
 * @date 2018/10/21 12:42
 */
public class WebResult<T> {

    private String code;

    private String message;

    private T value;

    private List<?> data;

    public WebResult() {
    }

    public WebResult(T value) {
        this.code = ErrorCode.SUCCESS.getCode();
        this.message = ErrorCode.SUCCESS.getMsg();
        this.value = value;
    }

    public WebResult(String code, String message, T value) {
        super();
        this.code = code;
        this.message = message;
        this.value = value;
    }

    public WebResult(List<?> data) {
        super();
        this.code = ErrorCode.SUCCESS.getCode();
        this.message = ErrorCode.SUCCESS.getMsg();
        this.data = data;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public List<?> getData() {
        return data;
    }

    public void setData(List<?> data) {
        this.data = data;
    }

}
