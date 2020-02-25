package com.cognizant.databaseActivity;

import java.io.IOException;
import java.util.List;

public interface EmployeeDAO {
	public boolean saveEmployee(Employee employee) ;
	public boolean updateEmployee(int emp_id);
	public boolean deleteEmployee(int emp_id2);
	public Employee getEmployeeById(int id);
	public List<Employee> getAllEmployees();
}