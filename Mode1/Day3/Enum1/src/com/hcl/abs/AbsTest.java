package com.hcl.abs;
abstract class Animal
{
	abstract void name();
	abstract void type();
}
class Lion extends Animal
{

	@Override
	void name() {
		System.out.println(" name is lion");
		// TODO Auto-generated method stub
		
	}

	@Override
	void type() {
		System.out.println("wild animal");
		// TODO Auto-generated method stub
		
	}
	
}
class Crocodile extends Animal
{

	@Override
	void name() {
		System.out.println("its crocodile");
		// TODO Auto-generated method stub
		
	}

	@Override
	void type() {
		System.out.println("wildanimal");
		// TODO Auto-generated method stub
		
	}
	
}
public class AbsTest {
public static void main(String[] args) {
	Animal arr[]=new Animal[]{new Lion(), new Crocodile()};
	for (Animal animal:arr)
	{
		animal.name();
		animal.type();
	}
}
}
