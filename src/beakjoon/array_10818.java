package beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class array_10818 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st;
        
		int[] arr = new int[Integer.parseInt(br.readLine())];
		
        st = new StringTokenizer(br.readLine()," ");
        
		for(int i=0; i<arr.length; i++) {		
			arr[i]=Integer.parseInt(st.nextToken());
		}
		int max = arr[0];
		int min = arr[0];
		for(int i=1; i<arr.length; i++) {
			if(max<arr[i]) 
				max = arr[i];
			if(min>arr[i])
				min = arr[i];
			
		}
		System.out.println(min+" "+max);
	}

}
