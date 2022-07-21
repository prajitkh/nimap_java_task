package com.javaproject.multitherading;

public class Example1 extends Thread {
	
public void run() {
	System.out.println("Running......................");
	for(int i=1;i<=10;i++) {
		System.out.println(i);
	}
}
public static void main(String[] args) {
	Example1 ss=new Example1();
	ss.run();
}
}
