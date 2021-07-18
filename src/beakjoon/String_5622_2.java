package beakjoon;

import java.io.IOException;

public class String_5622_2 {

	public static void main(String[] args) throws IOException {
		int second = 0;

		int c = System.in.read();
		while(c > 64) { //알파벳이 들어왔으면
			if(c > 82) {
				if(c == 90) {
					c--;
				}
				c--;
			}
			second += 3 + (c - 65) / 3;
			c = System.in.read(); //계속 받고
		}
		
		System.out.println(second);
	}

}
