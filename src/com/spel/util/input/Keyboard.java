package com.spel.util.input;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Keyboard implements KeyListener {

	private static boolean[] keys = new boolean[1000];
	
	public Keyboard() {
	}

	public static boolean isKeyDown(int keycode) {
		return keys[keycode];
	}
	
	@Override
	public void keyTyped(KeyEvent e) {
		System.out.println("Key typed: " + e.getKeyCode());
	}

	@Override
	public void keyPressed(KeyEvent e) {
		keys[e.getKeyCode()] = true;
		System.out.println("Key press: " + e.getKeyCode());
	}

	@Override
	public void keyReleased(KeyEvent e) {
		keys[e.getKeyCode()] = false;
		System.out.println("Key release: " + e.getKeyCode());
	}

}
