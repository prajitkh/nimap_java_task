package com.javaproject;

import java.text.NumberFormat;

public class FormatingNum {
public static void main(String[] args) {
	NumberFormat currency=NumberFormat.getCurrencyInstance();
	String result=currency.format(4545);
	System.out.println(result);
	
}
}
