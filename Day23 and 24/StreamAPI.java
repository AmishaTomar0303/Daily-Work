package com;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPI {
	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<>();
		addNames(names);
		// 1. print Names with length more than 6
		List<String> nameList = names.stream().filter(s -> s.length() > 6).collect(Collectors.toList());
		System.out.println(nameList);
		nameList.forEach(System.out::println);
		// 2 name in upper case
		List<String> namesInUpper = names.stream().map(s -> s.toUpperCase()).collect(Collectors.toList());
		System.out.println("names in upper case");
		namesInUpper.forEach(System.out::println);
		long count=names.stream().count();
		System.out.println("list count is:"+ count);
		Stream<Integer>data= Stream.of(1,11,111,1111,11111);
		System.out.println("DAta count-"+ data.count());
		
		
		Stream<String> languages= Stream.of("C","C++","java","phython","Angular");
		List<String> languagelist= languages.filter(sup-> sup.length()>4).collect(Collectors.toList());
		System.out.println(languagelist);
		
	}
	Stream<String> languages2= Stream.of("C","C++","java","phython","Angular");

	private static void addNames(ArrayList<String> name) {
		name.add("neeraj");
		name.add("Harshita");
		name.add("Rajshree");
		name.add("pulkit");
		name.add("abhishek");

	}
}
