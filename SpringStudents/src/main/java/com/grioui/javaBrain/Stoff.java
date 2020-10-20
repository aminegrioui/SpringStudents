package com.grioui.javaBrain;

public class Stoff {
	
	private String name;
	private int numberDays;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNumberDays() {
		return numberDays;
	}
	public void setNumberDays(int numberDays) {
		this.numberDays = numberDays;
	}
	
	
	public String describ() {
		return "Stoff [name=" + name + ", numberDays=" + numberDays + "]";
	}
	
	
	

}
