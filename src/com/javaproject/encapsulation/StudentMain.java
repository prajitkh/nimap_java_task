package com.javaproject.encapsulation;



public class StudentMain {
public static void main(String[] args) throws IllegalAccessException {
	Student student=new Student();
	

student.setStuId(1);
student.setStuName("PRAJIT");
System.out.println("Id >>"+student.getStuId());
System.out.println("College >>"+student.getCollege());
System.out.println("Name>>"+student.getName());
System.out.println("*********************************************");


}

}
