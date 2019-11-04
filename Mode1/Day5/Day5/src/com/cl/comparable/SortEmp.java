package com.cl.comparable;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortEmp {
	public static void main(String[] args) {
		SortedSet s=new TreeSet();
		s.add(new Emp(1,"sai",8856));
		s.add(new Emp(2,"saii",8857));
		s.add(new Emp(3,"saiii",8858));
		s.add(new Emp(4,"saiiii",8859));
		s.add(new Emp(5,"saiiiii",88590));
		System.out.println("sorted data is");
		s.forEach(System.out::
			println);
	}

}
