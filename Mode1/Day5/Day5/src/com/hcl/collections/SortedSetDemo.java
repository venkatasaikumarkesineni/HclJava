package com.hcl.collections;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetDemo {
	public static void main(String[] args) {
		SortedSet s=new TreeSet();
		s.add("vishalakshi");
		s.add("lakshmi");
		s.add("anubhav");
		s.add("sai krishna");
		s.add("anisha");
		s.add("hema");
		s.forEach(System.out::println);
	}

}
