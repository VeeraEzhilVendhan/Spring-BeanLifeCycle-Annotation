package com.spring.bean_scope_lifecycle.annotation;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class BaseballCoach implements Coach{
	
	String instruction="Practice batting for 30mins a day";
	
	@Override
	public String getDailyWorkout()
	{
		return instruction;
	}
	
	@PostConstruct
	public void doStart()
	{
		System.out.println("Init method called - started");
	}
	
	@PreDestroy
	public void doStop()
	{
		System.out.println("Destroy method called - stopped");
	}
	

}
