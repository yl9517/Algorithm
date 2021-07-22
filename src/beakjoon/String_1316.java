package beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class String_1316 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//1. 현재 문자가 직전문자열과 다르고 -2전까지의 문자들과 비교했을때 같은게 있다면 아웃
		//2. 현재 문자가 다음문자열과 다르고 +2부터의 문자와 같으면 아웃
		//3. 현재 문자가 +2문자열부터 존재하는지, 존재할 경우 다음문자열과 다른지 => 아웃
		int num = Integer.parseInt(br.readLine());
		
		int count = 0;
		for(int i=0; i<num; i++) {  //문자열 넣기
			String str = br.readLine();
			//3
			for(int j=0; j<str.length(); j++) {
				char nowAlpa = str.charAt(j); //현재알파벳
				
				if(j < str.length()-2){//현재 숫자가 length-2보다 작아야함
					if( -1 != str.indexOf(nowAlpa, j+2)) { //통과하면 존재함
						if(nowAlpa != str.charAt(j+1))  //이후 알파벳과 같으면 아웃
							break;		
					}		
				}
				else {
					if((j+1)==str.length())
						count++;
				}
			}
		}
		System.out.println(count);
		
	}

}
