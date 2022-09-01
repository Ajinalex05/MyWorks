//package com.ajin.spring;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//
//@Component
//public class TennisCoach implements Coach {
//	
//	public FortuneServices fortuneservices;
//	
//	
////	
////    @Autowired
////	public TennisCoach(FortuneServices fortuneservices) {
////		this.fortuneservices = fortuneservices;
////	}
//	
//	public TennisCoach() {
//		
//	}
//	
//	
//
//	public FortuneServices getFortuneservices() {
//		return fortuneservices;
//	}
//
//
//    @Autowired
//	public void setFortuneservices(FortuneServices fortuneservices) {
//		this.fortuneservices = fortuneservices;
//	}
//
//
//
//	@Override
//	public String getDailyWorkout() {
//		// TODO Auto-generated method stub
//		return "play tennis for 20min";
//	}
//
//	
//
//	@Override
//	public String getDailyFortune() {
//		// TODO Auto-generated method stub
//		return fortuneservices.getDailyFortune();
//	}
//
//}
