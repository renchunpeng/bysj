package bysj;
import javax.swing.*;

import java.awt.Dimension;
import java.awt.event.*;
public class c1 extends MouseAdapter implements ActionListener
{
	JMenuBar mb1;
	JFrame f;
	JMenu mf1;
	JScrollPane jsp1 = null;
	JScrollPane jsp2 = null;
	public void display()
	{
		f=new JFrame("毕业设计");
		f.setSize(1000,725);
		f.setLocation(0,0);
		f.setLayout(null);
		caidan();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}
	public void caidan()
	{
		mb1=new JMenuBar();
		f.setJMenuBar(mb1);
		mf1=new JMenu("检索方式");
		mb1.add(mf1);
		JMenuItem anniu1=new JMenuItem("作者之间的联系");
		mf1.add(anniu1);
		JMenuItem anniu2=new JMenuItem("地区之间的联系");
		mf1.add(anniu2);
		JMenuItem anniu3=new JMenuItem("期刊之间的联系");
		mf1.add(anniu3);
	//	mf1.add(new JMenuItem("学科之间的联系"));
	//	mf1.add(new JMenuItem("机构之间的联系"));
		anniu1.addActionListener(this);
		anniu2.addActionListener(this);
		anniu3.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e)
	{
		
		if(e.getActionCommand()=="作者之间的联系")		
		{
			mianban1 s=new mianban1();
			s.setPreferredSize(new Dimension(1000,8000));  			
			jsp1 = new JScrollPane(s);
			jsp1.setSize(1000,725);
			jsp1.setLocation(0,0);
			f.add(jsp1);
			mianban2 m2=new mianban2();
			m2.wunai();
			f.add(m2);
			f.setVisible(true);				
		}
		if(e.getActionCommand()=="地区之间的联系")
		{
			mianban1 s=new mianban1();
			s.setPreferredSize(new Dimension(1000,8000));  			
			jsp1 = new JScrollPane(s);
			jsp1.setSize(1000,725);
			jsp1.setLocation(0,0);
			f.add(jsp1);
			mianban2 m2=new mianban2();
			m2.wunai();
			f.add(m2);
			f.setVisible(true);		
		}
		if(e.getActionCommand()=="期刊之间的联系")		
		{
			mianban1 s=new mianban1();
			s.setPreferredSize(new Dimension(1000,8000));  			
			jsp1 = new JScrollPane(s);
			jsp1.setSize(1000,725);
			jsp1.setLocation(0,0);
			f.add(jsp1);
			mianban2 m2=new mianban2();
			m2.wunai();
			f.add(m2);
			f.setVisible(true);				
		}
	}	
	public static void main(String[] args)
	{
		(new c1()).display();
	}
}
