package com.deepak.spring_security.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.deepak.spring_security.model.Users;

@Repository
public interface  UserRepo extends JpaRepository<Users, Integer>{

    public Users findByUsername(String username);

}
