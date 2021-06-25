package dynamicProgramming;
import java.util.*;

public class PartitionArrayToKSubsets {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		int k = sc.nextInt();
		
		int sum = 0;
		for(int i=0; i<n; i++) {
		    sum = sum + arr[i];
		}
		if(k>n || sum%k!=0) {
		    System.out.println(false);
		}
		int tar = sum/k;
		boolean vis[] = new boolean[n];
		
		System.out.println(solve(arr, 0, n, k, vis, tar, 0));
		
		
	}
	
	public static boolean solve(int arr[], int i, int n, int k, boolean vis[], int tar, int curr) {
        
        if(k == 1) {
            return true;
        }
        if(tar == curr) {
            return solve(arr, 0, n, k-1, vis, tar, 0);
        }
        
        for(int x=0; x<n; x++) {
            if(!vis[x] && curr+arr[x]<=tar) {
                
                vis[x] = true;
                boolean yes = solve(arr, x+1, n, k, vis, tar, curr+arr[x]);
                if(yes) {
                    return true;
                }
                vis[x] = false;

            }
        }
        return false;
    }

}
