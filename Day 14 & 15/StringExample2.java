package com.cognizant;

public class StringExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String msg="I am an Enginner";
		System.out.println(msg.length());
		String year="of 2020";
		/*string is immutable*/
		String h =msg.concat(year);
		System.out.println(h);
		System.out.println(msg.substring(3,10));
		System.out.println(msg.charAt(5));
		System.out.println(msg.replace('e', 'o'));
		System.out.println(msg.isBlank());
		System.out.println(msg.intern());
		System.out.println(msg.repeat(2));
		System.out.println(msg.isBlank());
		System.out.println(msg.compareToIgnoreCase(year));
		System.out.println(msg.toUpperCase());
		System.out.println(msg.toLowerCase());
		System.out.println(msg.replaceFirst("i am", "we are"));
		System.out.println(msg.contentEquals(h));
		System.out.println(msg.strip());
		System.out.println(msg.valueOf('e'));
		System.out.println(msg.indent(3));
		System.out.println(msg.codePointAt(8));
	}

}
