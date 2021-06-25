package dynamicProgramming;
import java.util.*;

public class TotalDecodingMessages {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		System.out.println(solve(str));

	}
	
	public static int solve(String str) {
		
		int n = str.length(); 
        if(str.charAt(0)=='0') {
            return 0;
        }
        
        int dp[] = new int[n];
        dp[0] = 1;
        
        for(int i=1; i<n; i++) {
            char ch1 = str.charAt(i);
            char ch2 = str.charAt(i-1);
            
            if(ch1=='0' && ch2=='0') {
                dp[i] = 0;
                return 0;
            }
            else if(ch1!='0' && ch2=='0') {
                dp[i] = dp[i-1]%1000000007;
            }
            else if(ch1=='0' && ch2!='0') {
                if(ch2=='1' || ch2=='2') {
                    dp[i] = (i>=2 ? dp[i-2]%1000000007 : 1);
                }
                else {
                    dp[i] = 0;
                }
            }
            else {
                if(Integer.parseInt(ch2+""+ch1) <= 26) {
                    dp[i] = (dp[i-1]%1000000007 + (i>=2 ? dp[i-2]%1000000007 : 1));
                }
                else {
                    dp[i] = dp[i-1]%1000000007;
                }
            }
            
        }
        
        return dp[n-1]%1000000007;
		
	}

}
