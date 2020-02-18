package com.cognizant;

public class Hr extends Eployee {
void hr_Display(){
	System.out.println("I am Hr");
}
public static void main (String args[]) {
	Perosn p1= new Perosn ();
	
	Eployee e1= new Eployee();
	Manager m1= new Manager();
	Hr h1= new Hr();
	h1.hr_Display();
	h1.e_Display();
	h1.p_Display();
	Tester t1= new Tester();
	t1.e_Display();
	t1.t_Display();
	
	t1.m_Display();
	
}
}
 class Perosn {
	
	void p_Display() {
		System.out.println("i am person");
	}
	

}
 class Eployee extends Perosn {

void e_Display	() {
	System.out.println("i am employee");
}}
 
 
 class Tester extends Manager {
	  void t_Display(){
		  System.out.println(" i am tester");
	  }
	}

	class Manager extends Eployee{
		void m_Display() {
			System.out.println(" I am employee");
		}
	}

	 class Doveloper extends Manager{
		 void d_display(){
			 System.out.println("I am doveloper");
		 }
	 }