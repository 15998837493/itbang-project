package com.itbang.utils;

import com.itbang.entity.system.SysUser;
import org.apache.shiro.SecurityUtils;

/**
 * 日志输出格式类
 *
 * @author zj
 * @version 1.0
 * <p>
 * 变更履历：
 * v1.0 2018年7月19日 zj 初版
 */
public class LogUtil {

    /**
     * 通用日志输出
     *
     * @param desc
     * @return
     */
    public static String logComm(String desc) {
        SysUser user = (SysUser) SecurityUtils.getSubject().getPrincipal();
        String operator = user != null ? "操作人：" + user.getUserName() : "";
        return operator + "-" + desc;
    }

    /**
     * 分类日志输出
     *
     * @param keyWord
     * @param desc
     * @return
     */
    public static String logComm(String keyWord, String desc) {
        SysUser user = (SysUser) SecurityUtils.getSubject().getPrincipal();
        String operator = user != null ? "操作人：" + user.getUserName() : "";
        return operator + "-" + keyWord + desc;
    }

}
