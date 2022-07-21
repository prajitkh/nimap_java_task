package com.javaproject.multitherading;

public class TestJoinMethod extends Thread{
	public void run() {
		for(int i=1;i<=5;i++){
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(i);

		}

	}
	public static void main(String[] args) {
		TestJoinMethod tt=new TestJoinMethod();
		TestJoinMethod tt1=new TestJoinMethod();
		TestJoinMethod tt2=new TestJoinMethod();
		tt.start();
		try {
			tt.join();
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
tt1.start();
tt2.start();


	}
}
