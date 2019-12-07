package GUIsystem;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class ChoiceSubject extends JFrame {
	public static void main(String args[]) {
		ChoiceSubject demo = new ChoiceSubject();
    }
	 public ChoiceSubject() {
	        init();
	        this.setTitle("学生选课系统：学生选课");
			this.setBounds(400, 150, 900, 300);;
			this.setVisible(true);
	    }
	public void init() {
		GetSubjects s=new GetSubjects();
		FileOperations file=new FileOperations();
		String[] s1=s.getSubjects();
		String[] s2=new String[20];
		JFrame frame=new JFrame();
		frame.setTitle("choice");
		JPanel panel2=new JPanel();
		JList list =new JList(s.getSubjects());
		JButton btn1=new JButton("确定");
		btn1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0) {
				if(list.isSelectionEmpty()){
					JOptionPane.showMessageDialog(null, "您没有退课！");
					return;
				}
				for(int i=0;i<s2.length;i++) {
					if(list.isSelectedIndex(i)&&file.readFile(file.readFile("text")).contains(s1[i])==false) {
						s2[i]=s1[i];
					}
				}
			file.WriteFile(s2,file.readFile("text"));
				JOptionPane.showMessageDialog(null, "选课成功");
				setVisible(false);
			}
		});
		JButton btn2=new JButton("退出");
		btn2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0) {
				setVisible(false);
			}
		});
		panel2.add(btn1);
		panel2.add(btn2);
		panel2.add(list);
		this.add(panel2);
	}
}

