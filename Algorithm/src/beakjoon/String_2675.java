package beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class String_2675 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int cyc = Integer.parseInt(br.readLine());
		
		for(int c=0; c<cyc; c++) {
			String input = br.readLine();
			StringTokenizer stk = new StringTokenizer(input, " ");
			StringBuilder sb = new StringBuilder();
			
			int num = Integer.parseInt(stk.nextToken());
			String msg = stk.nextToken();
			
			for(int i=0; i<msg.length(); i++) {
				
				for(int j=0; j<num; j++) {
					sb.append(msg.charAt(i));
				}
			}
			System.out.println(sb);
		}

	}

}
