package com.javaproject.abstraction.abclass;

abstract class Pet {
	
String name;
int age;

public Pet(String name,int age) {
	this.age=age;
	this.name=name;
	
	
}
abstract void m1();



void m2() {
	System.out.println("m1 method in pet class");
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public int getAge() {
	return age;
}

public void setAge(int age) {
	this.age = age;
}
public abstract void  speak();

}
