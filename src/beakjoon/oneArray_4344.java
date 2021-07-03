package beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class oneArray_4344 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer str ;
		
		int around = Integer.parseInt(br.readLine());

		
		//�Է��� ����ŭ ������
		for(int i=0; i<around; i++) {
			
			double result = 0, upNum = 0; //�����, ��ճѴ� �л� ��
			
			str = new StringTokenizer(br.readLine()," ");
			
			int[] arr = new int[Integer.parseInt(str.nextToken())];
			
			//�л� ��, �����Է�
			for(int j=0; j<arr.length; j++) {
				arr[j] = Integer.parseInt(str.nextToken());	
				result += arr[j]; //���� ��
			}
			result/=arr.length; //��հ�
			
			
			//��� �Ѵ� �л� ��
			for(int j=0; j<arr.length; j++) {
				if(arr[j]>result) {
					upNum++;
				}
			}
			
			result = upNum/arr.length*100; //����

			System.out.printf("%.3f%%", result);
			System.out.println();
			
		}

	}

}
