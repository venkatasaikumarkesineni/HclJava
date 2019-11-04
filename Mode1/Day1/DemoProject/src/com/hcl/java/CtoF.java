package com.hcl.java;

import java.nio.charset.MalformedInputException;

public class CtoF {
	public void calc( double c)
	{
		double f;
		f=((9*c/5))+32;
		System.out.println("farenheit " +f);

}
	public static void maibn( String s[])
	{
		double c=37;
		CtoF obj=new CtoF();
		obj.calc(c);
	}

}

