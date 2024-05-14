package com.clock;

import javax.swing.*;
import java.awt.*;
import java.time.LocalTime;

public class Clock extends JFrame {
	private JLabel time;
	private JLabel title;
	private JPanel clockPanel;
	LocalTime currentTime;

	public Clock() {
		this.setTitle("Clock");
		this.setResizable(true);
		currentTime = LocalTime.now();
		time.setText(String.format("%02d:%02d:%02d", currentTime.getHour(), currentTime.getMinute(),
				currentTime.getSecond()));
	}

	public void setTime() {

	}

	public static void main(String[] args) {
		JFrame frame = new JFrame("Clock");
		frame.setContentPane(new Clock().clockPanel);
		frame.setSize(600, 300);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
