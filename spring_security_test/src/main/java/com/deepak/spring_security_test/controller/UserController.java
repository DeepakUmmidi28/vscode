package com.deepak.spring_security_test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.deepak.spring_security_test.model.Users;
import com.deepak.spring_security_test.service.MyUserDetailsService;

import jakarta.servlet.http.HttpServletRequest;

@RestController
public class UserController {

    @Autowired
    private MyUserDetailsService service;

    @Autowired
    private AuthenticationManager authenticationManager;

    @GetMapping("/")
    public String home(HttpServletRequest request){
        return "Hello "+request.getSession().getId();
    }

    @PostMapping("/register")
    public Users register(@RequestBody Users user){
        return service.addUser(user);
    }

    @GetMapping("/Users")
    public List<Users> getUsers(){
        return service.getUsers();
    }

    @PostMapping("/login")
    public String login(@RequestBody Users user){
        Authentication authentication= authenticationManager
        .authenticate(new UsernamePasswordAuthenticationToken(user.getUsername(), user.getPassword()));
        if(authentication.isAuthenticated()){
            return "Login Successful";
        } else{
            return "Login Failed";
        }
    }
}
