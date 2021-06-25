package dynamicProgramming;

import java.util.Scanner;

public class MinimumEditDistance {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		String t = sc.next();
        
//        int ans = naive(s, t);
//        System.out.println(ans);
        
        int res = optimized(s, t);
        System.out.println(res);

	}
	
	// time complexity is - O(m*n);
	// space complexity is - O(m*n);
	
	public static int naive(String s, String t) {
		
		int m = s.length();
        int n = t.length();
		
		int dp[][] = new int[m+1][n+1];
        
        for(int i=0; i<m+1; i++) {
            for(int j=0; j<n+1; j++) {
                
                if(i == 0) {
                    dp[i][j] = j;
                }
                else if(j == 0) {
                    dp[i][j] = i;
                }
                else {
                    if(s.charAt(i-1) == t.charAt(j-1)) {
                        dp[i][j] = dp[i-1][j-1];
                    }
                    else {
                        dp[i][j] = 1 + Math.min(dp[i][j-1], Math.min(dp[i-1][j-1], dp[i-1][j]));
                    }
                }
                
            }
        }
		return dp[m][n];
		
	}
	
	// time complexity is - O(m*n);
	// space complexity is - O(n);
	
	public static int optimized(String s, String t) {
		
		int m = s.length();
        int n = t.length();
		        
        int dp[][] = new int[2][n+1];

        
        for(int i=0; i<m+1; i++) {
            for(int j=0; j<n+1; j++) {
                
                if(i == 0) {
                    dp[i%2][j] = j;
                }
                else if(j == 0) {
                	dp[i%2][j] = i;
                }
                else {
                    if(s.charAt(i-1) == t.charAt(j-1)) {
                        dp[i%2][j] = dp[(i-1)%2][j-1];
                    }
                    else {
                        dp[i%2][j] = 1 + Math.min(dp[i%2][j-1], Math.min(dp[(i-1)%2][j-1], dp[(i-1)%2][j]));
                    }
                }
                
            }
        }
		return dp[m%2][n];
		
	}

}
