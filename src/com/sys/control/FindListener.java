package com.sys.control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JDialog;


import com.sys.view.FindDialog;
import com.sys.view.ManagerJpanel;
import com.sys.view.QueryJDialog;

public class FindListener implements ActionListener{
	private JDialog err,masg;
	public void actionPerformed(ActionEvent e) {
		int index = ManagerJpanel.jt.getSelectedRow();
		String id = FindDialog.t_id.getText();
//		String name = FindDialog.t_name.getText();
//		String sex = FindDialog.cb_sex.getSelectedItem().toString();
//		String age = FindDialog.t_age.getText();
//		String ac = FindDialog.cb_ac.getSelectedItem().toString();
//		String sp = FindDialog.t_specialty.getText();
//		System.out.println(id+","+name+","+sex+","+age+","+ac);
		if(id.equals("")){
			FindDialog.err.setText("学号不能为空！");
		}else{
		 
//			ManagerJpanel.t_m.setValueAt(id, index,0);
//			ManagerJpanel.t_m.setValueAt(name, index,1);
//			ManagerJpanel.t_m.setValueAt(sex, index,2);
//			ManagerJpanel.t_m.setValueAt(age, index,3);
//			ManagerJpanel.t_m.setValueAt(ac, index,4);
//			ManagerJpanel.t_m.setValueAt(sp, index,5);
			int count  =  ManagerJpanel.jt.getRowCount();
			for(int i=0;i<count;i++){
				 try {
					 ManagerJpanel.jt.getValueAt(i, 0);
				    ManagerJpanel.jt.getValueAt(i, 0).toString();
				} catch (NullPointerException e2) {
					 
				  	FindDialog.err.setText("无查询结果！");	
					        break;
				}catch(Exception e1){
					continue;
				}
               
				 if(ManagerJpanel.jt.getValueAt(i, 0).toString().equals(id.toString().trim())){
					    String s_id = ManagerJpanel.jt.getValueAt(i, 0).toString();
						String s_name = ManagerJpanel.jt.getValueAt(i, 1).toString();
						String s_sex = ManagerJpanel.jt.getValueAt(i, 2).toString();
						String s_age = ManagerJpanel.jt.getValueAt(i, 3).toString();
						String s_ac = ManagerJpanel.jt.getValueAt(i, 4).toString();
						String s_sp = ManagerJpanel.jt.getValueAt(i, 5).toString();
						
						String[][] list = new String[1][6];
						list[0]= new String[]{ s_id, s_name, s_sex ,s_age ,s_ac, s_sp};
						QueryJDialog dialog  = new QueryJDialog(list);
				
						dialog.setAlwaysOnTop(true);
						dialog.setLayout(null);
						dialog.setSize(580, 320);
						dialog.setLocationRelativeTo(null);
						dialog.setVisible(true);  
					          
//						for(int j=1;j<=count;j++){
//							if(j!=i){
//					     	ManagerJpanel.t_m.removeRow(j);
//							ManagerJpanel.row--;
//							}
//						}
						break;
				 }
			
			}
            
			 
		}
	}
}
