import java.util.*;

public class Swapwithoutthird{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First no.");
		int n = sc.nextInt();
		System.out.println("Enter Second no.");
		int m = sc.nextInt();
		
		swap(n,m);
	
	}

	public static void swap(int n,int m){
		n=n+m;
		m=n-m;
		n=n-m;
		System.out.println("First number ->"+n+"\nSecond number-> "+m);
	}
}