
package com.itbang.web.druid;

/**
 * 过滤不需要监控的后缀
 *
 * @author zj
 * @version 1.0 
 *
 * 变更履历：
 *   v1.0 2018年7月10日 zj 初版
 */

import com.alibaba.druid.support.http.WebStatFilter;

import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;

@WebFilter(filterName = "druidWebStatFilter", urlPatterns = "/*",
        initParams = {
                @WebInitParam(name = "exclusions", value = "*.js,*.gif,*.jpg,*.bmp,*.png,*.css,*.ico,/druid/*")// 忽略资源
        })
public class DruidStatFilter extends WebStatFilter {

}
