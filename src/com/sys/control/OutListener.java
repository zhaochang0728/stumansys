package com.sys.control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.sys.main.Main;
import com.sys.view.ManagerJpanel;
import com.sys.view.TopJFrame;

public class OutListener implements ActionListener{

	public void actionPerformed(ActionEvent e) {
		String j = e.getActionCommand();
		System.out.println(j);
		if(j.equals("确定")){
			TableListener.jd_o.dispose();
			TopJFrame.c.first(TopJFrame.jp);
			Main.top.repaint();
		}else{
			TableListener.jd_o.dispose();
		}
	}

}
