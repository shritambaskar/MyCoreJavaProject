package com.basic;

public class MethodWithRA {

	public static void main(String[] args) {
		
		String fName = "Shrikant";
		String lName = "Tambaskar";
		String mobile = "9890581851";
		String address = "Nagpur";
		String gender = "Male";
		
		MethodWithRA m = new MethodWithRA();
		String info = m.getFullInfo(fName, lName, mobile, address, gender);
		
		
		System.out.println("Infomation "+info);
		String d = m.get(fName, lName, mobile);
		System.out.println("Infomation "+d);
		

	}
	
	public String getFullInfo(String firstName,String lastName,
			                  String mobile,String addr,String gender){
		
		String info = firstName + "," +lastName + "," + mobile + "," + addr + "," + gender;
		
		return info;
		
	}
	public String get(String firstName,String lastName,
            String mobile) {
		
		String d = "WebDriver";
		
		if(firstName.equals("Shriant")) {
			
			return firstName;
		}
		if(lastName.equals("Tabaskar")) {
			
			return lastName;
		}
		if(mobile.equals("989081851")) {
			
			return mobile;
		}
		return d;
	}
			

}
