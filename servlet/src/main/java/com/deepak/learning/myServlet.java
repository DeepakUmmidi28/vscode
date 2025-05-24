package com.deepak.learning;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class myServlet extends HttpServlet{
    @Override
    public void service(HttpServletRequest req, HttpServletResponse res){
        System.out.println("Hello from myServlet");
    }
}
