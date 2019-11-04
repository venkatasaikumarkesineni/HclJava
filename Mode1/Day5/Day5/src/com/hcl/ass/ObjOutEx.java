package com.hcl.ass;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.sql.Date;

public class ObjOutEx {
	public static void main(String[] args) {
		try {
		FileOutputStream fout=
				new FileOutputStream("c:/files/objout.txt");
		ObjectOutputStream objout=
				new ObjectOutputStream(fout);
		objout.writeObject(new String("date is"));
		objout.writeObject(new Date());
		objout.close();
		fout.close();
		System.out.println("object stored");
		} catch (FileNotFoundException e)
		{
			e.printStackTrace();
	
	}catch(ArithmeticException e)
		e.printStackTrace();

	}
}
}
// program not completed
