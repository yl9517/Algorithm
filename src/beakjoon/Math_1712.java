package beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Math_1712 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer stk = new StringTokenizer(br.readLine()," ");
		int A = Integer.parseInt(stk.nextToken());
		int B = Integer.parseInt(stk.nextToken());
		int C = Integer.parseInt(stk.nextToken());
		
		int result = -1;
		
		if(B<C)
			result = A/(C-B) +1;	  // C-B = ÀÌÀÍ
		System.out.println(result);
	}

}
