package com.hcl.lamdaexp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LamdaProduct {
	public static void main(String[] args) {
		List<Product> list=new ArrayList<Product>();
		list.add(new Product(1,"sai",25000));
		list.add(new Product(2,"siri",525001));
		list.add(new Product(3,"sreenu",725002));
		System.out.println("sorted by name");
		Collections.sort(list,(p1,p2)-> {
			return p1.name.compareTo(p2.name);
		});
		for(Product product:list)
		{
			System.out.println(product);
		}
		System.out.println("sorted by price value----");
	 Collections.sort(list,(p1,p2)-> {
		 return (int)(p2.price-p1.price);
	 });
		 for(Product product:list)
		 {
			 System.out.println(product);
		 }
	 
	}
	

}
