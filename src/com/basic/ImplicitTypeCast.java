package com.basic;

public class ImplicitTypeCast {

	int var = 67;
	public static void main(String[] args) {
		
		long a = 89 , b = 45; // 134
		 byte v = (byte)(a + b); //-128 to 128
		 System.out.println(v);
		 
		 int num = 67;
		 char ch = (char)num;
		 System.out.println(ch);
		 
		 ImplicitTypeCast i = new ImplicitTypeCast();
		 System.out.println(i.var);
		 
		 ImplicitTypeCast j = new ImplicitTypeCast();
		 System.out.println(j);
		 
		 System.out.println(Integer.toOctalString(45)); 
		 

	}

}
