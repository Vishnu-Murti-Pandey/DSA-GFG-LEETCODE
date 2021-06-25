package dynamicProgramming;
import java.util.*;

public class CountPalindromeSubStringsOfAString {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String str = sc.next();
		
		boolean dp[][] = new boolean[n][n];
		int count = 0;
		
		// gap strategy
		for(int gap=0; gap<n; gap++) {
			int i = 0;
			for(int j=gap; j<dp.length; j++) {
				if(gap == 0) {
					dp[i][j] = true;
				}
				else if(gap == 1) {
					dp[i][j] = str.charAt(i) == str.charAt(j);
				}
				else {
					if(str.charAt(i)==str.charAt(j) && dp[i+1][j-1]) {
						dp[i][j] = true;
					}
				}
				if(dp[i][j]) {
					count++;
				}
				i++;
			}
		}
		
		System.out.println(count);
		
	}

}
