package beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class oneArray_8958 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] arr = new String[Integer.parseInt(br.readLine())];
		
		for(int i=0; i<arr.length; i++) { //���̸�ŭ �ݺ���
			arr[i] = br.readLine();
			
			int total = 0, thissum = 0;
			
			for(int j=0; j<arr[i].length(); j++) { //ox���̸�ŭ �ݺ���
				
				if(arr[i].charAt(j)=='O') { //�¾�����
					thissum++;
					total+=thissum;
				}
				else { //Ʋ������ 0����
					thissum=0;
				}
			}
			System.out.println(total);		
		}
		
		
	}

}
