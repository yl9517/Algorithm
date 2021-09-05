package beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class String_1316 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//1. ���� ���ڰ� �������ڿ��� �ٸ��� -2�������� ���ڵ�� �������� ������ �ִٸ� �ƿ�
		//2. ���� ���ڰ� �������ڿ��� �ٸ��� +2������ ���ڿ� ������ �ƿ�
		//3. ���� ���ڰ� +2���ڿ����� �����ϴ���, ������ ��� �������ڿ��� �ٸ��� => �ƿ�
		int num = Integer.parseInt(br.readLine());
		
		int count = 0;
		for(int i=0; i<num; i++) {  //���ڿ� �ֱ�
			String str = br.readLine();
			//3
			for(int j=0; j<str.length(); j++) {
				char nowAlpa = str.charAt(j); //������ĺ�
				
				if(j < str.length()-2){//���� ���ڰ� length-2���� �۾ƾ���
					if( -1 != str.indexOf(nowAlpa, j+2)) { //����ϸ� ������
						if(nowAlpa != str.charAt(j+1))  //���� ���ĺ��� ������ �ƿ�
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
