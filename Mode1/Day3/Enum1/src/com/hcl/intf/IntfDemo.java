package com.hcl.intf;

interface ITraining
{
	void name();
	void email();
}
class Hema implements ITraining
{

	@Override
	public void name() {
		System.out.println("name is sai");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void email() {
		System.out.println("saikumar@mail.com");
		// TODO Auto-generated method stub
		
	}
	
}
class Keerthana implements ITraining
{

	@Override
	public void name() {
		System.out.println(" keerthana");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void email() {
		System.out.println("keerhana@gail.com");
		// TODO Auto-generated method stub
		
	}
	
}

public class IntfDemo {
	public static void main(String[] args) {
		ITraining arr[]=new ITraining[]{new Hema(), new Keerthana()
	};
		for(ITraining t:arr )
		{
			t.name();
			t.email();
		}

}
}