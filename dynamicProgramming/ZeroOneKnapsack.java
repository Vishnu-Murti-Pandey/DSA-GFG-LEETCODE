package dynamicProgramming;

import java.util.Scanner;

public class ZeroOneKnapsack {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int val[] = new int[n];
        for(int i=0; i<n; i++) {
            val[i] = sc.nextInt();
        }
        int w[] = new int[n];
        for(int i=0; i<n; i++) {
            w[i] = sc.nextInt();
        }
        int cap = sc.nextInt();
        
        int dp[][] = new int[n+1][cap+1];
        
        for(int i=1; i<n+1; i++) {
            for(int j=1; j<cap+1; j++) {
                if(j >= w[i-1]) { 
                    int ifNotBat = dp[i-1][j];
                    int ifBat = val[i-1];
                    int remBalls = j - w[i-1];
                    int remRuns = dp[i-1][remBalls];
                        
                    int totalRuns = ifBat + remRuns;
                    if(totalRuns > ifNotBat) {
                        dp[i][j] = totalRuns;
                    }
                    else {
                        dp[i][j] = dp[i-1][j];
                    }
                }
                else {
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        System.out.println(dp[n][cap]);
			
	}

}
