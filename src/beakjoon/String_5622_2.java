package beakjoon;

import java.io.IOException;

public class String_5622_2 {

	public static void main(String[] args) throws IOException {
		int second = 0;

		int c = System.in.read();
		while(c > 64) { //���ĺ��� ��������
			if(c > 82) {
				if(c == 90) {
					c--;
				}
				c--;
			}
			second += 3 + (c - 65) / 3;
			c = System.in.read(); //��� �ް�
		}
		
		System.out.println(second);
	}

}
