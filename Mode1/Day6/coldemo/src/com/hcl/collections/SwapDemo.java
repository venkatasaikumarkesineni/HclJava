package com.hcl.collections;
/**
 * program foe swapping.
 * @author Coalesce.
 * @param <T>
 */
 class Data<T> { 
	 public void swap(T x,T y) {
		 T t;
		 t = x;
		 x = y;
		 y = t;
		 System.out.println("x value is"+ x + " y value is" +y);
	 }
	
}
public class SwapDemo { 
	public static void main(String[] args) {
		Data obj = new Data();
		int x,y;
		x = 12;
		y = 13;
		obj.swap(x, y);
		double b1=12.2,b2=22.22;
		obj.swap(b1,b2);
		String s1="sai",s2="sirisha";
		obj.swap(s1, s2);
		boolean f1=true,f2=false;
		obj.swap(f1, f2);
	}

}
