package com.cognizant.database;

import java.util.Scanner;

//Given a number we need to find the number of times its digits need
//to be added so it becomes a single digit number .

public class Activity10 {
public static void main(String[] args) {
	Scanner scan= new Scanner(System.in);
	System.out.println("Enter number");
	int a= scan.nextInt();
	if(a>0 && a<=9) {
		System.out.println("done");
	}
	else {
		count(a);
	}
      } 
    
 
	
	
	static int count(int num) {
		
		int count=0;
		
		  int sum = 0; 
	    
	      while (num != 0) 
	      { 
	          sum = sum + num % 10; 
	          num = num/10; 
	          System.out.println("function");
	          
	         // System.out.println(count);
	      } System.out.println(count);
	   
		return num;
		
	}

}