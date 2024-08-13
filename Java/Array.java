import java.util.*;
public class Array{
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		int sum=0;
		int arr[]=new int[5];
		System.out.print("Enter 5 values : ");
		
		for(int i=0;i<arr.length;i++){
		arr[i]=s.nextInt();
		}

		for(int i=0;i<arr.length;i++){
		System.out.println(arr[i]);
		sum= sum + arr[i];
		}
		System.out.print("Array Sum : "+sum);
	}
}