import java.util.*;

public class Reverse{
	public static void main(String[] args){
		int []  arr = {1,2,3,4,5,6,7,8,9};
		reverse(arr);
	}	

	public static void reverse(int[] arr){
		int start = 0;
		int end = arr.length-1;
		
		for(int i = 0;i<arr.length/2;i++){
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	System.out.println(Arrays.toString(arr));
	}
}