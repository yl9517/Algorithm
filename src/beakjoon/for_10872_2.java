package beakjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

/*정수 N개로 이루어진 수열 A와 정수 X가 주어진다. 이때, A에서 X보다 작은 수를 모두 출력하는 프로그램을 작성하시오.*/



public class for_10872_2 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st;

		st = new StringTokenizer(br.readLine()," ");
		int N = Integer.parseInt(st.nextToken()); //정수 n개
		int X = Integer.parseInt(st.nextToken());  //x보다 작은 수 출력
		
		int[] list = new int[N];
		

		st = new StringTokenizer(br.readLine()," ");
		
		for(int i=0; i<N; i++) {
			list[i] = Integer.parseInt(st.nextToken()); 
			

			if(list[i] < X) {
				bw.write(list[i]+" ");
			}

		}
		bw.flush();
		bw.close();
		
	}

}

