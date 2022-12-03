package com.basic;

public class LocalVariable {

	public static void main(String[] args) {
		
		//local Variable & It has Direct Access within that method
		String firstName = "Shrikant";
		System.out.println("My First Name is "+firstName);
		
//		StaticVariable sv = new StaticVariable();
//		sv.main(null);
		
		NonStaticVariable nvs = new NonStaticVariable();
		nvs.main(null);
		
		System.out.println("My Name is "+nvs.name);
		System.out.println("My Age is "+nvs.age);
		System.out.println("My Mobile is "+nvs.mobile);

	}
	

}
