package com.javaproject.polymerphism.overriding;

public class Test {
	public static void main(String[] args) {
		Icici ic=new Icici();
		Sbi sb=new Sbi();
		System.out.println("ICICI BANK RATE OF INTERST IS >>"+ic.getRateOfInterst()+" %");
		System.out.println("SBI BANK RATE OF INTERST IS >>"+sb.getRateOfInterst()+" %");

	}
}
