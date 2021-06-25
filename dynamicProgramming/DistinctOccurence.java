package dynamicProgramming;
import java.util.*;

public class DistinctOccurence {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String t = sc.next();
		
		int n = s.length();
		int m = t.length();
		
		int dp[][] = new int[m+1][n+1];
		int mod = 1000000007;
		
		for(int i=0; i<m+1; i++) {
		    for(int j=0; j<n+1; j++) {
		        
		        if(i == 0) {
		            dp[i][j] = 1;
		        }
		        else if(j == 0) {
		            dp[i][j] = 0;
		        }
		        else {
		            if(t.charAt(i-1) == s.charAt(j-1)) {
		                dp[i][j] = (dp[i][j-1] + dp[i-1][j-1])%mod;
		            }
		            else {
		                dp[i][j] = dp[i][j-1];
		            }
		        }
		    }
		}
		
		for(int i=0; i<dp.length; i++) {
			for(int j=0; j<dp[0].length; j++) {
				System.out.print(dp[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println(dp[m][n]);		

	}

}


// recursive approach

//public static int findsubsequenceCount(String S,String T, int n, int m){
//    
//    if(m == 0)
//      return 1;
//    
//    if(n == 0)
//      return 0;
//      
//    if(S.charAt(n-1) != T.charAt(m-1))
//       return findsubsequenceCount(S,T,n-1,m);
//    else
//      return findsubsequenceCount(S,T,n-1,m) + findsubsequenceCount(S,T,n-1,m-1);
//}


