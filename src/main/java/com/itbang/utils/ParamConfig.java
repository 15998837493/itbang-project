
package com.itbang.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PropertiesLoaderUtils;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.Properties;

@Component
public class ParamConfig {

    private static Properties props;

    private static final Logger logger = LoggerFactory.getLogger(ParamConfig.class);
    
    private static ParamConfig systemPara;

    /**
     * 构造方法.
     */
    public ParamConfig() {
        try {
            Resource resource = new ClassPathResource("/paramConfig.properties");
            props = PropertiesLoaderUtils.loadProperties(resource);
        } catch (IOException ex) {
            ex.printStackTrace();
            logger.error(ex.getMessage());
        }
    }
    
    public static ParamConfig getInstance() {
        if (systemPara == null) {
            systemPara = new ParamConfig();
        }
        return systemPara;
    }

    /**
     * 获取属性
     * 
     * @param key
     *            键
     * @return 值.
     */
    public static String getProperty(String key) {
        getInstance();
        return props == null ? null : props.getProperty(key);

    }

    /**
     * 获取属性
     * 
     * @param key
     *            属性key
     * @param defaultValue
     *            属性value
     * @return 值.
     */
    public static String getProperty(String key, String defaultValue) {
        getInstance();
        return props == null ? null : props.getProperty(key, defaultValue);

    }

    /**
     * 获取properyies属性
     * 
     * @return 配置文件.
     */
    public static Properties getProperties() {
        return props;
    }
    
    public static void main(String[] args) {
        System.out.println(ParamConfig.getProperty("create.ins.id"));
    }

}
