package com.deepak.learning.spring_boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.deepak.learning.spring_boot.Model.Student;
import com.deepak.learning.spring_boot.service.StudentService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ApplicationContext context= SpringApplication.run(Application.class);
		Student s=context.getBean(Student.class);
		StudentService studentService=context.getBean(StudentService.class);

		s.setRollNo(3);
		s.setName("Deepak");
		s.setMarks(100);

		studentService.addStudent(s);

		// studentService.addStudent(s);
		// studentService.getStudent(s1);

		// List<Student> students = studentService.getStudents();
		// for (Student student : students) {
		// 	System.out.println("Student details: " + student);
		// }

		// System.out.println("Student details: " + students);
	}

}
