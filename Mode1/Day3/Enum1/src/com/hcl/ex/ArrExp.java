package com.hcl.ex;

public class ArrExp {
	public static void main(String[] args) {
		try {
			int a[] = new int[] { 12, 13 };
			a[10] = 37;
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
