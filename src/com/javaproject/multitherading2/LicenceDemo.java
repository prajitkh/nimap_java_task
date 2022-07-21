package com.javaproject.multitherading2;

public class LicenceDemo {
	public static void main(String[] args) throws InterruptedException {

	Medical medical =new Medical();
	medical.start();
	
	medical.join();
	
	TestDrive test=new TestDrive();
	test.start();
	
	test.join();
	
	OfficerSign os=new OfficerSign();
	os.start();
	
	
	
	

}
}