package beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class oneArray_1546 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer str;
		
		double[] arr = new double[Integer.parseInt(br.readLine())];
		double max =0,avg = 0;
		str = new StringTokenizer(br.readLine()," ");
		
		for(int i=0; i<arr.length; i++) { //�Է°� �ְ�, �ִ� ���ϱ�
			arr[i] = Integer.parseInt(str.nextToken());
			if(max < arr[i])
				max = arr[i];
		}
		
		for(int i=0; i<arr.length; i++) { //���ο��, ������
			avg += arr[i]/max*100;

		}
		
		System.out.println(avg/arr.length);
		
	
	}

}
