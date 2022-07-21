package com.javaproject.abstraction.abstractlclass;

public class BankMain {
	
	public static void main(String[] args) {
		RBI rr=new HDFC();
		System.out.println("HDFC rate of interst is "+rr.getRateOfIntrest()+"%");
		RBI rr1=new ICICI();
		System.out.println("ICICI rate of interst is "+rr1.getRateOfIntrest()+"%");
		RBI rr2=new SBI();
		System.out.println("SBI rate of interst is "+rr2.getRateOfIntrest()+"%");
		
	}

}
