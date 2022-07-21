package com.javaproject.collectionexample;

public class Student {
private int id;
String name;
String location;


@Override
public String toString() {
	return "Student [id=" + id + ", name=" + name + ", location=" + location + "]";
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getLocation() {
	return location;
}
public void setLocation(String location) {
	this.location = location;
}
public Student(int id, String name, String location) {
	super();
	this.id = id;
	this.name = name;
	this.location = location;
}

}
