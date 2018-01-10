package com.spel.entities;

import com.spel.graphics.Graphics;
import com.spel.util.ImageLoader;
import com.spel.util.input.Keyboard;
import com.spel.util.input.Keys;

public class Player extends Mob {

	public Player() {
		setSize(75, 75);
		setImage(ImageLoader.loadImage("boi.png"));
		setMovementSpeed(5.0f);
		setAcceleration(1.0f);
		setDeacceleration(0.5f);
	}

	private boolean jumpToggle = false;
	private boolean right = true;

	@Override
	public void update() {
		super.update();

		setMovementSpeed(10);
		setAcceleration(2);
		setDeacceleration(2);

		if (Keyboard.isKeyDown(Keys.JUMP) && !jumpToggle) {
			jumpToggle = true;
			jump();
		} else if (!Keyboard.isKeyDown(Keys.JUMP) && jumpToggle)
			jumpToggle = false;

		if (!isOnGround())
			getVelocity().translateY(1);

		if (Keyboard.isKeyDown(Keys.RIGHT)) {
			moveRight();
			right = true;
		} else if (Keyboard.isKeyDown(Keys.LEFT)) {
			moveLeft();
			right = false;
		} else
			stop();

	}

	@Override
	public void draw() {

		if (right)
			Graphics.drawImage(image, getX(), getY(), getWidth(), getHeight());
		else
			Graphics.drawImage(image, getX() + getWidth(), getY(), -getWidth(), getHeight());

	}

}
