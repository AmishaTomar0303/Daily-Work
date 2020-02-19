package com.cognizant;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.LinkedList;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList();
		// List list= new ArrayList();
		list.add("hello");
		list.add("to");
		list.add("java");
		list.add("Batch");
		list.add("7");
		list.add("true");
		System.out.println(list.get(3));
		System.out.println(list.indexOf("Batch"));
		System.out.println(list.remove("true"));
		System.out.println(list);

		for (Object obj : list) {
			System.out.println(obj);
			if (obj.equals("java")) {
				break;
			}
		}
		Iterator<String> it = list.iterator();
		System.out.println("****Forward Direction*****");
		while (it.hasNext()) {
			String element = it.next();
			System.out.println(element);
		}

		System.out.println("****Backward Direction***");
		ListIterator<String> it1 = list.listIterator();
		while (it1.hasPrevious()) {
			String element = it1.previous();
			System.out.println(element);
		}

		for (String obj : list) {
			System.out.println(obj);
			if (obj.equals("java")) {
				break;
			}
		}

	}

}
