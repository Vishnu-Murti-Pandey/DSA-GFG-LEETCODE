package dynamicProgramming;
import java.util.*;

public class StrictlyIncreasingArray {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		int ans = solve(arr);
		
		System.out.println(ans);

	}
	
	public static int solve(int nums[]) {
        
        int n = nums.length;
        if(n == 1) {
            return 0;
        }
        int dp[] = new int[n];
        dp[0] = 1;
        int count = 0;
        
        for(int i=1; i<n; i++) {
            int max = 0;
            for(int j=i-1; j>=0; j--) {
                if(nums[i]>nums[j] && (i-j) <= nums[i]-nums[j]) {
                    max = Math.max(max, dp[j]);
                }
            }
            dp[i] = max + 1;
            count = Math.max(count, dp[i]);
        }

        
        return n-count;
    }

}
