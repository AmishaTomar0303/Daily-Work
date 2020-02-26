package com.cognizant.classes;

import java.util.Scanner;

public class CopyArray {
public static void main(String[] args) {
	Scanner scan= new Scanner(System.in);
	System.out.println("Enter the no. element u want in array");
	int n;
	
	n=scan.nextInt();
	int a[]=new int[n];
	int b[]=new int[n];
	System.out.println("enter the element");
	for(int i=0; i<n;i++) {
	a[i]= scan.nextInt();
	

	}	 for(int i: a){ 

        System.out.println("elements in a::"+i);
	}
        for(int j=0;j<a.length;j++) {
        	b[j]=a[j];
        } for(int j: b){ 

            System.out.println("elements in b::"+j);
    	}
}
}
