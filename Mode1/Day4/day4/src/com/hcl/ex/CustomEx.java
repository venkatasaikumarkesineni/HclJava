package com.hcl.ex;
class NumberZeroException extends Exception
{
	public NumberZeroException(String error)
	{
		super(error);
	}
}
class NegativeException extends Exception
{
	public NegativeException(String error)
	{
		super(error);
	}
}
public class CustomEx
{
	public void sum(int a,int b) throws NegativeException, NumberZeroException{
		int c;
		boolean flag=true;
		if(a<0||b<0){

		
			flag=false;
		throw new NegativeException("negative nos not allowed");
	}
		if(a==0||b==0)
		{
			flag=false;
			throw new NumberZeroException("zero is inalid");
		}
		if(flag==true)
		{
			c=a+b;
			System.out.println("sum is   " +c);
		}
		}
	public static void main(String[] args) {
		int a=5,b=-12;
		try{
		new CustomEx().sum(a,b);
		}
		catch(NegativeException | NumberZeroException e)
		{
			e.printStackTrace();
		}
	}
}

