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
	
	
	
	public boolean contains(float x, float y) {
		return (getX() <= x &&
				getY() <= y &&
				getX() + getWidth() >= x &&
				getY() + getHeight() >= y);
	}

	public boolean contains(Point p) {
		return contains(p.getX(), p.getY());
	}
	
	public boolean contains(Rectangle r) {
		return 	contains(r.getX(), r.getY()) &&
				contains(r.getX() + r.getWidth(), r.getY()) &&
				contains(r.getX() + r.getWidth(), r.getY() + r.getHeight()) &&
				contains(r.getX(), r.getY() + r.getHeight());
	}
	
	public boolean intersects(Rectangle r) {
		return 	contains(r.getX(), r.getY()) ||
				contains(r.getX() + r.getWidth(), r.getY()) ||
				contains(r.getX() + r.getWidth(), r.getY() + r.getHeight()) ||
				contains(r.getX(), r.getY() + r.getHeight());
	}
	
	public boolean intersects(float x, float y, float w, float h) {
		return 	contains(x, y) ||
				contains(x + w, y) ||
				contains(x + w, y + h) ||
				contains(x, y + h);
	}

}
