package com.deepak.learning;

import org.apache.catalina.Context;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;

public class Main {
    public static void main(String[] args) throws LifecycleException {
        System.out.println("Hello world!");

        Tomcat tomcat=new Tomcat();

        Context context=tomcat.addContext("", null);
        Tomcat.addServlet(context, "myServlet", new myServlet());
        context.addServletMappingDecoded("/myServlet", "myServlet");

        tomcat.start();
        tomcat.getServer().await();
    }
}