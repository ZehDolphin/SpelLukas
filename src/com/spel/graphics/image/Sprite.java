package com.spel.graphics.image;

import java.awt.image.BufferedImage;

import com.spel.graphics.Graphics;
import com.spel.math.Rectangle;

public class Sprite extends Rectangle {

	protected BufferedImage image;
	
	public Sprite() {
		
	}

	public Sprite(float x, float y, float width, float height) {
		super(x, y, width, height);
	}
	
	public Sprite setImage(BufferedImage image) {
		this.image = image;
		return this;
	}
	
	public void draw() {
		Graphics.drawImage(image, this);
	}

}
