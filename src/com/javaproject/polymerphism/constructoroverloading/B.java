package com.javaproject.polymerphism.constructoroverloading;

public class B {
	public static void main(String[] args) {
		
	
A a=new A();
A a1=new A(10);
A a2=new A(1.1,"suk");
System.out.println(a.a+" "+a.b+" "+a.c);
System.out.println(a.a);
System.out.println(a.b+" "+a.c);
}
}
