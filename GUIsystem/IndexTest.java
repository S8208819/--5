package GUIsystem;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class IndexTest extends JFrame {
	public static void main(String args[]) {
		IndexTest demo = new IndexTest();//ʵ����demo
    }
	 public IndexTest() {
	        init();
	        this.setTitle("ѧ��ѡ��ϵͳ");
			this.setSize(400, 150);
			this.setVisible(true);
	    }
	public void init() { 
		JFrame frame=new JFrame();
		JPanel panel=new JPanel();
		JButton btn1=new JButton("ѧ��ѡ��");//������ť���
		btn1.setBounds(10, 10, 20, 20);
		btn1.addActionListener(new ActionListener(){//�����¼�
			public void actionPerformed(ActionEvent arg0) {
			ChoiceSubject choice=new ChoiceSubject();//�����ťʱ����choice����ʵ����������ҳ�����ת
			}
		});
		JButton btn2=new JButton("ѧ���˿�");
		btn2.setBounds(40, 10, 20, 20);
		btn2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0) {
			QuitSubjects quit=new QuitSubjects();
			}
		});
		JButton btn3=new JButton("�γ̴�ӡ");
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