package com.javaproject.stream.example;

public class Employee {
private int name;
private int age;
public Employee(int name, int age) {
	super();
	this.name = name;
	this.age = age;
}
public int getName() {
	return name;
}
public void setName(int name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
@Override
public String toString() {
	return "Employee [name=" + name + ", age=" + age + "]";
}

}
