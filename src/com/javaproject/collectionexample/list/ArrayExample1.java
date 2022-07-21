package com.javaproject.collectionexample.list;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;

public class ArrayExample1 {
public static void main(String[] args) {
	
	try {
		FileInputStream ss=new FileInputStream("C:\\\\Users\\\\hp\\\\file.text");
		ObjectInputStream ee=new ObjectInputStream(ss);
		
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
}
