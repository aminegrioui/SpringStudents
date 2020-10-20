package com.grioui.javaBrain;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;

public class StudentH implements Personn{
	
	public String name;
	public Stoff stoff1;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Stoff getStoff1() {
		return stoff1;
	}
	@Resource(name = "stoffC")
	public void setStoff1(Stoff stoff1) {
		this.stoff1 = stoff1;
	}
	@Override
	public void describ() {
		// TODO Auto-generated method stub
		System.out.println( "StudentH [name=" + name + ", stoff1=" + stoff1.describ() + "]");
		
	}
	
	
	
	

}
