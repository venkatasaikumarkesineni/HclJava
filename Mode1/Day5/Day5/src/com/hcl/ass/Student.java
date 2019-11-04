package com.hcl.ass;

import java.io.Serializable;

public class Student implements Serializable{
	String name;
	String city;
	transient double cgpa;
	public Student(String name, String city, double cgpa) {
		super();
		this.name = name;
		this.city = city;
		this.cgpa = cgpa;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", city=" + city + ", cgpa=" + cgpa + "]";
	}
	
}

