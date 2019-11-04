package com.hcl.lamdaexp;

import java.util.ArrayList;
import java.util.List;

public class SkipAndLimit {
	public static void main(String[] args) {
		List<Integer> lstData=new ArrayList<Integer>();
		lstData.add(new Integer(42));
		lstData.add(new Integer(12));
		lstData.add(new Integer(2));
		lstData.add(new Integer(4));
		lstData.stream().limit(2).forEach(p ->{
			System.out.println(p);
		});
		System.out.println("after skipping two records");
		lstData.stream().skip(2).forEach(p -> {
			System.out.println(p);
		});
		System.out.println("filterdata");
		lstData.stream().filter(p-> p>15).forEach(x-> {
			System.out.println(x);
		});
	}
}
