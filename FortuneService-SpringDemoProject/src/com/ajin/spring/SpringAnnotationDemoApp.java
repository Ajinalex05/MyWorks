package com.ajin.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringAnnotationDemoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Coach thecoach = context.getBean("tennisCoach",Coach.class);
		
		System.out.println(thecoach.getDailyWorkout());
		
		System.out.println(thecoach.getDailyFortune());
		
		context.close();

	}

}
