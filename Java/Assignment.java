package com.harry;
import java.util.Scanner;
	class Student{
		int studentId;
		String studentName;
		int arr[]=new int[5];
		
		Student(int studentId, String studentName) {
			this.studentId=studentId;
			this.studentName=studentName;
		}
		
		void getMarks() {
			Scanner s=new Scanner(System.in);
			for(int i=0;i<arr.length;i++) {
				arr[i]=s.nextInt();
			}
		}
		
		void displayGrade() {
			int sum=0;
			for(int i=0;i<arr.length;i++) {
				sum+=arr[i];
			}
			int avg=0;
			avg=sum/arr.length;
			System.out.println("Student ID: "+studentId);
			System.out.println("Student Name: "+studentName);
			System.out.println("Average: "+avg);
			
			if(avg>90) {
				System.out.println("Grade A");
			}
			else if(avg>80) {
				System.out.println("Grade B");
			}
			else if(avg>70) {
				System.out.println("Grade C");
			}
			else {
				System.out.println("Grade D");
			}
		}
	}
	
	
public class Assignment {
	public static void main(String[] args) {
		
		Student stu=new Student(101,"Harry");
		stu.getMarks();
		stu.displayGrade();

	}

}
