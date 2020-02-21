package com.cognizant.inputoutput;

import java.io.File;

public class FirstFile {
	public static void main(String[] args) {
		String path="D:\\\\amisha java\\\\src\\\\day18\\\\ami11.txt";
		File file=new File(path);
		System.out.println("File Name :" +file.getName());
		System.out.println("File length :" +file.length());
		System.out.println("Parent Name :" +file.getParent());
		System.out.println("Path is :" +file.getPath());
	}
	}
