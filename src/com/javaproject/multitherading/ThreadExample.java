package com.javaproject.multitherading;


public class ThreadExample extends Thread{
	 


@Override
public void run() {
	for(int i=1;i<=10;i++) {
	System.out.println("Running thread "+i);
	try {
		Thread.sleep(400);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
	
public static void main(String[] args) {
System.out.println(Thread.currentThread().getName()+ " thread begin");
	ThreadExample tt=new ThreadExample();
	tt.start();
	//performing single task  from single thread
	// performing multiple task form single thread
	ThreadExample tt1=new ThreadExample();
	tt1.start();
}



}
