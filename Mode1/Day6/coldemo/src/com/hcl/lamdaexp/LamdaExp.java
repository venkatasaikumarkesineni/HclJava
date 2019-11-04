package com.hcl.lamdaexp;

import java.util.ArrayList;
import java.util.List;

public class LamdaExp {
public static void main(String[] args) {
	List<Integer> lstData=new ArrayList<Integer>();
	lstData.add(new Integer(42));
	lstData.add(new Integer(12));
	lstData.add(new Integer(2));
	lstData.add(new Integer(4));
	lstData.forEach(p -> {
		if(p>= 10)
		{
			p+=1;
			System.out.println(p);
		}
	});
}
}
// in order to overcome the disadvantage of for each loop we are going to 
//lamda expression. here we can give conditions in for each loop its self
//instead of giving in methods.