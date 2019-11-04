package com.hcl.scanner;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class DateDemo {
	public static void main(String[] args) {
		Date dt=new Date();
		System.out.println(dt);
		SimpleDateFormat sdf=new SimpleDateFormat("MM/dd/yyyy");;
		System.out.println(sdf.format(dt));
		String strDate="20/03/1998";
		try {
			Date obj=sdf.parse(strDate);
			System.out.println(obj);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

}
