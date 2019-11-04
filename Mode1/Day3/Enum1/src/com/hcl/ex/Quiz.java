package com.hcl.ex;

public class Quiz{
	public static void main(String[] args) {
		try {
			int a[] = new int[] { 12, 13 };
			a[10] = 12/0;
		} 
		catch(ArithmeticException e)
		{
			System.out.println("notdivided by zero");
		}
		
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("array size is small");
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
