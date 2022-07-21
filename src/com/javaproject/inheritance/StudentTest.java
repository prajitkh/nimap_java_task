package com.javaproject.inheritance;

public class StudentTest  extends Student{
     
		public void getAdmission2019() { // Base class method
		System.out.println("Done....");
		}
		
		public static void main(String[] args) {
			StudentTest stu=new StudentTest();
			stu.getAdmission2018();
			stu.getAdmission2019();
		
		}

}
