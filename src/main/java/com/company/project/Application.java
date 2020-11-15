package com.company.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
@ServletComponentScan //启动器启动时，扫描本目录以及子目录带有的webservlet注解的
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}

