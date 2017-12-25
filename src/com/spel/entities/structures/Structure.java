package com.spel.entities.structures;

import java.awt.Color;

import com.spel.entities.Entity;
import com.spel.graphics.Graphics;

public class Structure extends Entity {

	public Structure() {
	}
	
	public Structure(float x, float y, float width, float height) {
		set(x, y);
		setSize(width, height);
	}

	@Override
	public void draw() {
		super.draw();

		Graphics.setColor(Color.RED);
		Graphics.drawRect(this);
		
	}
	
}
