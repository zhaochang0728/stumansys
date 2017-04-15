package com.sys.view;

import javax.swing.JDialog;
import javax.swing.JLabel;

import com.sys.control.DiaListener;

public class HelpDialog extends JDialog{
	
	private JLabel lab1,lab2;
	public HelpDialog() {
		this.setTitle("帮助");
		this.setLayout(null);
		lab1 = new JLabel("登录账号：admin   密码：123456");
		lab2 = new JLabel("默认最大学生数量为20");
		lab1.setBounds(20, 10, 210, 30);
		lab2.setBounds(20, 50, 210, 30);
		this.add(lab1);
		this.add(lab2);
		this.setSize(250, 150);
		this.setLocationRelativeTo(null);
		this.addWindowFocusListener(new DiaListener());
		this.setVisible(true);
		
	}
}
