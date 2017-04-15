package com.sys.main;

import java.util.ArrayList;
import java.util.List;

import com.sys.bean.StudentBean;
import com.sys.view.TopJFrame;

public class Main {
	public static String[] t_head = {"学号","姓名","性别","班级","学院","专业"};
	public static String[][] s_list = new String[20][6];
	static{
		s_list[0]= new String[]{"13101476", "刘典雨", "男","1","生命科学学院","农学"};
		s_list[1]= new String[]{"13101477", "惠人峰", "男","1","生命科学学院","药学"};
		s_list[2]= new String[]{"13101479", "李烨", "女","1","生命科学学院","软件工程 "};
		s_list[3]= new String[]{"13101481", "曹兴瑜", "女","1","生命科学学院","临床医学"};
		s_list[4]= new String[]{"13101482", "董浩南", "男","1","生命科学学院","建筑学"};
		s_list[5]= new String[]{"13101485", "杨斌杰", "男","1","生命科学学院","英语"};
	}
	public static TopJFrame top;
	
	public static void main(String[] args) {
		
		top = new TopJFrame("学生信息管理系统");
	}
	
}
