package com.hcl.ass;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteStudent {
	public static void main(String[] args) throws IOException {
		try {
			FileOutputStream fout=
					new FileOutputStream("c:/files/student.txt");
ObjectOutputStream objout=
               new ObjectOutputStream(fout);
Student e=new Student("sai","chennai",9.35);
objout.writeObject(e);
objout.close();
fout.close();


		} catch (FileNotFoundException e) {
			// TODO uto-generated catch block
			e.printStackTrace();
		}
		
	}

}