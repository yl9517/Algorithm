package beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Math_1193 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int sum=0,cycle=0;
		String result=""; 
		
		while(sum<n) {	//단락 나누기, 단락 별 전체 합
			cycle++;
			sum+=cycle;
		}
		
		int index = n-(sum-cycle);  //인덱스 구하기
		
		//분자 기준
		if(cycle%2==0)  //짝수
			result = index+"/"+(cycle-(index-1)); 
		else  //홀수
			result = (cycle-(index-1))+"/"+index;			
		
		System.out.println(result);		
	}

}
