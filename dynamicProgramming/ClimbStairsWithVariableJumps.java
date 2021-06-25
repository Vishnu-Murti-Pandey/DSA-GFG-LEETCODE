package dynamicProgramming;
import java.util.*;

public class ClimbStairsWithVariableJumps {

public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int jumps[] = new int[n];
        for(int i=0; i<n; i++) {
            jumps[i] = sc.nextInt();
        }
        
        int ans = jumpTab(n, jumps);
        System.out.println(ans);
    }
    
    public static int jumpTab(int n, int jumps[]) {
        int dp[] = new int[n+1];
        dp[n] = 1;
        
        for(int i=n-1; i>=0; i--) {
            int paths = jumps[i];
            
            for(int j=1; j<=paths; j++) {
                if((i+j) > n) {
                    break;
                }
                else {
                    dp[i] = dp[i] + dp[i+j]; 
                }
            }
            
        }
        return dp[0];
    }
	
	
}
