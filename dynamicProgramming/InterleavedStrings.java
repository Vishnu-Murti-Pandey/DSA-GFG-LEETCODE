package dynamicProgramming;
import java.util.*;

public class InterleavedStrings {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String a = sc.next();
		String b = sc.next();
		String c = sc.next();
		
		System.out.println(solve(a, b, c));

	}
	
	public static boolean solve(String a, String b, String c) {
		
		int l1 = a.length();
	    int l2 = b.length();
	    
	    if(l1+l2 != c.length()) {
	        return false;
	    }
	    
	    boolean dp[][] = new boolean[l1+1][l2+1];
	    dp[0][0] = true;
	    
	    // A is empty
	    for(int i=1; i<l1+1; i++) {
	        if(a.charAt(i-1) == c.charAt(i-1)) {
	            dp[i][0] = dp[i-1][0];
	        }
	    }
	    
	    // B is empty
	    for(int j=1; j<l2+1; j++) {
	        if(b.charAt(j-1) == c.charAt(j-1)) {
	            dp[0][j] = dp[0][j-1];
	        }
	    }
	    
	    for(int i=1; i<l1+1; i++) {
	        for(int j=1; j<l2+1; j++) {
	            
	            char cha = a.charAt(i-1);
	            char chb = b.charAt(j-1);
	            char chc = c.charAt(i+j-1);
	            
	            // check if a[i-1] and c[i-1] are equal
	            if(cha == chc) {
	                dp[i][j] = dp[i-1][j];
	            }
	            // check if b[i-1] and c[i-1] are equal
	            if(chb == chc) {
	                dp[i][j] = dp[i][j]||dp[i][j-1];
	            }
	            
	        }
	    }

	    return dp[l1][l2];
			
	}

}
