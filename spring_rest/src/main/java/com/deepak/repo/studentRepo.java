package com.deepak.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.deepak.model.Student;

public interface studentRepo extends JpaRepository<Student, Integer>{

}
