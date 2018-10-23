
package com.itbang.web.exception;

import com.itbang.model.ErrorCode;
import com.itbang.model.WebResult;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 异常统一处理类
 *
 * @author zcq
 * @date 2018/10/23 11:17
 */
@ControllerAdvice
public class GlobalExceptionHandler {

    /**
     * 
     * 系统异常
     *
     * @param e
     * @return
     */
    @ResponseBody
    @ExceptionHandler(value = Exception.class)
    public WebResult<String> defaultErrorHandler(Exception e) {
        WebResult<String> webResult = new WebResult<String>(ErrorCode.ERROR.getCode(), ErrorCode.ERROR.getMsg(),
                e.getMessage());
        e.printStackTrace();
        return webResult;
    }

    /**
     * 
     * 业务异常
     *
     * @param e
     * @return
     */
    @ResponseBody
    @ExceptionHandler(value = BizException.class)
    public WebResult<String> errorHandler(Exception e) {
        WebResult<String> webResult = new WebResult<String>(ErrorCode.BizError.getCode(), ErrorCode.BizError.getMsg(),
                e.getMessage());
        e.printStackTrace();
        return webResult;
    }

}
