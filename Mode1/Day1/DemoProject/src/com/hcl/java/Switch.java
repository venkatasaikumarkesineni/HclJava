package com.hcl.java;
/**
 * program for switch case.
* @author Coalesce.
 
 */
public class Switch {
 /**
	 * calling method ch.
	 * @param ch passsing as arguments.
	 */
	public void calc(int ch)
	{
	switch(ch)
	{
	case 1:
		System.out.println("a");
		break;
	case 2:
		System.out.println("b");
		break;
	case 3:
		System.out.println("c");
		break;
	case 4:
		System.out.println("d");
		break;
	case 5:
		System.out.println("e");
		break;
	case 6:
		System.out.println("f");
		break;
	case 7:
		System.out.println("h");
		break;
		default:
			System.out.println("enteredwrongly");
			break;
	}
	
	}
	public static void main(String[] args) {
		int ch=8;
		Switch obj=new Switch();
		obj.calc(ch);
	}

}
