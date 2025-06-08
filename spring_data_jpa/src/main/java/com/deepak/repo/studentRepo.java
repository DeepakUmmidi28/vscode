package com.deepak.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.deepak.model.Student;

@Repository
public interface studentRepo extends JpaRepository<Student, Integer>{
    // This interface will automatically provide CRUD operations for the Student entity
    // No need to write any additional code here
    // Spring Data JPA will generate the implementation at runtime

    @Query("select s from Student s where s.name=?1")
    public List<Student> findByName(String name);
}
