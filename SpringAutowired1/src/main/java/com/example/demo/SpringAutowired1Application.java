package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringAutowired1Application {

	
	
	public static void main(String[] args) {
		
		
		
		ApplicationContext context = SpringApplication.run(SpringAutowired1Application.class, args);;
		
		
		  Student1 s1= (Student1) context.getBean("student1"); s1.l1.showLaptop();
		  
		  Student1 s2= (Student1) context.getBean("student1"); s2.l1.showLaptop();
		 
		  
		  System.out.println("Now auto wiring ...........");
		  
		
		
		
	}

}
