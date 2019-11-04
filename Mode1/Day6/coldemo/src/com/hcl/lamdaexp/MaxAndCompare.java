package com.hcl.lamdaexp;

import java.util.ArrayList;
import java.util.List;

public class MaxAndCompare {
	public static void main(String[] args) {
		List<Product> list=new ArrayList<Product>();
		list.add(new Product(1,"nokia",25000));
		list.add(new Product(2,"mi",525001));
		list.add(new Product(3,"micromax",725002));
		list.stream().filter(p ->p.price>=20000).forEach(x-> {
			System.out.println(x);
		});
		System.out.println("name strat with m");
		list.stream().filter(p ->p.name.startsWith("m")).forEach(x-> {
			System.out.println(x);
		});
Product maxP=list.stream().max((p1,p2) ->  p1.price >= p2.price ? 1 : -1).get();
	System.out.println("max price record");
	System.out.println(maxP);
Product minP=list.stream().min((p1,p2) -> p1.price >= p2.price ? 1: -1).get();
	System.out.println("main price reecord is");
	System.out.println(minP);
	}

}
