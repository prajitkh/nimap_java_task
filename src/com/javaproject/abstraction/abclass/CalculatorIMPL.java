package com.javaproject.abstraction.abclass;

public class CalculatorIMPL extends Calsi{
	
	@Override
	public void addition() {
		
		int b=20;
		int c=a+b;
		System.out.println("Addition is: "+c);
		
	}
	@Override
	public void multiplication() {
int num=10;

System.out.println("multiplication "+num*a);
	}
	public static void main(String[] args) {
		
		CalculatorIMPL aa=new  CalculatorIMPL();
	
		aa.addition();
		aa.substraction();
		aa.multiplication();
		aa.division();
	}
	
}
