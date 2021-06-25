package recursionAdvance;

import java.util.Scanner;

public class MinimumEditDistance {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		String t = sc.next();
		
		int m = s.length();
		int n = t.length();
		
		int ans = solve(m, n, s, t);
		System.out.println(ans);

	}
	
	public static int solve(int i, int j, String s, String t) {
		
		if(i<0 || j<0) {
			return 0;
		}
		if(i == 0) {
			return j;
		}
		else if(j == 0) {
			return i;
		}
		else if(s.charAt(i-1) == t.charAt(j-1)) {
			return solve(i-1, j-1, s, t);
		}
		return 1 + Math.min(solve(i, j-1, s, t), Math.min(solve(i-1, j-1, s, t), solve(i-1, j, s, t)));
	}

}
