package dynamicProgramming;
import java.util.*;

public class BestTimeToBuyAndSellStocksKTransactionAllowed {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		int dp[][] = new int[k+1][n];
        
		// Method With O(n2) Complexity
		
        for(int i=1; i<k+1; i++) {
            int max = dp[i-1][0] - arr[0];
            for(int j=1; j<n; j++) {
                
                dp[i][j] = Math.max(max+arr[j], dp[i][j-1]);
                
                max = Math.max(max, dp[i-1][j-1]-arr[j]);
            }
        }
        
        System.out.println(dp[k][n-1]);

	}

}

// Method With O(n3) Complexity

//int dp[][] = new int[k+1][n];
//
//for(int i=1; i<k+1; i++) {
//    for(int j=1; j<n; j++) {
//        
//        int max = dp[i][j-1];
//        
//        for(int t=j-1; t>=0; t--) {
//            int val = arr[j] - arr[t] + dp[i-1][t];
//            max = Math.max(val, max);
//        }
//        dp[i][j] = max;
//    }
//}
//
//return dp[k][n-1];

