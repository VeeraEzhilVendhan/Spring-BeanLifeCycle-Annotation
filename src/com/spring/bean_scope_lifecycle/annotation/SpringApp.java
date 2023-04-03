package com.spring.bean_scope_lifecycle.annotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringApp {
	
	public static void main(String[] args) {
		 
		ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		Coach c=context.getBean("baseballCoach",Coach.class);
		
		Coach c1=context.getBean("baseballCoach",Coach.class);
		
		Boolean b=c1==c;
		
		System.out.println("\nFirst Instace "+c);
		
		System.out.println("\nSecond Instace "+c1);
		
		System.out.println("\nResult "+b);
		
		context.close();
	}

}
