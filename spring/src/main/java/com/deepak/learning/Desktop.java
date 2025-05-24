package com.deepak.learning;

import org.springframework.stereotype.Component;

@Component("des")
public class Desktop implements Computer {
    @Override
    public void compile(){
        System.out.println("Desktop is compiling");
    }

    public Desktop() {
        System.out.println("Desktop object created");
    }
}
