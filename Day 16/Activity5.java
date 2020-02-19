

//Wite a code to input string from terminal window. Use  Substrings.
package com.cognizant;

import java.util.Scanner;

public class Activity5 {
public static void main (String[]args) {
	System.out.println("Enter a String");
	Scanner scan= new Scanner(System.in);
	String a= scan.nextLine();
	
	inputSubstring(a);
}
public static void inputSubstring (String s) {

String []words= s.split("\\s+");
for(int i=0; i<words.length;i++) {
	System.out.println(words[i]);
}
}}