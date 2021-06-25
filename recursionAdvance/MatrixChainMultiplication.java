package recursionAdvance;

import java.util.Scanner;

public class MatrixChainMultiplication {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}

		int res = solve(arr, 1, n-1);
		System.out.println(res);
		
	}
	
	public static int solve(int arr[], int i, int j) {
		
		if(i >= j) {
			return 0;
		}
		
		int min = Integer.MAX_VALUE;
		for(int k=i; k<j; k++) {
			int ans = solve(arr, i, k) + solve(arr, k+1, j) + arr[i-1]*arr[k]*arr[j];
			min = Math.min(ans,  min);
		}
		
		return min;
	}

}
