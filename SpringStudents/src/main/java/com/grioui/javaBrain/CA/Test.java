package com.grioui.javaBrain.CA;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.grioui.javaBrain.Personn;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
		Shype student=(Shype)context.getBean("circle");
		student.draw(); 
		
	}

}
