package com.cognizant;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Set {
	public static void main(String[] args) {
		TreeSet<String> set = new TreeSet();
		set.add("hello");
		set.add("to");
		set.add("java");
		set.add("Batch");
		set.add("Batch");
		set.add("Batch");
		set.add("Batch");
		set.add("7");
		set.add("true");
		Iterator<String> it = set.iterator();
		while (it.hasNext()) {

			String element = it.next();
			System.out.println(element);

		}
	}
}
