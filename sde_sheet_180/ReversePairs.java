package sde_sheet_180;
import java.util.*;

public class ReversePairs {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int nums[] = new int[n];
		for(int i=0; i<n; i++) {
			nums[i] = sc.nextInt();
		}
		
		count = 0;
		
		int ans[] = mergeSort(nums, 0, n-1);
		
		System.out.println(count);

	}
	
	static int count;

	private static int[] mergeSort(int[] nums, int lo, int hi) {
		
		if(lo == hi) {
			int ba[] = new int[1];
			ba[0] = nums[lo];
			return ba;
		}
		
		int mid = (lo + hi)/2;
		
		int left[] = mergeSort(nums, lo, mid);
		int right[] = mergeSort(nums, mid+1, hi);
		
		int merged[] = merge(left, right);
		return merged;
		
	}

	private static int[] merge(int[] left, int[] right) {
		
		int x = 0;
		int y = 0;
		
		while(x<left.length && y<right.length) {
			if(left[x] > 2*right[y]) {
				count = count + (left.length-x);
				y++;
			}
			else {
				x++;
			}
		}
		
		int temp[] = new int[left.length+right.length];
		
		int i = 0; 
		int j = 0;
		int k = 0;
		
		while(i<left.length && j<right.length) {
			if(left[i]<=right[j]) {
				temp[k] = left[i];
				i++;
				k++;
			} 
			else {
				temp[k] = right[j];
				j++;
				k++;
				
			}
		}
		
		while(i<left.length) {
			temp[k] = left[i];
			k++;
			i++;
		}
		
		while(j<right.length) {
			temp[k] = right[j];
			k++;
			j++;
		}
		
		return temp;
	}

}
