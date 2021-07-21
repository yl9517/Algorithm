package beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class String_2941 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		String[] croa = {"c=","c-","dz=","d-","lj","nj","s=","z="};
		
		for(int i=0; i<croa.length; i++) {
			if(str.contains(croa[i])) {
				str = str.replace(croa[i], "1");
			}
			
		}
		
		System.out.println(str.length());
	}

}
