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

		
		//입력한 수만큼 돌리기
		for(int i=0; i<around; i++) {
			
			double result = 0, upNum = 0; //결과값, 평균넘는 학생 수
			
			str = new StringTokenizer(br.readLine()," ");
			
			int[] arr = new int[Integer.parseInt(str.nextToken())];
			
			//학생 수, 성적입력
			for(int j=0; j<arr.length; j++) {
				arr[j] = Integer.parseInt(str.nextToken());	
				result += arr[j]; //점수 합
			}
			result/=arr.length; //평균값
			
			
			//평균 넘는 학생 수
			for(int j=0; j<arr.length; j++) {
				if(arr[j]>result) {
					upNum++;
				}
			}
			
			result = upNum/arr.length*100; //비율

			System.out.printf("%.3f%%", result);
			System.out.println();
			
		}

	}

}
