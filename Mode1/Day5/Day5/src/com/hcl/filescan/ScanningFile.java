package com.hcl.filescan;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class ScanningFile {
	public static void main(String[] args) throws IOException {
		try {
			FileInputStream fin=
new FileInputStream("C:/hcljava/Day2/com.hcl.boxing/src/com/hcl/boxing");
			Scanner sc=new Scanner(fin);
			while(sc.hasNextLine())
			{
				System.out.println(sc.nextLine());
			}
			sc.close();
			fin.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}//ave some error
