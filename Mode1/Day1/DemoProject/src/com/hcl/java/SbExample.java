package com.hcl.java;

public class SbExample {
	public void show(int age,String name)
	{
		System.out.println("age is "+ age);
		System.out.println("name is " + name);
	}
	public static void main(String[] args) {
		int age;
		String name;
		age=11;
		name="sai";
		SbExample obj=new SbExample();
		obj.show(age,name);
		
	}

}
