package com.hcl.file;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
public class Finput {
	public static void main(String[] args) {
		try{
FileInputStream fin= 
		new FileInputStream("C:/hcljava/Day4/siri/src/com/hcl/ex/Custom.java");

		int ch;
		try {
			while((ch=fin.read())!=-1)
			{
				System.out.print((char)ch);
			}
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			fin.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	} catch (FileNotFoundException e)
	{
		e.printStackTrace();
	}

}
}
