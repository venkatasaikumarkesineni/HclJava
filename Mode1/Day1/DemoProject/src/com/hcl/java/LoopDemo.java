package com.hcl.java;

public class LoopDemo {
	public void print(int n)
	{
		int i=0;
		while(i<n)
		{
			System.out.println("hai");
			i++;
		}
	}
	public static void main(String[] args) {
		int n=5;
		LoopDemo obj=new LoopDemo();
		obj.print(n);
	}

}
