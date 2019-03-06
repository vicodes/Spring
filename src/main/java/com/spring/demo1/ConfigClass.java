package com.spring.demo1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Configuration
//@ComponentScan(basePackages = {"com/spring/test1"})
//@PropertySource("classpath:com/spring/test1/context.properties")
//@ComponentScan("com.spring.test1")
public class ConfigClass {
    @Bean
    public Parent child() {
        return new Child();
    }


    //Auto invoked before the starting of the Spring
    @PostConstruct
    public void init() {
        System.out.println("I am a initializer method!!");
    }

    //Auto invoked after the closing of Spring
    @PreDestroy
    public void destroy() {
        System.out.println("I am a destroy method!!!!");
    }

}
