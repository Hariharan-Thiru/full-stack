package com.harry;


class Person{
	String name;
	int age;

Person(String name,int age){
	this.name=name;
	this.age=age;
	
	}

void display() {
	System.out.println("Person name: "+name);
	System.out.println("Person age: "+age);
}
}

public class Ass1 {
	
	public static void main(String[] args) {
		
		Person obj=new Person("Harry",20);
		obj.display();
		

	}

}
