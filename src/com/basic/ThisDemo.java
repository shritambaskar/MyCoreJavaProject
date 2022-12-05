package com.basic;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ThisDemo {

	int x,y;
	public static void main(String[] args) {
		
		ThisDemo td = new ThisDemo(56, 5);
		td.add();
		boolean isEmail = td.valiate("@shrikant.com");
		System.out.println(isEmail);
		

	}
	
	public ThisDemo(int x , int y) {
		this.x = x;
		this.y = y;
		System.out.println((x*y));
	}
	
	public void add() {
		System.out.println(x+y);
	}
	
	public boolean valiate(String email) {
		//boolean validate = email.contains("@");
		String regex = "^(.+)@(.+)$";  
	     //Compile regular expression to get the pattern  
	     Pattern pattern = Pattern.compile(regex); 
	     Matcher matcher = pattern.matcher(email);
		return matcher.matches();
	}
	

}
