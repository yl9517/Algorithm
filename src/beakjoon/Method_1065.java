package beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Method_1065 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		System.out.println( test(Integer.parseInt(br.readLine())) );
	}
	public static int test(int num) {
		int count = 0;	
		
		if(num < 100) {
			count = num;
		}
		else {					
			count = 99;		
			for(int i=num; i>100; i--) {
				int a = i/100;
				int b = (i/10)%10;
				int c = i%10;
				if(a-b==b-c) 
					count++;		
			}
		}
		
		return count;
	}

}
