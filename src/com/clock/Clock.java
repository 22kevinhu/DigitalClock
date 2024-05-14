package com.clock;

import javax.swing.*;
import java.awt.*;
import java.time.LocalTime;

public class Clock extends JFrame {
	private JLabel time;
	private JLabel title;
	private JPanel clockPanel;
	private LocalTime currentTime;

	public Clock() {
		this.setContentPane(clockPanel);
		this.setTitle("Clock");
		this.setResizable(true);
		this.setSize(600, 300);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		time.setSize(50, 50);

		setTime();
	}

	public void setTime() {
		while (true) {
			currentTime = LocalTime.now();
			time.setText(String.format("%02d:%02d:%02d", currentTime.getHour(), currentTime.getMinute(),
					currentTime.getSecond()));
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		new Clock();
	}
}
