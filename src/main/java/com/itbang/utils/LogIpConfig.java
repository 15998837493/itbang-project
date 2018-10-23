package com.itbang.utils;

import ch.qos.logback.classic.pattern.ClassicConverter;
import ch.qos.logback.classic.spi.ILoggingEvent;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * 在日志中输出ip的类
 *
 * @author zj
 * @version 1.0 
 *
 * 变更履历：
 *   v1.0 2018年7月12日 zj 初版
 */
public class LogIpConfig extends ClassicConverter {
//    private static final Logger LOGGER = LoggerFactory.getLogger(LogIpConfig .class);
    @Override
    public String convert(ILoggingEvent event) {
        try {
            return InetAddress.getLocalHost().getHostAddress();
        } catch (UnknownHostException e) {
//            LOGGER.error("获取日志Ip异常", e);
        }
        return null;
    }

}
