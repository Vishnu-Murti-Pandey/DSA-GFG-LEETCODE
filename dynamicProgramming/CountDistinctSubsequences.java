package dynamicProgramming;
import java.util.*;

public class CountDistinctSubsequences {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int n = str.length();
		
		int dp[] = new int[n+1];
		dp[0] = 1;
		HashMap<Character, Integer> map = new HashMap<>();
		
		for(int i=1; i<=n; i++) {
			dp[i] = dp[i-1]*2;
			
			char ch = str.charAt(i-1);
			if(map.containsKey(ch)) {
				int val = map.get(ch);
				dp[i] = dp[i] - dp[val-1];
			}
			map.put(ch, i);
		}
		System.out.println(dp[n]);

	}

}
