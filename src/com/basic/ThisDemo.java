package com.basic;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ThisDemo {

	int x,y;
	public static void main(String[] args) {
		
		ThisDemo td = new ThisDemo(56, 5);
		td.add();
		boolean isEmail = td.valiateEmail("shri@shrikant.com");
		boolean isPassword = td.validatePassword("shri@1983");
		System.out.println(isEmail);
		System.out.println(isPassword);
		

	}
	
	public ThisDemo(int x , int y) {
		this.x = x;
		this.y = y;
		System.out.println((x*y));
	}
	
	public void add() {
		System.out.println(x+y);
	}
	
	public boolean valiateEmail(String email) {
		//boolean validate = email.contains("@");
		String regex = "^(.+)@(.+)$";  
	     //Compile regular expression to get the pattern  
	     Pattern pattern = Pattern.compile(regex); 
	     Matcher matcher = pattern.matcher(email);
		return matcher.matches();
	}
	
	public boolean validatePassword(String password) {
//		where:
//
//			^ represents starting character of the string.
//			(?=.*[0-9]) represents a digit must occur at least once.
//			(?=.*[a-z]) represents a lower case alphabet must occur at least once.
//			(?=.*[A-Z]) represents an upper case alphabet that must occur at least once.
//			(?=.*[@#$%^&-+=()] represents a special character that must occur at least once.
//			(?=\\S+$) white spaces don’t allowed in the entire string.
//			.{8, 20} represents at least 8 characters and at most 20 characters.
//			$ represents the end of the string.
		String regex ="^(?=.*[0-9])"
                + "(?=.*[a-z])(?=.*[A-Z])"
                + "(?=.*[@#$%^&+=])"
                + "(?=\\S+$).{8,20}$";
	     //Compile regular expression to get the pattern  
	     Pattern pattern = Pattern.compile(regex); 
	     Matcher matcher = pattern.matcher(password);
		return matcher.matches();
	}
	

}
