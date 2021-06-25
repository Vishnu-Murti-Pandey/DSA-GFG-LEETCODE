package infytq;
import java.util.*;

public class qone {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		boolean ispallin = false;
		
		while(!ispallin) {
			int res = n + reverse(n);
			
			int ans = reverse(res);
			
			if(String.valueOf(res).equals(String.valueOf(ans))) {
				ispallin = true;
				System.out.println(ans);
			}
			else {
				n = res;
			}
		}
		
		
	}
	
	public static int reverse(int n) {
		String x = String.valueOf(n);
		
		StringBuilder sb = new StringBuilder(x);
		sb.reverse();
		
		return Integer.parseInt(sb.toString());
		
	}
}

