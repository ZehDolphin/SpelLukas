package com.spel.graphics;

import java.awt.Color;
import java.awt.image.BufferedImage;

import com.spel.math.Rectangle;

public class Graphics {

	private static java.awt.Graphics g;
	
	public static void setGraphics(java.awt.Graphics g) {
		Graphics.g = g;
	}
	
	public static void drawImage(BufferedImage image, float x, float y, float width, float height) {
		g.drawImage(image, (int) x, (int) y, (int) width, (int) height, null);
	}
	
	public static void drawImage(BufferedImage image, Rectangle r) {
		drawImage(image, r.getX(), r.getY(), r.getWidth(), r.getHeight());
	}
	
	public static void setColor(Color color) {
		g.setColor(color);
	}
	
	public static void drawRect(float x, float y, float width, float height) {
		g.drawRect((int) x, (int) y, (int) width, (int) height);
	}
	
	public static void drawRect(Rectangle r) {
		drawRect(r.getX(), r.getY(), r.getWidth(), r.getHeight());
	}
	
}
