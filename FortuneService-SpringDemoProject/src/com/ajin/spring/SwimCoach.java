package com.ajin.spring;

import org.springframework.beans.factory.annotation.Value;

public class SwimCoach implements Coach {
    
	
	private FortuneServices fourtuneservice;
	
	@Value("${foo.email}")
	private String email;
	
	@Value("${foo.team}")
	private String team;
	
	
	public SwimCoach(FortuneServices fourtuneservice) {
		this.fourtuneservice = fourtuneservice;
	}
	
	

	public String getEmail() {
		return email;
	}



	public String getTeam() {
		return team;
	}



	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "swim daily 1000 meter";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fourtuneservice.getDailyFortune();
	}
	
	

}
