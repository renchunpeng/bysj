package bysj;
import java.awt.Dimension;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.*;
public class mianban1 extends JPanel
{
	static String[][] ywzzlocation=new String[100000][4];
	static String[][] zzlocation=new String[100000][3];	
	 static int ywzzlocationsum=0;
	static int zzlocationsum=0;
	public mianban1()
	{
		for(int kkk=0;kkk<100000;kkk++)
		{
			ywzzlocation[kkk][3]="0";
		}		
	System.out.println("���һ��������");	
	setLayout(null);	
	ss sss=new ss();
	sss.settree();
//������ʾ��ť***************************************************
	JLabel t1=new JLabel("sno");JLabel t2=new JLabel("��Դ��Ϣ");JLabel t3=new JLabel("������Ϣ");
	t1.setBounds(0,0,200,50);t2.setBounds(200,0,200,50);t3.setBounds(800,0,200,50);//��ǩ�Ĵ��λ��	
	add(t1);add(t2);add(t3);
//�������߿�ʼ����ť**********************************************
	int sum=ss.count;
	int j=50;//j��Ϊ�˿��ư�ť��ŵ�λ��
	String str;int k=0;	
	for(int i=0;i<sum;i++)
	{
		String t="";
	if(ss.sstr[i].equals(t)){continue;}
	JLabel btn=new JLabel(ss.sstr[i]);
	btn.setBounds(800,j,200,50);//��ǩ�Ĵ��λ��	
	ywzzlocation[i][0]=ss.sstr[i];//�����������ڼ�¼�������ߵ������ʹ�ŵ�ַ
	ywzzlocation[i][1]=String.valueOf(800);
	ywzzlocation[i][2]=String.valueOf(j);
	ywzzlocationsum++;
	j+=50;	
	add(btn);	
	}
//��Դ������һ�鿪ʼ����ť*******************************************************
	int zzsum=chuli.count;
	String strrr="";
	int jj=50;	
	for(int p=0;p<zzsum;p++)
	{
		if(p==4){break;}//���������Դ���ߵ���������
		int pp=Integer.valueOf(chuli.everylinezzname[p][0]);//����Դ������д��һ���ַ���
		for(int kk=0;kk<pp;kk++)
		{
			strrr+=chuli.everylinezzname[p][kk+2];
			strrr+=" ";
		}
		JButton btn2=new JButton(strrr);
		JLabel sno=new JLabel(chuli.everylinezzname[p][1]);
		strrr="";
		btn2.setBounds(200,jj,200,50);//��ǩ�Ĵ��λ��	
		sno.setBounds(0,jj,200,50);//��ǩ�Ĵ��λ��	
		zzlocation[p][0]=chuli.everylinezzname[p][1];//�����������ڼ�¼��Դ���ߵ������ʹ�ŵ�ַ
		zzlocation[p][1]=String.valueOf(200);
		zzlocation[p][2]=String.valueOf(jj);
		zzlocationsum++;
		jj+=100;	
		add(btn2);
		add(sno);
	}
	}
//���߳���********************************************
	protected void paintComponent(Graphics g) 
	{
		for(int kkk=0;kkk<100000;kkk++)
		{
			ywzzlocation[kkk][3]="0";
		}
		g.setColor(Color.red);	
		String str;//��¼������Դ���ߵ�SNO
		String str2;
		int x1;int x2;int y1;int y2;
		for(int sum=0;sum<zzlocationsum;sum++)
		{			
			x1=Integer.valueOf(zzlocation[sum][1]);
			y1=Integer.valueOf(zzlocation[sum][2]);
			str=zzlocation[sum][0];
			for(int sum2=0;sum2<chuli.count2;sum2++)
			{
				if(str.equals(chuli.everylineywzzname[sum2][1]))
				{
					int sum3=Integer.valueOf(chuli.everylineywzzname[sum2][0]);
					for(int sum4=0;sum4<sum3;sum4++)
					{
						str2=chuli.everylineywzzname[sum2][sum4+2];
						if(str2.equals(""))
						{
							continue;
						}
						for(int sum5=0;sum5<ywzzlocationsum;sum5++)
						{
							if(str2.equals(ywzzlocation[sum5][0]))
							{
								int kkkk=Integer.valueOf(ywzzlocation[sum5][3]);
								kkkk+=1;						
								ywzzlocation[sum5][3]=String.valueOf(kkkk);
								x2=Integer.valueOf(ywzzlocation[sum5][1]);
								y2=Integer.valueOf(ywzzlocation[sum5][2]);
								 g.drawLine(x1+200,y1+25,x2,y2+25);
							}
						}
					}
				}
			}
		}		
		int big=0;
		String st="";
		for(int sum5=0;sum5<ywzzlocationsum;sum5++)
		{
		if(big<=Integer.valueOf(ywzzlocation[sum5][3]))
		{
		big=Integer.valueOf(ywzzlocation[sum5][3]);
		st=ywzzlocation[sum5][0];
		}
		}
		System.out.println(big+"    "+st);
//		mianban2 m2=new mianban2();
//		m2.jieshou1(big,st);
		int ziy=0;
		for(int ii=0;ii<chuli.count2;ii++)
		{	
			
			int sum=Integer.valueOf(chuli.everylineywzzname[ii][0]);
			for(int iii=0;iii<sum;iii++)
			{
				if(st.equals(chuli.everylineywzzname[ii][iii+2]))
				{
					String snoo=chuli.everylineywzzname[ii][1];
					for(int i4=0;i4<100;i4++)
					{
						if(snoo.equals(chuli.everylinezzname[i4][1]))
						{
							int sum2=Integer.valueOf(chuli.everylinezzname[i4][0]);
							for(int i5=0;i5<sum2;i5++)
							{
								if(st.equals(chuli.everylinezzname[i4][i5+2]))
								{
									ziy++;
									System.out.println("��������"+ziy+"��");
									
								}
							}
						}
					}
				}
			}//m2.jieshou3(ziy);
		}
		
	} 
	
}
