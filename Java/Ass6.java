package com.harry;

class Emp{
	String name;
	String job;
	int da;
	int ma;
	int pa;
	int basicSalary;
	int totalSalary;
	
	Emp(String name,String job,int da,int ma,int pa,int basicSalary,int totalSalary ){
		this.name=name;
		this.job=job;
		this.da=da;
		this.ma=ma;
		this.pa=pa;
		this.basicSalary=basicSalary;
		this.totalSalary=totalSalary;
	}
	
	void Calculate() {
		totalSalary=da+ma+pa+basicSalary;
	}
	
	void display() {
		System.out.println("Name: "+name);
		System.out.println("Job: "+job);
		System.out.println("Total Salary: "+totalSalary);
		
	}
}

public class Ass6 {

	public static void main(String[] args) {
		Emp obj=new Emp("Harry","Editor",3000,4000,5000,10000,0);
		obj.Calculate();
		obj.display();
	}

}
