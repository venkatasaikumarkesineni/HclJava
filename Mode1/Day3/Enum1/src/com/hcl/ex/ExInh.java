package com.hcl.ex;

import java.nio.charset.MalformedInputException;

class First
{
	public void show()
	{
		System.out.println("showmethod fromfirst");
	}
}
class Second extends First
{
	public void show()
	{
		System.out.println("show method fro second");
	}
}
public class ExInh {
	public static void main(String[] args) {
		
	try {
		First ob1 = new First();
		Second ob2 = (Second) ob1;
		ob2.show();
	} catch(ClassCastException e)
	{
		System.out.println(" object cannot be created"
				+ "");
	}
	catch (Exception e) {
		// TODO: handle exception
	}
	}

}
