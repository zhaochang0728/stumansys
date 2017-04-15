package com.sys.control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowFocusListener;

import com.sys.view.ManagerJpanel;
import com.sys.view.UpdateDialog;

public class DiaListener implements WindowFocusListener{

	public void windowGainedFocus(WindowEvent e) {
		// TODO Auto-generated method stub
	}

	public void windowLostFocus(WindowEvent e) {
		e.getComponent().disable();
	}

}
