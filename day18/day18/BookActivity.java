package com.cognizant.inputoutput;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class BookActivity {
	public static void main(String[] args) throws IOException {
		int choice;
		int exit_choice;

		do {
			System.out.println("\n");
			System.out.println("-------- bOOK Management Menu -------------");
			System.out.println("1. Add Book Details");
			System.out.println("2. Display Book Details");
			System.out.println("enter your choice");
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			choice = Integer.parseInt(br.readLine());
			switch (choice) {
			case 1:
				String path = "D:\\amisha java\\src\\day18\\Book.txt";
				FileWriter out = new FileWriter(path);
				
				System.out.println("enter the name");
				String BookName = br.readLine();
				System.out.println("enter the price");
				String BookPrice = br.readLine();

				

				
				out.write(BookName+"\t"+BookPrice);
				out.close();
			case 2:
				String path1 = "D:\\amisha java\\src\\day18\\Book.txt";
				 FileReader fr =  new FileReader(path1); 
			  
			    int i; 
			    while ((i=fr.read()) != -1) 
			      System.out.print((char) i); 
				
			}
			System.out.println("\n\n\nDo you want to contunue ? 1 for yes / 0 for no : ");
			exit_choice = Integer.parseInt(br.readLine());
		} while (exit_choice != 0);

	}

}