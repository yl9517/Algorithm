package beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class String_1157 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String inp = (br.readLine()).toUpperCase();
		int[] arr = new int[26];

		for(int i=0; i<inp.length(); i++) {
			arr[inp.charAt(i)-65] +=1;
		}
		int max=0, same=0;
		char ch = '?';
		
		for(int i=0; i<arr.length; i++) { //�ִ밪 ���� ���ĺ� ã��
			if(arr[i] > max) {
				max = arr[i]; //��������
				ch = (char)(i+65);
			}
			else if(max!=0 && arr[i] == max) { //�ִ밪�� 0�� �ƴϸ鼭 ���ٸ�
				ch = '?';
			}
		}			
		System.out.println(ch);

	}

}
