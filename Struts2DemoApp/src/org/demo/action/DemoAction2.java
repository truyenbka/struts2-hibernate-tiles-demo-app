package org.demo.action;

import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
public class DemoAction2 extends ActionSupport {
	private String name;

	public String execute() throws Exception {
		System.out.println("Inside the DemoAction2....");
		return "SUCCESS";
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

}
