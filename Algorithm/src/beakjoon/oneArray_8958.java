package beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class oneArray_8958 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int size =Integer.parseInt(br.readLine());
		String score;
		for(int i=0; i<size; i++) { //���̸�ŭ �ݺ���
			score = br.readLine();
			
			int total = 0, thissum = 0;
			
			for(int j=0; j<score.length(); j++) { //ox���̸�ŭ �ݺ���
				
				if(score.charAt(j)=='O') { //�¾�����
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
