package beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class String_11720 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int inp = Integer.parseInt(br.readLine());
		
		String num = br.readLine();
		int sum =0;
		for(int i=0; i<num.length(); i++) {
			 sum += num.charAt(i) - 48;
		}
		System.out.println(sum);
	}

}
