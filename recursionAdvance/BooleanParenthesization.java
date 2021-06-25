package recursionAdvance;
import java.util.*;

public class BooleanParenthesization {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int n = str.length();
		
		System.out.println(solve(str, 0, n-1, true));

	}
	
	public static int solve(String str, int i, int j, boolean isTrue) {
		
		if(i > j) {
			return 0;
		}
		if(i == j) {
			if(isTrue) {
				return str.charAt(i) == 'T'? 1 : 0;
			}
			else {
				return str.charAt(i) == 'F'? 1 : 0;
			}
		}
		
		int ans = 0;
		for(int k=i+1; k<j; k=k+2) {
			char oprtr = str.charAt(k);
			
			int lt = solve(str, i, k-1, true);
			int rt = solve(str, k+1, j, true);
			int lf = solve(str, i, k-1, false);
			int rf = solve(str, k+1, j, false);
			
			if(oprtr == '&') {
				if(isTrue) {
					ans += lt*rt;
				}
				else {
					ans += lt*rf + lf*rt + lf*rf;
				}
			}
			else if(oprtr == '|') {
				if(isTrue) {
					ans += lt*rf + lf*rt + lt*rt;
				}
				else {
					ans += lf*rf;
				}
			}
			else {
				if(isTrue) {
					ans += lt*rf + lf*rt;
				}
				else {
					ans += lt*rt + lf*rf;
				}
			}
			
		}
		
		return ans;
	}

}
