package beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class String_2908 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String twonum = br.readLine();
		String nums = "";

		for(int i=twonum.length()-1; i>=0; i--) {
			nums+= twonum.charAt(i);
		}
		
		StringTokenizer stk = new StringTokenizer(nums," ");
		
		int num1 = Integer.parseInt(stk.nextToken());
		int num2 = Integer.parseInt(stk.nextToken());
	
		System.out.println((num1 > num2) ? num1:num2);
				
	}

}
