package com.hcl.boxing;

public class BoxDemo 
{
	public void show(Object ob)
	{
		String type=ob.getClass().getSimpleName();
		if(type.equals("Integer"))
		{
			int x=(Integer)ob;
			System.out.println("Integer casting"+x);
			
		}
		if(type.equals("Double"))
		{
			double x=(Double)ob;
			System.out.println("double casting"+x);
		}
		if(type.equals("String"))
		{
			String x=(String)ob;
			System.out.println("String casting"+x);
		}
	}
	public static void main(String[] args)
	{
		int a=12;
        double d=12.5;
		String name="sai";
		BoxDemo obj=new BoxDemo();
		obj.show(a);
		obj.show(d);
		obj.show(name);
		
	}

}
