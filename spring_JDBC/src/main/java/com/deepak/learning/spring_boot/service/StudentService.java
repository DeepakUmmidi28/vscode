package com.deepak.learning.spring_boot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.deepak.learning.spring_boot.Model.Student;
import com.deepak.learning.spring_boot.repo.StudentRepo;

@Service
public class StudentService {

    // @Autowired
    private StudentRepo repo;

    public void addStudent(Student s) {
        repo.save(s);
    }

    public StudentRepo getRepo() {
        return repo;
    }

    @Autowired
    public void setRepo(StudentRepo repo) {
        this.repo = repo;
    }

    public List<Student> getStudents() {
        return repo.findAll();
    }

}
