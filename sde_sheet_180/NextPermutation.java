package sde_sheet_180;

import java.util.*;

public class NextPermutation {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int nums[] = new int[n];
		for(int i=0; i<n; i++) {
			nums[i] = sc.nextInt();
		}
		
        if(n<=1) {
            return;
        }
        int bp = -1;
        
        for(int i=n-1; i>0; i--) {
            if(nums[i] > nums[i-1]) {
                bp = i;
                break;
            }
        }
        if(bp == -1) {
            reverse(nums, 0, n-1);
            return;
        }
        
        int pivot = bp - 1;
        int ele = nums[pivot];
        int idx = pivot;
        
        for(int i=pivot+1; i<n; i++) {
            if(nums[i] > ele) {
                idx = i;
            }
        }
        swap(nums, idx, pivot);
        reverse(nums, pivot+1, n-1);
        
        for(int i=0; i<n; i++) {
        	System.out.print(nums[i]+" ");
        }
        
    }
    
    private static void reverse(int nums[], int bp, int n) { 
        while(bp < n) {
            swap(nums, bp, n);
            bp++;
            n--;
        }
    } 
    
    private static void swap(int nums[], int x, int y) {
        int temp = nums[x];
        nums[x] = nums[y];
        nums[y] = temp;
    }
		
}
