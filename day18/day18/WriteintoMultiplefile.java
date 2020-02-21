package com.cognizant.inputoutput;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;

public class WriteintoMultiplefile {
	public static void main(String[] args) throws IOException {
		String path1 = "D:\\amisha java\\src\\day18\\ami1.txt";
		String path2 = "D:\\amisha java\\src\\day18\\ami2.txt";
		String path3 = "D:\\amisha java\\src\\day18\\ami3.txt";
		String path4 = "D:\\amisha java\\src\\day18\\ami4.txt";
		FileInputStream fin1=new FileInputStream(path1);
		FileInputStream fin2=new FileInputStream(path2);
		SequenceInputStream sis=new SequenceInputStream(fin1,fin2);
		int i;
		while ((i = sis.read()) != -1) {
			System.out.println(sis.read());
		}
	
		/*
		FileOutputStream out1=new FileOutputStream(path1);
		FileOutputStream out2=new FileOutputStream(path2);
		FileOutputStream out3=new FileOutputStream(path3);
		FileOutputStream out4=new FileOutputStream(path4);
		ByteArrayOutputStream bout=new ByteArrayOutputStream();
		String data="This is a common data to be written in the files";
		byte[] b=data.getBytes();
		bout.write(b);
		bout.writeTo(out1);
		bout.writeTo(out2);
		bout.writeTo(out3);
		bout.writeTo(out4);
		


*/



	}
}


