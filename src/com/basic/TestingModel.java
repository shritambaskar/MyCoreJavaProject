package com.basic;

public class TestingModel {

	public static void main(String[] args) {
		
		ModelClass m = new ModelClass();
		
		m.setEmp_Id(567);
		System.out.println(m.getEmp_Id());
		
		MyConstructor m2 = new MyConstructor("Prachi", "Pande");
		m2.displayInfo();

	}

}
