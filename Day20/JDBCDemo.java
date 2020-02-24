package com.cognizant.database;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;


public class JDBCDemo {
	public static void main(String[] args)throws ClassNotFoundException, SQLException {
		//1. load database driver
		//1.1 By using forName() method
		Class.forName("com.mysql.jdbc.Driver");
		//1.2
	//	Driver driver= new com.mysql.jdbc.Driver();
		
		//2. Establish the connection
		String url= "jdbc:mysql://localhost:3306/ctspune";
		Connection conn = DriverManager.getConnection(url, "root","root");
		Statement stmt= conn.createStatement();
		//String query="insert into employee values(1,'Harshita','pune',22)";
		String query="insert into employee values(2,'Akshita','mumbai',23)";
		//String query="insert into employee values(3,'Anita','indore',24)";
//	int result=stmt.executeUpdate(query);
		// String query="update employee set address='thane' where id=3";
	//	String query= "delete from employee where id=2";
		//int result=stmt.executeUpdate(query);
		/*if(result>0) {
			System.out.println("record sussessfully");
		
		}else {
			System.out.println("something went wrong");
		}
		//System.out.println(conn.getClass().getName());  */
		//String query="select* from employee";
		ResultSet rs= stmt.executeQuery(query);
	/*	while(rs.next()) {
			int id=rs.getInt(1);
			String name= rs.getString(2);
			String address= rs.getString(3);
			int age= rs.getInt(4);
			System.out.println(id+":"+name+":"+address+":"+age);
		} */
	}

}
