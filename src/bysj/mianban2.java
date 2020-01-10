package bysj;
import java.awt.Dimension;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class mianban2 extends JPanel implements ActionListener
{
	private JTextField text=new JTextField();
	private JButton jb=new JButton("查询");
	private JTextArea area=new JTextArea();
	private JScrollPane jsp=new JScrollPane(area);
	String st;int big=0;
	static int ziy=0;
	public void wunai()
	{
	setLayout(null);
	setSize(400,725);//设置面板大小
	setLocation(1000,0);//设置面板位置
	setBackground(Color.yellow);				
	text.setBounds(20,20,200,25);		
	jb.setBounds(250,20,100,25);
	jsp.setBounds(20,55,320,260);
	add(jsp);
	add(jb);
	add(text);
	jb.addActionListener(this);
	text.addActionListener(this);
	}
	
	
	public void actionPerformed(ActionEvent e)
	{
		String str=text.getText();
		for(int sum5=0;sum5<mianban1.ywzzlocationsum;sum5++)
		{
			
			if(str.equals(mianban1.ywzzlocation[sum5][0]))
			{
				area.append("一共被引用"+mianban1.ywzzlocation[sum5][3]+"次");//追加显示	
				break;
			}
			if(sum5==mianban1.ywzzlocationsum-1)
			{
				area.append("一共被引用"+"0"+"次");//追加显示		
			}
		}
		
		
		for(int ii=0;ii<chuli.count2;ii++)
		{	
			
			int sum=Integer.valueOf(chuli.everylineywzzname[ii][0]);
			for(int iii=0;iii<sum;iii++)
			{
				if(str.equals(chuli.everylineywzzname[ii][iii+2]))
				{
					String snoo=chuli.everylineywzzname[ii][1];
					for(int i4=0;i4<chuli.count;i4++)
					{
						if(snoo.equals(chuli.everylinezzname[i4][1]))
						{
							int sum2=Integer.valueOf(chuli.everylinezzname[i4][0]);
							for(int i5=0;i5<sum2;i5++)
							{
								if(str.equals(chuli.everylinezzname[i4][i5+2]))
								{
									ziy++;
								//	System.out.println("其中自引"+ziy+"次");
								//	area.append("其中自引"+ziy+"次");//追加显示		
								}
							}
						}
					}
				}
			}
		}area.append("其中自引"+ziy+"次"+"\n");ziy=0;//追加显示	
		
	}
	
	
		
	
}
