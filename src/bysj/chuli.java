package bysj;

import java.io.*;
import javax.swing.*;
import javax.swing.JFileChooser;


public class chuli
{
	static String[][] everylinezzname=new String[10000][100];
	static int count=0;//记录处理到第几行数据了
	static String[][] everylineywzzname=new String[100000][1000];
	static int count2=0;//记录处理到第几行数据了
	String dizhi;//这是打开来源文件的地址字符串
	String dizhi2;//这是打开引文文件的地址字符串
	public void chulidata()
	{
		String str;
		int[] everylinezzsum=new int[10000];//记录每本书有几个作者(数量),10000在这里是为了满足行数，下同理
		openwindow s=new openwindow();
		s.fangfa("来源信息");
		dizhi=s.path;//获得打开文件的地址
		try
		{
		FileReader f1=new FileReader(dizhi);		
		BufferedReader buf1=new BufferedReader(f1);
		while((str=buf1.readLine())!=null)//将所打开的文件一行一行读取
			{ 	
			String[] strarray=str.split(";"); //将读取到的整行数据以;键进行拆分
			everylinezzsum[count]=strarray.length-1;
//			System.out.println(everylinezzsum[count]);//输出每一行有几个来源作者
			everylinezzname[count][0]=String.valueOf(everylinezzsum[count]);
			for (int i = 0; i < strarray.length; i++)
		      {  				
				everylinezzname[count][i+1]=strarray[i];
//				System.out.println(everylinezzname[count][i+1]);								
		      }
//			if(count==100)break;
			count++;	
			}
//		System.out.println(count);
		}
		catch(IOException ioe)
		{			
			System.out.println("错误!"+ioe);
		}		
//	****************引文作者数据开始处理************************	
		String str2;
		int[] everylineywzzsum=new int[100000];//记录每本书有几个作者(数量),10000在这里是为了满足行数，下同理	
		openwindow s2=new openwindow();		
		s2.fangfa("引文信息");
		dizhi2=s2.path;//获得打开文件的地址
		try
		{
		FileReader f2=new FileReader(dizhi2);		
		BufferedReader buf2=new BufferedReader(f2);
		while((str2=buf2.readLine())!=null)//将所打开的文件一行一行读取
			{ 	
			String[] strarray2=str2.split(";"); //将读取到的整行数据以;键进行拆分
			everylineywzzsum[count2]=strarray2.length-1;
//			System.out.println(everylineywzzsum[count2]);//输出每一行有几个引文作者
			everylineywzzname[count2][0]=String.valueOf(everylineywzzsum[count2]);
			for (int i = 0; i < strarray2.length; i++)
		      {  				
				everylineywzzname[count2][i+1]=strarray2[i];
//				System.out.println(everylineywzzname[count2][i+1]);								
		      }
//			if(count2==10)break;
			count2++;	
			}
//		System.out.println(count2);
		}
		
		catch(IOException ioe)
		{			
			System.out.println("错误!"+ioe);
		}		
	}
}
