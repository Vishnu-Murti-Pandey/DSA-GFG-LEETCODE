package dynamicProgramming;

import java.util.*;

public class MinCostPath {
	
//	static int minCost = Integer.MAX_VALUE;
//	static int min = 0;

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int cost[][] = new int[n][m];
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				cost[i][j] = sc.nextInt();
			}
		} 
		
//		boolean vis[][] = new boolean[n][m]; 
//		solveRec(0, 0, cost, vis);
//		
//		System.out.println(minCost);
		
		int ans = solveTab(n, m, cost);
        System.out.println(ans);
		
		
	}
	
//	public static void solveRec(int i, int j, int cost[][], boolean vis[][]) {
//		if(i<0 || j<0 || i>cost.length-1 || j>cost[0].length-1 || vis[i][j]) {
//			return;
//		}
//		vis[i][j] = true;
//		min = min + cost[i][j];
//		
//		if(i==cost.length-1 && j==cost[0].length-1) {
//			minCost = Math.min(min, minCost);
//		}
//
//		solveRec(i+1, j, cost, vis);
//		solveRec(i, j+1, cost, vis);
//		
//		vis[i][j] = false;
//		min = min - cost[i][j];
//		
//	}
	
	public static int solveTab(int n, int m, int cost[][]) {
        int dp[][] = new int[n][m];
        
        for(int i=n-1; i>=0; i--) {
            for(int j=m-1; j>=0; j--) {
                
                if(i==n-1 && j==m-1) {
                    dp[i][j] = cost[i][j];
                }
                else if(i==n-1) {
                    dp[i][j] = dp[i][j+1] + cost[i][j]; 
                }
                else if(j==m-1) {
                    dp[i][j] = dp[i+1][j] + cost[i][j];
                }
                else {
                    int min = Math.min(dp[i+1][j], dp[i][j+1]);
                    dp[i][j] = min + cost[i][j];
                }
            }
        }
        return dp[0][0];
	}
}
