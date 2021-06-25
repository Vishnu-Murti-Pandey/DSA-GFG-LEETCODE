package sildingWindow;
import java.util.*;

public class MaxSumSubarrrayOfSizeK {

	public static void main(String[] args) {
		 
		Scanner sc = new Scanner(System.in);
	    int t = sc.nextInt();
	    
	    while(t-->0) {
	        int n = sc.nextInt();
	        int k = sc.nextInt();
	        int a[] = new int[n];
	        for(int i=0; i<n; i++) {
	            a[i] = sc.nextInt();
	        }
	        int sum = 0;
	        for(int i=0; i<k; i++) {
	        	sum += a[i];
	        }
	        
	        int maxSum = sum; 
	        int result = maxSum;
	        for(int i=1; i<n-k+1; i++) {
	        	maxSum += a[k+i-1]-a[i-1];
	        	result = Math.max(result, maxSum);
	        }
	        System.out.println(result);
	        
	    } 

	}

}
