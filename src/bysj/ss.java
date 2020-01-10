package bysj;
import javax.swing.*;

import java.util.*;
//import java.applet.*;
import java.awt.Color;
import java.awt.Graphics;
import java.io.*;
public class ss extends JPanel
{
	static int count=0;
	static String[] sstr=new String[100000];		
	public void settree()
	{
	chuli cl=new chuli();
	cl.chulidata();
	datadelete dt=new datadelete();
	dt.delete();
		int sum=datadelete.totalywzzsum;
		sstr=datadelete.totalywzzname;
		Set set = new TreeSet();
		for (int i = 0; i < sum; i++) {
			set.add(sstr[i]);
		}
		sstr = (String[]) set.toArray(new String[0]);
		for (int i = 0; i < sstr.length; i++) 
		{		
//			System.out.println(sstr[i]);
			count++;
		}       
	}
}
