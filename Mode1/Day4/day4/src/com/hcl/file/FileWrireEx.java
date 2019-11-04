package com.hcl.file;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class FileWrireEx {
	public static void main(String[] args) throws IOException {
		File src,tar;
		FileReader fr;
		FileWriter fw;
		src=new File("C:/hcljava/Day4/siri/src/com/hcl/ex/Custom.java");
		tar=new File("c:/files/Custom.java");
		try {
			fr=new FileReader(src);
			fw=new FileWriter(tar);
			int ch;
			while((ch=fr.read())!=-1)
					{
                     fw.write((char)ch);				
					}
			fr.close();
			fw.close();
			System.out.println("file copied");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
