package com.gmd;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
@MapperScan("com.gmd.dao")
public class MySpringBootApplication {

    public static void main(String[] args){
        SpringApplication.run(MySpringBootApplication.class, args);
    }
}
