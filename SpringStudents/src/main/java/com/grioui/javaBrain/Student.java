package com.grioui.javaBrain;

public class Student implements Personn{;

	public String name;
	public Stoff stoff1;
	public Stoff stoff2;
	public Stoff stoff3;
	

	public Stoff getStoff1() {
		return stoff1;
	}


	public void setStoff1(Stoff stoff1) {
		this.stoff1 = stoff1;
	}


	public Stoff getStoff2() {
		return stoff2;
	}


	public void setStoff2(Stoff stoff2) {
		this.stoff2 = stoff2;
	}


	public Stoff getStoff3() {
		return stoff3;
	}


	public void setStoff3(Stoff stoff3) {
		this.stoff3 = stoff3;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Stoff getStoff() {
		return stoff1;
	}


	public void setStoff(Stoff stoff) {
		this.stoff1 = stoff;
	}


	@Override
	public void describ() {
		
		System.out.println("Student [name=" + name + ", stoff1=" + stoff1.describ() + ", stoff2=" + stoff2.describ() + ", stoff3=" + stoff3.describ() + "]");
	}


	

}
