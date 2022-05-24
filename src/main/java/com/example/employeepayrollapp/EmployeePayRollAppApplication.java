package com.example.employeepayrollapp;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
@Slf4j
public class EmployeePayRollAppApplication {

    public static void main(String[] args) {
        System.out.println("Welcome to employeepayroll app");
        ApplicationContext context=SpringApplication.run(EmployeePayRollAppApplication.class, args);
        log.info("Employee payrollapp started {} environment",context.getEnvironment().getProperty("environment"));
    }

}
