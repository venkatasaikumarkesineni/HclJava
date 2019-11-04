package com.hcl.collections;

import java.util.List;
import java.util.ArrayList;

public class GenListInt { 
	public static void main(String[] args) {
		List<Integer> lstData=new ArrayList<Integer>();
		lstData.add(new Integer(42));
		lstData.add(new Integer(12));
		lstData.add(new Integer(2));
		lstData.add(new Integer(4));
		int sum=0;
		for(Integer i:lstData)
		{
			sum+=i;
		}
		System.out.println("sum is" +sum);
		
		
	}

}
