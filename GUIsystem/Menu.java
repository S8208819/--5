package GUIsystem;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Scanner;
import GUIsystem.AppendSubjects;
import GUIsystem.IndexTest;

public class Menu extends JFrame {
	public Menu() {
		setTitle("ѡ��ϵͳ");
		setSize(700,500);
		setLocation(700,300);
		setLayout(new FlowLayout());
		setVisible(true);
		
		Button bu1 = new Button("ѧ��ѡ��");
		Button bu2 = new Button("�γ�����");
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
	
