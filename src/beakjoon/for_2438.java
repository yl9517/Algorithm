package beakjoon;
/*
첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제
 */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class for_2438 {	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		
		for(int i=0; i<N; i++) { //줄 
			for(int j=0; j<=i; j++) { //j(*)은 i번째 줄에서 j개 출력 (j가 i와 같을때 스톱)
				bw.write("*");
			}
			bw.write("\n");	
		}
		bw.flush();
		bw.close();
		
	}



}
