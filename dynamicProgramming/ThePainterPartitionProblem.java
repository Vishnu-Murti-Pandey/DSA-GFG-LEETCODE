package dynamicProgramming;
import java.util.*;

public class ThePainterPartitionProblem {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		int ans = solve(k, n, arr);
		System.out.println(ans);

	}
	
	public static int solve(int k, int n, int arr[]) {
		
		
		
		return 0;
	}

}
