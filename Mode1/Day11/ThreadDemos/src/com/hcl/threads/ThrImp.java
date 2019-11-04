package com.hcl.threads;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

class ListDemo implements Runnable{
	@Override
	public void run(){
		List lstData=new ArrayList();
		lstData.add("Keerthana");
		lstData.add("sai");
		lstData.add("vinod");
		lstData.add("prem");
		lstData.add("kumar");
		for(Object object : lstData){
			System.out.println(object);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
class LinkDemo implements Runnable{

	@Override
	public void run() {
		LinkedList lst=new LinkedList();
		lst.add("kesineni");
		lst.add("venkata");
		lst.add("sai");
		lst.add("kumar");
		lst.add("vinod");
		lst.addFirst("Tarun");
		lst.addLast("Kiruba");
		for(Object object:lst){
			System.out.println(object);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
class VectorDemo implements Runnable{

	@Override
	public void run() {
		Vector v=new Vector(3,2);
		v.addElement("Niveda");
		v.addElement("yaswanth");
		v.addElement("sai krishna");
		v.addElement("prem");
		v.addElement("anisha");
		v.addElement("Nagendra");
		for(Object object:v){
			System.out.println(object);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

public class ThrImp {
	public static void main(String[] args) {
		Thread t1=new Thread(new ListDemo());
		Thread t2=new Thread(new LinkDemo());
		Thread t3=new Thread(new VectorDemo());
		t1.start();
		t2.start();
		t3.start();
	}
}
