package com.sys.view;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import com.sys.control.TableListener;
import com.sys.data.StaticData;
import com.sys.main.Main;

public class ManagerJpanel extends JPanel{
	private JButton jb_del,jb_find,jb_update,jb_insert,jb_out;
	public JTextField tex_id;
	private JLabel lab_check,lab_id;
	public static int row = 6;
	public static DefaultTableModel t_m = new DefaultTableModel(Main.s_list,Main.t_head);
	public static final JTable jt = new JTable(t_m){
		public boolean isCellEditable(int row, int column) {
			return false;
		}
	};
	private JScrollPane js;
	public ManagerJpanel(){
		this.repaint();
		this.setLayout(null);
		jb_del = new JButton(StaticData.DEL);
		jb_find = new JButton(StaticData.FIND);
		jb_update = new JButton(StaticData.UPDATE);
		jb_insert = new JButton(StaticData.INSETT);
		jb_out = new JButton(StaticData.OUT);
		tex_id = new JTextField();
		lab_check = new JLabel(StaticData.CHECK);
		lab_id = new JLabel(StaticData.S_ID+":");
		jt.setDragEnabled(false);
		js = new JScrollPane();
		jt.setBackground(Color.LIGHT_GRAY);
		jt.setRowHeight(30);
		jt.setColumnSelectionAllowed(false);
		jt.setCellSelectionEnabled(false);
		jt.setRowSelectionAllowed(true);
		js.setViewportView(jt);
		js.setBounds(220, 30, 700, 450);
		jb_del.setBounds(20, 50, 100, 30);
		jb_del.setName("del");
		jb_find.setBounds(20, 100, 100, 30);
		jb_find.setName("find");
		jb_update.setBounds(20, 150, 100, 30);
		jb_update.setName("update");
		jb_insert.setBounds(20, 200, 100, 30);
		jb_insert.setName("insert");
		jb_out.setBounds(20, 250, 100, 30);
		jb_out.setName("out");
		TableListener t = new TableListener();
		jb_del.addMouseListener(t);
		jb_find.addMouseListener(t);
		jb_insert.addMouseListener(t);
		jb_update.addMouseListener(t);
		jb_out.addMouseListener(t);
		this.add(jb_del);
		this.add(jb_find);
		this.add(jb_update);
		this.add(jb_insert);
		this.add(jb_out);
		this.add(js);
		this.setSize(1000, 600);
		
	}
	protected void paintComponent(Graphics g) {
		Graphics2D g2d = (Graphics2D)g;
		g2d.setColor(Color.GRAY);
		g2d.drawLine(150, 0,150, 600);
	}
	
}
