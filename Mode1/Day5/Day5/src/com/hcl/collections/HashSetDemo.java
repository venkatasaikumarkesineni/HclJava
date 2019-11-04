package com.hcl.collections;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {
	public static void main(String[] args) {
		Set s=new HashSet();
		s.add("vinod");
		s.add("hema");
		s.add("keerthana");
		s.add("anubhav");
		s.add("raghu");
		
		s.add("vinod");
		s.add("hema");
		s.add("keerthana");
		s.add("anubhav");
		s.add("raghu");
		
		s.add("vinod");
		s.add("hema");
		s.add("keerthana");
		s.add("anubhav");
		s.add("raghu");
		s.forEach(System.out::println);
		
	}

}
