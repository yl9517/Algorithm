package beakjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class oneArray_2577 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int a= Integer.parseInt(br.readLine());
		int b= Integer.parseInt(br.readLine());
		int c= Integer.parseInt(br.readLine());
		
		String result = String.valueOf(a*b*c);
		
		int[] arr = new int[10];
		
		//���� ���� ������ ���̸�ŭ ����.
		for(int i=0; i<result.length(); i++) {
			//String�� i��° ���� �̾Ƴ��� //�� ���ڰ� n�̸� arr[n]�� +1�ϱ�
			String n = String.valueOf(result.charAt(i));
			arr[Integer.parseInt(n)]++;
			
		}
		
		//arr�� index �̱�
		for(int i:arr) {
			bw.write(String.valueOf(i));
			bw.newLine();
		}
		bw.flush();
		bw.close();
	
		
		
	}

}
