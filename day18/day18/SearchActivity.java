package com.cognizant.inputoutput;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class SearchActivity {
public static void main(String[] args) throws IOException {
	System.out.println("write the name of file");
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	int i;
	int count = 0;
	String[] words = null;
	String s;
	System.out.println("Enter file name : ");
	String file_name = br.readLine();
	System.out.println("Enter the word to search in file : ");
	String word_to_search = br.readLine();
	String path = "D:\\amisha java\\src\\day18\\"+ file_name;
	FileReader fr = new FileReader(path);
	BufferedReader br2 = new BufferedReader(fr);
	while ((s = br2.readLine()) != null) {
		words = s.split(" ");
		for (String word : words) {
			if (word.equals(word_to_search)) {
				count++;
			}
		}
	}
	if (count != 0) {
		System.out.println("The given word is present for " + count + " Times in the file");
	} else {
		System.out.println("The given word is not present in the file");
	}
	fr.close();
}
}