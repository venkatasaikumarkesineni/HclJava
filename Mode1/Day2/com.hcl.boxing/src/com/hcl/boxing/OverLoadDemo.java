package com.hcl.boxing;

public class OverLoadDemo 
{
	public void show(int x)
	{
		System.out.println("showmethos wrt to int" + x);
	}
	public void show(double x)
	{
		System.out.println("showmethod wrt double" +x);
	}
	public void show(String x)
	{
		System.out.println("show methos wrt string"+x);
	}
	public void show(float x)
	{
		System.out.println("show methpd wrt float"+x);
	}
	public static void main(String[] args) {
		String s="sai";
		OverLoadDemo ob=new OverLoadDemo();
		ob.show(s);
	}
	

}
