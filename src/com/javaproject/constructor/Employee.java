package com.javaproject.constructor;

import java.util.Scanner;

public class Employee {

	private String name;  
	private int age;  
	//parameterized constructor  
	public Employee(String name, int age)  
	{  
		this.name =name;  
		this.age = age;  
	}  
	//Default constructor  
	public Employee()  
	{  
		this.name = "PRAJIT";  
		this.age = 25;  
	}  
	//method for printing the values  
	public void show()  
	{  
		System.out.println("Name of the employee: "+this.name);  
		System.out.println("Age of the employee: "+this.age);  
	}  
	
	public static void main(String args[])   
	{  
		Employee e=new Employee();  
	
		Scanner sc = new Scanner(System.in);  
		System.out.println("Enter the name of the employee: ");  
		String name = sc.nextLine();  
		System.out.println("Enter the age of the employee: ");  
		int age = sc.nextInt();  
		System.out.println("*******************");  
		 
		System.out.println("Show() method for the parameterized constructor: ");  
		new Employee(name, age).show();  
		
		System.out.println("Show() method for the default constructor: ");  
		new Employee().show();  
	}  
}  