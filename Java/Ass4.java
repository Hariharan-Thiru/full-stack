package com.harry;

class Circle{
	int radius;
	
	void Area(int radius) {
		double area=3.14*radius*radius;
		System.out.println("Area : "+area);
	}
	
	void Circumference(int radius) {
		double cirf=2 * 3.14 * radius;
		System.out.println("Circumference : "+cirf);
	}
}
public class Ass4 {

	public static void main(String[] args) {
		Circle obj= new Circle();
		obj.Area(10);
		obj.Circumference(30);
		
	}

}
