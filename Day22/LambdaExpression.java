package com.cognizant.classes;

public class LambdaExpression {
	public static void main(String[] args) {
		// Runnable r = () -> System.out.println("hello Runnable");
		// Thread t = new Thread(r);
		// t.start();
		Hello h=()->"Good Morning";
		System.out.println(h.greeting());
	}

}
@FunctionalInterface
interface Hello{
	String greeting();
}