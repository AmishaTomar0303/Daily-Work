package com.cognizant.classes;

import java.util.Scanner;

// Write a program in C to count a total number of duplicate elements in an array
public class DuplicateNoArray {
public static void main(String[] args) {
	
	int count=0;
	int a[]= {3,3,5,4,2,2};
	for(int i=0; i<a.length;i++) {
		for(int j=i+1; j<a.length;j++) {
			if(a[i]==a[j]) 
				count= count+1;
				
				
			}
		}System.out.println(count);
	}
	
}

