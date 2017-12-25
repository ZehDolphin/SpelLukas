package com.spel.math;

public class Point {

	private float x, y;
	
	public Point() {
		set(0, 0);
	}
	
	public Point(float x, float y) {
		set(x, y);
	}
	
	public void set(float x, float y) {
		this.x = x;
		this.y = y;
	}

	public float getX() {
		return x;
	}

	public void setX(float x) {
		this.x = x;
	}

	public float getY() {
		return y;
	}

	public void setY(float y) {
		this.y = y;
	}
	
	public void translate(Vector v) {
		translate(v.getX(), v.getY());
	}
	
	public void translate(float x, float y) {
		this.x += x;
		this.y += y;
	}
	
	public void translateX(float x) {
		translate(x, 0);
	}
	
	public void translateY(float y) {
		translate(0, y);
	}
	
	
}
