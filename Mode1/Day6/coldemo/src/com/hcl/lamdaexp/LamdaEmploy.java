package com.hcl.lamdaexp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LamdaEmploy {
	public static void main(String[] args) {
		List<Employ> list=new ArrayList<Employ>();
		list.add(new Employ("sai","kadaapa",44525));
		list.add(new Employ("vinod","nandyaa",445256));
		list.add(new Employ("prem","hyd",44527));
		list.add(new Employ("raghu","bengaluru",44528));
		System.out.println("compare by name");
		Collections.sort(list,(e1,e2) ->{
			return e1.name.compareTo(e2.name);
			
		});
		for(Employ employ:list)
		{
			System.out.println(employ);
		}
		System.out.println("compare by salary");
		Collections.sort(list,(e1,e2)->{
			return (int)(e1.basic-e2.basic);
		});
		for(Employ employ:list)
		{
			System.out.println(employ);
		}
	}

}
