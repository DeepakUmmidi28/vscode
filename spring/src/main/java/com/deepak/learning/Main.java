package com.deepak.learning;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
       try(ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml")) {
           Alien obj = (Alien) context.getBean("Alien");
           obj.meth();
       }
    }
}