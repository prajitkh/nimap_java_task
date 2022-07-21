package com.javaproject.abstraction.interface1;

public  class EmpTax implements Emp{
	
private double taxableIncome;


public EmpTax(double taxableIncome ) {
	this.taxableIncome=taxableIncome;
}

	@Override
	public double calculateTax() {
		
		return taxableIncome*0.4;
	}
	public static void main(String[] args) {
		EmpTax ee=new EmpTax(11.222);
		ee.calculateTax();
	}

}
