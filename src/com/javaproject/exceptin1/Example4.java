package com.javaproject.exceptin1;

public class Example4 {
public static void main(String[] args) throws InterruptedException {
	
	
	for(int i=1;i<15;i++) {
try {
		System.out.println(i);
		Thread.sleep(1000);
	}catch(InterruptedException e) {
		System.out.println(e);
		
	}
	}
}
}
