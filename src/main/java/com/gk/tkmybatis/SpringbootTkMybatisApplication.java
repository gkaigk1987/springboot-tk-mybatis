package com.gk.tkmybatis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@MapperScan("com.gk.tkmybatis.mapper")
@SpringBootApplication
public class SpringbootTkMybatisApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootTkMybatisApplication.class, args);
    }

}
