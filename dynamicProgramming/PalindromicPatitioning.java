package dynamicProgramming;
import java.util.*;

public class PalindromicPatitioning {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		
		//System.out.println(method1(str));
		
		System.out.println(method2(str));
		
		
	}
	
	// Time complexity Of this method2 is O(n2)
	public static int method2(String str) {
		
		
		return 0;
	}
	
	// Time complexity Of this method1 is O(n3)
	public static int method1(String str) {
		
		int n = str.length();
        boolean dp1[][] = new boolean[n][n];
        
        for(int gap=0; gap<n; gap++) {
            for(int i=0,j=gap; j<n; i++,j++) {
                
                if(gap == 0) {
                    dp1[i][j] = true;
                }
                else if(gap == 1) {
                    dp1[i][j] = str.charAt(i)==str.charAt(j);
                }
                else {
                    if(dp1[i+1][j-1] && str.charAt(i)==str.charAt(j)) {
                        dp1[i][j] = true;
                    }
                }
                
            }
        }
        
        int dp[][] = new int[n][n];
        
        for(int gap=0; gap<n; gap++) {
            for(int i=0, j=gap; j<n; i++,j++) {
                
                if(gap == 0) {
                    dp[i][j] = 0;
                }
                else if(gap == 1) {
                    if(str.charAt(i)!=str.charAt(j)) {
                        dp[i][j] = 1;
                    }
                }
                else {
                    if(dp1[i][j]) {
                        dp[i][j] = 0;
                    }
                    else {
                        int min = Integer.MAX_VALUE;
                        for(int k=i; k<j; k++) {
                            int lc = dp[i][k];
                            int rc = dp[k+1][j];
                            
                            min = Math.min(lc+rc+1, min);
                        }
                        dp[i][j] = min;
                    }
                }
                
            }
        }
        
        return dp[0][n-1];
		
	}

}
