package beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Math_10250 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		for(int i=0; i<num; i++) {
			StringTokenizer stk = new StringTokenizer(br.readLine()," ");
			
			int HH = Integer.parseInt(stk.nextToken());  // 類 熱
			int HW = Integer.parseInt(stk.nextToken());  //寞 偎熱
			int person = Integer.parseInt(stk.nextToken());
			
			int thisW = (person-1) / HH +1; //�ˉ�
			int thisH = person - ((thisW-1)*HH); //類
			
			System.out.println(thisH+String.format("%02d", thisW));
			
		}
	}

}
