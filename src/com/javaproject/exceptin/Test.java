package com.javaproject.exceptin;



public class Test {
	public static void main(String[] args) {
		
	
	
	try {
		
		///check  at compiled time 
		Class.forName("com.mysql.jdbc.driver");
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	int a=20; int b=0;
	
	int c=a/b;
	
	//those exception which are not check compile time is known run time exception 
System.out.println(c);
	
	
	try {
		System.out.println(1/0);
	}finally {
		
		System.out.println("sss");
	}

}
}
