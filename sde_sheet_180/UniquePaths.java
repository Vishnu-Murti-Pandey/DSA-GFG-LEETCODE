package sde_sheet_180;
import java.util.*;

public class UniquePaths {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		
		// 1. We can solve this using recursion, but time and space complexity will be exponential.
		
		// 2. DP approach -> T.C- O(m*n), S.C - O(m*n)
		System.out.println(UsingDP(m, n));
		
		// 3. Using Combinatorics
		
		
		

	}

	private static int UsingDP(int m, int n) {
		
		int dp[][] = new int[m][n];
        
		for(int i=0; i<m; i++) {
            for(int j=0; j<n; j++) {
                if(i==0 || j==0) {
                    dp[i][j] = 1;
                }
                else {
                    dp[i][j] = dp[i-1][j] + dp[i][j-1];
                }
            }
        }
		
        return dp[m-1][n-1];
	}

}
