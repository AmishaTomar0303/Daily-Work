package com.cognizant.classes;

import java.util.Scanner;

//Write a program in C to sort elements of array in ascending order
public class AscendingArray {
public static void main(String[] args) {
	int temp;
	int i;
	int j;
	 Scanner s = new Scanner(System.in);
	    System.out.print("Enter no. of elements you want in array:");
	   int  n = s.nextInt();
	    int a[] = new int[n];
	  
	    System.out.println("Enter all the elements:");
	    for( i = 0; i < n; i++)
	    {
	        a[i] = s.nextInt();
	    }for( i=0;i<a.length;i++) {
	    	for( j=0;j<a.length;j++) {
	    if(a[i]<a[j]) {
	    	temp=a[i];
	    	a[i]=a[j];
	    	a[j]=temp;
	    	
	    }
	    	}} 
	    System.out.println("Ascending elements::");
	    for(i=0;i<a.length;i++) {
	    	System.out.println(a[i]);
	
}
}
}
