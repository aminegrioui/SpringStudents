package com.grioui.javaBrain;

public class Student implements Personn{;

	public String name;
	public Stoff stoff;
	

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Stoff getStoff() {
		return stoff;
	}


	public void setStoff(Stoff stoff) {
		this.stoff = stoff;
	}


	@Override
	public void describ() {
		System.out.println("Name is : "+name+ " Stoff : "+stoff.getName() +" Days : "+stoff.getNumberDays());
		
	}

}
