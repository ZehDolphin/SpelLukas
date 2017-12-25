package com.spel.graphics;

import java.awt.Graphics;

import javax.swing.JPanel;

@SuppressWarnings("serial")
public abstract class GamePanel extends JPanel implements Runnable {

	private Thread thread;
	
	private int frameCap = 60;
	
	public GamePanel() {
		thread = new Thread(this, "game_thread");
	}
	
	public void start() {
		thread.start();
	}
	
	@Override
	public void run() {
		while(true) {
			
			try {
				Thread.sleep(1000 / frameCap);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			update();
			repaint();
			
		}
	}
	
	public abstract void update();
	public abstract void draw(Graphics g);
	
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		com.spel.graphics.Graphics.setGraphics(g);
		draw(g);
	}

}
