package beakjoon;
/*
ù° �ٿ��� �� 1��, ��° �ٿ��� �� 2��, N��° �ٿ��� �� N���� ��� ����
������, �������� �������� ������ ���� ����Ͻÿ�. 
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
		
		for(int i=1; i<=N; i++) { //5��
			for(int j=N; j>0; j--) { //���ٿ� ������ '5'���� ���� ���
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
