package beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class String_1152 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		
		StringTokenizer stk = new StringTokenizer(br.readLine().trim()," ");
		
		int num=0;
		try {
		while(stk.nextToken() != null) 
			num++;
		}catch (Exception e) {
			System.out.println(num);
		}		
	}
}
