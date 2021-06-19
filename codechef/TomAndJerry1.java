package codechef;
import java.util.*;
import java.io.*;

public class TomAndJerry1 {

public static void main (String[] args) throws java.lang.Exception {
	    
	    FastReader s = new FastReader();
	    int t = s.nextInt();
	    
	    while(t-->0) {
	        int n = s.nextInt();
	        int k = s.nextInt();
	        String str = s.next();
	        int q[] = new int[k];
	        for(int i=0; i<k; i++) {
	            q[i] = s.nextInt();
	        }
	        
	        int arr[] = new int[n];
	        int total = 0;
	        
	        for(int i=1; i<n; i++) {
	            char ch1 = str.charAt(i);
	            char ch2 = str.charAt(i-1);
	            
	           if((ch1=='0'&&ch2=='0') || (ch1=='1'&&ch2=='1')) {
	                total = total + 2;
	           }
	           else {
	                total = total + 1; 
	           }
	           
	           if(ch1 == '1') {
	               arr[i] = 1;
	           }
	           else {
	               arr[i] = 0;
	           }
	           
	        }
	        
	        if(str.charAt(0) == '1') {
	            arr[0] = 1;
	        }
	        
	        for(int i=0; i<k; i++) {
	            int pos = q[i]-1;
	            
	            if(arr[pos] == 0) {
	                arr[pos] = 1;
	                if(pos!=0 && arr[pos-1]==0) total--;
	                else if(pos!=0 && arr[pos-1]==1) total++;
	                if(pos!=n-1 && arr[pos+1]==0) total--;
	                else if(pos!=n-1 && arr[pos+1]==1) total++;
	            }
	            else if(arr[pos] == 1) {
	                arr[pos] = 0;
	                if(pos!=0 && arr[pos-1]==0) total++;
	                else if(pos!=0 && arr[pos-1]==1) total--;
	                if (pos!=n-1 && arr[pos+1]==0) total++;
	                else if(pos!=n-1 && arr[pos+1]==1) total--;
	            }
	            
	            System.out.println(total);
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
