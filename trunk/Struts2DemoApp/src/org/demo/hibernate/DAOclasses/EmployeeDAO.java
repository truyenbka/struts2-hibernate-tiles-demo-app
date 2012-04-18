package org.demo.hibernate.DAOclasses;

import java.util.ArrayList;
import java.util.List;

import org.demo.hibernate.pojos.Employee;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.googlecode.s2hibernate.struts2.plugin.annotations.SessionTarget;
import com.googlecode.s2hibernate.struts2.plugin.annotations.TransactionTarget;

public class EmployeeDAO {
	@SessionTarget
	Session session;
	
	@TransactionTarget
	Transaction transaction;
	
	//Method to get a list employees
	@SuppressWarnings("unchecked")
	public List<Employee> getEmployees(){
		List<Employee> employees=new ArrayList<Employee>();
		try {
			employees=session.createQuery("FROM Employee").list();
		} catch (Exception e) {
			System.out.println("Error in EmployeeDAO - getEmployees() :");
			e.printStackTrace();
		}
		return employees;
	}
	//Method to add an employee
	public void addEmployee(Employee employee){
		session.save(employee);
	}
}
