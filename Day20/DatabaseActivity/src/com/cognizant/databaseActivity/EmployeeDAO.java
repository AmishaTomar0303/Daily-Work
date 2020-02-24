package com.cognizant.databaseActivity;

import java.io.IOException;
import java.util.List;

public interface EmployeeDAO {
	public boolean saveEmployee(Employee employee) ;
	public boolean updateEmployee(Employee employee);
	public boolean deleteEmployee(Employee employee);
	public Employee getEmployeeById(int id);
	public List<Employee> getAllEmployees();
}