package beakjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

/*���� N���� �̷���� ���� A�� ���� X�� �־�����. �̶�, A���� X���� ���� ���� ��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.*/



public class for_10871 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();

		st = new StringTokenizer(br.readLine()," ");
		
		int N = Integer.parseInt(st.nextToken()); //���� n��
		int X = Integer.parseInt(st.nextToken());  //x���� ���� �� ���
		
		//int[] list = new int[N];
		
		st = new StringTokenizer(br.readLine()," ");
		
		for(int i=0; i<N; i++) {
			int value = Integer.parseInt(st.nextToken()); 
			

			if(value < X) 
				sb.append(value).append(' '); //sb�� �� ��
			

		}
		System.out.println(sb);
		
	}

}
