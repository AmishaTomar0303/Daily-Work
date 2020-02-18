package com.cognizant;

public class InterfaceExample extends Div implements Hello,Sub {

	@Override
	public int add(int a, int b) {
		
		return a+b;
	}
	public static void main (String args[]) {
		InterfaceExample imp= new InterfaceExample();
		System.out.println(imp.add(2, 3));
		System.out.println(imp.sub(8,10));
		System.out.println(imp.div(10,2));
		System.out.println(Hello.mul(5, 3));
	}
	
	@Override
	public int sub(int a, int b) {
		
		return a-b;
	}

}
