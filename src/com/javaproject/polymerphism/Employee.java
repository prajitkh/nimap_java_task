package com.javaproject.polymerphism;

public class Employee {

	
	

	public void   show(int roll,int id) {
		System.out.println("show method 1");
		
	}
	public  void  show (int roll,int id,String name) {
		System.out.println("method 2");
	}
	public static void main(String[] args) {
		Employee ee=new Employee();
		ee.show(11, 12, "prajit");
		ee.show(11,22);
	}

	
	
}
