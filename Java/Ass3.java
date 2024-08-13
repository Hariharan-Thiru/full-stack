package com.harry;

class Rectangle{
	int breath;
	int height;


void Area(int height,int breath){
	int area=breath*height;
	System.out.println("Area : "+area);
}

void Perimeter(int height,int breath) {
	int perimeter=2*(breath*height);
	System.out.println("Perimeter : "+perimeter);
}
}
public class Ass3 {

	public static void main(String[] args) {
		Rectangle obj=new Rectangle();
		obj.Area(10,20);
		obj.Perimeter(10,20);
	}

}
