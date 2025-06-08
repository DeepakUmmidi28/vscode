package com.deepak.spring_security.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.deepak.spring_security.model.Student;
import com.deepak.spring_security.model.Users;
import com.deepak.spring_security.service.MyUserDetailsService;

import jakarta.servlet.http.HttpServletRequest;

@RestController
public class HomeController {

    @Autowired
    private MyUserDetailsService service;

    @Autowired
    private AuthenticationManager authenticationManager;

    List<Student> students = new ArrayList<>(List.of(
        new Student(1,"John","Java"),
        new Student(2,"Jane","Python"),
        new Student(3,"Doe","JavaScript")
    ));

    @GetMapping("/")
    public String greet(HttpServletRequest request){
        return "Hello Spring"+" "+request.getSession().getId();
    }

    @GetMapping("/students")
    public List<Student> getStudents(){
        return students;
    }

    @GetMapping("/csrf")
    public CsrfToken getCsrfToken(HttpServletRequest request){
        return (CsrfToken) request.getAttribute("_csrf");
    }

    @PostMapping("/students")
    public Student addStudent(@RequestBody Student student){
        students.add(student);
        return student;
    }

    @PostMapping("/register")
    public Users addUser(@RequestBody Users user){
        return service.addUser(user);
    }

    @PostMapping("/login")
    public String login(@RequestBody Users user){
        Authentication auth=authenticationManager.authenticate(
            new UsernamePasswordAuthenticationToken(user.getUsername(), user.getPassword())
        );
        if(auth.isAuthenticated()){
            return "Login successful for user: " + user.getUsername();
        } else {
            return "Login failed for user: " + user.getUsername();
        }
    }
}
