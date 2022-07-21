package com.javaproject.multitherading1;

public class TestJoinEx extends Thread {

	
	public void run() {
	for(int i=1;i<=5;i++) {
		try {
			
			System.out.println("child Thread" +i);
		Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}

}
	public static void main(String[] args) throws InterruptedException {
		
		TestJoinEx tt=new TestJoinEx();
		
		tt.start();
		tt.join();
	
		for(int i=1;i<=5;i++) {
			try {
				System.out.println( "main thread" +i);
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
}
}