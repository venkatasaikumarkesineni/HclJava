package com.hcl.collections;

import java.util.HashMap;
import java.util.Map;

import javax.print.attribute.HashAttributeSet;

public class MapDemo {
	public static void main(String[] args) {
		Map m=new HashMap();
		m.put("priya","darshini");
		m.put("laksh","laksh");
		m.put("rishab","rishab");
		m.put("karumba","lakshmi");
             String key="priya";
             String value=(String)m.getOrDefault(key,"Not found");
             System.out.println(value);
	}

}
