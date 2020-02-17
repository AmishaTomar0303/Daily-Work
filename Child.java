package com.cognizent;

public class Child extends Parent{
	public Child(){
		super();
	}
	public Child(String name,int age,String address){
		super(name,age,address);
	}
	public static void main(String[]args){
		Child c= new Child();
		c.parentDisplay();
		Child c2= new Child("tin",20,"flip");
		c2.parentDisplay();
	}

}
