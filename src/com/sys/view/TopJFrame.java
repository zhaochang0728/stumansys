package com.sys.view;

import java.awt.CardLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class TopJFrame extends JFrame{
	public static CardLayout c;
	public static JPanel jp;
	public TopJFrame(String name) {
		super(name);
		c = new CardLayout();
		jp = new JPanel(c);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(1000,600);
		this.setLocation(250, 100);
		jp.add(new LoginJPanel());
		jp.add(new ManagerJpanel());
		this.add(jp);
		this.setResizable(false);
		this.setVisible(true);
	}
}
