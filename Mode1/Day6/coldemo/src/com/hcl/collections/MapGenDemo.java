package com.hcl.collections;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class MapGenDemo {
	public static void main(String[] args) {
		Map<Integer,String> m=new Hashtable<Integer,String>() ;
		m.put(1,"sai");
		m.put(2,"saii");
		m.put(3,"saiii");
		m.put(4,"saiiii");
		m.put(5,"saiiiii");
		int key;
		String result;
		System.out.println("enter key");
		Scanner sc=new Scanner(System.in);
		key=sc.nextInt();
		result=m.getOrDefault(key, "not found");
		System.out.println(result);
		
		
	}

}
