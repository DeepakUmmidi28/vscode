package com.deepak.learning.spring_demo;

// import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
// import org.springframework.stereotype.Component;

@Configuration
@ComponentScan(basePackages = "com.deepak.learning.spring_demo")
public class AppConfig {
    // @Bean
    // public Student student(){
    //     return new Student();   
    // }
}