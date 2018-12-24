package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemoApp {

	public static void main(String[] args) {
		
		// load config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanLifeCycle-applicationContext.xml");
		
		// retrieve bean from Spring container
		Coach theCoach = context.getBean("myBasketballCoach", Coach.class);
		
		// print results
		System.out.println(theCoach.getDailyWorkout());
		
		// close the context
		context.close();
	}

}
