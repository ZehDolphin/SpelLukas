package com.spel.entities;

import com.spel.util.ImageLoader;
import com.spel.util.input.Keyboard;
import com.spel.util.input.Keys;

public class Player extends Mob {

	public Player() {
		setSize(75, 75);
		setImage(ImageLoader.loadImage("boi.png"));
		setMovementSpeed(5.0f);
	}
	
	@Override
	public void update() {
		super.update();

		
		if (Keyboard.isKeyDown(Keys.RIGHT)) moveRight();
		else if (Keyboard.isKeyDown(Keys.LEFT)) moveLeft();
		else stop();
		
	}

}
