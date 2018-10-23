package com.itbang;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.itbang.dao")
public class ItbangProjectApplication {

    /**
     * 启动
     *
     * @param args
     * @return void
     * @author zcq
     * @date 2018/10/14 17:06
     */
    public static void main(String[] args) {
        SpringApplication.run(ItbangProjectApplication.class, args);
    }

}
