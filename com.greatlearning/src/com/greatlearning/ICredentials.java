package com.greatlearning;

public interface ICredentials {
	public String GenerateEmailAddress(String FirstName,String LastName,String department); 
	public String GeneratePassword();
	public void ShowCredentials(Employee emp);
		
	

}
