package com.hcl.java;

public class Prime {
	public void calc(int n)
	{
		int i=2;
		boolean flag=true;
		while(i<n/2)
		{
			if(n%i==0)
			{
				flag=false;
			}
			i++;
		}
		if(flag==true)
		{
			System.out.println(" prime");
		}
		else
		{
			System.out.println("not prime");
		}
		
	}
   public static void main(String[] args) {
	int n=5;
	Prime obj=new Prime();
	obj.calc(n);
}

}
