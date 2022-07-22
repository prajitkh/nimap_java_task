package com.javaproject.collectionexample.list;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class ArrayExample {
public static void main(String[] args) {
	
	ArrayList<String> ss=new ArrayList<>();
ss.add("Nimap");
	ss.add("PRM");
	ss.add("Honor");
	
try {
	
	 //Serialization
	FileOutputStream  ii=new FileOutputStream("C:\\Users\\hp\\file.text");
	
		ObjectOutputStream aaa=new ObjectOutputStream(ii);
		aaa.writeObject(ss);
		System.out.println("created");
		ii.close();
		aaa.close();
		
		FileInputStream input=new FileInputStream("C:\\\\Users\\\\hp\\\\file.text");
		ObjectInputStream ee=new ObjectInputStream(input);
		ArrayList list= (ArrayList) ee.readObject();
		System.out.println(list);
		
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
	



