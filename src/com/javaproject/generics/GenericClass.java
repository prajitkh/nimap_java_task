package com.javaproject.generics;



public class GenericClass<T1,T2>{
	public void display(T1 v1,T2 v2) {
		System.out.println("name : "+v1+", ID"+v2);

	
	}
public static void main(String[] args) {
	GenericClass<Integer,String >obj =new GenericClass<Integer,String>();
	obj.display(11, "prajit");

		
}
}
