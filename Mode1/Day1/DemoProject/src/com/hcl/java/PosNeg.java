package com.hcl.java;

public class PosNeg {
	public void check(int n)
	{
		if(n>=0)
		{
			System.out.println("positive number");
		}
		else
		{
			System.out.println("negative number");
		}
	}
	public static void main(String[] args) {
		int n=12;
		PosNeg obj=new PosNeg();
		obj.check(n);
		
		
		
	}

}
