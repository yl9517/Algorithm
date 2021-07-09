package beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class String_10809 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringBuilder result = new StringBuilder();
		String S = br.readLine();
		
		int[] arr = new int[26];
		for(int i=0; i<arr.length; i++) { //�ʱⰪ
			arr[i]= -1;
		}
		
		for(int i=0; i<S.length(); i++) { //��
			if(arr[S.charAt(i)-97]==-1) {
				arr[S.charAt(i)-97] = i; //�ش� ������ -97(a) ��ŭ�� �ڸ��� �ڸ��� �ֱ�
			}
		}
		for(int i:arr) { //�����ڿ� ���̱�
			result.append(i).append(" ");
		}
		System.out.println(result);
		
		//���2
//		for(char ch='a'; ch<='z'; ch++) { // int=97~z����
//			System.out.print( S.indexOf(ch)+" " );
//		
//		}
	}

}
