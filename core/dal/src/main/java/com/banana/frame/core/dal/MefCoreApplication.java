package com.banana.frame.core.dal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
@ComponentScan(basePackages = {"com.banana.frame"})
public class MefCoreApplication {

    public static void main(String[] args) {
        SpringApplication.run(MefCoreApplication.class, args);
    }

}
