package com.example.hikaricpdemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.hikaricpdemo.mapper")
public class HikaricpdemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(HikaricpdemoApplication.class, args);
    }

}
