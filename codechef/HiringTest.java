package codechef;

import java.io.*;
import java.util.*;

public class HiringTest {

	public static void main (String[] args) throws java.lang.Exception {
	    
	    FastReader s = new FastReader();
	    int t = s.nextInt();
	    
	    while(t-->0) {
	        int n = s.nextInt();
	        int m = s.nextInt();
	        
	        int x = s.nextInt();
	        int y = s.nextInt();
	        
	        char ch[][] = new char[n][m];
	        
	        for(int i=0; i<n; i++) {
	            int full = 0;
	            int par = 0;
	            String str = s.next();
	            for(int j=0; j<str.length(); j++) {
	                ch[i][j] = str.charAt(j);
	                if(ch[i][j] == 'F') {
	                    full++;
	                }
	                else if(ch[i][j] == 'P') {
	                    par++;
	                }
	            }
	            
	            if(full>=x) {
	                System.out.print(1);
	            }
	            else if((full>=x-1) && (par>=y)) {
	                System.out.print(1);
	            }
	            else {
	                System.out.print(0);
	            }
	            
	        }
	        System.out.println();
	    }
	}
	
	static class FastReader {
        BufferedReader br;
        StringTokenizer st;
 
        public FastReader()
        {
            br = new BufferedReader(
                new InputStreamReader(System.in));
        }
 
        String next()
        {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
 
        int nextInt() { return Integer.parseInt(next()); }
 
        long nextLong() { return Long.parseLong(next()); }
 
        double nextDouble()
        {
            return Double.parseDouble(next());
        }
 
        String nextLine()
        {
            String str = "";
            try {
                str = br.readLine();
            }
            catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
	

}
