package com.grioui.javaBrain.CA;

public class Traigle implements Shype{
	
	private Point pointA;
	private Point pointB;
	private Point pointC;
	public Point getPointA() {
		return pointA;
	}
	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}
	public Point getPointB() {
		return pointB;
	}
	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}
	public Point getPointC() {
		return pointC;
	}
	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}
	@Override
	public void draw() {
		System.out.println("PointA : ("+pointA.getX() + " , "+pointA.getY()+" )");
		System.out.println("PointA : ("+pointB.getX() + " , "+pointB.getY()+" )");
		System.out.println("PointA : ("+pointC.getX() + " , "+pointC.getY()+" )");
	}
	

}
