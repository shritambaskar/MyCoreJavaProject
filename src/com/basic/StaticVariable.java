package com.basic;


public class StaticVariable {

	//Static Variable
	static String base_url;
	static int userId;
	
	public static void main(String[] args) {
		
		base_url = "www.shrikant.xyz";
		System.out.println("BASE URL "+base_url);
//		Direct Call to static Variable 1 st way
//		System.out.println("Base URL :"+base_url);
//		System.out.println("User ID :"+userId);
		
//		int userId = 2345;
//		Most Widely Approch
//		System.out.println("Base URL "+ StaticVariable.base_url);
//		System.out.println("User ID :"+ StaticVariable.userId);
//		
//		String bu = StaticVariable.base_url;
//		System.out.println("My Url "+bu);
		
//		static variable calling by Object Reference
		
		
		
//		StaticVariable ankesh = new StaticVariable();
//		
//		System.out.println("Base URL :"+ankesh.base_url);
//		System.out.println("User Id :"+ankesh.userId);
	}

}
