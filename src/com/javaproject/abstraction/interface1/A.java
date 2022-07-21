package com.javaproject.abstraction.interface1;

public class A implements Student,B {
public int a=100;
public int b=200;

	@Override
	public void addition() {
		System.out.println("done interface");
		this.b=b;
		
		
int c=a+b;
System.out.println(c);
	}
	
public static void main(String[] args) {
	Student student=new A();
	
	student.addition();
}

@Override
public void m2() {
	System.out.println("m2 in B class");
	
}
}
