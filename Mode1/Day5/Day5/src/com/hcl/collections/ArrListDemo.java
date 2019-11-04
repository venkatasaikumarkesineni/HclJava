package com.hcl.collections;

import java.util.ArrayList;
import java.util.List;

public class ArrListDemo {
	public static void main(String[] args) {
		List lstNames=new ArrayList();
		lstNames.add("sai");
		lstNames.add("kumar");
		lstNames.add("kesineni");
		lstNames.add("pove");
		lstNames.add("pora");
		lstNames.add("sai");
		System.out.println("names are");
		/*for(Object object:lstNames)
		{
			System.out.println(object);
		}*/
		System.out.println("in jdk 1.8");
		lstNames.forEach(System.out::println);
		//if you give err
		//instead of out ouuput will be printed in output in
		//red colour
		lstNames.set(2,"kumar sai");
		lstNames.forEach(System.err::println);
		lstNames.remove(1);
	lstNames.forEach(System.out::println);
	lstNames.remove("pove");
	System.out.println("list after  removeing by object");
	lstNames.forEach(System.out::println);
	System.out.println("4th element is"+ lstNames.get(3));
	}

}
