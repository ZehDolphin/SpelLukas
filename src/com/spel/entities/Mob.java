package com.spel.entities;

import com.spel.math.Vector;

public class Mob extends Entity {

	private float movementSpeed = 5.0f;
	
	private float acceleration = 1.0f;
	
	private float deacceleration = 0.5f;
	
	private Vector velocity = new Vector();
	
	public Mob() {
	}

	public Mob(float x, float y) {
		super(x, y);
	}
	
	public void moveRight() {
		if (velocity.getX() < movementSpeed)
			velocity.translateX(getAcceleration());
	}
	
	public void moveLeft() {
		if (velocity.getX() > -movementSpeed)
			velocity.translateX(-getAcceleration());
	}
	
	public void stop() {
		if (velocity.getX() > 0) velocity.translateX(-getDeacceleration());
		if (velocity.getX() < 0) velocity.translateX(getDeacceleration());
	}

	@Override
	public void update() {
		super.update();
		
		translate(velocity);
		
	}
	
	
	
	
	
	public void setMovementSpeed(float speed) {
		movementSpeed = speed;
	}
	
	public float getMovementSpeed() {
		return movementSpeed;
	}

	public float getAcceleration() {
		return acceleration;
	}

	public void setAcceleration(float acceleration) {
		this.acceleration = acceleration;
	}

	public Vector getVelocity() {
		return velocity;
	}

	public void setVelocity(Vector velocity) {
		this.velocity = velocity;
	}

	public float getDeacceleration() {
		return deacceleration;
	}

	public void setDeacceleration(float deacceleration) {
		this.deacceleration = deacceleration;
	}
	
	
	
}
