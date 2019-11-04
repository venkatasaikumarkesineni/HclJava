package com.hcl.intf;
interface IOne
{
	void name();
}
interface ITwo
{
	void email();
}
class Test implements IOne,ITwo
{

	@Override
	public void email() {
		System.out.println("sai kumar");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void name() {
		// TODO Auto-generated metho
		System.out.println("saukumar@gmai.com");
		
	}

}
public class MultiInh {
	public static void main(String[] args) {
		Test obj=new Test();
		obj.name();
		obj.email();
	}

}
