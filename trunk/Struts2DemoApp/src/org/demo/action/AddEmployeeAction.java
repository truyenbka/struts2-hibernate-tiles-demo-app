package org.demo.action;

import java.util.ArrayList;
import java.util.List;

import org.demo.hibernate.DAOclasses.EmployeeDAO;
import org.demo.hibernate.pojos.Employee;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

@SuppressWarnings("serial")
public class AddEmployeeAction extends ActionSupport implements ModelDriven<Employee> {
	
	Employee employee=new Employee();
	List<Employee> employees=new ArrayList<Employee>();
	EmployeeDAO employeeDAO=new EmployeeDAO();
	
	@Override
	public Employee getModel() {
		return employee;
	}
	
	public String execute(){
		System.out.println("In execute...., EMP FN : "+employee.getFirstName()+" EMP LN : "+employee.getLastName()+" SAL : "+employee.getSalary());
		employeeDAO.addEmployee(employee);
		return "SUCCESS";
	}
	
	public String listEmployees(){
		employees=employeeDAO.getEmployees();
		return "SUCCESS";
	}
	
	public Employee getEmployee(){
		return employee;
	}
	
	public void setEmployee(Employee emp){
		this.employee=emp;
	}
	
	public List<Employee> getEmployees(){
		return employees;
	}
	
	public void setEmployees(List<Employee> emps){
		this.employees=emps;
	}
}
