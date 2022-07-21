package com.javaproject.multitherading1;

public class Test extends Thread{

	public void run() {
		
		for(int i=1;i<=5;i++) {
			Thread.yield();
			System.out.println(Thread.currentThread().getName()+" "+ i);
		}
	}
	public static void main(String[] args) {
		Test tt=new Test();
		try {
			tt.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		tt.start();
		
		for(int i=6;i<=10;i++) {
	System.out.println(Thread.currentThread().getName()+" "+i);

		}
	}

}
