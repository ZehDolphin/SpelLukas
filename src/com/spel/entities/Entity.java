package com.spel.entities;

import com.spel.graphics.image.Sprite;

public class Entity extends Sprite {

	private boolean delete = false;
	
	public Entity() {
		
	}
	
	public Entity(float x, float y) {
		set(x, y);
	}
	
	public void update() {
		
	}
	
	public void remove() {
		delete = true;
	}
	
	public boolean shouldRemove() {
		return delete;
	}


}
