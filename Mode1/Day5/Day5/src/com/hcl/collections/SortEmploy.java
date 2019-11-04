package com.hcl.collections;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortEmploy {
	public static void main(String[] args) {
		Comparator c=new BasicComparator();
		SortedSet s= new TreeSet(c);
		s.add(new Employ(1,"sai",4588));
		s.add(new Employ(2,"saii",4589));
		s.add(new Employ(3,"saiii",45810));
		s.add(new Employ(4,"saiiii",45811));
		s.add(new Employ(5,"saiiiii",45812));
		s.forEach(System.out::println);//we are getting error so we are doing by comapartor
	}

}
