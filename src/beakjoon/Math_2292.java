package beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Math_2292 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int value = Integer.parseInt(br.readLine());

		int first = 2;
		int count = 1;
		if(value==1) {
			System.out.println(1);
		}
		else {
			while(first<=value) {
				first = first + (6 * count);
				count++;
			}
			System.out.println(count);
		}
		
	}
}
