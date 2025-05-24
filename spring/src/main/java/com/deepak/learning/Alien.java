package com.deepak.learning;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component

public class Alien {
    private int id;
    private String name;
    @Autowired()
    @Qualifier("des")
    private Computer com;

    public Alien(){
        System.out.println("Alien object created");
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Computer getCom() {
        return com;
    }

    public void setCom(Computer com) {
        this.com = com;
    }

    public void meth(){
        System.out.println("Alien method");
        com.compile();
    }

    public Alien(int id, String name, Computer com) {
        this.id = id;
        this.name = name;
        this.com = com;
    }
}
