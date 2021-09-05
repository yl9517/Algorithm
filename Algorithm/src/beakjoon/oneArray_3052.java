package beakjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

public class oneArray_3052 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] input = new int[10];
		List<Integer> arr = new ArrayList<Integer>();
		
		for(int i=0; i<input.length; i++) { //�迭��ŭ ������
			input[i] = Integer.parseInt(br.readLine());
			//42�� ���� ���ڰ� arr�迭�� ���� ������ �߰�
			int left = input[i]%42;
			if(!arr.contains(left)) 
				arr.add(left);
		}
		
		//arr���� ���
		System.out.println(arr.size());
		
	}

}
