package com.greatlearning;

import java.util.Scanner;

public class DriverClass {
	public static void main(String[] args) {
		System.out.println("Please enter first name");
		Scanner sc = new Scanner(System.in);
		String FirstName = sc.next();
		
		System.out.println("Please enter last name");
		String LastName = sc.next();
		Employee emp = new Employee(FirstName,LastName);
		
		System.out.println("Enter the technical department from the following:");
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. Human Resource");
		System.out.println("4. Legal");
		
		int option = sc.nextInt();
		String generatedEmail = null;
		String generatedPassword = null;
		ICredentials iCredentials = new CredentialService();
			
		
			
		switch(option) {
		case 1:
			generatedEmail = iCredentials.GenerateEmailAddress(FirstName,LastName,"tech");
			generatedPassword = iCredentials.GeneratePassword();
			break;
		case 2:
			generatedEmail = iCredentials.GenerateEmailAddress(FirstName,LastName,"admin");
			generatedPassword = iCredentials.GeneratePassword();
		
			break;
		case 3:
			generatedEmail = iCredentials.GenerateEmailAddress(FirstName,LastName,"hr");
			generatedPassword = iCredentials.GeneratePassword();
		
			break;
		case 4:
			generatedEmail = iCredentials.GenerateEmailAddress(FirstName,LastName,"legal");
			generatedPassword = iCredentials.GeneratePassword();
			
			break;
		
		default:
			System.out.println("Invalid Option");
		
		}
	
		emp.setEmail(generatedEmail);
		emp.setPassword(generatedPassword);
		iCredentials.ShowCredentials(emp);
		sc.close();
	}
	
	

}
