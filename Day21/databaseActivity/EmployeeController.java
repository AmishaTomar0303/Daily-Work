package com.cognizant.databaseActivity;

import java.util.List;
import java.util.Scanner;


 
public class EmployeeController {

	public static void main(String[] args) {
		
		EmployeeDAO employeeDAO = new EmployeeDAOImp1();
	//	EmployeeDAO empObj = new EmployeeDAOImp1();
		//Employee emp = new Employee(111, "Disha", "Bhopal", "Digital Engineer", 22, 46566.77, 46546656L);
		//empObj.addEmployee(emp);
		Scanner sc = new Scanner(System.in);
//		List<Employee> list = empObj.getAllEmployees();
//		list.forEach(System.out::println);
		int emp_id;
		int emp_id2;
		int emp_id3;
		int choice;
		int exit_choice;
		do {
			System.out.println("\n");
			System.out.println("-------- Employee Management Menu -------------");
			System.out.println("1. Add Employee");
			System.out.println("2. Update Employee");
			System.out.println("3. Remove Employee");
			System.out.println("4. Get Employee By Id");
			System.out.println("5. Display All");
			System.out.println("6. Exit");
			System.out.println();
			System.out.println("Enter your choice : ");
			choice = Integer.parseInt(sc.next());
			switch (choice) {
			case 1:
				System.out.println("\nEnter employee id : ");
				int employee_id = sc.nextInt();
				sc.nextLine();
				System.out.println("\nEnter employee name : ");
				String employee_name = sc.nextLine();
				sc.nextLine();
				System.out.println("\nEnter city : ");
				String employee_city = sc.nextLine();
				sc.nextLine();
				System.out.println("\nEnter employee designation : ");
				String employee_designation = sc.nextLine();
				sc.nextLine();
				System.out.println("\nEnter employee age : ");
				int employee_age = sc.nextInt();
				sc.nextLine();
				System.out.println("\nEnter employee salary : ");
				int employee_salary = sc.nextInt();
				sc.nextLine();
				System.out.println("\nEnter mobile number : ");
				int phone_number = sc.nextInt();
				sc.nextLine();
				Employee emp2 =new Employee(employee_id, employee_name, employee_city, employee_designation,employee_age, employee_salary, phone_number);
				employeeDAO.saveEmployee(emp2);
				break;
			case 2:
				System.out.println("\nEnter employee id to update data : ");
				emp_id = sc.nextInt();
				employeeDAO.updateEmployee(emp_id);
				break;
			case 3:
				System.out.println("\n\nEnter employee id to delete employee data : ");
				emp_id2 = sc.nextInt();
				employeeDAO.deleteEmployee(emp_id2);
				break;
			case 4:
				System.out.println("\n\nEnter employee id to get data : ");
				emp_id3 = sc.nextInt();
				System.out.println("\n\nEmployee details are : \n");
				Employee emp = employeeDAO.getEmployeeById(emp_id3);
				System.out.println(emp);
				break;
			case 5:
				System.out.println("\n\nEmployee Details are : \n");
				List<Employee> list = employeeDAO.getAllEmployees();
				list.forEach(System.out::println);
				break;
			case 6:
				System.exit(0);
			}
			System.out.println("\n\n\nDo you want to contunue ? 1 for yes / 0 for no : ");
			exit_choice = Integer.parseInt(sc.next());
		} while (exit_choice != 0);
	}
}