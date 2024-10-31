package com.deepak.learning;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Demo{
    public static void main(String[] args) {
        List<Student> l=new ArrayList<>();
        l.add(new Student(91, "Deepak"));
        l.add(new Student(82, "ramya"));
        l.add(new Student(23, "Hemanth"));
        l.add(new Student(43, "Sai"));

        @SuppressWarnings("unused")
        Comparator<Student> com=new Comparator<>() {
            public int compare(Student i,Student j){
                if(i.age>j.age)
                return 1;
                else 
                return -1;
            }
        };

        // DemoComparator d=new DemoComparator();
        Collections.sort(l,(Student i,Student j)->{
            if(i.age>j.age)
                return 1;
                else 
                return -1;
        });
        for (Student student : l) {
            System.out.println(student);  
        }
    }
}

class Student implements Comparable<Student>{
    int age;
    String name;
    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }
    @Override
    public String toString() {
        return "Student [age=" + age + ", name=" + name + "]";
    }

    public int compareTo(Student that){
        /*
         * int diff=(int)(this.age-that.age)
         * return diff
         */
        if(this.age>that.age)
        return 1;
        else return -1;
    }
}
