package com.hcl.collections;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class GenEmploy {
	public static void main(String[] args) {
	
		List<Employ> lstEmploy=new ArrayList<Employ>();
		lstEmploy.add(new Employ(1,"divya",67753));
		lstEmploy.add(new Employ(2,"laksh",67754));
		lstEmploy.add(new Employ(3,"vinod",67755));
		lstEmploy.add(new Employ(4,"prem",67756));
		lstEmploy.add(new Employ(5,"sai",67757));
		System.out.println("employ list");
		lstEmploy.forEach(System.out::println);
	}

}
