package beakjoon;

import java.util.Scanner;

public class Method_15596_2 {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[sc.nextInt()];
		
		for(int i=0; i<arr.length; i++) {
			arr[i]= sc.nextInt();
		}
		
		System.out.println(sum(arr));
		
		
	}

	static long sum(int[] a) {
		long result=0;
		for(int i=0; i<a.length; i++) {
			result+=a[i];
		}
		return result;
	}


}
