package com.javaproject.multitherading4;

public class MovieBookApp {
	public static void main(String[] args) throws InterruptedException {

		TotalEarning ee=new TotalEarning();
		ee.start();

	///	System.out.println("total earning :"+ee.total);
		synchronized(ee) {
			ee.wait();
			System.out.println("total earning :"+ee.total);
		}


	}

}
