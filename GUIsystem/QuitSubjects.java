package GUIsystem;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;





public class QuitSubjects extends JFrame {
	public static void main(String args[]) {
		QuitSubjects demo = new QuitSubjects();
    }
	 public QuitSubjects() {
	        init();
	        this.setTitle("ѧ��ѡ��ϵͳ��ѧ���˿�");
			this.setBounds(400, 150, 900, 300);;
			this.setVisible(true);
	    }
	public void init() {
		String[] s2=new String[20];
		FileOperations file=new FileOperations();
		JFrame frame=new JFrame();
		frame.setTitle("Quit");
		JPanel panel2=new JPanel();
		s2=file.readFile(file.readFile("ID")).split("��");
		JList list =new JList(s2);
		JButton btn1=new JButton("�˿�");
		btn1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0) {
				String[] s2=file.readFile(file.readFile("ID")).split("��");
				if(list.isSelectionEmpty()){
					JOptionPane.showMessageDialog(null, "��û���˿Σ�");
					return;
				}
				for(int i=0;i<s2.length;i++) {
					if(list.isSelectedIndex(i)) {//�жϿγ��Ƿ�ѡ��
						s2[i]=null;//�γ���Ϣ��Ϊ��
					}
					else {
						s2[i]=s2[i]+"��";
					}
				}
				file.WriteFile(s2,file.readFile("ID"));
				JOptionPane.showMessageDialog(null, "�˿γɹ���");
				setVisible(false);
			}
		});
		JButton btn2=new JButton("�˳�");
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
