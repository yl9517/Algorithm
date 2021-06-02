package beakjoon;

import java.util.*;
import java.io.*;

public class while_10952{
    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer st;
        
        while(true){
            st = new StringTokenizer(br.readLine()," ");
            
            int one = Integer.parseInt(st.nextToken());
            int two = Integer.parseInt(st.nextToken());
            
            if(one==0 && two==0)
                break;
            
            bw.write(one+two+"\n");
            bw.flush();

        }
        bw.close();
        
    }
}