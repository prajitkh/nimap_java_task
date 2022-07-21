package com.javaproject.multitherading;

public class Test extends Thread {
	
	public void run() {
		for(int i=1;i<=10;i++) {
			System.out.println(i+" Thread task "+ Thread.currentThread().getName() );
		try {
			Thread.sleep(20);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	
	}

	public static void main(String[] args) {
	Test test=new Test();
	test.setName("t1");
	test.start();
	System.out.println(test.isAlive());
	
	Test test1=new Test();
	test1.setName("t2");
	test1.start();
	
	}
}
 