package com.javaproject.polymerphism;

public class College {
	String clgName="Dy_patil";
	public void getAdmission(String name,int marks,String clgName) {
		this.clgName=clgName;
		System.out.println("Admission done");
	}
	public void getAdmission(String name,int marks,int per) {
		
		System.out.println("Admission done with fees");
	}
	public static void main(String[] args) {
		College college =new College();
		college.getAdmission("pr", 720, 77);


	}

}
