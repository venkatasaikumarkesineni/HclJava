package com.hcl.ass;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class writeEmploy {
	public static void main(String[] args) throws IOException {
		try {
			FileOutputStream fout=
					new FileOutputStream("c:/files/employ.txt");
ObjectOutputStream objout=
               new ObjectOutputStream(fout);
Employ e=new Employ(1,"anupuma",5528.2);
objout.writeObject(e);
objout.close();
fout.close();


		} catch (FileNotFoundException e) {
			// TODO uto-generated catch block
			e.printStackTrace();
		}
		
	}

}
