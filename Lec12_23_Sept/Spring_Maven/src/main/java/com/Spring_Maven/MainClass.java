package com.Spring_Maven;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass {
	
	public static void main(String[] args) {
		
		ApplicationContext app = new AnnotationConfigApplicationContext(AppConfig.class);
		Hello h=  app.getBean(Hello.class);
		h.h();
		
		Spring s=app.getBean(Spring.class);
	    System.out.println(s.getId());
	    System.out.println(s.getName());
	}

}
