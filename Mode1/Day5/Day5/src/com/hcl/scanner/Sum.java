package com.hcl.scanner;

import java.util.Scanner;

public class Sum {
	public static void main(String[] args) {
		int a,b,c;
		System.out.println("enter the two unumbers");
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		c=a+b;
		System.out.println("sum is"+ c);
	}

}
