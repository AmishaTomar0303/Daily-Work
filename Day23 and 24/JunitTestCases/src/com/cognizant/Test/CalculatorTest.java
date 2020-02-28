package com.cognizant.Test;



import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.cognizant.calculator.Calculator;

public class CalculatorTest {

	private static Calculator calculator;

	@BeforeClass
	public static void init() {
		calculator = new Calculator();
		System.out.println("object Created");
	}

	@AfterClass
	public static void destroy() {
		calculator = null;
		System.out.println("object Destroy");
	}

	@Test
	public void test() {
		assertEquals(17,calculator.add(12,5));
	}
	@Test
	public void test_sub_success() {
		assertEquals(7,calculator.sub(5, 12));
		System.out.println("inside sub Test");
	}
	public void test_mul() {
		assertEquals(60,calculator.mul(12,5));
	}
	@Test
	public void test_div() {
		assertEquals(5,calculator.div(15, 3));
		System.out.println("inside sub Test");
	}
	@Test
	public void test_isprime_success() {
		assertEquals(true,calculator.isprime(7));
	}
	@Test
	public void test_isprime_fail() {
		assertEquals(false,calculator.isprime(4));
	}
	
}
