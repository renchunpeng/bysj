package bysj;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.event.*;
public class datadelete
{
	static String totalywzzname[]=new String[100000];
	static int totalywzzsum=0;
	public void delete()
	{
	int count2=chuli.count2;
	for(int i=0;i<count2;i++)
		{
		if(i==4){break;}//控制引文作者的输入行数
			String sum=chuli.everylineywzzname[i][0];
			int intsum=Integer.valueOf(sum);
			for(int k=0;k<intsum;k++)
			{	
							totalywzzname[totalywzzsum]=chuli.everylineywzzname[i][k+2];
							totalywzzsum++;				
			}
		}  
	}	
}



