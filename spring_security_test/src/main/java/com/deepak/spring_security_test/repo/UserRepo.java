package com.deepak.spring_security_test.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.deepak.spring_security_test.model.Users;

@Repository
public interface UserRepo extends JpaRepository<Users, Integer>{

    public Users findByUsername(String username);

}
