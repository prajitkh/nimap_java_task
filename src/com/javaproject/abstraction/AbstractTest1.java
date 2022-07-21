package com.javaproject.abstraction;

public class AbstractTest1 extends AbstractClassEx1{
	public void disp2() {
		System.out.println("I'm overriding abstract method");
		}
		public static void main(String[] args) {
			AbstractTest1	obj = new AbstractTest1();
		obj.disp2();
		obj.disp1();
		}
		}

