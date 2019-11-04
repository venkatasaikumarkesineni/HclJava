package com.hcl.java;

public class EvenNumbers {
	public void calc(int n)
	{
	int i=0;
	while(i<n)
	{
		i=i+2;
		System.out.println(i);
	}
	}
	public static void main(String[] args) {
		int n=20;
		EvenNumbers obj=new EvenNumbers();
		obj.calc(n);
		
	}

}
