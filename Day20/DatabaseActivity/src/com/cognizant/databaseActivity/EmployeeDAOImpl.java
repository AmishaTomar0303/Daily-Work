package com.cognizant.databaseActivity;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;



public class EmployeeDAOImpl implements EmployeeDAO  {
	
	Connection conn = getConnection();
	PreparedStatement ps = null;
private Connection getConnection() {
		Connection conn = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/ctspune";
			conn = DriverManager.getConnection(url, "root", "root");
			return conn;
		} catch (Exception e) {
			return null;
		}
}
@Override
public boolean saveEmployee(Employee employee)  {
	String sql="insert into employee values(?,?,?,?,?,?,?)";
	try {
		ps=conn.prepareStatement(sql);
		ps.setInt(1, employee.getId());
		ps.setString(2, employee.getName());
		ps.setString(3, employee.getAddress());
		ps.setString(4, employee.getDesignation());
		ps.setInt(5,employee.getAge());
		ps.setInt(6, employee.getSalary());
		ps.setInt(7, employee.getPhone());
		ps.executeUpdate();
		return true;
	}catch(SQLException e) {
		e.printStackTrace();
		return false;
	}
	
}
@Override
public boolean updateEmployee(Employee employee) {
	// TODO Auto-generated method stub
	return false;
}
@Override
public boolean deleteEmployee(Employee employee) {
	
	return false;
}
@Override
public Employee getEmployeeById(int id) {
	String sql="select*from employee where id=?";
	try {
		ps=conn.prepareStatement(sql);
	ps.setInt(1, id);
		ResultSet rs= ps.executeQuery();
		Employee emp=null;
		while(rs.next()) {
		emp.setId(rs.getInt("id"));
		emp.setName(rs.getString("name"));
		emp.setAddress(rs.getString("address"));
		emp.setDesignation(rs.getString("designation"));
		emp.setAge(rs.getInt("age"));
		emp.setSalary(rs.getInt("Salary"));
		emp.setPhone(rs.getInt("phone"));
		}
		
		return emp;
	}catch(SQLException e){
		e.getStackTrace();
		return null;
	}
	}

	
@Override
public List<Employee> getAllEmployees() {
	List<Employee> employees= new ArrayList<Employee>();
	String sql="select * from employee";
	try {
		ps=conn.prepareStatement(sql);
		ResultSet rs= ps.executeQuery();
		while(rs.next()) {
			Employee emp=new Employee();
			emp.setId(rs.getInt("id"));
			emp.setName(rs.getString("name"));
			emp.setAge(rs.getInt("age"));
			emp.setAddress(rs.getString("address"));
			emp.setPhone(rs.getInt("phone"));
			emp.setDesignation(rs.getString("designation"));
			employees.add(emp);
		}
		return employees;
	}catch(SQLException e){
		e.getStackTrace();
		return null;
	}
	// TODO Auto-generated method stub
	
}
}