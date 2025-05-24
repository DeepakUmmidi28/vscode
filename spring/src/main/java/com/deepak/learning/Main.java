package com.deepak.learning;

// import org.springframework.context.ApplicationContext;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.deepak.learning.AppConfig.AppConfig;


public class Main {
    public static void main(String[] args) {
    //    try(ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml")) {
    //        Alien obj = (Alien) context.getBean("Alien");
    //        obj.meth();
    //    }

        // ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
        try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class)){
            Alien obj=(Alien)context.getBean("alien");
            obj.meth();
        } catch (Exception e) {        }
    }
}