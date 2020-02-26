package com.cognizant.classes;

public class LambdaExpressionDemo {
public static void main(String[] args) {
	Hello1 add=(a,b)-> a+b;
	System.out.println(add.calculate(3, 5));
	Hello1 sub=(a,b)->a-b;
	System.out.println(sub.calculate(5, 3));
	Hello1 mul=(a,b)->a*b;
	System.out.println(mul.calculate(3, 2));
	Hello1 div=(a,b)->b/a;
	System.out.println(div.calculate(4, 8));
}
}
@FunctionalInterface
interface Hello1{
	double calculate(double a, double b);
}