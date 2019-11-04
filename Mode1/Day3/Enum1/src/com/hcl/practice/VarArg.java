package com.hcl.practice;
public class VarArg
{
	public static void show(int day,String...name){
		for(String s:name){
			System.out.print(day + " " +s+" ");
		}
		System.out.println();
	}

public static void main(String s[])
{
	show(1);
	show(2,"sai","kumar","kumar");
	show(3,"pove","pora");
}
}