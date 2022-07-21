package com.javaproject.multitherading2;

public class OfficerSign extends Thread{
	
	
public void run() {
	
	System.out.println("officer take file");
	try {
		Thread.sleep(1000);
		System.out.println("officer work complete");
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}

}
