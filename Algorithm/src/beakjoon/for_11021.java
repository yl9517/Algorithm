package beakjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class for_11021 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer stk;
		
		int N = Integer.parseInt(br.readLine());
		
		for(int i=1; i<=N; i++) {
			stk = new StringTokenizer(br.readLine()," "); //Stringtokenizer(�Է°�,�ڸ��� ����) ������ �������� �Է°��� ����
			bw.write("Case #"+i+": "+(Integer.parseInt(stk.nextToken())+Integer.parseInt(stk.nextToken()))+"\n");
		}
		bw.flush();
		bw.close();	
		
	}
	

}
