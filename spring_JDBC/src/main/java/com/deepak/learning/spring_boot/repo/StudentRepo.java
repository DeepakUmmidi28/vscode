package com.deepak.learning.spring_boot.repo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.deepak.learning.spring_boot.Model.Student;

@Repository
public class StudentRepo {

    private JdbcTemplate jdbc;

    public JdbcTemplate getJdbc() {
        return jdbc;
    }

    @Autowired
    public void setJdbc(JdbcTemplate jdbc) {
        this.jdbc = jdbc;
    }

    public void save(Student s) {
        String sql="INSERT INTO student (rollNo, name, marks) VALUES (?, ?, ?)";
        int row_count=jdbc.update(sql,s.getRollNo(), s.getName(), s.getMarks());
        System.out.println("Rows affected: " + row_count);
        System.out.println("Student saved: " + s);
    }

    public List<Student> findAll() {
        List<Student> students = List.of(
            new Student(1, "John Doe", 85),
            new Student(2, "Jane Smith", 90),
            new Student(3, "Alice Johnson", 78)
        );

        // List<Student> students = new ArrayList<>();
        return students;
    }
}
