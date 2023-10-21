package com.example.xiaomi;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.xiaomi.dao")
public class XiaomiApplication {

    public static void main(String[] args) {
        SpringApplication.run(XiaomiApplication.class, args);
    }

}
