package com.basic;

public class DeclareMethod {

	static int age = 45;
	public static void main(String[] args) {
		
//		//1. Direct Call
//		myDemo();
//		
//		//2. ClassName.methodName()
//		DeclareMethod.myInfo();
		
		//Object.methodName()
		DeclareMethod declareMethod = new DeclareMethod();
		declareMethod.myDemo();
		declareMethod.myInfo();

	}
	
	//returntype, methodName, () ,{}
	public void myDemo() {
		
		String address = "Nagpur";
		System.out.println("Address "+address);
	}
	
	public void myInfo() {
		
		long mobile = 9890581851L;
		String name = "Shrikant Tambaskar";
		int age = 40;
		
		System.out.println("My Name is "+name);
		System.out.println("My Age is "+age);
		System.out.println("My Mobile is "+mobile);
	}

}
