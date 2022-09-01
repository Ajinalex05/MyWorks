package com.ajin.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.ajin.spring")
@PropertySource("classpath:Sport.properties")
public class SportConfig {
	
	@Bean
	public FortuneServices sadfortune() {
		return new SadFortuneService();
	}
	
	@Bean
	public Coach swimCoach() {
		SwimCoach mySwimCoach = new SwimCoach(sadfortune());
		return mySwimCoach;
	}

}
