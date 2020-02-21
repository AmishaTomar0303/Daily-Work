package com.cognizant.inputoutput;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Vector;

public class MultipleFileRead {
public static void main(String[] args) throws FileNotFoundException {
	String path1 = "D:\\amisha java\\src\\day18\\ami1.txt";
	String path2 = "D:\\amisha java\\src\\day18\\ami2.txt";
	String path3 = "D:\\amisha java\\src\\day18\\ami3.txt";
	String path4 = "D:\\amisha java\\src\\day18\\ami4.txt";
	FileInputStream fin1=new FileInputStream(path1);
	FileInputStream fin2=new FileInputStream(path2);
	FileInputStream fin3=new FileInputStream(path3);
	FileInputStream fin4=new FileInputStream(path4);
	Vector vector= new Vector();
	vector.add(fin1);
	vector.add(fin2);
	vector.add(fin3);
	vector.add(fin4);
	Enumeration en = vector.elements();
	SequenceInputStream sis= new SequenceInputStream(en);
}

}
