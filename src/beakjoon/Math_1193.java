package beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Math_1193 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int sum=0,cycle=0;
		String result=""; 
		
		while(sum<n) {	//�ܶ� ������, �ܶ� �� ��ü ��
			cycle++;
			sum+=cycle;
		}
		
		int index = n-(sum-cycle);  //�ε��� ���ϱ�
		
		//���� ����
		if(cycle%2==0)  //¦��
			result = index+"/"+(cycle-(index-1)); 
		else  //Ȧ��
			result = (cycle-(index-1))+"/"+index;			
		
		System.out.println(result);		
	}

}
