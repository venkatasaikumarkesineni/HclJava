package com.hcl.file;
import java.io.File;

public class FileInfo {
	public static void main(String[] args) {
		File f1=
	new File("C:/hcljava/Day4/siri/src/com/hcl/ex/Custom.java");
		System.out.println("file name" +f1.getName());
		System.out.println("full name"+ f1.getAbsolutePath());
		File f2=new File("C:/hcljava/Day4/siri/src/com/hcl/ex");
		String files[]=f2.list();
		for (String s: files)
		{
			System.out.println(s);
		}
		
	}

}
