package com.hcl.abs;
abstract class Training
{
	abstract void name();
	abstract void email();
}
class Anubhav extends Training

{

	@Override
	void name() {
		System.out.println("name is anubhav");
		// TODO Auto-generated method stub
		
	}

	@Override
	void email() {
		System.out.println(" kesineni@gmail.com");
		// TODO Auto-generated method stub
		
	}
	
}
class SaiKrishna extends Training
{

	@Override
	void name() {
		System.out.println(" vinod");
		// TODO Auto-generated method stub
		
	}

	@Override
	void email() {
		System.out.println("chopes@gmail.com");
		// TODO Auto-generated method stub
		
	}
	
}
public class AbsDemo {
	public static void main(String[] args) {
		//Training t1=new Anubhav();
	//	Training t2=new saiKrishna();
		Training arr[]=new Training[]{new Anubhav(),new SaiKrishna()};
		for(Training t:arr)
		{
			t.name();
			t.email();
		}
		
	}
	

}

