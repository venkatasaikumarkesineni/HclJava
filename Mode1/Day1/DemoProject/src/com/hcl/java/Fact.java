package com.hcl.java;

public class Fact 
{
	public void calc(int n)
	{
		int f=1,i=1;
		while(i<=n)
		{
			f=f*i;
			i++;
			
		}
		System.out.println(f);
	}
	public static void main(String[] args) {
		int n=5;
		Fact obj=new Fact();
		obj.calc(n);
		
	}

}
