package bysj;

import java.io.*;
import javax.swing.*;
import javax.swing.JFileChooser;


public class chuli
{
	static String[][] everylinezzname=new String[10000][100];
	static int count=0;//��¼�����ڼ���������
	static String[][] everylineywzzname=new String[100000][1000];
	static int count2=0;//��¼�����ڼ���������
	String dizhi;//���Ǵ���Դ�ļ��ĵ�ַ�ַ���
	String dizhi2;//���Ǵ������ļ��ĵ�ַ�ַ���
	public void chulidata()
	{
		String str;
		int[] everylinezzsum=new int[10000];//��¼ÿ�����м�������(����),10000��������Ϊ��������������ͬ��
		openwindow s=new openwindow();
		s.fangfa("��Դ��Ϣ");
		dizhi=s.path;//��ô��ļ��ĵ�ַ
		try
		{
		FileReader f1=new FileReader(dizhi);		
		BufferedReader buf1=new BufferedReader(f1);
		while((str=buf1.readLine())!=null)//�����򿪵��ļ�һ��һ�ж�ȡ
			{ 	
			String[] strarray=str.split(";"); //����ȡ��������������;�����в��
			everylinezzsum[count]=strarray.length-1;
//			System.out.println(everylinezzsum[count]);//���ÿһ���м�����Դ����
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
			System.out.println("����!"+ioe);
		}		
//	****************�����������ݿ�ʼ����************************	
		String str2;
		int[] everylineywzzsum=new int[100000];//��¼ÿ�����м�������(����),10000��������Ϊ��������������ͬ��	
		openwindow s2=new openwindow();		
		s2.fangfa("������Ϣ");
		dizhi2=s2.path;//��ô��ļ��ĵ�ַ
		try
		{
		FileReader f2=new FileReader(dizhi2);		
		BufferedReader buf2=new BufferedReader(f2);
		while((str2=buf2.readLine())!=null)//�����򿪵��ļ�һ��һ�ж�ȡ
			{ 	
			String[] strarray2=str2.split(";"); //����ȡ��������������;�����в��
			everylineywzzsum[count2]=strarray2.length-1;
//			System.out.println(everylineywzzsum[count2]);//���ÿһ���м�����������
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
			System.out.println("����!"+ioe);
		}		
	}
}
