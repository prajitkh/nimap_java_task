package com.javaproject.multitherading;

public class Example implements Runnable{

	@Override
	public void run() {
		System.out.println("Thread is runnig.......");
		for(int i=1;i<=5;i++) {
			System.out.println(i);
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
			
				e.printStackTrace();
			}
		}
		
	}
	public static void main(String[] args) {
		
		Example ee=new Example();
		Thread tt=new Thread(ee);
		tt.start();
		Thread tt1=new Thread(ee);
		tt1.start();
		
	}

}
