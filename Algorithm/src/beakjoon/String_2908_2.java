package beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class String_2908_2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer stk = new StringTokenizer(br.readLine()," ");
		
		int num1 = Integer.parseInt(reverseString(stk.nextToken()));
		int num2 = Integer.parseInt(reverseString(stk.nextToken()));
		
		System.out.println(num1>num2 ? num1:num2);
		
	}
	private static String reverseString(String s) {
		return new StringBuilder(s).reverse().toString();
	}

}
