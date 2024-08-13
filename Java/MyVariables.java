package com.harry;

public class MyVariables {
//types of variable
	
	int b=20;  //instance or obj variable
	static int c=30; //static or class variable
	
	public static void main(String[] args) {
		int a=10;  //local var
		System.out.println("Local Variable :"+a);
		
		MyVariables obj=new MyVariables();
		System.out.println(obj.b);
		
		System.out.println(MyVariables.c);
		
		

	}

}
