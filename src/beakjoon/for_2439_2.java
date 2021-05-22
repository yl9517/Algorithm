package beakjoon;
/*
첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제
하지만, 오른쪽을 기준으로 정렬한 별을 출력하시오. 
 */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class for_2439_2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		
		for(int i=1; i<=N; i++) { //5줄
			for(int j=N; j>0; j--) { //한줄에 무조건 '5'개의 문자 출력
				if(j>i) 
					bw.write(" ");	
				else
					bw.write("*");				
			}
			bw.write("\n");
		}
		bw.flush();
		bw.close();
		
	}

}
