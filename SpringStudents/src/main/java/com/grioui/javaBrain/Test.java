package com.grioui.javaBrain;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
		Personn student=(Personn)context.getBean("studentH");
		student.describ(); 
	}
	

}
