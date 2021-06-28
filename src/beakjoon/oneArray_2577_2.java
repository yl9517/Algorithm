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
		
		//값이 나온 숫자의 길이만큼 돌기.
		while(result!=0) {
			arr[result%10]++; //result를 10으로 나눈 나머지값 번째 인덱스 +1씩
			result/=10; //계속 10으로 나눠주기
		}
		
		//arr의 index 뽑기
		for(int i:arr) {
			bw.write(String.valueOf(i));
			bw.flush();
			bw.newLine();
		}
		bw.close();
	
		
		
	}

}
