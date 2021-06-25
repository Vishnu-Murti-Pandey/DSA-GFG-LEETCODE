package dynamicProgramming;
import java.util.*;

public class LongestIncreasingSubsequence {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		int arr[] = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		//int ans = solve(n, arr);
		//System.out.println(ans);
		
		int res = LIS(n, arr);
		System.out.println(res);
		
	}
	
	// This is O(n2) approach
	public static int solve(int n, int arr[]) {
		
		if(n == 1) {
            return 1;
        }
        
        int count = 0;
        
        int dp[] = new int[n];
        dp[0] = 1;

        for(int i=1; i<n; i++) {
            int max = 0;
            for(int j=i-1; j>=0; j--) {
                if(arr[i] > arr[j]) {
                    max = Math.max(max, dp[j]);
                }
            }
            dp[i] = max+1;
            count = Math.max(dp[i], count);
        }
        
        return count;
	}
	
	// This is O(n*log(n)) approach 
	public static int LIS(int n, int arr[]) {
		
		int[] dp = new int[n];
		dp[0] = arr[0];
		int len = 1;
		
		for(int i=1; i<n; i++) {
			if(arr[i] > dp[len-1]) {
				dp[len] = arr[i];
				len++;
			}
			else {
				int idx = binarySearch(0, len-1, arr[i], dp);
				dp[idx] = arr[i];
			}
		}
		
		return len;
		
	}
	
	public static int binarySearch(int l, int r, int x, int dp[]) {
		
		while (r - l > 1) {
            int m = l + (r - l) / 2;
            if (dp[m] >= x)
                r = m;
            else
                l = m;
        }
		return r;
	}

}
