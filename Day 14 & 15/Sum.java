package com.cognizant;

import java.util.Scanner;

public class Sum {
public static void main(String args[]) {
	System.out.println("Enter a no.");
	Scanner scan= new Scanner(System.in);
	int n=scan.nextInt();
	int length=0;
	int sum=0;
	while(n!=0) {
		sum=sum+ n%10;
				n=n/10;
		
	}

System.out.println(sum);
}
}
