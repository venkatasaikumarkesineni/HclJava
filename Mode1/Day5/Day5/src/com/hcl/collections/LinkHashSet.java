package com.hcl.collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkHashSet {
	public static void main(String[] args) {
		Set s=new LinkedHashSet();
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
