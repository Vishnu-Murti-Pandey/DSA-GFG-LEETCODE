package dynamicProgramming;

import java.util.Scanner;

public class EggDrop {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		int dp[][] = new int[n+1][k+1];
        
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=k; j++) {
                
                if(i == 1) {
                    dp[i][j] = j;
                }
                else if(j == 1) {
                    dp[i][j] = 1;
                }
                else {
                    int a = 0;
                    int min = Integer.MAX_VALUE;
                    for(int b=j-1; b>=0; b--) {
                        int max = Math.max(dp[i][b], dp[i-1][a]);
                        min = Math.min(min, max);
                        a++;
                    }
                    dp[i][j] = min + 1;
                }
            }
        }
		System.out.println(dp[n][k]);
		
	}

}
