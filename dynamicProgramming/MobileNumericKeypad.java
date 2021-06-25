package dynamicProgramming;
import java.util.*;

public class MobileNumericKeypad {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		long ans = solve(n);
		System.out.println(ans);
		
	}
	
	public static long solve(int n) {
		
		long dp[][] = new long[n+1][10];
		
		for(int i=1; i<=n; i++) {
		    for(int j=0; j<=9; j++) {
		  
		        if(i == 1) {
		            dp[i][j] = 1;
		        }
		        else {
		            if(j == 0) {
		                dp[i][j] = dp[i-1][0] + dp[i-1][8];
		            }
		            else if(j == 1) {
		                dp[i][j] = dp[i-1][1] + dp[i-1][2] + dp[i-1][4];
		            }
		            else if(j == 2) {
		                dp[i][j] = dp[i-1][2] + dp[i-1][1] + dp[i-1][3] + dp[i-1][5];
		            }
		            else if(j == 3) {
		                dp[i][j] = dp[i-1][3] + dp[i-1][2] + dp[i-1][6];
		            }
		            else if(j == 4) {
		                dp[i][j] = dp[i-1][4] + dp[i-1][1] + dp[i-1][5] + dp[i-1][7];
		            }
		            else if(j == 5) {
		                dp[i][j] = dp[i-1][5] + dp[i-1][8] + dp[i-1][2] + dp[i-1][4]+dp[i-1][6];
		            }
		            else if(j == 6) {
		                dp[i][j] = dp[i-1][6] + dp[i-1][3] + dp[i-1][5] + dp[i-1][9];
		            }
		            else if(j == 7) {
		                dp[i][j] = dp[i-1][7] + dp[i-1][8] + dp[i-1][4];
		            }
		            else if(j == 8) {
		                dp[i][j] = dp[i-1][8] + dp[i-1][5] + dp[i-1][9] + dp[i-1][7]+dp[i-1][0];
		            }
		            else {
		                dp[i][j] = dp[i-1][9] + dp[i-1][8] + dp[i-1][6];
		            }
		        }
		        
		    }
		}
		
		long ans = 0;
		for(int j=0; j<dp[0].length; j++) {
		    ans = ans + dp[n][j];
		}
		
		return ans;
	}

}
