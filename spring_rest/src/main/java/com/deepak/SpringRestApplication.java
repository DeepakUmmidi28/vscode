package com.deepak;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.deepak.model.Student;
import com.deepak.repo.studentRepo;

@SpringBootApplication
public class SpringRestApplication {

	public static void main(String[] args) {
		ApplicationContext context= SpringApplication.run(SpringRestApplication.class, args);

		Student s1= new Student();
		s1.setId(1);
		s1.setName("John Doe");

		studentRepo repo= context.getBean(studentRepo.class);
		repo.save(s1);
	}

}
