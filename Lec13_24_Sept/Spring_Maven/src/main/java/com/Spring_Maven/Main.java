package com.Spring_Maven;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.Wasif.Harshit;

@ComponentScan(basePackages = {"com.Spring_Maven","com.Wasif"})
public class Main {
	
	public static void main(String[] args) {
		
		ApplicationContext app = new AnnotationConfigApplicationContext(Main.class);
		
		Employee e = app.getBean(Employee.class);
		System.out.println(e.getEmpId());
		
		Wasif w = app.getBean(Wasif.class);
		w.g();
		
		Harshit h = app.getBean(Harshit.class);
		h.h1();
		
		Employee e1 = app.getBean(Employee.class);
		System.out.println(e1.getAdd().getCity());
		
		
		
		
	}

}
