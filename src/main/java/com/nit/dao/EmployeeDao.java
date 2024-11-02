package com.nit.dao;

import com.nit.entity.Employee;
import java.util.List;

public interface EmployeeDao {
	public void saveEmployee(Employee emp);
	public void updateEmployee(Employee emp);
	public void deleteEmployee(Integer id);
	public Employee getOneEmployee(Integer id);
	public List<Employee> getAllEmployees();
	public List<Employee> getAllEmployeesBasedOnSalary(Double salary);
    public List<Employee> getAllEmployeeBasedOnNativeQuery(String name,Double Salary);
}
