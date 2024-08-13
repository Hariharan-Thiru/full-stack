import java.util.*;
public class Fibanoci{
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		
		int a=0;
		int b=1; 
		int c=0;

System.out.print(a+" "+b+" ");

for(int i=2;i<=num;i++){
c=a+b;
System.out.print(c+" ");
a=b;
b=c;
}}}