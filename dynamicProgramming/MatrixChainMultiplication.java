package dynamicProgramming;
import java.util.*;

public class MatrixChainMultiplication {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
//		int ans = solveTab(n, arr);
//		System.out.println(ans);
		
		int dp[][] = new int[n][n];
		int res = solveMemo(arr, 1, n-1, dp);
		System.out.println(res);

	}
	
	
	public static int solveMemo(int arr[], int i, int j, int dp[][]) {
		
		if(i >= j) {
			return 0;
		}
		if(dp[i][j] != 0) {
			return dp[i][j];
		}
		
		int min = Integer.MAX_VALUE;
		for(int k=i; k<j; k++) {
			int ans = solveMemo(arr, i, k, dp) + solveMemo(arr, k+1, j, dp) + arr[i-1]*arr[k]*arr[j];
			min = Math.min(ans,  min);
		}
		return dp[i][j] = min;

	}
	
	public static int solveTab(int n, int arr[]) {
		
		int dp[][] = new int[n-1][n-1];
        
        for(int gap=0; gap<n-1; gap++) {
            for(int i=0, j=gap; j<n-1; i++,j++) {
                if(gap == 0) {
                    dp[i][j] = 0;
                }
                else if(gap == 1) {
                    dp[i][j] = arr[i]*arr[j]*arr[j+1];    
                }
                else {
                    int min = Integer.MAX_VALUE;
                    for(int k=i; k<j; k++) {
                        int lc = dp[i][k];
                        int rc = dp[k+1][j];
                        int mc = arr[i]*arr[k+1]*arr[j+1];
                        
                        int tc = lc + rc + mc;
                        
                        min = Math.min(min, tc);
                    }
                    dp[i][j] = min;
                }
            }
        }
        
        return dp[0][dp.length-1];
	}

}
