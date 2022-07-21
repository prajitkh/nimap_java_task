package com.javaproject;

public class Demo {
	public static void main(String[] args) {
	int n=100;
	for(int i=1;i<=n;i++) {
		if(i%3==0) 
			System.out.println(i+"boo");
		
		else{
			if(i%5==0  && i%3 ==0) {
				System.out.println(i+"foo");
			}
		}
		
	}
	
}
	}
