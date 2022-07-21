package com.javaproject.multitherading;


import java.lang.*;
public class PrioirtyExample extends Thread{

	public void run() {
		System.out.println("inside run method");
	}

	public static void main(String[] args) {
		PrioirtyExample pr=new PrioirtyExample();
		PrioirtyExample pr1=new PrioirtyExample();
		PrioirtyExample pr2=new PrioirtyExample();
		PrioirtyExample pr3=new PrioirtyExample();

		System.out.println("pr priority "+pr.getPriority());
		System.out.println("pr1 priority "+pr1.getPriority());
		System.out.println("pr2 priority "+pr2.getPriority());
		System.out.println("pr3 priority "+pr3.getPriority());

pr.setPriority(MAX_PRIORITY);
pr1.setPriority(MIN_PRIORITY);
pr2.setPriority(5);
pr3.setPriority(NORM_PRIORITY);

System.out.println("____________________________________");
System.out.println("pr priority "+pr.getPriority());
System.out.println("pr1 priority "+pr1.getPriority());
System.out.println("pr2 priority "+pr2.getPriority());
System.out.println("pr3 priority "+pr3.getPriority());

System.out.println("______________________");

System.out.println("Currently executing thread :"+Thread.currentThread().getName());
System.out.println("Main thread priority"+Thread.currentThread().getPriority());

	}
}
