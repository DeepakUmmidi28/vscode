package com.deepak;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.deepak.model.Student;
import com.deepak.repo.studentRepo;

@SpringBootApplication
public class SpringDataJpaApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringDataJpaApplication.class, args);

		Student s1=context.getBean(Student.class);
		s1.setId(101);
		s1.setName("Deepak");	
		studentRepo sr=context.getBean(studentRepo.class);

		// sr.save(s1);
		// System.out.println(sr.findById(101));
		
		System.out.println(sr.findByName("Deepak"));
	}

}
