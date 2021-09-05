package beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class oneArray_8958 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int size =Integer.parseInt(br.readLine());
		String score;
		for(int i=0; i<size; i++) { //길이만큼 반복문
			score = br.readLine();
			
			int total = 0, thissum = 0;
			
			for(int j=0; j<score.length(); j++) { //ox길이만큼 반복문
				
				if(score.charAt(j)=='O') { //맞았을때
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
