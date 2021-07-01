package beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class oneArray_8958 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] arr = new String[Integer.parseInt(br.readLine())];
		
		for(int i=0; i<arr.length; i++) { //길이만큼 반복문
			arr[i] = br.readLine();
			
			int total = 0, thissum = 0;
			
			for(int j=0; j<arr[i].length(); j++) { //ox길이만큼 반복문
				
				if(arr[i].charAt(j)=='O') { //맞았을때
					thissum++;
					total+=thissum;
				}
				else { //틀렸을때 0으로
					thissum=0;
				}
			}
			System.out.println(total);		
		}
		
		
	}

}
