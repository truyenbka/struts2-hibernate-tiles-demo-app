package org.demo.action;

import org.demo.hibernate.pojos.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DemoAction {

	private String message;
	private String userName;

	public DemoAction() {

	}

	public String execute() {
		System.out.println("In execute!!!");
		setMessage("Hello " + getUserName());

		/////////////////////////////HIBERNATE////////////////////////////////////////////
		// Using hibernate to display a data in MySQL database table
		Employee employee=new Employee();
		employee.setId(0);
		employee.setFirstName("firstUser1");
		employee.setLastName("lastUser1");
		employee.setSalary(15000);
		
		@SuppressWarnings("deprecation")
		SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
		Session session=sessionFactory.openSession();
		session.beginTransaction();
		session.save(employee);
		session.getTransaction().commit();
		//////////////////////////////////////////////////////////////////////////////////
		return "SUCCESS";
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserName() {
		return userName;
	}

}
