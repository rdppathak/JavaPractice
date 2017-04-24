package com.microservice.SingleMS.Employee;

public class Employee {
	private long id;
	private String firstName;
	private String emailId;
	
	public Employee(long id, String firstName, String emailId) {
		this.id = id;
		this.firstName = firstName;
		this.emailId = emailId;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstName=" + firstName + ", emailId=" + emailId + "]";
	}
	
	
}
