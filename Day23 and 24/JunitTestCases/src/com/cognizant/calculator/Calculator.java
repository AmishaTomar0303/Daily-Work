package com.cognizant.calculator;

public class Calculator {
public int add(int a, int b) {
	return a+b;
}
public int sub(int a, int b) {
	if (a>b) {
		return a-b;
	}else {
		return b-a;
	}
}
public int mul(int a, int b) {
	return a*b;
}
public int div(int a, int b) {
	return a/b;
}
public boolean isprime(int number) {
	boolean status=true;
	for(int i=2;i<=number/2; i++) {
		if(number%2==0) {
			status= false;
			break;
		}
	}return status;
}
}
