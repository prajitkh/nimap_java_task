package com.javaproject.static1;

public class Student1 {
	String name;
	static String clgName="udct";
	
	
	static void m1() {
		System.out.println("Static method");
	}
	
	void m2(String name,String clgName) {
		this.name=name;
		
		System.out.println(name + " "+clgName);
		
	}

	public static void main(String[] args) {
		Student1 stu=new Student1();
		stu.m2("prajit", clgName);
		
		stu.m2("ss", clgName);
		stu.m1();
		
	}

}
