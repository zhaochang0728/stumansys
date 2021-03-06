package com.sys.view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;

import com.sys.control.DiaListener;
import com.sys.control.FindListener;
import com.sys.control.TableListener;
import com.sys.control.UpdateListener;
import com.sys.data.StaticData;

public class FindDialog extends JDialog{
	
	private JLabel id,name,sex,age,academy,specialty;
	public static JLabel err;
	public static JTextField t_id,t_name,t_sex,t_age,t_academy,t_specialty;
	private JButton check,ok,cancle;
	public static JComboBox cb_sex,cb_ac;
	
	public FindDialog(){
		this.setAlwaysOnTop(true);
		this.setTitle("查找学生信息");
		this.setLayout(null);
		this.setSize(580, 320);
		this.setLocationRelativeTo(null);
		//this.addWindowFocusListener(new DiaListener());
		int index = ManagerJpanel.jt.getSelectedRow();
	 

		
		
		id = new JLabel(StaticData.S_ID+":");
		name = new JLabel(StaticData.S_NAME+":");
		sex = new JLabel(StaticData.S_SEX+":");
		age = new JLabel(StaticData.S_CLASS+":");
		academy = new JLabel(StaticData.S_ACADEMY+":");
		specialty = new JLabel(StaticData.S_SPECIALTY+":");
		err = new JLabel();
		t_age = new JTextField();
		t_id = new JTextField();
		t_name = new JTextField();
		t_specialty = new JTextField();
		cb_sex = new JComboBox();
		cb_ac = new JComboBox();
		ok = new JButton("查找");
		cancle = new JButton("取消");
		cb_sex.addItem("男");
		cb_sex.addItem("女");
		id.setBounds(30, 50, 30, 30);
		t_id.setBounds(80, 50, 100, 30);
		name.setBounds(200, 50, 30, 30);
		t_name.setBounds(250, 50, 100, 30);
		sex.setBounds(370, 50, 30, 30);
		cb_sex.setBounds(420, 50, 100, 30);
		 
		age.setBounds(30, 100, 30, 30);
		t_age.setBounds(80, 100, 100, 30);
		academy.setBounds(200, 100, 30, 30);
		cb_ac.setBounds(250, 100, 100, 30);
		specialty.setBounds(370,100,30,30);
		t_specialty.setBounds(420,100,100,30);
		 
			cb_ac.addItem("生命科学学院");
			cb_ac.addItem("经济管理学院");
			cb_ac.addItem("人文社科学院");
			cb_ac.addItem("外国语学院");
			cb_ac.addItem("继续教育学院");
			cb_ac.addItem("动物科技学院");
			cb_ac.addItem("农学院");
		 
		err.setBounds(30, 150, 120, 30);
		err.setForeground(Color.RED);
		ok.setBounds(130, 200, 100, 30);
		cancle.setBounds(350, 200, 100, 30);		
		
		ok.addActionListener(new FindListener());
		cancle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TableListener.jd_u.dispose();
			}
		});
		
		add(id);
		add(t_id);
		add(name);
		add(t_name);
		add(sex);
		add(cb_sex);
		add(age);
		add(t_age);
		add(academy);
		add(specialty);
		add(t_specialty);
		add(cb_ac);
		add(err);
		add(ok);
		add(cancle);
		setVisible(true);
	}
}
