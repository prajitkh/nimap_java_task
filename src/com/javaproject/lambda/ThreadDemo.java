package com.javaproject.lambda;

public class ThreadDemo {
	public static void main(String[] args) {
		
Runnable thread1 =() -> {
	 for(int i=1;i<=10;i++) 
		 System.out.println("value is "+i);
	 try {
		Thread.sleep(4000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

};
Runnable thread2 =() -> {
	 for(int i=1;i<=10;i++) 
		 System.out.println("....... "+i*2);
	 try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

};

	Thread rr=new Thread(thread1);

	rr.setName("Prajit");
	rr.start();
	
	Thread tt=new Thread(thread2);
	tt.start();
}
}
