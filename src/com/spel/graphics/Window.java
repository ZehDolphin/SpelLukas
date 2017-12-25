package com.spel.graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

import com.spel.util.input.Keyboard;

public class Window {

	private JFrame frame;
	
	public Window(String title, int width, int height) {
		
		frame = new JFrame(title);
		frame.setSize(width, height);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setFocusable(true);
		
		frame.addKeyListener(new Keyboard());
		
		frame.setVisible(true);

	}
	
	public void setPanel(JPanel panel) {
		frame.add(panel);
		frame.setVisible(true);
	}
	
	public int getWidth() {
		return frame.getWidth();
	}
	
	public int getHeight() {
		return frame.getHeight();
	}
	
}
