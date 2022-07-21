package com.javaproject.polymerphism.constructoroverloading;

public class A {
int a;
double b;
String c;

A(){
	a=100; b=33.22; c="prajit";
}
A(int x){
this.a=x;

}
A(double y,String z){
	b=y;
	c=z;
	
}
}
