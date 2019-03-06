package com.spring.demo1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Child implements Parent {
    @Value("Test Name")
    private String name;

    @Value("${age}")
    private String age;

    public Child() {
    }

    public String getName() {
        return this.name;
    }

    public String getAge() {
        return this.age;
    }
}
