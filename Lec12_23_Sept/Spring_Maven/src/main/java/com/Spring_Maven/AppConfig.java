package com.Spring_Maven;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	
	@Bean
	public Hello h1()
	{
		return new Hello();
	}
	
	@Bean
	public Spring sp()
	{
		return new Spring();
	}

}
