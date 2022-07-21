package com.javaproject.abstraction;

public class DrawTest {
	public static void main(String[] args) {
		int width=10;


		Drawable dd=() -> System.out.println("Drawing -->"+ width);
		
dd.draw();

	}
}