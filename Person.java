package com.cognizent;

public class Person{
   String name;
   float age;
   String address;
   public Person(){}
   public Person(String name, int age){
   this.name=name;
   this.age=age;
	   
   }
   public Person(String name,int age,String addr){
	   
	   this.name=name;
	   this.age=age;
	   address=addr;
   }
   void display(){
	   System.out.println("Name:\t"+name+"Age:\t"+age+"address\t"+address);
   }
   public static void main(String[]args){
	   Person p= new Person();
	   p.display();
	   Person p2= new Person("mel",30);
	   p2.display();
	   Person p3= new Person("tik",49,"flip");
	   p3.display();
   }
   
}