package com.hcl.collections;

import java.util.TreeSet;
import java.util.Comparator;
import java.util.List;
import java.util.Set;


public class SortEmploy {
	public static void main(String[] args) {
		Comparator<Employ> c=new NameComparator();
		Set<Employ> setEmploy=new TreeSet<Employ>(c);
		setEmploy.add(new Employ(1,"divya",67753));
		setEmploy.add(new Employ(2,"laksh",67754));
		setEmploy.add(new Employ(3,"vinod",67755));
		setEmploy.add(new Employ(4,"prem",67756));
		setEmploy.add(new Employ(5,"sai",67757));
		System.out.println("employ list");
		setEmploy.forEach(System.out::println);
	}

}
