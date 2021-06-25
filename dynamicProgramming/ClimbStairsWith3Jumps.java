package dynamicProgramming;

import java.util.*;

public class ClimbStairsWith3Jumps {

	 public static void main(String[] args) throws Exception {
	        
	        Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        
	        //int ans = countPathsMemo(n, new int[n+1]);
	        int ans = countPathsTab(n);
	        System.out.println(ans);
	        
	    }
	    
	    public static int countPathsMemo(int n, int dp[]) {
	        if(n == 0) {
	            return 1;
	        }
	        if(n < 0) {
	            return 0;
	        }
	        if(dp[n] != 0) {
	        	return dp[n];
	        }
	        
	        
	        int x = countPathsMemo(n-1, dp);
	        int y = countPathsMemo(n-2, dp);
	        int z = countPathsMemo(n-3, dp);
	        
	        int paths = x + y + z;
	        dp[n] = paths;
 	        
	        return paths;
	        
	    } 
	    
	    public static int countPathsTab(int n) {
	    	int dp[] = new int[n+1];
	    	dp[0] = 1;
	    	
	    	for(int i=1; i<=n; i++) {
	    		if(i == 1) {
	    			dp[i] = dp[i-1];
	    		}
	    		else if(i == 2) {
	    			dp[i] = dp[i-1] + dp[i-2];
	    		}
	    		else {
	    			dp[i] = dp[i-1] + dp[i-2] + dp[i-3];
	    		}
	    	}
	    	return dp[n];
	    }

}
