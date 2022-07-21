package com.javaproject.inheritance;

public class Programmer  extends Employee{
	int bonous=2000;
	
	public static void main(String[] args) {
		
		Programmer p=new Programmer();
		System.out.println("SALARY "+p.salary);
		System.out.println("BONOUS "+p.bonous);
		
	}

}
