package dynamicProgramming;
import java.util.*;

public class Fibonacci {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int ans = fibonacci(n, new int[n+1]);
		System.out.println(ans);
	}
	
	public static int fibonacci(int n, int dp[]) {
		if(n==0 || n==1) {
			return n;
		}
		if(dp[n] != 0) {
			return dp[n];
		}
		
		int fib1 = fibonacci(n-1, dp);
		int fib2 = fibonacci(n-2, dp);
		int fib = fib1 + fib2;
		
		dp[n] = fib;
		
		return fib;
	}

}
