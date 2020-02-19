package com.cognizant;

import java.util.Arrays;
import java.util.Scanner;

public class Activity4 {
	public static void main(String[]args) {
		System.out.println("Enter a String");
		Scanner scan= new Scanner(System.in);
		String a= scan.next();
		sortString(a);
	}
     static void sortString(String str) {
    	  char []arr = str.toCharArray(); 
          Arrays.sort(arr); 
          System.out.print(String.valueOf(arr)); 
     }
}
