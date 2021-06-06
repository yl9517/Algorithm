package beakjoon;

import java.util.Scanner;

public class while_10951 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
        while(sc.hasNextInt()) {
        	
        	int a = sc.nextInt();
        	int b = sc.nextInt();
        	
        System.out.println(a+b);

          }
   
	}
}

//다른방법

//BufferedReader br = new BufferedReader(
//		new InputStreamReader(System.in));
//
//StringBuilder sb = new StringBuilder();
//StringTokenizer st;
//String tmp = "";
//while((tmp = br.readLine()) != null ) {
//	st = new StringTokenizer(tmp, " ");
//	sb.append(Integer.parseInt(st.nextToken())
//			+Integer.parseInt(st.nextToken())
//			).append("\n");
//}
//System.out.print(sb);
