package beakjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class oneArray_2562 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int[] arr = new int[9];
		int max=0;
		int num =-1;
		
		for(int i=0; i<9; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			
			if(arr[i]>max) {
				max=arr[i];
				num = i+1;
			}
		}
		
		
//		System.out.println(max+"\n"+num);
		bw.write(String.valueOf(max));
		bw.newLine();
		bw.write(String.valueOf(num));

		bw.flush();
		bw.close();
		
		
		
	}

}
