package com.nit.test;

import com.nit.dao.EmployeeDao;
import com.nit.dao.EmployeeDaoImp;
import com.nit.entity.Employee;

public class EmployeeTest {

	public static void main(String[] args) {
		EmployeeDao dao = new EmployeeDaoImp();
//		Employee emp=new Employee(8,"keerthana","mallur",10D);
//		dao.saveEmployee(emp);
// 		System.out.println("succussfully save Employee");
		
		
//		System.out.println(emp);
//		Employee employee=dao.getOneEmployee(6);
//		dao.deleteEmployee(10);
//		System.out.println("succssfully deleted employee");
		
		
//		System.out.println(employee);
		
//		employee.setName("keerthi");
//		dao.updateEmployee(employee);
//		System.out.println("succussfully updated Employee");
		
//		for (Employee emp1 : dao.getAllEmployees()) {
//			System.out.println(emp1);
//		}
//		System.out.println("succussfully getAllEmployees....");
		
		
		
		for (Employee employee : dao.getAllEmployeesBasedOnSalary(100D)) {
			System.out.println(employee);
		}
		System.out.println("succussfully getAllEmployeesBasedOnSalary....");
		
//		
//		for (Employee employee : dao.getAllEmployeeBasedOnNativeQuery("keerthana", 10D)) {
//		    System.out.println(employee);
//		}

       // System.out.println("succussfully get Employees based on nativeQury");
		
		
		
	}
	
	
	

}
