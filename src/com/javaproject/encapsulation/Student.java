package com.javaproject.encapsulation;

public class Student {
	
	
	private String stuName;
	private  int stuId;
	private String college="SBAU AMRAVATI";

	public String getCollege() {

		return college;
	}
	public void setStuName(String stuName) {

		this.stuName = stuName;
	}
	public String getName () {
		return stuName;

	}
	public int getStuId() {
		return stuId;
	}
	public void setStuId(int stuId) throws IllegalAccessException {
		if(stuId<=0) {

			throw new IllegalAccessException("Not allowed");
		}
		this.stuId = stuId;
	}

}
