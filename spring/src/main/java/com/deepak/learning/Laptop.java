package com.deepak.learning;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("lap")
@Primary
public class Laptop implements Computer {
    @Override
    public void compile(){
        System.out.println("Laptop is compiling");
    }

    public Laptop() {
        System.out.println("Laptop object created");
    }
}
