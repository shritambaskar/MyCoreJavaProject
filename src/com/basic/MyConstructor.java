package com.basic;

public class MyConstructor {

	String fName,lName;
	
	public MyConstructor() {
		fName = "Ankesh";
		lName = "Rotkar";
		System.out.println("Default Constructor Called");
	}
	
	MyConstructor(String firstName,String lastName){
		fName = firstName;
		lName = lastName;
		System.out.println("Parameterised Constructor");
	}
	
	public void displayInfo() {
		System.out.println("First Name is :"+fName);
		System.out.println("Last Name is :"+lName);
	}
	
	public static void main(String[] args) {
		
//		MyConstructor m1 = new MyConstructor();
//		m1.displayInfo();
//		
//		MyConstructor m2 = new MyConstructor("Prachi", "Pande");
//		m2.displayInfo();
		
		new MyConstructor().displayInfo();
		new MyConstructor("Prachi", "Pande").displayInfo();

	}

}
