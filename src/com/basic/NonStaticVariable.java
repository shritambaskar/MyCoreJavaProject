package com.basic;

public class NonStaticVariable {

	//Declaration of non static variable
	long mobile = 9890581851L;
	String name = "Shrikant Tambaskar";
	int age = 40;
	
	public static void main(String[] args) {
		
		int a = 90;
		System.out.println("data "+a);
		NonStaticVariable nvs = new NonStaticVariable();
		
		System.out.println("My Name is "+nvs.name);
		System.out.println("My Age is "+nvs.age);
		System.out.println("My Mobile is "+nvs.mobile);
	}
	
	public void myData() {
		
		System.out.println("My Name is "+name);
		System.out.println("My Age is "+age);
		System.out.println("My Mobile is "+mobile);
	}
}
