package com.cognizent;

public class Parent {
String name;
String address;
int age;
 private String color;
 
 public Parent(String name,int age, String address){
	 this.name=name;
	 this.age=age;
	 address=address;
 }
 
public Parent() {
	// TODO Auto-generated constructor stub
}

void parentDisplay(){
	System.out.println("name"+name+"address"+address+"Age:"+age);
}
}
