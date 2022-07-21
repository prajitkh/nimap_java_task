package com.javaproject.multitherading5;

public class Trigger {
	
	public static void main(String[] args) throws InterruptedException {
System.out.println(Thread.currentThread().getName());
		
		//AMZON
		Job jb=new Job();
		jb.start();
		jb.setName("Amazon");
		
		jb.join();
		
		Job jb1=new Job();
		jb1.start();
		jb1.setName("Flipkart");
	}

}
