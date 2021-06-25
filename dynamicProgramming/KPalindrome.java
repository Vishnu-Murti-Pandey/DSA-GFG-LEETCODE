package dynamicProgramming;
import java.util.*;

public class KPalindrome {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		while(t-->0) {
			String str = sc.next();
			int k = sc.nextInt();
			
			StringBuilder sb = new StringBuilder(str);
			sb.reverse();
			
			String rev = sb.toString();
			
			boolean ans = palindrome(str, rev, k);
			
			if(ans) {
				System.out.println(1);
			}
			else {
				System.out.println(0);
			}
		}

	}
	
	public static boolean palindrome(String str, String rev, int  k) {
		
		int n = str.length();
	    
	    int dp[][] = new int[n+1][n+1];
	    
	    for(int i=0; i<n+1; i++) {
	        for(int j=0; j<n+1; j++) {
	            
	            if(i == 0) {
	                dp[i][j] = j;
	            }
	            else if(j == 0) {
	                dp[i][j] = i;
	            }
	            else {
	                char f = rev.charAt(i-1);
	                char l = str.charAt(j-1);
	                
	                if(f == l) {
	                    dp[i][j] = dp[i-1][j-1];
	                }
	                else {
	                    dp[i][j] = Math.min(dp[i-1][j], dp[i][j-1]) + 1;
	                }
	            }
	        }
	    }
	    
	    for(int i=0; i<n+1; i++) {
	    	for(int j=0; j<n+1; j++) {
	    		System.out.print(dp[i][j] +" ");
	    	}
	    	System.out.println();
	    }
	    
	    
	    if(k == dp[n][n]/2) {
	        return true;
	    }
	    return false;
		
		
	}

}
