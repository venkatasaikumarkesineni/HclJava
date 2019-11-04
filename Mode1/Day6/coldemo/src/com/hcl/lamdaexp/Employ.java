package com.hcl.lamdaexp;

public class Employ {
String name;
String city;
double basic;
public Employ(String name, String city, double basic) {
	super();
	this.name = name;
	this.city = city;
	this.basic = basic;
}
/* (non-Java doc)
 * @see java.lang.Object#toString()
 */
@Override
public String toString() {
	return "Employ [name=" + name + ", city=" + city + ", basic=" + basic + "]";
}

}
