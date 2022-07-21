package com.javaproject.multitherading1;

public class InterpertedEx extends Thread{
	public void run() {
		
		try {
			for(int i=1;i<=5;i++) 
				System.out.println("run>>>>>>>>>> "+i);
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			System.out.println("Exception>>>>>"+e);
		}
	
	}
	public static void main(String[] args) {
		 InterpertedEx tt=new  InterpertedEx();
		 tt.start();
		 tt.interrupt();
			 
	
	}

}

