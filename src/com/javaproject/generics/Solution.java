package com.javaproject.generics;

public class Solution{
	
	public static  <E> void printArray(E[]inputArray)
	
	{
		for(E ee: inputArray) {
			System.out.print(ee);
		}
		System.out.println();
	}
	public static void main(String[] args) {
		Integer[] intArray= {1,2,3,4,5};
		Double[] dd= {1.1,2.2,4.3};
		
		
		System.out.println("Array integer");
	printArray(intArray);
	System.out.println("double array");
	printArray(dd);
	
		}
}