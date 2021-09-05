package beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class String_2941_2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
	
		str = str.replaceAll("c=|c-|dz=|d-|lj|nj|s=|z=", "1");

		System.out.println(str.length());
	}

}
