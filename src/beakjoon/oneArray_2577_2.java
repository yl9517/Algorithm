package beakjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class oneArray_2577_2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int a= Integer.parseInt(br.readLine());
		int b= Integer.parseInt(br.readLine());
		int c= Integer.parseInt(br.readLine());
		
		int result =a*b*c;
		
		int[] arr = new int[10];
		
		//���� ���� ������ ���̸�ŭ ����.
		while(result!=0) {
			arr[result%10]++; //result�� 10���� ���� �������� ��° �ε��� +1��
			result/=10; //��� 10���� �����ֱ�
		}
		
		//arr�� index �̱�
		for(int i:arr) {
			bw.write(String.valueOf(i));
			bw.flush();
			bw.newLine();
		}
		bw.close();
	
		
		
	}

}
