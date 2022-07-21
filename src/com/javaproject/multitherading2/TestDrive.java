package com.javaproject.multitherading2;

public class TestDrive extends Thread{
	public void run() {
		System.out.println("Test drive start");
		try {
			Thread.sleep(5000);
			System.out.println("Test drive complete");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
