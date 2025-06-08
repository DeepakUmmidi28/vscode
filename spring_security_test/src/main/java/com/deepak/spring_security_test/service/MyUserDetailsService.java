package com.deepak.spring_security_test.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.deepak.spring_security_test.model.UserPrincipal;
import com.deepak.spring_security_test.model.Users;
import com.deepak.spring_security_test.repo.UserRepo;

@Service
public class MyUserDetailsService implements UserDetailsService{

    @Autowired
    private UserRepo repo;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException{
        Users user=repo.findByUsername(username);
        return new UserPrincipal(user);
    }

    public Users addUser(Users user) {
        return repo.save(user);
    }

    public List<Users> getUsers() {
        return repo.findAll();
    }

}
