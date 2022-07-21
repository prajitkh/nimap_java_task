package com.javaproject.polymerphism.constructoroverloading;

public class Student {
int stuId;
String stuName;
int passYear;

Student(int id,String stuName){
	this.stuId=id;
	this.stuName= stuName;
}
Student(int passYear,int i,String name){
	this.stuId=i;
	this.stuName=name;
	this.passYear=passYear;
	
	
	
}
public static void main(String[] args) {
	Student student=new Student(11,"prajit");
	System.out.println("\nSTU ID - "+student.stuId+"\nSTU NAME -"+student.stuName);
	
		
}
}