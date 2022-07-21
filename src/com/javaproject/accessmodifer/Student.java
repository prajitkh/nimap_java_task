package com.javaproject.accessmodifer;

public class Student {

	
	public int a;
    private int b;
	int c;
	protected int d;
	
	public void m1() {
		this.a=100;
		this.b=220;
		this.c=33;
		this.d=22;
		System.out.println("m1 public method"+a+" "+b+" "+" "+c+" "+d);
		
	}
	
	private void m2() {
		System.out.println("m2 private method");
                 int d=22;
		
	}
	
	void m3() {
		System.out.println("m3 default method");
	}
	protected void  m4() {
		System.out.println("protected m4 method ");
		
	}
	
}

