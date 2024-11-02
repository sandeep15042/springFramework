package com.nit.dao;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.nit.entity.Employee;


public class EmployeeDaoImp implements EmployeeDao {
	private static Session sess = null;

	@Override
	public void saveEmployee(Employee emp) {
		Transaction txn = sess.beginTransaction();
		sess.persist(emp);
		txn.commit();
	}

	@Override
	public void updateEmployee(Employee emp) {
		Transaction txn = sess.beginTransaction();
		sess.persist(emp);
		txn.commit();

	}

	@Override
	public void deleteEmployee(Integer id) {
		Transaction tx = sess.beginTransaction();
		Employee emp = getOneEmployee(id);
		sess.remove(emp);
		tx.commit();
	}

	@Override
	public Employee getOneEmployee(Integer id) {
		Employee emp = sess.get(Employee.class, id);
		return emp;
	}

	static {
		Configuration cfg = new Configuration();
		cfg.configure("/hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		sess = factory.openSession();
	}

	@Override
	public List<Employee> getAllEmployees() {
		Query<Employee> query = sess.createQuery("from Employee");
		List<Employee> employees = query.getResultList();
		return employees;

	}

	@Override
	public List<Employee> getAllEmployeesBasedOnSalary(Double salary) {
		Query<Employee> query=sess.createQuery("from Employee where salary <=:abc");
		query.setParameter("abc", salary);
		List<Employee> employees=query.getResultList();
		return employees;
	}

	
	public List<Employee> getAllEmployeeBasedOnNativeQuery(String name, Double salary) {
	    String sql = "SELECT * FROM Employee WHERE salary <= :salary AND name = :name";
	    Query query = sess.createNativeQuery(sql, Employee.class);
	    query.setParameter("salary", salary);
	    query.setParameter("name", name);
	    return query.getResultList();
	}


	

}
