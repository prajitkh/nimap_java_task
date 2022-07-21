package com.javaproject.multitherading;

public class MultithreadDemo extends Thread{

	public void run() {
		for(int i=1;i<=6;i++) {
			
			System.out.println(i);
	}
	}
	
	public static void main(String[] args) {
		MultithreadDemo tt=new  MultithreadDemo();
		
			tt.start();
	}

		}
	

