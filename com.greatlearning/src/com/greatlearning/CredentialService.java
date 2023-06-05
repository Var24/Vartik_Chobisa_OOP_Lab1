package com.greatlearning;
import java.util.Random;

public class CredentialService implements ICredentials {

	@Override
	public String GenerateEmailAddress(String FirstName, String LastName, String department) {
		// TODO Auto-generated method stub
		return FirstName+LastName+"@"+department+".gl.com";
		
	}
    public static void main(String[] args) {
    	
    	CredentialService c = new CredentialService();
    	c.GeneratePassword();
    	
    }
	@Override
	public String GeneratePassword() {
		String password = "";
		String capitalLetters = "ABCDEFGHIJKLMNOPQRSTUWXYZ";
		String smallLetters = "abcdefghijklmnopqrstuvwxyz";
		String numbers = "0123456789";
		String specialCharacters= "!@#$%^&*()<>?{}";
		String values = capitalLetters + smallLetters + numbers + specialCharacters;
		Random random = new Random();
		
		for(int i=0;i<8;i++) {
			int index = random.nextInt(values.length());
			//System.out.println("index: "+index);
			char c = values.charAt(index);
			//System.out.println("character: "+c);
			password+=String.valueOf(c);
			//System.out.println("Password: "+password);
			
			}
		
		
		
		
		return password;
	}

	@Override
	public void ShowCredentials(Employee emp) {
		// TODO Auto-generated method stub
		System.out.println("");
		System.out.println("");
		System.out.println("Hi: "+emp.getFirstName()+" "+emp.getLastName()+".Following are the credentials: ");
		System.out.println("Email is: "+emp.getEmail());
		System.out.println("Password is: "+emp.getPassword());
	}
	

}
