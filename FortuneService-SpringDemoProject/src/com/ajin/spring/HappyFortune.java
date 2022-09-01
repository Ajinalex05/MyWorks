package com.ajin.spring;

import org.springframework.stereotype.Component;

@Component
public class HappyFortune implements FortuneServices {

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "Have a nice day";
	}

}
