package com.cognizant.databaseActivity;

import java.util.List;
import java.util.Scanner;


 
public class EmployeeController {

	public static void main(String[] args) {
		
		EmployeeDAO empObj = new EmployeeDAOImpl();
		// Employee employee = new Employee(11, "Disha", "Bhopal", "Digital Engineer", 22, 46, 46);
		 //empObj.saveEmployee(employee);
		//List<Employee> list = empObj.getAllEmployees();
	//	list.forEach(System.out::println);
		
	Employee emp=	empObj.getEmployeeById(1);
	System.out.println(emp);
		
	}}