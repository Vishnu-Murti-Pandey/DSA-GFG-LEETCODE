package dynamicProgramming;

import java.util.Scanner;

public class OptimalStrategyForAGame {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		int ans = solve(arr, n);
		System.out.println(ans);
		
	}
	
	public static int solve(int arr[], int n) {
		
		int dp[][] = new int[n][n];
	    
	    for(int gap=1; gap<=n; gap++) {
	        for(int j=gap-1, i=0; j<n; i++, j++) {
	            
	            if(gap == 1) {
	                dp[i][j] = arr[i];
	            }
	            else if(gap == 2) {
	                dp[i][j] = Math.max(dp[i+1][j], dp[i][j-1]);
	            }
	            else {
	                dp[i][j] = Math.max((arr[i] + Math.min(dp[i+2][j], dp[i+1][j-1])),
	                           (arr[j] + Math.min(dp[i][j-2], dp[i+1][j-1])));
	            }
	        }
	    }
	    return dp[0][n-1];

	}

}
