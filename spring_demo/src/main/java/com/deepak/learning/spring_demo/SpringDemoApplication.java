package com.deepak.learning.spring_demo;

import org.springframework.context.ApplicationContext;
// import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
// import org.springframework.context.support.ClassPathXmlApplicationContext;


public class SpringDemoApplication {

	public static void main(String[] args) {
		// SpringApplication.run(SpringDemoApplication.class, args);
		// try(ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("spring.xml")) {
		// 	Student obj=context.getBean(Student.class);
			
		// } 
		// catch (Exception e) {		}

		ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
		Student obj=context.getBean(Student.class);

	}

}
