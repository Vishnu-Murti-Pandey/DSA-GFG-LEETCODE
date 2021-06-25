package recursionAdvance;
import java.util.*;

public class CountPalindromicSubsequences {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		int ans = solve(0, str.length()-1, str);
		System.out.println(ans);
	}
	
	public static int solve(int i, int j, String str) {
		
		if(i > j) {
			return 0;
		}
		if(i == j) {
			return 1;
		}
		else if(str.charAt(i) == str.charAt(j)) {
			return solve(i+1, j, str) + solve(i, j-1, str) + 1;
		}
		
		return solve(i+1, j, str) + solve(i, j-1, str) - solve(i+1, j-1, str);
	}

}
