package beakjoon;
/*
ù° �ٿ��� �� 1��, ��° �ٿ��� �� 2��, N��° �ٿ��� �� N���� ��� ����
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
		
		for(int i=0; i<N; i++) { //�� 
			for(int j=0; j<=i; j++) { //j(*)�� i��° �ٿ��� j�� ��� (j�� i�� ������ ����)
				bw.write("*");
			}
			bw.write("\n");	
		}
		bw.flush();
		bw.close();
		
	}



}
