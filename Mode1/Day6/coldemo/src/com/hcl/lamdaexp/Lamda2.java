package com.hcl.lamdaexp;
interface IHello
{
	void sayHello();
}
public class Lamda2 {
	public static void main(String[] args) {
		IHello h1= () -> {
			System.out.println("hello from sai kumar");
		};
		IHello h2= () -> {
			System.out.println("hello frokvinod");
		};
		IHello h3= () ->{
			System.out.println("hello from prem");
		};
		
		h1.sayHello();
		h2.sayHello();
		h3.sayHello();
	}

}
//a interface having only one method. here istead of creating  number of 
//classes we are creating objects and printing them at the output.