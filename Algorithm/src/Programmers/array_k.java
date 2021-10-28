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
	    	int[] answer = new int[commands.length];
	    	for(int i=0; i<commands.length; i++) {
	    		int f = commands[i][0];
	    		int l = commands[i][1];
	    		int k = commands[i][2];
	    		
	    		int[] twoArray = Arrays.copyOfRange(array, f-1, l); //배열 자르기	    		
	    		int tmp;
	    		
	    		//정렬1
	    		//Arrays.sort(temp); 
	    		
	    		//정렬2
	    		for(int j=0; j<twoArray.length-1; j++) {
	    			int min = j;
	    			for(int h=j+1; h<twoArray.length; h++) {
	    				if(twoArray[h] < twoArray[min]) 
	    					min = h;	
	    			}
	    				
	    				tmp = twoArray[j];
	    				twoArray[j] = twoArray[min];
	    				twoArray[min] = tmp;
	    		}
	    		
	    		answer[i] = twoArray[k-1];
	    		
	    	}
	    	
	        return answer;
	    }
	
	
}
