package beakjoon;

import java.util.ArrayList;

public class Method_4673 {
public static ArrayList<Integer> arr =new ArrayList<Integer>();
	public static void main(String[] args) {
		
		for(int i=1; i<=10000; i++) {
			test(i);	
			if(!arr.contains(i))
				System.out.println(i);
		}
		
	}

	public static void test(int num) {
		
		int result = num+(num/1000)+((num/100)%10)+((num/10)%10)+num%10;

		arr.add(result);
	}


}
