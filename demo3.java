//maximum between two numbers
import java .util.Scanner;

public class demo3{
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter two number");
		int a =s.nextInt();
		int b =s.nextInt();
		if(a>b){
			System.out.printf("Between %d and %d,maximum is %d \n",a,b,a);	
		}
		else{
			System.out.printf("Between %d and %d,maximum is %d \n",a,b,b);
		}
	}
}