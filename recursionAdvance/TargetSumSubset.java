package recursionAdvance;
import java.util.*;

import java.util.Scanner;

public class TargetSumSubset {

public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int arr[] = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		int tar = sc.nextInt();
		
		solve(arr, 0, "", 0, tar);

	}
	
	public static void solve(int arr[], int idx, String set, int sum, int tar) {
		if(idx == arr.length) {
			if(tar == sum) {
				System.out.println(set+".");
			}
			return;
		}
		 
		solve(arr, idx+1, set+arr[idx]+", ", sum+arr[idx], tar);
		solve(arr, idx+1, set, sum, tar);
		
		
	}

}
