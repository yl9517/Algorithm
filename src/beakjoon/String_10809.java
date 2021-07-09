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
		for(int i=0; i<arr.length; i++) { //초기값
			arr[i]= -1;
		}
		
		for(int i=0; i<S.length(); i++) { //값
			if(arr[S.charAt(i)-97]==-1) {
				arr[S.charAt(i)-97] = i; //해당 문자의 -97(a) 만큼의 자리에 자리수 넣기
			}
		}
		for(int i:arr) { //정문자열 붙이기
			result.append(i).append(" ");
		}
		System.out.println(result);
		
		//방법2
//		for(char ch='a'; ch<='z'; ch++) { // int=97~z까지
//			System.out.print( S.indexOf(ch)+" " );
//		
//		}
	}

}
