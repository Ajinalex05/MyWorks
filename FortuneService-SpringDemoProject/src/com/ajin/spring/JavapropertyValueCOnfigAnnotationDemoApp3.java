package com.ajin.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JavapropertyValueCOnfigAnnotationDemoApp3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
		
		SwimCoach thecoach = context.getBean("swimCoach",SwimCoach.class);
		
		System.out.println(thecoach.getDailyWorkout());
		
		System.out.println(thecoach.getDailyFortune());
		
		System.out.println(thecoach.getEmail());
		
		System.out.println(thecoach.getTeam());
		
		context.close();

	}

}
