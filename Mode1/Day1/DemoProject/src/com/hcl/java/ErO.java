package com.hcl.java;

public class ErO {
	
		public void check(int n)
		{
		if(n%2==0)
		{
			System.out.println(" even number");
		}
		else
		{
			System.out.println(" odd nmber");
		}
	}
	public static void main(String[] args) {
         int n=4;
		ErO obj=new ErO();
		obj.check(n);
		
	}

}
