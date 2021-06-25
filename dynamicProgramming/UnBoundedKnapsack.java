package dynamicProgramming;
import java.util.Scanner;

public class UnBoundedKnapsack {

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
        
        int dp[] = new int[cap+1];
        dp[0] = 0;
        
        for(int i=0; i<cap+1; i++) {
            for(int j=0; j<n; j++) {
                if(i >=w[j]) {
                    int fi = val[j];
                    int si = dp[i - w[j]];
                    
                    dp[i] = Math.max(dp[i], fi+si);
                }
            }
        }
        
        System.out.println(dp[cap]);
        
	}

}
