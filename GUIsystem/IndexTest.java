package GUIsystem;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class IndexTest extends JFrame {
	public static void main(String args[]) {
		IndexTest demo = new IndexTest();//实例化demo
    }
	 public IndexTest() {
	        init();
	        this.setTitle("学生选课系统");
			this.setSize(400, 150);
			this.setVisible(true);
	    }
	public void init() { 
		JFrame frame=new JFrame();
		JPanel panel=new JPanel();
		JButton btn1=new JButton("学生选课");//创建按钮组件
		btn1.setBounds(10, 10, 20, 20);
		btn1.addActionListener(new ActionListener(){//监听事件
			public void actionPerformed(ActionEvent arg0) {
			ChoiceSubject choice=new ChoiceSubject();//点击按钮时，对choice进行实例化，进行页面的跳转
			}
		});
		JButton btn2=new JButton("学生退课");
		btn2.setBounds(40, 10, 20, 20);
		btn2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0) {
			QuitSubjects quit=new QuitSubjects();
			}
		});
		JButton btn3=new JButton("课程打印");
		btn3.setBounds(80, 10, 20, 20);
		btn3.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0) {
			PrintSubjects print=new PrintSubjects();
			}
		});
	    panel.add(btn1);
		panel.add(btn2);
		panel.add(btn3);
		this.add(panel);
	}
}