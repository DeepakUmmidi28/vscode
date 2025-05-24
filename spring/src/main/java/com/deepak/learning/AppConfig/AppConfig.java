package com.deepak.learning.AppConfig;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.deepak.learning")
public class AppConfig {

    // @Bean
    // public Alien alien(Computer com){
    //     Alien obj=new Alien();
    //     obj.setId(01);
    //     obj.setName("Deepak");
    //     obj.setCom(com);
    //     return obj;
    // }

    // @Bean
    // public Alien alien(){
    //     Alien obj=new Alien();
    //     obj.setId(01);
    //     obj.setName("Deepak");
    //     // obj.setCom(com);
    //     return obj;
    

    // @Bean(name="laptop")
    // // @Scope("prototype")
    // public Laptop laptop(){
    //     return new Laptop();
    // }
}
