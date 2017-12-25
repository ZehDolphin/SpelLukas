package com.spel;

import com.spel.graphics.Window;

public class Platformer {

	public static Window window;
	public static Game game;
	
	public static void main(String[] args) {
		window = new Window("Skit Spel", 800, 600);
		window.setPanel(game = new Game());
		
		game.start();
	}
	
}
