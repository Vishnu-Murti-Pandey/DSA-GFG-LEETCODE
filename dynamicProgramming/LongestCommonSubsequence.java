package dynamicProgramming;
import java.util.*;

public class LongestCommonSubsequence {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String str1 = sc.next();
		String str2 = sc.next();
		
		//int ans = recursion(0, 0, str1, str2);
		
		int res = tabulation(str1, str2); 

		System.out.println(res);
		
	}
	
	public static int tabulation(String str1, String str2) {
		
		int n = str1.length();
		int m = str2.length();
		
		int dp[][] = new int[n+1][m+1];
		
		for(int i=0; i<=n; i++) {
			for(int j=0; j<=m; j++) {
				
				if(i==0 || j==0) {
					dp[i][j] = 0;
				}
				else {
					char ch1 = str1.charAt(i-1);
					char ch2 = str2.charAt(j-1);
					
					if(ch1 == ch2) {
						dp[i][j] = 1 + dp[i-1][j-1];
					}
					else {
						dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
					}
				}
			}
		}
		
		return dp[n][m];
	}
	
	
	public static int recursion(int i, int j, String str1, String str2) {
		
		if(i>=str1.length() || j>=str2.length()) {
			return 0;
		}
		else if(str1.charAt(i) == str2.charAt(j)) {
			return 1 + recursion(i+1, j+1, str1, str2);
		}
		return Math.max(recursion(i+1, j, str1, str2), recursion(i, j+1, str1, str2));
		
	}

}
