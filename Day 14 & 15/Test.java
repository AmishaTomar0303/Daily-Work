package com.cognizant;

public class Test {
	public static void main(String rgs[]) {
		D d= new D();
		C c =new C();
		C c1= new D();
		c1.display();
	}

}



 class C {
	 
	 int x=10;
	 int y=20;
	 public void display() {
		 int z= x+y;
		 System.out.println(z);
	 }
	 
 }
 class D extends C
 {@Override
	 public void display() {
		 System.out.println("this is class D");
	 }
 }
 