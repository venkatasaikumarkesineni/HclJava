package com.hcl.collections;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class SortStudent {
	public static void main(String[] args) {
		Comparator<Student> c=new CityComparator();
		Set<Student>setStudent=new TreeSet<Student>(c);
		setStudent.add(new Student("kesineni","kumar","chennai",9.525));
		setStudent.add(new Student("kesineni","kumar","vempalli",9.545));
		setStudent.add(new Student("kesineni","kumar","kadapa",9.45885));
		setStudent.add(new Student("kesineni","kumar","hydrabad",9.574));
		setStudent.add(new Student("kesineni","kumar","proddutur",9.577));
		System.out.println("studentdetails are");
		setStudent.forEach(System.out::println);
	}

}


