package com.spel.graphics;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JPanel;

import com.spel.util.input.Keyboard;

public class Window {

	private JFrame frame;

	public Window(String title, int width, int height) {

		if (System.getProperty("os.name").equals("Mac OS X"))
		try {
			Runtime.getRuntime().exec("defaults write -g ApplePressAndHoldEnabled -bool false");
		} catch (IOException e) {
			e.printStackTrace();
		}

		frame = new JFrame(title);
		frame.setSize(width, height);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		frame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				if (System.getProperty("os.name").equals("Mac OS X"))
				try {
					Runtime.getRuntime().exec("defaults write -g ApplePressAndHoldEnabled -bool true");
				} catch (IOException ee) {
					ee.printStackTrace();
				}
				System.exit(0);
			}
		});
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
