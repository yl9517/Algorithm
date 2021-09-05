 package beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Math_2869 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stk = new StringTokenizer(br.readLine());
		
		int A =Integer.parseInt(stk.nextToken());
		int B =Integer.parseInt(stk.nextToken());
		int V =Integer.parseInt(stk.nextToken());
		
		int day = (V-A)/(A-B);
		if((V-A)%(A-B)!=0) 
			day++;
		System.out.println(day+1);
	}
	
}
