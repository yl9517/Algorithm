package beakjoon;
// scanner �̿�
import java.util.Scanner;

public class while_1110 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt(); //�ʱⰪ
		
		int first=0;
		int second=num%10;
		int temp;
		
		if(num>=10) //10���� ũ�� 
			first = num/10;
		
		int i=0;
		while(true) {
			temp = (first+second)%10;
			
			first = second;
			second = temp;
			
			i++;
			if(first==(num/10) && second==(num%10)) {
				System.out.println(i);
				break;
			}
		}
		
		
		
	}

}
