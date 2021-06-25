package dynamicProgramming;
import java.util.*;

public class WildcardPatternMatching {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		String pattern = sc.next();
		
		int ans = wildCard(pattern, str);
		System.out.println(ans);

	}
	
	public static int wildCard(String pattern, String str) {
        
        int n = pattern.length();
        int m = str.length();
        
        boolean dp[][] = new boolean[m+1][n+1];
        
        dp[0][0] = true;
        
        for(int i=0; i<m+1; i++) {
            for(int j=1; j<n+1; j++) {
                
                if(i == 0) {
                    if(pattern.charAt(j-1) == '*') {
                        dp[i][j] = dp[i][j-1];
                    }
                    else {
                        dp[i][j] = false;
                    }
                }
                else {    
                    if(str.charAt(i-1)==pattern.charAt(j-1) || pattern.charAt(j-1)=='?') {
                        dp[i][j] = dp[i-1][j-1];
                    }
                    else if(pattern.charAt(j-1) == '*') {
                        dp[i][j] = dp[i][j-1] || dp[i-1][j];
                    }
                    else {
                        dp[i][j] = false;
                    }
                }
            }
        }
        if(dp[m][n]) {
            return 1;
        }
        return 0;
    }

}
