package com.basic;

public class MethodWithArguement {

	public static void main(String[] args) {
		String firstName = "Shrikant";
		String lastName = "Tambaskar";
		int mage = 40;
		
		MethodWithArguement m = new MethodWithArguement();
		m.getInfo(firstName,lastName,mage);
		
		
		

	}

	public void getInfo(String fName, String lName, int age) {
		
		System.out.println("First Name "+fName);
		System.out.println("Last Name "+lName);
		System.out.println("My Age "+age);
	}


}
