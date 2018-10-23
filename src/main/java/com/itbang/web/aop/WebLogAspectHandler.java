package com.itbang.web.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;

/**
 * Controller日志
 *
 * @author zcq
 * @date 2018/10/23 21:05
 */
@Component
@Aspect
public class WebLogAspectHandler {

    @Autowired
    private HttpServletRequest request;

    @Around("execution(* com.itbang.controller..*.*(..))")
    public Object methodAround(ProceedingJoinPoint pjp) throws Throwable {

        Logger LOGGER = LoggerFactory.getLogger(pjp.getTarget().getClass());

        // 获取当前的线程号
        request.getSession().getId();
        Long threadId = Thread.currentThread().getId();

        String identify = "[ThreadId-" + threadId + "]";
        // 记录下请求内容
        LOGGER.debug(identify + "HTTP-SESSION-ID  : " + request.getSession().getId());
        LOGGER.debug(identify + "HTTP-URL         : " + request.getRequestURL().toString());
        LOGGER.debug(identify + "HTTP-METHOD      : " + request.getMethod());
        LOGGER.debug(identify + "CLASS-METHOD     : " + pjp.getSignature().getDeclaringTypeName() + "."
                + pjp.getSignature().getName());

        LOGGER.info(identify + "METHOD-ARGS      : " + Arrays.toString(pjp.getArgs()));
        // 获取当前的线程号
        Object retVal = null;
        long processTime = 0;
        try {
            long starttime = System.currentTimeMillis();
            retVal = pjp.proceed();
            processTime = System.currentTimeMillis() - starttime;
        } catch (Exception e) {
            LOGGER.error(identify + "METHOD-EXCEPTION : " + e.getMessage(), e);
            throw e;
        }

        LOGGER.debug(identify + "PROCESS-TIMES    : " + processTime + "ms");

        return retVal;
    }
}
