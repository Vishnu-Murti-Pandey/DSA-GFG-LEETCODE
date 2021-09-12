package sde_sheet_180;
import java.util.*;

public class CountInversionsInAnArray {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		bruteForce(arr, n);

	}

	private static void bruteForce(int[] arr, int n) {
		int count = 0;
		
		for(int i=0; i<n-1; i++) {
			for(int j=i+1; j<n; j++) {
				if(arr[i]>arr[j]) {
					count++;
				}
			}
		}
		
		System.out.println(count);
	}
	
	

}
