package com.javaproject.abstraction.abclass;

public class TestStudent extends Student {

	@Override
	void m1() {
		System.out.println("test m1 method ");
	}
public static void main(String[] args) {
	TestStudent test=new TestStudent();
	test.m1();
	test.getDetials();
	System.out.println(test);
}
}
