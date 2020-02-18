package com.cognizant;

public class StringExample {

	public static void main(String[] args) {
		
		String city1="pune";
		String city2="Mumbai";
		String city3= "pune";
		String city4 =new String("pune");
		String city5= new String("mumbai");
		String city6= new String("pune") ;
		
		System.out.println(city1==city3);
		System.out.println(city3.contentEquals(city6));
		System.out.println(city1==city6);
		
	}
	
	

	
	}


