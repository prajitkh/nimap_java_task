package com.javaproject.strings;

public class StringFormatter {

	public static String capitalizeWord(String str){  
	    String words[]=str.split("\\s");  
	    String c="";  
	    for(String w:words){  
	        String first=w.substring(0,1);  
	        String afterfirst=w.substring(1);  
	        c+=first.toUpperCase()+afterfirst+" ";  
	    }  
	    return c.trim();  
	} 
	public static void main(String[] args) {
	    System.out.println(StringFormatter.capitalizeWord("prajit shriram khawshi"));  

	}
	}
	
	

	


