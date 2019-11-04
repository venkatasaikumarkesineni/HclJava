package com.hcl.ass;

import java.io.Serializable;

public class Employ implements Serializable {
	int empno;
	String name;
	transient double basic;
	public Employ(int empno, String name, double basic) {
		super();
		this.empno = empno;
		this.name = name;
		this.basic = basic;
	}
	public Employ(String string, String name2, double basic2) {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Employ [empno=" + empno + ", name=" + name + ", basic=" + basic + "]";
	}

}
