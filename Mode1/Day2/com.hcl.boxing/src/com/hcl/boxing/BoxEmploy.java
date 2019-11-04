package com.hcl.boxing;

public class BoxEmploy 

{
	public void show(Object obEmploy)
	{
		Employ e=(Employ)obEmploy;
		System.out.println(e);
	}
  public static void main(String[] args) {
	Employ objEmploy=new Employ();
	objEmploy.id=1;
	objEmploy.name="sai";
	objEmploy.basic=85434;
	new BoxEmploy().show(objEmploy);
}
}
