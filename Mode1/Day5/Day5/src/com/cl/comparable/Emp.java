package com.cl.comparable;



public  class Emp implements Comparable {
	int empno;
	String name;
	double basic;
	public Emp(int empno, String name, double basic) {
		super();
		this.empno = empno;
		this.name = name;
		this.basic = basic;
	}
	@Override
	public String toString() {
		return "Employ [empno=" + empno + ", name=" + name + ", basic=" + basic + "]";
	}
	@Override
	public int compareTo(Object o) {
		Emp e=(Emp)o;
		// TODO Auto-generated method stub
		return name.compareTo(e.name
				);
	}

	
	

}

