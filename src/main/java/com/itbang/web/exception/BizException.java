
package com.itbang.web.exception;

/**
 * 业务类异常
 *
 * @author zcq
 * @date 2018/10/21 11:12
 */
public class BizException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public BizException(String message) {
        super(message);
    }

}
