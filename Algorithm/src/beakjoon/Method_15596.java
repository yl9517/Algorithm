package beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Method_15596 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer str;
		
		int[] arr = new int[Integer.parseInt(br.readLine())];
		
		str = new StringTokenizer(br.readLine()," ");	
		for(int i=0; i<arr.length; i++) {
			arr[i]= Integer.parseInt(str.nextToken());
		}
		
		System.out.println(sum(arr));
		
		
	}

	static long sum(int[] a) {
		long result=0;
		for(int i:a) {
			result+=i++;
		}
		return result;
	}


}
