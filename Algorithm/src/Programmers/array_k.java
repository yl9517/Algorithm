package Programmers;

import java.util.Arrays;
import java.util.Vector;

public class array_k {

	public static void main(String[] args) {
		int[] array = {1, 5, 2, 6, 3, 7, 4};
		int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
		
		int[] ans = solution(array, commands);
		System.out.println("답");
		for(int i=0; i<ans.length; i++) {
			System.out.print(ans[i]+" ");
		}
	}

	    public static int[] solution(int[] array, int[][] commands) {
	    	int[] answer = new int[3];
	    	
	    	for(int i=0; i<commands.length; i++) {
	    		int f = commands[i][0];
	    		int l = commands[i][1];
	    		int k = commands[i][2];
	    		
	    		int[] twoArray = Arrays.copyOfRange(array, f-1, l); //배열 자르기

	    		
	    		answer[i] = twoArray[k-1];
	    		
	    	}
	    	
	        return answer;
	    }
	
	
}
