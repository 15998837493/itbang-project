package com.itbang.web.aop;

import com.itbang.entity.system.SysUser;
import com.itbang.utils.StringUtil;
import com.itbang.utils.ParamConfig;
import org.apache.shiro.SecurityUtils;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * 保存、更新操作拦截器
 *
 * @author zcq
 * @date 2018/10/23 21:06
 */
@Component
@Aspect
public class DataSaveAspectHandler {

    private String userId;

    @Before("execution(* com.itbang.service..*.save*(..))")
    public void saveDataBefore(JoinPoint joinPoint) throws Throwable {

        for (int i = 0; i < joinPoint.getArgs().length; i++) {
            Field[] fields = joinPoint.getArgs()[i].getClass().getDeclaredFields();
            for (int j = 0; j < fields.length; j++) {
                Method method = null;
                // 保存uuid
                if (fields[j].getName().equals("id")) {
                    method = joinPoint.getArgs()[i].getClass().getMethod("setId", String.class);
                    method.invoke(joinPoint.getArgs()[i], StringUtil.getUUID32());
                }
                if (fields[j].getName().equals("createUserId")) {
                    method = joinPoint.getArgs()[i].getClass().getMethod("setCreateUserId", String.class);
                    method.invoke(joinPoint.getArgs()[i], getUserId());
                }
                if (fields[j].getName().equals("updateUserId")) {
                    method = joinPoint.getArgs()[i].getClass().getMethod("setUpdateUserId", String.class);
                    method.invoke(joinPoint.getArgs()[i], getUserId());
                }
                // 机构号
                if (fields[j].getName().equals("createInsId")) {
                    method = joinPoint.getArgs()[i].getClass().getMethod("setCreateInsId", String.class);
                    method.invoke(joinPoint.getArgs()[i], ParamConfig.getProperty("create.ins.id"));
                }
            }
        }
    }

    @Before("execution(* com.itbang.service..*.update*(..))")
    public void updateDataBefore(JoinPoint joinPoint) throws Throwable {

        for (int i = 0; i < joinPoint.getArgs().length; i++) {
            Field[] fields = joinPoint.getArgs()[i].getClass().getDeclaredFields();
            for (int j = 0; j < fields.length; j++) {
                Method method = null;
                if (fields[j].getName().equals("updateUserId")) {
                    method = joinPoint.getArgs()[i].getClass().getMethod("setUpdateUserId", String.class);
                    method.invoke(joinPoint.getArgs()[i], getUserId());
                }
                // 机构号
                if (fields[j].getName().equals("createInsId")) {
                    method = joinPoint.getArgs()[i].getClass().getMethod("setCreateInsId", String.class);
                    method.invoke(joinPoint.getArgs()[i], ParamConfig.getProperty("create.ins.id"));
                }
            }
        }
    }

    /**
     * 获取userid
     *
     * @return
     */
    public String getUserId() {
        SysUser user = (SysUser) SecurityUtils.getSubject().getPrincipal();
        userId = user == null ? "sys" : user.getUserId();
        return userId;
    }

}
