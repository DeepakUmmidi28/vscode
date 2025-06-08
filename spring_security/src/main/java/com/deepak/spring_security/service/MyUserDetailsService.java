package com.deepak.spring_security.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.deepak.spring_security.model.UserPrinciple;
import com.deepak.spring_security.model.Users;
import com.deepak.spring_security.repo.UserRepo;

@Service
public class MyUserDetailsService implements UserDetailsService{

    BCryptPasswordEncoder encoder=new BCryptPasswordEncoder();

    @Autowired
    private UserRepo userRepo;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Users user=userRepo.findByUsername(username);
        if(user==null){
            throw new UsernameNotFoundException("User not found with username: " + username);
        }
        System.out.println("Load by username method called");
        return new UserPrinciple(user);
    }

    public Users addUser(Users user) {
        user.setPassword(encoder.encode(user.getPassword()));
        System.out.println(user.getPassword());
        return userRepo.save(user);
    }

}
