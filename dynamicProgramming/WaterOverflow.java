package dynamicProgramming;

import java.util.Scanner;

public class WaterOverflow {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int r = sc.nextInt();
		int c = sc.nextInt();
		
		System.out.println(solve(k, r, c));

	}
	
	public static double solve(int k, int r, int c) {
		
		double dp[][] = new double[k+1][k+1];
        
        dp[1][1] = k;
        
        for(int i=1; i<k; i++) {
            for(int j=1; j<=i; j++) {
                
                if(dp[i][j] > 1) {
                    dp[i+1][j] += (dp[i][j]-1)/2;
                    dp[i+1][j+1] += (dp[i][j]-1)/2;
                    dp[i][j] = 1;
                }
                
            }
        }
        double ans = dp[r][c];
        
        String str = String.format("%.6f", ans);
        
        double res = Double.parseDouble(str);
        
        return res;

	}

}
