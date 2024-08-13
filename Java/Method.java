package com.harry;

public class Method {
	void myMethod1() {
		System.out.println("Instance or obj Method");
	}
	static void myMethod2() {
		System.out.println("Static or class method");
	}
	
	public static void main(String[] args) {
		Method obj=new Method();
		obj.myMethod1();
		
		Method.myMethod2();

	}

}
