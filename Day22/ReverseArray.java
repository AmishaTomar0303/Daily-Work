package com.cognizant.classes;

import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the no. element u want in array");
		int n;
		
		n=scan.nextInt();
		int a[]=new int[n];
		System.out.println("enter the element");
		for(int i=0; i<n-1;i++) {
		a[i]= scan.nextInt();
		
		}
		System.out.println("elements are::");
		for(int i=0; i<n-1;i++) {
			System.out.println(a[i]);
			
			}

		for(int i=a.length-1;i>0;i--) {
			System.out.println("reverse element is"+a[i]);
		}
		System.out.println("Reverse elements are::");
		for(int i=0; i<n-1;i++) {
			System.out.println(a[i]);
			
			}
	}

}
