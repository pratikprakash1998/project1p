package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootConfiguration


public class Project1Application {
	

	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(Project1Application.class, args);
		student s1 = context.getBean(student.class);
		s1.display();
		
		student s2 = context.getBean(student.class);
		s2.display();
	
	}
	
}
}
