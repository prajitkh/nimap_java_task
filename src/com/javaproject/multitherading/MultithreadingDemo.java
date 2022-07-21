package com.javaproject.multitherading;

public class MultithreadingDemo implements Runnable {

	@Override
	public void run() {
System.out.println("Thread "+Thread.currentThread().getId()+" is running");
System.out.println("Thread "+Thread.currentThread().getName()+" is running");
		
	}
	

}
