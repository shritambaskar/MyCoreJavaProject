package com.basic;

public class ObjecttoPrimitive {

	public static void main(String[] ankesh) {
		
		String s1 = "2";
		String s2 = "3";
		float a = Float.parseFloat(s1);
		float b = Float.valueOf(s2);
		System.out.println("" + (a+b)); // 5
		
		int x = Integer.parseInt(s1);
		int y = Integer.valueOf(s2);
		System.out.println(x*y);


	}

}
