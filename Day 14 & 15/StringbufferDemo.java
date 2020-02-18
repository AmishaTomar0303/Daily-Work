package com.cognizant;

public class StringbufferDemo {
public static void main(String args[]) {
	StringBuffer sb= new StringBuffer();
	System.out.println(sb.capacity());
	sb.append("hello to java version 8");
	System.out.println(sb.capacity());
	sb.append("-this is my version");
	System.out.println(sb.capacity());
	sb.insert(7,"dear");
	System.out.println(sb);
	sb.replace(7, 20,"this is a very new version of java");
	System.out.println(sb);
	sb.delete(7, 20);
	System.out.println(sb);
	sb.reverse();
	System.out.println(sb);
}
}
