package com.spring.demo1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConfigClass.class);

        Parent obj = context.getBean("child", Parent.class);
        System.out.println(obj.getName());
        System.out.println(obj.getAge());
        context.close();

    }
}
