package dynamicProgramming;
import java.util.*;

public class MinimumSumPartition {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		int ans = solve(n, arr);
		System.out.println(ans);	
		
	}
	
	public static int solve(int n, int arr[]) {
		
		int sum = 0;
	    
	    for(int i=0; i<n; i++) {
	        sum = sum + arr[i];
	    }
	    
        boolean dp[][] = new boolean[n+1][sum+1];
        
        for(int i=0; i<n+1; i++) {
            for(int j=0; j<sum+1; j++) {
                
                if(i==0 && j==0) {
                    dp[i][j] = true;   
                }
                else if(i == 0) {
                    dp[i][j] = false;
                }
                else if(j == 0) {
                    dp[i][j] = true;
                }
                else {
                    if(dp[i-1][j]) {
                        dp[i][j] = true;
                    }   
                    else {
                        int val = arr[i-1];
                        if(val <= j) {
                            if(dp[i-1][j-val]) {
                                dp[i][j] = true;
                            }
                        }
                    }
                }
                
            }
        }
        

	    int diff = Integer.MAX_VALUE;
	    
	    for(int j=0; j<=dp[0].length/2; j++) {
	        if(dp[n][j]) {
	            diff = Math.min(diff, sum-2*j);
	        }
	    }
	    
	    return Math.abs(diff);
		
	}

}
