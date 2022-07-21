package com.javaproject.abstraction.interface1;

public class StudentTest implements Student1,Student2 {

	@Override
	public void study() {
		System.out.println("ssss");
	}
	public static void main(String[] args) {
		StudentTest student=new StudentTest();
		student.study();
	}

}
