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
		
		for(int i=0; i<input.length; i++) { //배열만큼 돌려서
			input[i] = Integer.parseInt(br.readLine());
			//42로 나눈 숫자가 arr배열에 있지 않으면 추가
			int left = input[i]%42;
			if(!arr.contains(left)) 
				arr.add(left);
		}
		
		//arr갯수 출력
		System.out.println(arr.size());
		
	}

}
