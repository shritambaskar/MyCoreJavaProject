package com.basic;

public class MethodOverloading {

	String fName,lName,email;
	long mobile;
	int empId;
	public static void main(String[] args) {
		
		MethodOverloading m = new MethodOverloading();
		m.register();
		m.register(5823);
		m.register("shri.tambaskar@gmail.com", 9890581851L);
		m.info();

	}
	
	public void register() {
		fName = "Shrikant";
		lName = "Tambaskar";
	}
	
	public void register(String email,long mobile) {
		this.email = email;
		this.mobile = mobile;
		
	}
	public void register(int emId) {
		this.empId = emId;
	}
	
	public void info() {
		System.out.println("First Name :"+fName);
		System.out.println("Last Name :"+lName);
		System.out.println("Email :"+email);
		System.out.println("Mobile :"+mobile);
		System.out.println("Employee ID :"+empId);
	}

}
