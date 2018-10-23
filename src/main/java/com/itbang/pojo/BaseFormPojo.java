
package com.itbang.pojo;

import java.io.Serializable;

/**
 * 基础表单
 *
 * @author zcq
 * @date 2018/10/21 12:43
 */
public class BaseFormPojo implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 页数
     */
    private int pageNumber;

    /**
     * 页长度
     */
    private int pageSize;

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

}
