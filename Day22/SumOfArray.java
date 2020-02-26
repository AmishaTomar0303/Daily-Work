package com.cognizant.classes;

import java.util.Scanner;

public class SumOfArray {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the no. element u want in array");
		int n;
		int sum=0;
		n=scan.nextInt();
		int a[]=new int[n];
		System.out.println("enter the element:");
		for(int i=0; i<n;i++) {
		a[i]= scan.nextInt();
		sum= sum+a[i];
		
		}System.out.println("sum in array:"+ sum);
	}

}
