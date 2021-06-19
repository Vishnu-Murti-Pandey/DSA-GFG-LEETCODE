package codechef;

import java.io.*;
import java.util.*;

public class CorrectSentence {

public static void main (String[] args) throws java.lang.Exception {
	    
	    FastReader s = new FastReader();
	    int t = s.nextInt();
	    
	    while(t-->0) {
	        int n = s.nextInt();
	        String str[] = new String[n];
	        for(int i=0; i<n; i++) {
	            str[i] = s.next();
	        }
	        
	        boolean overAllUp = false;
	        boolean overAllLow = false;
	        
	        for(int i=0; i<n; i++) {
	            String w = str[i];
	            boolean isUpper = false;
		        
	            if(Character.isUpperCase(w.charAt(0))) {
	                isUpper = true;
	            }
	            
	            if(isUpper) {
	            	for(int j=0; j<w.length(); j++) {
	            		char ch = w.charAt(j);
	            		if(ch >= 'N' && ch <= 'Z') {
	            			overAllUp = true;
	            		}
	            		else {
	            			overAllUp = false;
	            			break;
	            		}
	            	}
	            	if(!overAllUp) {
	            		break;
	            	}
	            }
	            else {
	            	for(int j=0; j<w.length(); j++) {
	            		char ch = w.charAt(j);
	            		if(ch >= 'a' && ch <= 'm') {
	            			overAllLow = true;
	            		}
	            		else {
	            			overAllLow = false;
	            			break;
	            		}
	            	}
	            	if(!overAllLow) {
	            		break;
	            	}
	            }
	            
	        }
	        
	        if(overAllLow || overAllUp) {
	        	System.out.println("YES");
	        }
	        else {
	        	System.out.println("NO");
	        }
	        
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
