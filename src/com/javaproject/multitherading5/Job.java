package com.javaproject.multitherading5;

public class Job extends Thread{
	
	static int balance=1000;
	
	
	@Override
	public void run() {
		for(int i=1;i<=5;i++)
		withDraw(150);
	
		
	}

 synchronized static	private void withDraw(int ammount) {
	System.out.println(Thread.currentThread().getName());
	if(balance >150)	{
	 balance=balance-ammount;
		System.out.println(balance);
	}else {
		System.out.println("NO balance");
	}

}}
