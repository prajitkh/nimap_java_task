package com.javaproject.abstraction.interface1;

public class Xc  extends X{

	@Override
	void m2() {
		System.out.println("m2 method in Xc class");
		
	}
	
	
	
public static void main(String[] args) {
	
	X xx=new Xc();
	xx.m2();
	xx.m1();
}	
	

}
