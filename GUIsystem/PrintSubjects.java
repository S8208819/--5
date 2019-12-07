package GUIsystem;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;

public class PrintSubjects extends JFrame {//extends继承JFrame类
	public static void main(String args[]) {
		PrintSubjects demo = new PrintSubjects();//实例化demo
    }
	 public PrintSubjects() {
	        init();
	        this.setTitle("学生选课系统：课程打印");
			this.setBounds(400, 150, 900, 300);;
			this.setVisible(true);
	    }
	public void init() { 
		FileOperations file=new FileOperations();
		String[] s2=new String[5];
		JFrame frame=new JFrame();
		frame.setTitle("Quit");
		JPanel panel2=new JPanel();
		s2=file.readFile(file.readFile("ID")).split("。");
		JList list =new JList(s2);
		JButton btn2=new JButton("退出");
		btn2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0) {
				setVisible(false);
			}
		});
		panel2.add(btn2);
		panel2.add(list);
		this.add(panel2);
	}
}