package com.javaproject.polymerphism.overriding;
 
public class HDFC  extends RBI{
	@Override
	 void withdraw() {
		System.out.println(35000);
	}
	
	void show() {
		System.out.println("show method");
	}
public static void main(String[] args) {
	
	RBI hh=new HDFC();
	HDFC h=new HDFC();
	h.withdraw();
	h.show();
	
}
}
