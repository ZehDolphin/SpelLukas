package com.spel;

import java.awt.Graphics;

import com.spel.entities.EntityHandler;
import com.spel.entities.Player;
import com.spel.entities.structures.Platform;
import com.spel.graphics.GamePanel;

@SuppressWarnings("serial")
public class Game extends GamePanel {

	public Player player;
	
	public Game() {
		
		EntityHandler.add(player = new Player());
		player.set(Platformer.window.getWidth() / 2 - player.getWidth() / 2, 50);
		
		EntityHandler.add(new Platform(100, 500, 600, 50));
		
	}

	@Override
	public void update() {
		EntityHandler.update();
		
		
	}

	@Override
	public void draw(Graphics g) {
		EntityHandler.draw();
	}

}
