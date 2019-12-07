package GUIsystem;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Scanner;
import GUIsystem.AppendSubjects;
import GUIsystem.IndexTest;

public class Menu extends JFrame {
	public Menu() {
		setTitle("选课系统");
		setSize(700,500);
		setLocation(700,300);
		setLayout(new FlowLayout());
		setVisible(true);
		
		Button bu1 = new Button("学生选课");
		Button bu2 = new Button("课程新添");
		add(bu1);
		add(bu2);
		
		bu1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				IndexTest indextest= new IndexTest();
		
		
	}

});
		bu2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AppendSubjects appendsubjects= new AppendSubjects();
		
		
	}

});
	}
	public static void main(String[] args) {
	    new Menu();
	    }
}
	
