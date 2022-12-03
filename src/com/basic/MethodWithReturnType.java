package com.basic;

public class MethodWithReturnType {

	public static void main(String[] args) {
		
		MethodWithReturnType mrt = new MethodWithReturnType();
		
		//System.out.println(mrt.getAddress()); //Nagpur
		
		String addr = mrt.getAddress();//"Nagpur"
		
		System.out.println(addr);
		

	}

	private String getAddress() {
		
		String address = "Nagpur";
		return address;
	}

}
