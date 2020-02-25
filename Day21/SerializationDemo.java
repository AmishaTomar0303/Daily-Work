package com.cognizant.database;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationDemo 
{
	public static void serialize(Employee employee,String path) {
	try {
		FileOutputStream fout= new FileOutputStream(path);
		BufferedOutputStream bout= new BufferedOutputStream(fout);
		ObjectOutputStream oss= new ObjectOutputStream(bout);
		oss.writeObject(employee);
		oss.close();
		bout.close();
		fout.close();
		
	}catch(FileNotFoundException e) {
		e.printStackTrace();
	}catch(IOException e) {
		e.printStackTrace();
	}
}
	public static Object deserialize(String filepath)  {
	try{
		FileInputStream fin= new FileInputStream(filepath);
	
	BufferedInputStream bin= new BufferedInputStream(fin);
	ObjectInputStream oin= new ObjectInputStream(bin);
	Object obj= oin.readObject();
	oin.close();
	return obj;
	}
	catch(FileNotFoundException e) {
		e.printStackTrace();          
	}catch(IOException e) {
		e.printStackTrace();
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return null;
	
	
	}
public static void main(String[] args) {
	//Employee employee= new Employee(101,"Nikhil","Mumbai","Software Engineer",35,765,876);
//	serialize(employee,"D:\\amisha java\\src\\day21\\employee.txt");
//	System.out.println("object added susscessfully");
	Employee employee=(Employee)deserialize("D:\\\\amisha java\\\\src\\\\day21\\\\employee.txt");
	System.out.println(employee);
	
}
}
