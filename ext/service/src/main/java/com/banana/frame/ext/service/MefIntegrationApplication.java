package com.banana.frame.ext.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource({"classpath:META-INF/cxf/cxf.xml"})
@ComponentScan(basePackages = {"com.banana.frame.ext"})
public class MefIntegrationApplication {
    public static void main(String[] args) {
        SpringApplication.run(MefIntegrationApplication.class, args);
    }
}