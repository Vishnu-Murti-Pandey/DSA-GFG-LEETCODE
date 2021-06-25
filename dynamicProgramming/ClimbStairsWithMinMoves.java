package dynamicProgramming;
import java.util.*;

public class ClimbStairsWithMinMoves {

public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int arr[] = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        
        Integer ans = solveTab(n, arr);
        System.out.println(ans);
    }
    
    public static Integer solveTab(int n, int arr[]) {
        Integer dp[] = new Integer[n+1];
        dp[n] = 0;
        
        for(int i=n-1; i>=0; i--) {
            if(arr[i] > 0) {
                int paths = arr[i];
                int min = Integer.MAX_VALUE;
                
                for(int j=1; j<=paths; j++) {
                    if((i+j) > n) {
                        break;
                    }
                    else {
                        if(dp[i+j] != null) {
                            min = Math.min(min, dp[i+j]);
                        }
                    }
                }
                if(min != Integer.MAX_VALUE) {
                    dp[i] = min + 1; 
                }
            }
        }
        return dp[0];
    }

}
