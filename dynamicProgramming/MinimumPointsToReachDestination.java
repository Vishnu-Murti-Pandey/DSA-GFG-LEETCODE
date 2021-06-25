package dynamicProgramming;
import java.util.*;

public class MinimumPointsToReachDestination {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		
		int points[][] = new int[m][n];
		for(int i=0; i<m; i++) {
			for(int j=0; j<n; j++) {
				points[i][j] = sc.nextInt();
			}
		}
		
		int dp[][] = new int[m][n];
	    
	    for(int i=m-1; i>=0; i--) {
	        for(int j=n-1; j>=0; j--) {
	            
	            if(i==m-1 && j==n-1) {
	                dp[i][j] = points[i][j];
	                if(dp[i][j] > 0) {
	                    dp[i][j] = 0;
	                }
	                
	            }
	            else if(i == m-1) {
	                dp[i][j] = dp[i][j+1] + points[i][j];
	                if(dp[i][j] > 0) {
	                    dp[i][j] = 0;
	                }
	            }
	            else if(j == n-1) {
	                dp[i][j] = dp[i+1][j] + points[i][j];
	                if(dp[i][j] > 0) {
	                    dp[i][j] = 0;
	                }
	            }
	            else {
	                int val = Math.max(dp[i+1][j], dp[i][j+1]) + points[i][j];
	                if(val > 0) {
	                    dp[i][j] = 0;
	                }
	                else {
	                    dp[i][j] = val;
	                }
	            }
	            
	        }
	    }
	    
		System.out.println(Math.abs(dp[0][0]) + 1) ;

	}
}
