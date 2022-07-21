package com.javaproject.multitherading2;

public class Medical extends Thread{
	public void run() {
		System.out.println("Medical start");
		try {
			Thread.sleep(1000);
			System.out.println("medical complete");
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}

}
