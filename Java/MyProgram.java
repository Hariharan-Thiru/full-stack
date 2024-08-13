import java.util.Scanner;
public class MyProgram{
	public static void main(String args[]){
		int employeeId;
		String employeeName;
		float employeeSalary;

		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Employee ID : ");
		employeeId=sc.nextInt();
		System.out.print("Enter the Employee Name : ");
		employeeName=sc.next();
		System.out.print("Enter the employee Salary : ");
		employeeSalary=sc.nextInt();

		System.out.println("Employee ID= "+employeeId); 
		System.out.println("Employee Name= "+employeeName); 
		System.out.println("Employee Salary= "+employeeSalary); 
	}
}