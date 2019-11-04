package com.hcl.file;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
public class Foutput {
	public static void main(String[] args) {
		FileInputStream src;
		FileOutputStream tar;
		
		
			src=new FileInputStream("C:/hcljava/Day4/siri/src/com/hcl/ex/Custom.java");
		 
				
					tar=new FileOutputStream("c:/files/target.text");
			
		     int ch;
		     while((ch=src.read())!=-1)
		    		 {
		    	 tar.write((char)ch);
		    		 }
		     src.close();
		     tar.close();
		     System.out.println("file copied");
		
		
		
	}

}
