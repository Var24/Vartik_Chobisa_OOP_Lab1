package com.greatlearning;

public class Employee {
	private String FirstName;
	private String LastName;
	private String email;
	private String password;
	
	public Employee(String FirstName,String LastName){
		this.FirstName = FirstName;
		this.LastName = LastName;
		
	}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		this.FirstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		this.LastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	

}
