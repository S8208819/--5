计182 2018310785 彭亦斌  
一.实验目的  
1.分析学生选课系统  
2.使用GUI窗体及其组件  
3.完成学生选课业务逻辑  
4.基于文件保存和读取  
5.异常处理  
二.实验要求： 
1、	设计GUI窗体，支持学生注册、课程新加、学生选课、学生退课、打印学生选课列表等操作。  
2、	基于事件模型对业务逻辑编程，实现在界面上支持上述操作。  
3、	针对操作过程中可能会出现的各种异常，做异常处理  
4、	基于输入/输出编程，支持学生、课程、教师等数据的读写操作。 
5、	基于Github.com提交实验，包括实验SRC源文件夹程序、README.MD实验报告文档。  
6、	本次实验是综合性实验，在40%的实验成绩中占比最大，望同学们认真对待。  
三、调试过程：
1.建立不同的类，分别对学生、教师、课程的方法属性进行定义：  
	public Students(String id, String name, String sex,Subject choicesub,String score) {  
		super(id, name, sex);  
		this.choicesub=choicesub;  
		this.score=score;  
		}  
	public Subject(String num,String subname,String place,String time,Teacher teaname) {  
		this.num=num;  
		this.subname=subname;  
		this.place=place;  
		this.time=time;  
		this.teaname=teaname;  
	}  
  	public Teacher(String id, String name, String sex,String teachsub) {  
		super(id, name, sex);  
		this.teachsub=teachsub;  
	}  
  	public People(String id,String name,String sex) {  
		this.id=id;  
		this.name=name;  
		this.sex=sex;  
	}
  2.事先设定好的部分教师、课程信息的类  
  提前设定好的部分信息，如下：  
  	Teacher teaone=new Teacher("001","杜老师","F","Math");  
		Teacher teatwo=new Teacher("002","张老师","M","Java");  
		Teacher teathree=new Teacher("003","高老师","M","Physics");  
		Teacher teafour=new Teacher("004","王老师","F","Python");  
		Teacher teafive=new Teacher("005","李老师","F","English");  
		Subject subone=new Subject("1","Math","houseone","8:00",teaone);  
		Subject subtwo=new Subject("2","Java","housetwo","9:00",teatwo);  
		Subject subthree=new Subject("3","Physics","housethree","10:00",teathree);  
		Subject subfour=new Subject("4","Python","housefour","11:00",teafour);  
		Subject subfive=new Subject("5","English","housefive","12:00",teafive);  
		String [] subjects= new String[20];  
		subjects[0]=subone.toString();  
		subjects[1]=subtwo.toString();  
		subjects[2]=subthree.toString();  
		subjects[3]=subfour.toString();  
		subjects[4]=subfive.toString();  
    	for(int i=0;i<file.readFile("test").split("。").length;i++) {  
			subjects[i+5]=file.readFile("test").split("。")[i]+"。";  
		}  
		return subjects;  
		}  
  3.编写学生选课系统界面的相关内容，在窗体中创建三个按钮分别为选课、退课、打印  
  （1）选课、退课、打印函数  
  声明一个函数，并使用点击触发事件，监听，当点击后跳转到相关的类中继续运行程序  
  （2）该类中的主函数，创建窗体并运行上述函数  
  4.选课的类的编写  
  （1）声明函数，调用读取txt文件的类和事先设定好的部分教师、课程信息的类，并设置点击触发事件并随后添加：  
  btn1.addActionListener(new ActionListener(){  
			public void actionPerformed(ActionEvent arg0) {  
				if(list.isSelectionEmpty()){   
					JOptionPane.showMessageDialog(null, "您没有退课！");  
					return;  
				}  
				for(int i=0;i<s2.length;i++) {  
					if(list.isSelectedIndex(i)&&file.readFile(file.readFile("ID")).contains(s1[i])==false) {  
						s2[i]=s1[i];  
					}  
				}  
			file.WriteFile(s2,file.readFile("ID"));  
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
   （2）写该类的的主函数，调用上述函数，设置窗体、弹窗  
 5.退课的类的编写  
 （1）声明函数，调用读取txt文件的类及定义相关操作如下：  
 String[] s2=new String[20];  
		FileOperations file=new FileOperations();  
		JFrame frame=new JFrame();  
		frame.setTitle("Quit");  
		JPanel panel2=new JPanel();  
		s2=file.readFile(file.readFile("ID")).split("。");  
		JList list =new JList(s2);  
		JButton btn1=new JButton("退课");  
点击触发事件及异常处理和退课相关操，如下：  
btn1.addActionListener(new ActionListener(){  
			public void actionPerformed(ActionEvent arg0) {  
				String[] s2=file.readFile(file.readFile("ID")).split("。");  
				if(list.isSelectionEmpty()){  
					JOptionPane.showMessageDialog(null, "您没有退课！");  
					return;  
				}   
				for(int i=0;i<s2.length;i++) {  
					if(list.isSelectedIndex(i)) {//判断课程是否被选中  
						s2[i]=null;//课程信息置为空
					}  
					else {  
						s2[i]=s2[i]+"。";  
					}  
				}  
				file.WriteFile(s2,file.readFile("ID"));  
				JOptionPane.showMessageDialog(null, "退课成功！");  
				setVisible(false);  
			}  
		});  
		JButton btn2=new JButton("退出");  
		btn2.addActionListener(new ActionListener(){  
			public void actionPerformed(ActionEvent arg0) {  
				setVisible(false);  
			}  
		});  
 并添加相关按钮和其他信息  
 （2）该类主函数，调用上述函数，设置窗体、弹窗  
 6.打印选课信息相关的类  
 （1）声明函数，调用读取txt文件的类及定义相关操作，并设置点击触发事件：  
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
添加相关按钮、信息  
7.  
 
  
三、实验运行结果截图：  

四、总结  
本次的java实验整体上还是比较简单地，整节实验课让我了解到字符串的相关知识，让我获益匪浅，在程序中，我学习到了很多新的内容，同时也复习到了之前学习的很多内容，在对字符串中的字符进行查找时，先输入查找内容，再进行遍历，并输出遍历结果，这个内容让我复习到了之前学习的其他相关知识，在对整首古诗的进行分隔的操作，我利用循环进行判断，看他是否满足7个字符和2个字符分别进行判断来达到进行分隔的效果，总之，整个实验还是让我收获了许多内容。  
