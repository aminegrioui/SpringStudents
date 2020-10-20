package com.grioui.javaBrain.CA;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;

public class Circle implements Shype{

	private Point center;

	private MessageSource message;
	
	public MessageSource getMessage() {
		return message;
	}
	@Autowired
	public void setMessage(MessageSource message) {
		this.message = message;
	}
	public Point getCenter() {
		return center;
	}
	@Override
	public void draw() {
		System.out.println(message.getMessage("gretting", null, "hallo", null));
		System.out.println(message.getMessage("circle.draw", new Object[] {center.getX(), center.getY()}, "draw", null));

	}

	@Resource(name = "pointA")
	public void setCenter(Point center) {
		this.center = center;
	}

	
	
}
