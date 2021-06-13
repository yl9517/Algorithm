package beakjoon;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//br 이용

public class while_1110_bw {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        

		int num = Integer.parseInt(br.readLine());
		
		int first=0;
		int second=num%10;
		int temp;
		
		if(num>=10) //10보다 크면 
			first = num/10;
		
		int i=0;
		do {
			temp = (first+second)%10;			
			first = second;
			second = temp;
			
			temp = (first*10)+second;
			i++;
		} while(temp!=num);

		System.out.println(i);
		
		
		
	}

}
