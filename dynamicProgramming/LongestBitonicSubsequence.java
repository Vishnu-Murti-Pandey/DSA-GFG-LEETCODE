package dynamicProgramming;
import java.util.*;

public class LongestBitonicSubsequence {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		int lis[] = new int[n];
		
		for(int i=0; i<n; i++) {
			int max = 0;
			for(int j=i-1; j>=0; j--) {
				if(arr[i] > arr[j]) {
					max = Math.max(max, lis[j]);
				}
			}
			lis[i] = max + 1;
		}
		
		int lds[] = new int[n];
		
		for(int i=arr.length-1; i>=0; i--) {
			int max = 0;
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i] > arr[j]) {
					max = Math.max(max,  lds[j]);
				}
			}
			lds[i] = max + 1;
		}
		
		int overAllMax = 0;
		
		for(int i=0; i<n; i++) {
			if(lis[i]+lds[i] > overAllMax) {
				overAllMax = lis[i]+lds[i];
			}
		}
		
		System.out.println(overAllMax-1);
	}

}
