package com.javaproject.static1;

public class Student {
	int id;
	String name;
	static String clgName="udct";
	

	static void change() {
		clgName="Ram meghe";

	}
	Student(int i,String n){
		id=i;
		name=n;

	}
	void display() {

		System.out.println("Clg ID "+id +"\nStudent Name "+name+ "\nCollege Name "+ clgName);
	}

	public static void main(String[] args) {
		Student.change();
		Student student=new Student(112,"prajit");
		student.display();
	}
}

