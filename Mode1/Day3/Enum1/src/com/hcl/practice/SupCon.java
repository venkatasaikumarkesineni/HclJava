package com.hcl.practice;

class Employ
{
	int empno;
	String name;
	double basic;
	public Employ(int empno, String name, double basic) {
		super();
		this.empno = empno;
		this.name = name;
		this.basic = basic;
	}
	@Override
	public String toString() {
		return "Employ [empno=" + empno + ", name=" + name + ", basic=" + basic + "]";
	}
	
}
class Amit extends Employ
{

	public Amit(int empno, String name, double basic) {
		super(empno, name, basic);
		// TODO Auto-generated constructor stub
	}
	
}
class Vinod extends Employ
{

	public Vinod(int empno, String name, double basic) {
		super(empno, name, basic);
		// TODO Auto-generated constructor stub
	}
	
}


public class SupCon {
public static void main(String[] args) {
	Employ e1=new Amit(1,"amit",22334);
	Employ e2=new Vinod(2,"sai",5463);
	System.out.println(e1);
	System.out.println(e2);

}
	

}

