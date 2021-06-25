package dynamicProgramming;

import java.util.Scanner;

public class CountPalindromicSubsequences {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		long ans = solve(str);
		System.out.println(ans);

	}
	
	public static long solve(String str) {
		
		int n = str.length();
        long dp[][] = new long[n][n];
        
        for(int gap=0; gap<n; gap++) {
            for(int i=0, j=gap; j<n; j++, i++) {
                
                if(gap == 0) {
                    dp[i][j] = 1L;
                }
                else if(gap == 1) {
                    if(str.charAt(i) == str.charAt(j)) {
                        dp[i][j] = 3L;
                    }
                    else {
                        dp[i][j] = 2L;
                    }
                }
                else {
                    if(str.charAt(i) == str.charAt(j)) {
                        dp[i][j] = (dp[i+1][j] + dp[i][j-1] + 1L)%1000000007L; 
                    }
                    else {
                        dp[i][j] = ((dp[i+1][j] + dp[i][j-1])%1000000007 - (dp[i+1][j-1])%1000000007L + 1000000007L)%1000000007;
                    }
                }
                
            }
        }
        
        return dp[0][n-1]%1000000007;
		
		
	}

}
