public class Missingno{
	
	public static void main(String[] args){
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		check(arr);	
	}
	public static void check(int[] arr){
		int sum =0;
		for(int i=0;i<arr.length;i++){
			sum=sum+arr[i];
		}
		int m= ((arr[arr.length-1]*arr[arr.length-1])+arr[arr.length-1])/2;
		if(m==sum){
			System.out.println("No Missing");
		}else{
		System.out.println("Missing");
		int miss = m-sum;
		System.out.println("Missing no. is " + miss);
		}
	
	}
	
}