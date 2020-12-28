package com.husbandry.struggle.controller;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


/**
 * @author WTCL
 */
@ComponentScan(basePackages = {"com.husbandry.struggle.controller.husbandry.dao","com.husbandry.struggle.controller.husbandry"})
@MapperScan("com.husbandry.struggle.controller.husbandry.dao")
@SpringBootApplication
public class ControllerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ControllerApplication.class, args);
    }

}
