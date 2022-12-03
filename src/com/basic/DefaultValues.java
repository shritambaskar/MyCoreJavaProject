package com.basic;

public class DefaultValues {

	// Declaration of Primitive and User Defined Datatypes
	//but not initialising it
	int a;
	byte b;
	short s;
	long l;
	double d;
	float f;
	boolean isActive;
	char ch;
	NonStaticVariable nsv;
	
	public static void main(String[] args) {
		
		DefaultValues defaultValues = new DefaultValues();
		
		//Printing Default Values of Datatypes
		
		System.out.println("Integer Value :"+defaultValues.a);
		System.out.println("Byte Value :"+defaultValues.b);
		System.out.println("Short Value :"+defaultValues.s);
		System.out.println("Long Value :"+defaultValues.l);
		System.out.println("Double Value :"+defaultValues.d);
		System.out.println("Float Value :"+defaultValues.f);
		System.out.println("Boolean Value :"+defaultValues.isActive);
		System.out.println("Character Value :"+defaultValues.ch);
		System.out.println("Class Type Value :"+defaultValues.nsv);
		
		
		

	}

}
