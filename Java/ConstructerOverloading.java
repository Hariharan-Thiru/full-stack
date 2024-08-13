package com.harry;

public class ConstructerOverloading {
	ConstructerOverloading(String name) {
		System.out.println("Welcome "+name);
	}
	
	ConstructerOverloading(int a,int b) {
		System.out.println("Addition: " +(a+b));
	}
	
	ConstructerOverloading(int n) {
		int fact=1;
		for(int i=1;i<=n;i++) {
			fact*=i;
			}
			System.out.println("Factorial: "+fact);
	}

	public static void main(String[] args) {
		ConstructerOverloading obj1 = new ConstructerOverloading(3);
		ConstructerOverloading obj2 = new ConstructerOverloading("harry");
		ConstructerOverloading obj3 = new ConstructerOverloading(10,55);
	}

}
