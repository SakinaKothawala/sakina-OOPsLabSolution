package com.greatlearning.service;

import com.greatlearning.model.Employee;
import java.util.Random;

public class CredentialService {
	public String generateEmailAddress( Employee emp ) {
		return emp.getFirstName().toLowerCase() + emp.getLastName().toLowerCase() + "@" + emp.getDepartment() + ".abc.com";
	}
	
	public String generatePassword() {
		Random random = new Random();
		
		String allowedChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$*()?.=+^&*<>";
		
		char[] password = new char[8];
		
		for( int i = 0; i < 8; i++ ) {
			int idx = random.nextInt( allowedChars.length() ); // generates an integer between 0 - length of allowedChars string
			password[i] = allowedChars.charAt( idx );
		}
		
		return new String( password );
	}
	
	public void showCredentials( Employee emp, String email, String password ) {
		System.out.println( "Dear " + emp.getFirstName() + " your generated credentials are as follows" );
		System.out.println( "Email --> " + email );
		System.out.println( "Password --> " + password );
	}
}