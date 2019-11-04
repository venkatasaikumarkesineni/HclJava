package com.hcl.lamdaexp;

import java.util.ArrayList;
import java.util.List;

public class LamdaFilterDemo {
	public static void main(String[] args) {
		List<Employ> list=new ArrayList<Employ>();
		list.add(new Employ("sai","kadaapa",44525));
		list.add(new Employ("vinod","nandyaa",445256));
		list.add(new Employ("prem","hyd",44527));
		list.add(new Employ("raghu","bengaluru",44528));
		list.stream().filter(p-> p.basic>=44526).forEach(x->{
			System.out.println(x);
		});
		list.stream().filter(p-> p.name.startsWith("s")).
		forEach(x-> {
			System.out.println(x);
		});
		}
	}


//in order to over come the di advantage of if
//by using filter we can reduce the size of the program
