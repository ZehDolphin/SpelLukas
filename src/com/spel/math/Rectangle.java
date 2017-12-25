package com.spel.math;

public class Rectangle extends Point {

	private float width = 0, height = 0;
	
	public Rectangle() {
		super();
	}
	
	public Rectangle (float x, float y, float width, float height) {
		super(x, y);
		setSize(width, height);
	}
	
	public void setSize(float width, float height) {
		setWidth(width);
		setHeight(height);
	}

	public float getWidth() {
		return width;
	}

	public void setWidth(float width) {
		this.width = width;
	}

	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}
	
	

}
