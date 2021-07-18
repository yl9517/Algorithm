package beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class String_5622 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String alpa = br.readLine();
		int result = 0;

		for(int i=0; i<alpa.length(); i++) {
			
			switch(alpa.charAt(i)){
				case 'A': case 'B':case 'C': // 65~67
					result += 3;
					break;
				case 'D': case 'E':case 'F': //68~70
					result += 4;
					break;
				case 'G': case 'H':case 'I': //71~73
					result += 5;
					break;
				case 'J': case 'K':case 'L': //74~76
					result += 6;
					break;
				case 'M': case 'N':case 'O': //77~79
					result += 7;
					break;
				case 'P': case 'Q':case 'R':case 'S': //80~83
					result += 8;
					break;
				case 'T': case 'U':case 'V': //84~86
					result += 9;
					break;
				case 'W': case 'X':case 'Y':case 'Z': //87~90
					result += 10;
					break;
			}
			
		}
		System.out.println(result);
	
	}

}
